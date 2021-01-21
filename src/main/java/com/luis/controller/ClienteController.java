package com.luis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.dto.Cliente;
import com.luis.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl clienteServiceImpl;

	/**
	 * url-Get : "/api/clientes
	 * @return lista de todos los clientes
	 */
	@GetMapping("/clientes")
	public List<Cliente> listarClientes() {
		return clienteServiceImpl.listarClientes();
	}
	
	/**
	 * url-Post : "/api/clientes
	 * @param cliente que contiene los mismos datos que en db
	 * @return cliente
	 */
	@PostMapping("/clientes")
	public Cliente guardarClientes(@RequestBody Cliente cliente) {
		return clienteServiceImpl.guardarCliente(cliente);
	}
	
	/**
	 * url-Get : "/api/clientes/{id}
	 * @param id tipo Long, buscara e cliente
	 * @return error o cliente encontrado
	 * @throws Exception 
	 */
	@GetMapping("/clientes/{id}")
	public Cliente listarClienteXID(@PathVariable(name = "id") Long id) throws Exception {
		
		try {
			Cliente cliente_xId = new Cliente();
			cliente_xId = clienteServiceImpl.clienteXID(id);
			return cliente_xId;
		} catch (Exception e) {
			throw new Exception("Cliente no encontrado");
		}
		
		
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente actualizarCliente(@PathVariable(name="id") Long id,@RequestBody Cliente cliente) throws Exception {
		Cliente cliente_seleccionado = new Cliente();
		Cliente cliente_actualizado = new Cliente();
		
		try {
			cliente_seleccionado = clienteServiceImpl.clienteXID(id);
		} catch (Exception e) {
			throw new Exception("El cliente no existe");
		}
		
		cliente_seleccionado.setNombre(cliente.getNombre());
		cliente_seleccionado.setApellido(cliente.getApellido());
		cliente_seleccionado.setTipoDocumento(cliente.getTipoDocumento());
		cliente_seleccionado.setCedula(cliente.getCedula());
		cliente_seleccionado.setFechaNacimiento(cliente.getFechaNacimiento());
		cliente_seleccionado.setDireccion(cliente.getDireccion());
		cliente_seleccionado.setCelular(cliente.getCelular());
		
		cliente_actualizado = clienteServiceImpl.actualizarCliente(cliente_seleccionado);
		return cliente_actualizado;
	}
	
	@DeleteMapping("/clientes/{id}")
	public void eliminarCliente(@PathVariable(name = "id") Long id) throws Exception {
		try {
			clienteServiceImpl.eliminarCliente(id);	
		} catch (Exception e) {
			throw new Exception("El cliente no existe");
		}
		
	}
	
}
