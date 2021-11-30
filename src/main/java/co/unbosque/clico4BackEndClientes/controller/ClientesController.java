package co.unbosque.clico4BackEndClientes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.unbosque.clico4BackEndClientes.model.Clientes;
import co.unbosque.clico4BackEndClientes.service.interfaces.IClientesService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("/clientes")
@Api(tags = "Clientes", description = "EnPoints Para la Gestión de clientes" )
@CrossOrigin(origins = "*")
public class ClientesController {

	@Autowired
	private IClientesService iClientesService;

	@PostMapping()
	public void crearCliente(@RequestBody Clientes cliente) {
		try {

			iClientesService.saveCliente(cliente);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@GetMapping()
	public List<Clientes> listarClientes() {
		List<Clientes> listaClientes = new ArrayList<Clientes>();
		try {
			listaClientes = iClientesService.ListarClientes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaClientes;
	}
	@GetMapping(path = "/{cedula_cliente}")
	public  Optional<Clientes> obtenerClienteById(@PathVariable("cedula_cliente") long cedula_cliente) {
		Optional<Clientes> cliente= Optional.ofNullable(new Clientes());
		try {
			cliente= iClientesService.findClienteById(cedula_cliente);
		} catch (Exception e) {
 			e.printStackTrace();
		}
		return cliente;
	}

	@DeleteMapping(path = "/{id}")
	public void eliminarCliente(@PathVariable("id") long cedula_cliente) {
		try {
			iClientesService.deleteClienteById(cedula_cliente);
		} catch (Exception e) {
 			e.printStackTrace();
		}
	}

	@PutMapping()
	public void actualizarUsuario(@RequestBody Clientes usuarios) {
		try {
			iClientesService.updateCliente(usuarios);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
