package com.msglife.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mortalidade2016 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pais;
	private BigDecimal txfeminino;
	private BigDecimal txmasculino;
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais=pais;
	}
	public BigDecimal getTxFeminino() {
		return txfeminino;
	}
	public void setTxFeminino(BigDecimal txfeminino) {
		this.txfeminino=txfeminino;
	}
	public BigDecimal getTxMasculino() {
		return txmasculino;
	}
	public void setTxMasculino(BigDecimal txmasculino) {
		this.txmasculino=txmasculino;
	}
	@Override
	public String toString() {
		return "Mortalidade2016 [País="+pais+", taxa feminina="+txfeminino+", taxa masculina="+txmasculino+"]";
	}
}
