package com.luis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.dao.IClienteDAO;
import com.luis.dto.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	IClienteDAO iClienteDAO;
	
	@Override
	/**
	 * Lista los clientes
	 * <b>Precondiciones: </b> Se utiliza con el metodo get
	 */
	public List<Cliente> listarClientes() {
		
		return iClienteDAO.findAll();
	}

	@Override
	/**
	 * Guarda Clientes 
	 * <b>Precondiciones: </b> Se utiliza con el metodo post
	 */
	public Cliente guardarCliente(Cliente cliente) {
		return iClienteDAO.save(cliente);
	}

	@Override
	/**
	 * Busca clientes por ID
	 */
	public Cliente clienteXID(Long id) {
		return iClienteDAO.findById(id).get();
	}

	@Override
	/**
	 * Actualiza clientes
	 * <b>Precondiciones: </b> Se utiliza con el metodo put
	 */
	public Cliente actualizarCliente(Cliente cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	/**
	 * <b>Elimina Clientes: </b> Se utiliza con el metodo deleted
	 */
	public void eliminarCliente(Long id) {
		iClienteDAO.deleteById(id);
	}

}
