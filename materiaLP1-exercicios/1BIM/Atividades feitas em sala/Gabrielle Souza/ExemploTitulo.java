//crir um metodo para centalizar uma string
//m�todo n�o retorna argumneto

//criando a classe
class ExemploTitulo{
	
	//criando o m�todo para centralizar
	//m�todo n�o retorna valor
	// n�o necessita de um objeto para ser executado
	//o argumento n�o poder� ser alterado
	
	static void titulo(final String texto){
		int brancos = (80-texto.length())/2;
		for (int i = 1; i<=brancos; i++)
		System.out.print (' ');
		System.out.print(texto);
		
	}
	//metodo pirncipal
	public static void main (String agrs[]){
		try
		{
			titulo("TO CANSADA \n");
		
		}
		catch (Exception e)
		{
			titulo("Exemplo de T�tulo Centralizado");
		}
		
		}
		
}		
		
	

