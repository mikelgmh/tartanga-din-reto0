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

    /*Mikel, este metodo hay que parametrizarlo. He puesto i=2 por poner un ejemplo, pero aqui tiene que ir el argumento que le vamos a mandar nosotros.
    Javi ha comentado que este metodo, puede recibir el parametro desde el main o desde el propio archivo de configuración.*/
    int i=2;
    public View getView() {
        if(i==1){
            return new GUIViewImplementation();
        }else{
            return new ViewImplementation();
        }
            
            
    }
}
