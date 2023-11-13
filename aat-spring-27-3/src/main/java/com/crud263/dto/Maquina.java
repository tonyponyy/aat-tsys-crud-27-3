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



@Table(name = "maquinas")
@Entity
public class Maquina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int piso;

	@JsonIgnoreProperties("maquinas")
	@OneToMany(mappedBy = "maquina", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Venta> ventas;

	public Maquina() {

	}

	public Maquina(int id, int piso, List<Venta> ventas) {
		super();
		this.id = id;
		this.piso = piso;
		this.ventas = ventas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

}
