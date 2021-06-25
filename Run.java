package carro;

public class Run {

	public static void main(String[] args) {
		Carro carro  = new Sedan(); // composicion y polimorfismo
		carro.print();
		
		carro = new Pickup();// composicion y polimorfismo
		carro.print();

	}

}
