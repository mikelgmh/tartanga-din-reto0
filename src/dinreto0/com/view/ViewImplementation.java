
package dinreto0.com.view;

/**
 * Contiene metodos para mostrar una vista en modo texto.
 * @author Mikel/Imanol
 */
public class ViewImplementation implements View {

    /**
     * Metodo para mostrar saludo en modo texto.
     * @param greeting contiene el saludo
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
