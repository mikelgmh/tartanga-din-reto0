/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.controller;

import dinreto0.com.model.Model;
import dinreto0.com.view.View;

/**
 * Metodo run que envie una vista y un modelo
 *
 * @author 2dam
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
