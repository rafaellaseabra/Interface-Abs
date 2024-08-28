package Interface;

public class CarroAbs extends TransportesAbstrata {

	@Override
	public void acelerar() {
		System.out.println("Aceleranado");	
	}

	@Override
	public void freia() {
		System.out.println("Freiar");
	}

	@Override
	public void virar() {
		System.out.println("Virando");	
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}
	
	

}
