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
@Table(name = "cajeros")
public class Cajero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;

	@JsonIgnoreProperties("cajeros")
	@OneToMany(mappedBy = "cajero", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Venta> ventas;

	public Cajero(int id, String nombre, List<Maquina> maquinas, List<Producto> productos, List<Venta> ventas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ventas = ventas;
	}

	public Cajero() {

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

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

}