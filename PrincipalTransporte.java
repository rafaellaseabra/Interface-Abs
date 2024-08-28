package Interface;

public class PrincipalTransporte {

	public static void main(String[] args) {
		
		CarroAbs car = new CarroAbs();
		Onibus busao = new Onibus();

		System.out.println("°°°°°°°°°°°°°°°°°°°Car°°°°°°°°°°°°°°°°°°°°°°");
		car.acelerar();
		car.freia();
		car.virar();
		car.ligar();
		
		System.out.println("°°°°°°°°°°°°°°°°°°°Busão°°°°°°°°°°°°°°°°°°°°°°");
		busao.acelerar();
		busao.freia();
		busao.virar();
		busao.ligar();
		
	}

}
