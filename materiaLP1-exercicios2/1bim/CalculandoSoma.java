//importando a classe JOptionPane
import javax.swing.JOptionPane;

//criar a classe
public class CalculandoSoma {
	
	//m�todo principal
	public static void main(String args[]){
		
		//criando as vari�veis
		int valor1 = 0;
		int valor2 = 0;
		int resultado = 0;
		String primeiroValor;
		String segundoValor;
		
			
		//solicitar os valores para o usu�rio
		primeiroValor = JOptionPane.showInputDialog("Entre com primeiro valor");
		segundoValor = JOptionPane.showInputDialog("Entre com segundo valor");
		         
	    //convertendo texto para n�mero
	    valor1 = Integer.parseInt(primeiroValor);	         
		valor2 = Integer.parseInt(segundoValor);
		
		//calculando
		resultado = valor1 + valor2;
		
		//exibir o resultado
		JOptionPane.showMessageDialog(null, "A soma � " + resultado); 
		
		
	}
	
	
}