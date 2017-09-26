package com.filcorreia.contactos;


public class Contacto {
	private String nome;
	private String email;
	private String Endereco;
	private String data_nasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setDatanasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
//	public Contacto(String nome, String email, String endereco, String data_nasc) {
//		super();
//		this.nome = nome;
//		this.email = email;
//		Endereco = endereco;
//		this.data_nasc = data_nasc;
//	}
}
