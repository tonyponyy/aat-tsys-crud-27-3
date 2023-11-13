package com.crud263.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int precio;

	@JsonIgnoreProperties("productos")
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Venta> ventas;

	public Producto() {

	}

	public Producto(int id, String nombre, int precio, List<Venta> ventas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

}
