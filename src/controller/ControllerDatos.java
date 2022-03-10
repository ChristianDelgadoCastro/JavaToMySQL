/*
 * Titulo del proyecto:
 * Descripcion del proyecto:
 * Nombre : Christian Emmanuel Delgado Castro
 * Fecha : 
 * Versión : 
 */
package controller;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javamysqlserver.Conexion;
import javax.swing.JOptionPane;
import model.Datos;

public class ControllerDatos {

    private Conexion conexion;
    private Datos modelDatos;
    private Connection conn;

    public ControllerDatos() {
        conexion = new Conexion();
        modelDatos = new Datos();
    }

    public void insertar(String nombre, int edad, String sexo) {
        PreparedStatement ps;
        String sql;
        modelDatos.setNombre(nombre);
        modelDatos.setEdad(edad);
        modelDatos.setSexo(sexo);
        try {
            conn = conexion.getConexion();
            sql = "insert into datos(nombre, edad, sexo) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, modelDatos.getNombre());
            ps.setInt(2, modelDatos.getEdad());
            ps.setString(3, modelDatos.getSexo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
