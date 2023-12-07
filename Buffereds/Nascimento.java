package Buffereds;

public class Nascimento {

	String nomePessoa;
	int DiaDeNascimento;
	int MesDeNascimento;
	int AnoDeNascimento;
	
	Nascimento(){
		this("",0,0,0);
	}
	
	public Nascimento(String nome, int dia, int mes, int ano) {
		nomePessoa = nome;
		DiaDeNascimento = dia;
		MesDeNascimento = mes;
		AnoDeNascimento = ano;
	}
}
