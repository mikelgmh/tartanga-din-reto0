/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.model;

import java.util.ResourceBundle;

/**
 * Obtener saludo desde el archivo de configuración
 *
 * @author Mikel/Imanol
 */
public class ModelImplementation implements Model {

    private ResourceBundle rb = ResourceBundle.getBundle("config.config");

    @Override
    public String getGreeting() {
        return rb.getString("greeting").trim();
    }

}
