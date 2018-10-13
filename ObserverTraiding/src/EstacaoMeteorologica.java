import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Subject;

public class EstacaoMeteorologica implements Subject{
	
	private List<Observer> observers;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	
	
	public EstacaoMeteorologica() {
		observers = new ArrayList<>();
	}

	public void setMedicoes(float temperatura, float umidade, float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int observerPositionOnList = observers.indexOf(observer);
		
		if(observerPositionOnList > -1) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(temperatura, umidade, pressao);
		}
		
	}
}
