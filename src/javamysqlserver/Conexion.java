/*
 * Titulo del proyecto:
 * Descripcion del proyecto:
 * Nombre : Christian Emmanuel Delgado Castro
 * Fecha : 
 * Versión : 
 */
package javamysqlserver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    String url = "jdbc:mysql://ulrcefcgqbdeooj7:XLYm7IO8zsWJCowf94pw@bed4hqeyanej2yuibkyp-mysql.services.clever-cloud.com:3306/bed4hqeyanej2yuibkyp";
    String user = "ulrcefcgqbdeooj7";
    String password = "XLYm7IO8zsWJCowf94pw";

    public Connection getConexion() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conn;
    }

}
