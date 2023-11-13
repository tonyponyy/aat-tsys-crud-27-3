package com.crud263.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JsonIgnoreProperties("ventas")
	@JoinColumn(name = "cajero_id")
	private Cajero cajero;

	@ManyToOne
	@JsonIgnoreProperties("ventas")
	@JoinColumn(name = "maquina_id")
	private Maquina maquina;

	@ManyToOne
	@JsonIgnoreProperties("ventas")
	@JoinColumn(name = "producto_id")
	private Producto producto;

	public Venta(int id, Cajero cajero, Maquina maquina, Producto producto) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	public Venta() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Maquina getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
