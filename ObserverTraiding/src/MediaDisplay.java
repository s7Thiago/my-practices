import observer.Observer;
import observer.Subject;

public class MediaDisplay implements Observer {

	

	private float temperaturaMin, temperaturaMax, temperaturaMed;
	private float umidadeMin, umidadeMax, umidadeMed;
	private float pressaoMin, pressaoMax, pressaoMed;

	public void display() {
		System.out.println("MediaDisplay: \n");
		System.out.println("Temperatura média: " + temperaturaMed);
		System.out.println("Umidade média: " + umidadeMed);
		System.out.println("Pressão média: " + pressaoMed + "\n");
	}
		
	public MediaDisplay() {
		// TODO Auto-generated constructor stub
	}

	public void mediaTemperatura(float temperatura) {
		
		System.out.println(temperaturaMed);

	}
	
	public void mediaUmidade(float umidade) {
		
		System.out.println(umidadeMed);
	}

	public void mediaPressao(float pressao) {
		System.out.println(pressaoMed);
		
	}

	@Override
	public void update(float temperatura, float umidade, float pressao) {
		// TODO Auto-generated method stub
		mediaTemperatura(temperatura);
		mediaUmidade(umidade);
		mediaPressao(pressao);
		
		display();
		
	}
}
