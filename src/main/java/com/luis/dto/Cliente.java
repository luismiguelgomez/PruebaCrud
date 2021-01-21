package com.luis.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entidad de la tabla 'Cliente'
 * @author gomez
 *
 */
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private Long cedula;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaNacimiento;
	private String direccion;
	private int celular;
	
	public Cliente() {
		
	}
	
	/**
	 * Metodo constructor
	 * @param id long
	 * @param nombre String
	 * @param apellido String
	 * @param tipoDocumento String
	 * @param cedula String
	 * @param fechaNacimiento tipo Date
	 * @param direccion String
	 * @param celular String
	 */
	public Cliente(Long id, String nombre, String apellido, String tipoDocumento, Long cedula, Date fechaNacimiento,
			String direccion, int celular) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tipoDocumento = tipoDocumento;
			this.cedula = cedula;
			this.fechaNacimiento = fechaNacimiento;
			this.direccion = direccion;
			this.celular = celular;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento="
				+ tipoDocumento + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", direccion="
				+ direccion + ", celular=" + celular + "]";
	}

}