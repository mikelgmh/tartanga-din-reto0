
package dinreto0.com.model;

import java.util.ResourceBundle;

/**
 * Hace referencia a archivo de propiedades y obtiene saludo.
 * @author Mikel/Imanol
 */
public class ModelImplementation implements Model {

    private ResourceBundle rb = ResourceBundle.getBundle("config.config");

    /**
     * Obtiene saludo.
     * @return String con referencia "greeting" en archivo propiedades. 
     */
    @Override
    public String getGreeting() {
        return rb.getString("greeting").trim();
    }

}
