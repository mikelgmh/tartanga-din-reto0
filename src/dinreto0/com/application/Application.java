/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.application;

import dinreto0.com.controller.Controller;
import dinreto0.com.model.Model;
import dinreto0.com.model.ModelFactory;
import dinreto0.com.view.View;
import dinreto0.com.view.ViewFactory;

/**
 * Crear un modelo y definirlo Metodo getView Metodo getModel
 *
 * @author 2dam
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (checkParameters(args)) {

            ViewFactory viewFactory = new ViewFactory();
            View view = viewFactory.getView(args[1]);

            ModelFactory modelFactory = new ModelFactory();
            Model model = modelFactory.getModel(args[0]);

            Controller controller = new Controller(model, view);
            controller.run();
        }else{
            System.out.println("Parámetros incorrectos.");
        }
    }

    public static boolean checkParameters(String[] args) {
        boolean parameters = true;
        if ((!"db".equals(args[0]) && !"file".equals(args[0])) || (!"console".equals(args[1]) && !"gui".equals(args[1]))) {
            parameters = false;
        }
        return parameters;
    }

}
