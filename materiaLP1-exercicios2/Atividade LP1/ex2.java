import javax.swing.JOptionPane;

public class ex2 {
	public static void main (String args []) {
    	int  Codigo = 0;
    	float Salario = 0;
    	float Salario1 = 0;
		String SalarioAtual;
		String Cod;
    	
    	Codigo = JOptionPane.showInputDialog("Insira seu c�digo: ");
    	SalarioAtual =JOptionPane.showInputDialog("Insira o seu sal�rio atual: ");
  
    	
    	if(Codigo == 101 ){
    		SalarioAtual = Salario * 1/100;
    		JOptionPane.showMessageDialog(null, "O seu novo cargo �: Gerente \n E seu novo salario �: " +SalarioAtual);
    		System.exit(0);
    		}
    		
    	 else if (Codigo == 102){
    	 	SalarioAtual = Salario * 2/100;
    	 	JOptionPane.showMessageDialog(null, "O seu novo cargo �: Engenheiro \n E se novo salario �:" +SalarioAtual);
    	 	System.exit(0);
    	 	}
    	 else if (Codigo == 103){
    	 	SalarioAtual = Salario * 3/100;
    	 	JOptionPane.showMessageDialog(null, "O seu novo cargo �: T�cnico \n E seu novo salario �: " +SalarioAtual);
    	 	System.exit(0);
    	 	}		
    		
    	 else if ( Codigo != 101 && Cod != 102 && Cod != 103 ) 
    	 	
    	 	SalarioAtual = Salario * 4/100;
    	 	JOptionPane.showMessageDialog(null, "O seu novo salario �: " +SalarioAtual);
    	 	System.exit(0);
    	 	}
    	
    }
		
	

  
    
