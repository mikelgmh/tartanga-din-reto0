
package dinreto0.com.view;

/**
 * Hace de intermediario entre las clases Application y ambos View
 * Implementation.
 * @author Mikel/Imanol
 */

public class ViewFactory {

    /**
     * Obtiene un String desde la clase Application, el cual hace referencia a 
     * la vista que se quiere obtener.
     * @param viewType Contiene vista, recibido desde la clase Application.
     * @return vista que se quiere usar.
     */
    public View getView(String viewType) {
        View view = null;
        switch (viewType) {
            case "console":
                view = new ViewImplementation();
                break;
            case "gui":
                view = new GUIViewImplementation();
                break;
        }
        return view;

    }
}
