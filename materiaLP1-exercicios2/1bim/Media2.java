//pgm calcula a media  de uma aluno que estuda semestralmente
//caso a media>=7 - aprovado
//caso a media<7 - reprovado

//importando a classe
import javax.swing.JOptionPane;

//criando a classe
public class Media2 {
	
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
		if (media >=7)
				//exibir o resultado aprovado
		JOptionPane.showMessageDialog(null,"Aprovado " + media); 
		   else
		   
		   //exibir o resultado reprovado
		JOptionPane.showMessageDialog(null,"Reprovado " + media); 
		
	}
	
	
}
