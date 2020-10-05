
package dinreto0.com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Accede a base de datos mediante conexión local y obtiene saludo.
 * @author Mikel/Imanol
 */
public class MySQLModelImplementation implements Model {

    private Connection con;
    private Statement stmt;
    private ResourceBundle rb = ResourceBundle.getBundle("config.config");

    public MySQLModelImplementation() {
        this.openConnection();
    }

    /**
     * Metodo para conectar con base de datos, obteniendo los parametros 
     * necesarios desde el archivo de configuracion.
     * @throws SQLException, ClassNotFoundException en caso de error al conectar.
     */
    private void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", rb.getString("user"));
            connectionProps.put("password", rb.getString("password"));
            this.con = DriverManager.getConnection(rb.getString("host"), connectionProps);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MySQLModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cierra conexion.
     * @throws SQLException en caso de error al interactuar con base de datos.
     */
    private void closeConeection() throws SQLException {
        stmt.close();
        con.close();
    }

    /**
     * Conecta a base de datos, realiza una query y devuelve String.
     * @return greeting obtenido en base de datos.
     * @throws SQLException en caso de error al interactuar con base de datos.
     */
    private String selectGreeting() {
        String greeting = null;

        try {
            String query = "SELECT FRASE FROM SALUDO WHERE ID IN(SELECT ID FROM PAIS WHERE IDIOMA = 'CASTELLANO')";

            this.openConnection();

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                greeting = rs.getString("FRASE");
            }

            rs.close();

            this.closeConeection();

        } catch (SQLException e) {
            System.out.println("Error en consulta.");
        }

        return greeting;
    }

    /**
     * Metodo que devuelve String a otras clases.
     * @return String con saludo.
     */
    @Override
    public String getGreeting() {
        return this.selectGreeting();
    }

}
