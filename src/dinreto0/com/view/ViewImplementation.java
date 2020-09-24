/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.view;

/**
 * Contiene metodos para mostrar una vista en modo texto y otra en GUI
 *
 * @author Mikel/Imanol
 */
public class ViewImplementation implements View {

    /**
     * Metodo para mostrar saludo
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
