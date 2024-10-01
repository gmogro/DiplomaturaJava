
package agenda.tiendaelectrodomestico;

import agenda.tiendaelectrodomestico.datos.ClienteDAO;
import agenda.tiendaelectrodomestico.dominio.Cliente;


public class TiendaElectrodomestico {

    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setNombre("Guillermo");
        cliente.setApellido("Mogro");
        cliente.setEmail("ah@a.com");
        cliente.setTelefono("1111111");
        cliente.setDireccion("Siempre viva 123");
        dao.agregarCliente(cliente);
    }
}
