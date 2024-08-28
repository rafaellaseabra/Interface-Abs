package Interface;

public class Gamer implements Computador {

	@Override
	public void ligar() {
		System.out.println("Ligando Computador ");
		
	}

	@Override
	public void reiniciar() {
		System.out.println("Reinicinado Computador ");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando Computador ");
		
	}

	@Override
	public void carregamentoSistema() {
		System.out.println("Carregando Computador ");
		
	}
	
	

}
