package control;

import model.Carro;
import model.CarroA;
import model.Moto;
		//import model.Veiculo;

public class Controle {
	
	public static void main(String[] args) {
		
		
		Carro c1 = new Carro();
		Moto m1 = new Moto();
		CarroA cv = new CarroA();
		//Veiculo v1 = new Veiculo();
		
		
		System.out.println( m1.acelerar());
		System.out.println(c1.acelerar());		
		System.out.println(cv.acelerar());
		

	}

}
