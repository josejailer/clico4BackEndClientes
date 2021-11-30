package co.unbosque.clico4BackEndClientes.service.interfaces;

import java.util.List;
import java.util.Optional;

import co.unbosque.clico4BackEndClientes.model.Clientes;

public interface IClientesService  {
	
	public void saveCliente(Clientes cliente) throws Exception;
	
	public List<Clientes> ListarClientes() throws Exception;
	
	public void deleteClienteById(long cedula_cliente) throws Exception;
	
	public  Optional<Clientes> findClienteById(long cedula_cliente) throws Exception;
	
	public void updateCliente(Clientes cliente) throws Exception;

}
