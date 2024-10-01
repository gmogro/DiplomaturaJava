
package agenda.tiendaelectrodomestico.datos;

import agenda.tiendaelectrodomestico.conexion.Conexion;
import agenda.tiendaelectrodomestico.dominio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClientes{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        
        Connection conexion = Conexion.getConection();
        
        var sql = "SELECT * FROM cliente ORDER BY id";
        try{
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setDireccion(rs.getString("direccion"));
                clientes.add(cliente);
            }
            
        }catch(Exception e){
            System.out.println("Error listar clientes "+ e.getMessage());
        }
        finally{
            try{
                conexion.close();
            }catch(Exception e){
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection conexion = Conexion.getConection();
        String sql = "INSERT INTO cliente(nombre, apellido, email, telefono, direccion) "
                + " VALUES(?, ?, ?, ?, ?)";
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al agregar cliente: " + e.getMessage());
        }
        finally {
            try {
                conexion.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection conexion = Conexion.getConection();
        var sql = "UPDATE cliente SET nombre=?, apellido=?, email=?, telefono=? , direccion=? " +
                " WHERE id = ?";
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar cliente: " + e.getMessage());
        }
        finally {
            try {
                conexion.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection conexion = Conexion.getConection();
        String sql = "DELETE FROM cliente WHERE id = ?";
        try{
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        }
        finally {
            try {
                conexion.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }
    
}
