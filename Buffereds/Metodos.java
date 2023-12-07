package Buffereds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Metodos {

	public Nascimento[] CadastraNascimentos(Nascimento[] nascido) throws IOException {
		int i;
		String fileName = "ArquivoNascimento.txt";
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
		for(i=0; i<2; i++) {
			nascido[i].nomePessoa = JOptionPane.showInputDialog("Informe o nome da pessoa: ");
			gravar.write(nascido[i].nomePessoa);
			gravar.newLine();
			nascido[i].DiaDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de seu nascimento: "));
			gravar.write(Integer.toString(nascido[i].DiaDeNascimento));
			gravar.newLine();
			nascido[i].MesDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes de seu nascimento: "));
			gravar.write(Integer.toString(nascido[i].MesDeNascimento));
			gravar.newLine();
			nascido[i].AnoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de seu nascimento: "));
			gravar.write(Integer.toString(nascido[i].AnoDeNascimento));
			gravar.newLine();
		}
		gravar.close();
		System.out.println("Cadastro feito com Sucesso!");
		System.out.println("_______________________________________");
		return nascido;
	}

	public void CalcularIdade(Nascimento[] nascido) {
		int i, idade, anoAtual = 2023, mesAtual = 12, diaAtual = 07;
		
		for(i=0; i<2; i++) {
			while(nascido[i].AnoDeNascimento > anoAtual) {
				nascido[i].AnoDeNascimento =Integer.parseInt(JOptionPane.showInputDialog("Informe novamente a sua idade:"));
			}
			
			if(mesAtual >= nascido[i].MesDeNascimento & diaAtual > nascido[i].DiaDeNascimento ) {
				idade = (anoAtual - nascido[i].AnoDeNascimento) - 1;
				System.out.println("A sua idade: " + idade + " Anos");
				System.out.println("______________________________________");
			}
			else {
				idade = anoAtual - nascido[i].AnoDeNascimento;
				System.out.println("A sua idade: " + idade + " Anos");
				System.out.println("______________________________________");
			}
		}
	}

	public void Leitura(Nascimento[] nascido) throws IOException {
		int i;
		String fileName = "ArquivoNascimento.txt";
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		
		for(i=0; i<2; i++) {
			nascido[i].nomePessoa = ler.readLine();
			nascido[i].DiaDeNascimento = Integer.parseInt(ler.readLine());
			nascido[i].MesDeNascimento = Integer.parseInt(ler.readLine());
			nascido[i].AnoDeNascimento = Integer.parseInt(ler.readLine());
		}
		ler.close();
		System.out.println("Gravação concluida");
		System.out.println("_____________________________________");
	}

	public void Futuro(Nascimento[] nascido) {
		int i, previsao, mes, dia, idade;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia no futuro: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes no futuro: "));
		previsao = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano no futuro: "));
		
		for(i=0; i<2; i++) {
			if(mes <= nascido[i].MesDeNascimento & dia < nascido[i].DiaDeNascimento ) {
				idade = (previsao - nascido[i].AnoDeNascimento) - 1;
				System.out.println("A sua idade: " + idade + " Anos");
				System.out.println("______________________________________");
			}
			else {
				idade = previsao - nascido[i].AnoDeNascimento;
				System.out.println("A sua idade: " + idade + " Anos");
				System.out.println("______________________________________");
			}
		}
		
	}

	public void Mostrar(Nascimento[] nascido) {
		int i;
		for(i = 0; i< 2; i++) {
			System.out.println("o seu nome: " + nascido[i].nomePessoa);
			System.out.println("o seu dia de nascimento foi: " +nascido[i].DiaDeNascimento + "/" +nascido[i].MesDeNascimento+ "/" +nascido[i].AnoDeNascimento);
			System.out.println("_______________________________________________________________");
		}
		
	}

}
