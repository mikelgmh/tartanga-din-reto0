
package dinreto0.com.model;

/**
 * Hace de intermediario entre las clases Application y ambos Model 
 * Implementation.
 * @author Mikel/Imanol
 */
public class ModelFactory {

    /**
     * Obtiene un String desde la clase Application, el cual hace referencia al 
     * modelo que se quiere obtener.
     * @param modelType Contiene modelo, recibido desde la clase Application.
     * @return modelo que se quiere usar.
     */
    public Model getModel(String modelType) {
        Model model = null;
        switch (modelType) {
            case "db":
                    model = new MySQLModelImplementation();
                break;
            case "file":
            model = new ModelImplementation();
                break;
        }
        return model;
    
    }

}
