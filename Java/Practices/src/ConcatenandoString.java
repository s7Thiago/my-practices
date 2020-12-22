public class ConcatenandoString {																										
	
	public ConcatenandoString() throws InterruptedException {
		/*
		 * ###########################################
		 * INICIO BLOCO CONCATENAÇÃO COM OPERADOR '+'
		 * ###########################################
		 * */
		String strFinal = "";
		int limit = 50000;
		long tStart = System.currentTimeMillis();
		/*
		 * Vamos concatenar 65536 vezes o caractere 'a',
		 * então entenda que cada vez que passarmos no laço
		 * a JVM irá criar um novo objeto em memória.
		 * */
		for(int i = 0; i < limit; i ++){
			strFinal += "a";                  
		}

		long tEnd = System.currentTimeMillis();
		long tResult = tEnd - tStart;

		System.out.println("Tempo de Execução com operador '+' = "
		+tResult+" ms");

		/*
		 * ###########################################
		 * FIM BLOCO CONCATENAÇÃO COM OPERADOR '+'ló
		 * ###########################################
		 * */



		/*
		 * ###########################################
		 * INICIO BLOCO CONCATENAÇÃO COM StringBuilder
		 * ###########################################
		 * */
		StringBuilder strBuilder = new StringBuilder();
		tStart = System.currentTimeMillis();
		for(int i = 0; i < limit; i ++){
			strBuilder.append("a");                 
		}
		tEnd = System.currentTimeMillis();
		tResult = tEnd - tStart;
		System.out.println("Tempo de Execução com StringBuilder = "
		+tResult+" ms");
		
		System.out.println("\n\n\nStrbuilder Content: " + strBuilder);
		System.out.println("\n\n\nStrFinal Content: " + strFinal);
	}
}
