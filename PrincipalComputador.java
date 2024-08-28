package Interface;

public class PrincipalComputador {

	public static void main(String[] args) {
		
		Gamer computador = new Gamer ();
		Home notebook = new Home ();
		
		System.out.println("°°°°Computador GAME°°°°");
		computador.ligar();
		computador.reiniciar();
		computador.desligar();
        computador.carregamentoSistema();
        
        System.out.println("");
        System.out.println("°°°°Notebook Home°°°°");
        notebook.ligar();
        notebook.reiniciar();
        notebook.desligar();
        notebook.carregamentoSistema();
        
        
        
	}
	

}
