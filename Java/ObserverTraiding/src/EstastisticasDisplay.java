import observer.Observer;

public class EstastisticasDisplay implements Observer{
	
	
	private float temperatura;
	private float umidade;
	private float pressao;
	
	private void display() {
		System.out.println("EstastisticasDisplay: \n");
		System.out.println("Temperatura: " +  this.temperatura);
		System.out.println("Umidade: " + this.umidade);
		System.out.println("Pressao: " + this.pressao + "\n");
	}
	
	public EstastisticasDisplay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float temperatura, float umidade, float pressao) {
		// TODO Auto-generated method stub
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		
		display();
	}
	
}
