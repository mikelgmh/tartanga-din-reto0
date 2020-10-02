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
