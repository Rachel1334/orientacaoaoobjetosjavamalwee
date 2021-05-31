package br.com.senai.exemplo;

public class Pessoa {

	//ATRIBUTOS:
	
	//PROTECTED
	//PRIVATE: SOMENTE ESSA CLASE,RECOHECE OS DADOS. 
	private String nome;
	private int anoDeNascimento;
	private String sexo;
	
	//METODOS:
	public String getNome() {
		return nome;
	}	
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public void name(String nome) {
		this.nome = nome;
	}
	
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public String getSexo() {
	return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoDeNascimento=" + anoDeNascimento + ", sexo=" + sexo + "]";
		//SINAL DE + É ONDE ESTA AS VARIAVEIS E NAO PODE ALTERAR,SÓ PODE ALTERAR OS QUE ESTÃO DENTRO DE "
	}
	
	}
	
	
	

