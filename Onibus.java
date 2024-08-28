package Interface;

public class Onibus extends TransportesAbstrata {


		@Override
		public void acelerar() {
			System.out.println("Aceleranado o BUS");	
		}

		@Override
		public void freia() {
			System.out.println("Freiar o BUS");
		}

		@Override
		public void virar() {
			System.out.println("Virando o BUS");	
		}

		@Override
		public void ligar() {
			System.out.println("Ligandoo BUS");
			
		}
		
}
