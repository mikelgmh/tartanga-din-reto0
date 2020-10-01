/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.model;

/**
 *  
 * 
 * @author Mikel/Imanol
 */
public class ModelFactory {
    
    //Falta el mismo supuesto que en la factoria de la Vista. Hay que añadir el ModelImplementation
    public Model getModel() {
        return new MySQLModelImplementation();
    }
    
    
    
}
