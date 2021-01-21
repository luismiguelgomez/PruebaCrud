package com.luis.service;

import java.util.List;

import com.luis.dto.Cliente;

public interface IClienteService {
	/*
	 * 	El método de creación debe ser de tipo HTTP POST.
		El método de edición debe ser de tipo HTTP PUT.
		El método de consulta debe ser de tipo HTTP GET.
		El método de eliminación debe ser de tipo HTTP DELETE.

	 */
	/**
	 * Lista clientes
	 * <b>Precondiciones: </b> Se utiliza con el metodo get
	 * <b>Poscondiciones: </b> Muestra todos los usuarios que estan en la db
	 * @return Clientes creados
	 */
	public List<Cliente> listarClientes();
	
	/**
	 * Crea clientes y los guarda
	 * <b>Precondiciones: </b> Se utiliza con el metodo post
	 * <b>Poscondiciones: </b> Crea clientes y los guarda
	 * @return Clientes creados
	 */
	public Cliente guardarCliente(Cliente cliente);
	
	/**
	 * <b>Precondiciones: </b> Se utiliza con el metodo post
	 * <b>Poscondiciones: </b> Crea clientes y los guarda
	 * @param id tipo Long, su funcion será buscar un cliente por id
	 * @return Cliente que fue buscado
	 */
	public Cliente clienteXID(Long id);
	
	/**
	 * <b>Precondiciones: </b> Se utiliza con el metodo Put
	 * <b>Poscondiciones: </b> Actualiza el cliente
	 * @param cliente Es el cliente que se va a actualizar
	 * @return Cliente que fue actualizado
	 */
	public Cliente actualizarCliente(Cliente cliente);
	
	/**
	 * <b>Precondiciones: </b> Se utiliza con el metodo deleted
	 * <b>Poscondiciones: </b> Busca un cliente y lo elimina
	 * @param id tipo Long, utilizado para buscar el cliente por el id
	 */
	public void eliminarCliente(Long id);
	
}
