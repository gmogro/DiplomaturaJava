
package agenda.tiendaelectrodomestico.datos;

import agenda.tiendaelectrodomestico.dominio.Cliente;
import java.util.List;


public interface IClientes {
    List<Cliente> listarClientes();
    boolean buscarClientePorId(Cliente cliente);
    boolean agregarCliente(Cliente cliente);
    boolean modificarCliente(Cliente cliente);
    boolean eliminarCliente(Cliente cliente);
}
