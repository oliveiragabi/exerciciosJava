//pgm calcula a media  de uma aluno que estuda semestralmente
//caso a media >=6 - aprovado
//desvio condicional simples

//importando a classe
import javax.swing.JOptionPane;

//criando a classe
public class Media1 {
	
	//m�todo principal
	public static void main(String args[]){
		
		//criando as vari�veis
		float primeiraNota = 0.0f;
		float segundaNota = 0.0f;
		float media = 0.0f;
		String primeiroValor;
		String segundoValor;
		
			
		//solicitar os valores para o usu�rio
		primeiroValor = JOptionPane.showInputDialog("Entre com a primeira nota");
		segundoValor = JOptionPane.showInputDialog("Entre com a segunda nota");
		         
	    //convertendo texto para n�mero
	    primeiraNota = Float.parseFloat(primeiroValor);
		segundaNota = Float.parseFloat(segundoValor);
		
		//calculando
		media = (primeiraNota+segundaNota)/2; 
		
		//condi��o
		if (media >=6)
				//exibir o resultado
		JOptionPane.showMessageDialog(null, "A m�dia � " + media); 
		
		
	}
	
	
}
