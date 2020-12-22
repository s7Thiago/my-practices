import observer.Subject;

public class Main {

	public static void main(String[] args) {

		String separador = "--------------------------------------------------------";

//		Este � o nosso subject
		EstacaoMeteorologica estacao = new EstacaoMeteorologica();

//		Estes s�o os nossos observadores
		EstastisticasDisplay estastisticas = new EstastisticasDisplay();
		MediaDisplay medias = new MediaDisplay();
		
//		Registrando os nossos observadores nas alteracoes de estado do subject
		estacao.addObserver(estastisticas);
		estacao.addObserver(medias);

		estacao.setMedicoes(22.0f, 56.0f, 1.0f);
		
		System.out.println(separador);
		System.out.println(separador);

		estacao.setMedicoes(15f, 95f, 1f);
		
		System.out.print("esta��o � um subject? ");
		System.out.println(estacao instanceof Subject? "Sim" : "N�o");
		
		System.out.print("medias � um subject? ");
		System.out.print(medias instanceof Subject? "Sim" : "N�o");
	}

}
