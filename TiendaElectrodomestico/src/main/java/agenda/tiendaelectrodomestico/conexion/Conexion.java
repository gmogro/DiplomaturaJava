
package agenda.tiendaelectrodomestico.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConection(){
        Connection conexion = null;
        var baseDatos = "tienda_electrodomestico";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "root";
        
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        }catch (Exception e){
            System.out.println("Error al conectarnos a la BD: " + e.getMessage());
        }
        return conexion;           
    }
    public static void main(String[] args) {
        var conexion = Conexion.getConection();
        if(conexion !=null)
            System.out.println("conexion exitosa");
        else
            System.out.println("conexion fallo");
    }
}
