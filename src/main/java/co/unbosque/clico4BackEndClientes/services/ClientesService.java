package co.unbosque.clico4BackEndClientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.unbosque.clico4BackEndClientes.model.Clientes;
import co.unbosque.clico4BackEndClientes.modelDao.interfaces.IClientesDao;
import co.unbosque.clico4BackEndClientes.service.interfaces.IClientesService;

@Service
public class ClientesService implements IClientesService {
	
	@Autowired
	private IClientesDao clienteDao;

	@Override
	public void saveCliente(Clientes cliente) throws Exception {
		
		clienteDao.save(cliente);
		
	}

	@Override
	public List<Clientes> ListarClientes() throws Exception {
		
		return clienteDao.findAll();
	}

	@Override
	public void deleteClienteById(long cedula_cliente) throws Exception {
		clienteDao.deleteById(cedula_cliente);
		
	}

	@Override
	public Optional<Clientes> findClienteById(long cedula_cliente) throws Exception {
		
		return clienteDao.findById(cedula_cliente);
	}

	@Override
	public void updateCliente(Clientes cliente) throws Exception {
		clienteDao.save(cliente);
		
	}

}
