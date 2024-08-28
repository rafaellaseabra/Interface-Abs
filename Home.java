package Interface;

public class Home implements Computador {

	@Override
	public void ligar() {
		System.out.println("Ligando Computador ");
		
	}

	@Override
	public void reiniciar() {
		System.out.println("Reinigando Computador ");
		
	}

	@Override
	public void desligar() {
		System.out.println("Desligando Computador ");
		
	}

	@Override
	public void carregamentoSistema() {
		System.out.println("Carregando o sistema do Computador ");
		
	}
  
}
