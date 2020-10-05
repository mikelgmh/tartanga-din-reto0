package dinreto0.com.controller;

import dinreto0.com.model.Model;
import dinreto0.com.view.View;

/**
 * Clase que contiene el metodo que muestra el saludo, obtenido previamente
 * en la clase aplicacion.
 *
 * @author Mikel/Imanol
 */
public class Controller {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }
    
    public void run(){
       
        this.view.showGreeting(this.model.getGreeting());
    }
}
