package carro;

public abstract class Carro {
   
   public abstract String tipo(); 
	
   public final void print() {
	   System.out.println("Soy carro=" + tipo());
   }
   
}
