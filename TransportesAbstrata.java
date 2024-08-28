package Interface;

public abstract class TransportesAbstrata {
	
	String placa;
	String modelo;
	String cor;
	int ano;
	
	public abstract void acelerar();
	
	
	public abstract void freia();
	
	
	public abstract void virar();
	
	public abstract void ligar();
}
