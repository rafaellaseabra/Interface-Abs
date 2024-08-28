package Interface;



public class Calculando implements Calculo{
	 
	
	 double a,b, soma, sub, mult;
     int x,y;
     
     
	@Override
	public double somar() {
		System.out.println("O resultado da soma é: ");
		soma = 2+2;
		return soma;
	}

	@Override
	public double subtracao() {
		System.out.println("O resultado da subtração é: ");
		return 4-2;
	}

	@Override
	public double multiplicacao() {
		System.out.println("O resultado da multiplicação: ");
		return 4*2;
	}

	@Override
	public int divisao() {
		System.out.println("O resultado da divisão é: ");
		return 2%4;
	}

	@Override
	public int exp() {
		System.out.println("O resultado do expoente: ");
		return 4^2;
	}
	
	

}
