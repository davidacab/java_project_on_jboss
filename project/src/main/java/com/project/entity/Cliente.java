package com.project.entity;

public class Cliente {
	
	private int id;
	private String nome;
	private String cognome;
	
	public Cliente() {}
	
	public Cliente(int id,String nome,String cognome) {
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	
	@Override
	public String toString() {
		return "id:"+this.id+","+"nome:"+this.nome+","+this.cognome;
	}
	
	

}
