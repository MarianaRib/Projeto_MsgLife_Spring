package com.msglife.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mortalidade2017 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pais;
	private float txfeminino;
	private float txmasculino;

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais=pais;
	}
	public float getTxFeminino() {
		return txfeminino;
	}
	public void setTxFeminino(float txfeminino) {
		this.txfeminino=txfeminino;
	}
	public float getTxMasculino() {
		return txmasculino;
	}
	public void setTxMasculino(float txmasculino) {
		this.txmasculino=txmasculino;
	}
	@Override
	public String toString() {
		return "Mortalidade2017 [País="+pais+", taxa feminina="+txfeminino+", taxa masculina="+txmasculino+"]";
	}
}
