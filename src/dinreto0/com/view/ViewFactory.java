/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.view;

/**
 *
 * @author Mikel
 */
public class ViewFactory {

    public View getView() {
        return new ViewImplementation();
    }
}
