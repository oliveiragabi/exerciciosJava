int codigo= 0; String cod;
		double salario_atual= 0.0; String SalAtual;

		cod= JOptionPane.showInputDialog("Entre com o c�digo do\n cargo do funcion�rio:");
		codigo= Integer.parseInt(cod);
		
		SalAtual= JOptionPane.showInputDialog("Entre com o sal�rio\n atual do funcion�rio:");
		salario_atual= Double.parseDouble(SalAtual);
		JOptionPane.showMessageDialog(null, "O sal�rio anterior do funcion�rio � de:"+ salario_atual);
		
		if (codigo== 101){
			
			salario_atual= salario_atual + (salario_atual*1/10);
			JOptionPane.showMessageDialog(null, "O novo sal�rio do funcion�rio � de:"+ salario_atual);
			System.exit(0);
		}
		
		else if (codigo== 102){
			
			salario_atual= salario_atual + (salario_atual*2/10);
			JOptionPane.showMessageDialog(null, "O novo sal�rio do funcion�rio � de:"+ salario_atual);
			System.exit(0);
		}
		
		else if (codigo== 103){
			
			salario_atual= salario_atual + (salario_atual*3/10);
			JOptionPane.showMessageDialog(null, "O novo sal�rio do funcion�rio � de:"+ salario_atual);
			System.exit(0);
		}
		
		else if (codigo!= 101 | codigo!= 102 | codigo!= 103){
			
			salario_atual= salario_atual + (salario_atual*4/10);
			JOptionPane.showMessageDialog(null, "O novo sal�rio do funcion�rio � de:"+ salario_atual);
			System.exit(0);
		}
	}
}