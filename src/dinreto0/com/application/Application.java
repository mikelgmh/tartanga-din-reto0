
package dinreto0.com.application;

import dinreto0.com.controller.Controller;
import dinreto0.com.model.Model;
import dinreto0.com.model.ModelFactory;
import dinreto0.com.view.View;
import dinreto0.com.view.ViewFactory;

/**
 * Clase que contiene metodo main. Obtiene Vista y Modelo, crea clase 
 * controlador y lo ejecuta.
 * @author Mikel/Imanol
 */
public class Application {

    /**
     * Metodo main que ejecuta el programa.
     * @param args Recibe argumentos desde la terminal de Windows al ejecutar
     * el programa.
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
    
    /**
     * Metodo que controla si los argumentos recibidos son validos.
     * @param args Son las variables que recibe el programa al ejecutar, via 
     * terminal de Windows.
     * @return true Si los argumentos recibidos se corresponden con 
     * los establecidos en el programa.
     */
    
    public static boolean checkParameters(String[] args) {
        boolean parameters = true;
        if ((!"db".equals(args[0]) && !"file".equals(args[0])) || (!"console".equals(args[1]) && !"gui".equals(args[1]))) {
            parameters = false;
        }
        return parameters;
    }

}
