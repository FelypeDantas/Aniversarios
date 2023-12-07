package Buffereds;

import java.io.IOException;

import javax.swing.JOptionPane;

public class ClassePrincipal {
   public static void main(String[] args) throws IOException {
	   Nascimento[] nascido = new Nascimento[2];
	   Metodos m = new Metodos();
	   
	   int i, opc = 0;
	   
	    for(i=0; i<2; i++) {
	    	nascido[i] = new Nascimento();
	    }
	   
	   while(opc != 9) {
		   opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n 1 - Cadastrar Nascimentos \n 2 - Calcular Idade \n 3 - Leitura \n 4 - quanto anos terá em ???? \n 5 - Mostrar \n 9 - Finaliza"));
		   
		   switch(opc) {
		   case 1: nascido = m.CadastraNascimentos(nascido);
		           break;
		   case 2: m.CalcularIdade(nascido);
		           break;
		   case 3: m.Leitura(nascido);
		           break;
		   case 4: m.Futuro(nascido);
		           break;
		   case 5: m.Mostrar(nascido);
		           break;
		   case 9: JOptionPane.showMessageDialog(null, "Finaliza Programa");
		           break;
		   default: JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente: ");
		   }
	   }
   }
}
