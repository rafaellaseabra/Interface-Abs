package Interface;

public class Tigre {

	public static void main(String[] args) {
		
		Animal tigrinho = new Animais ();
		Animal lobo = new Animais();
		Animal leao = new Animais();
		Animal gato = new Animais();
		Animal cachorro = new Animais();
		
		System.out.println("");
		System.out.println("°°°°°°°°°°°°°°°°°TIGRE°°°°°°°°°°°°°°°°");
		tigrinho.setNome("Simba ");
		tigrinho.setSexo("M");
		tigrinho.setRaca("Tigre-siberiano");
		
		System.out.println(tigrinho.getnome());
		System.out.println(tigrinho.getSexo());
		System.out.println(tigrinho.getRaca());
		tigrinho.andar();
		tigrinho.comer();
		tigrinho.som();
		tigrinho.dormir();
		
		System.out.println("");
		System.out.println("°°°°°°°°°°°°°°°°°LOBO°°°°°°°°°°°°°°°°");
		lobo.setNome("lobo-vermelho ");
		lobo.setSexo("M");
		lobo.setRaca("Canis rufus");
		
		System.out.println(lobo.getnome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());
		lobo.andar();
		lobo.comer();
		lobo.som();
		lobo.dormir();
		
		System.out.println("");
		System.out.println("°°°°°°°°°°°°°°°°°LEÃO°°°°°°°°°°°°°°°°");
		leao.setNome("Panthera ");
		leao.setSexo("M");
		leao.setRaca("Panthera leo");
		
		System.out.println(leao.getnome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());
		leao.andar();
		leao.comer();
		leao.som();
		leao.dormir();
		
		System.out.println("");
		System.out.println("°°°°°°°°°°°°°°°°°GATO°°°°°°°°°°°°°°°°");
		gato.setNome("Marry ");
		gato.setSexo("F");
		gato.setRaca("Himalaio");
		
		System.out.println(gato.getnome());
		System.out.println(gato.getSexo());
		System.out.println(gato.getRaca());
		gato.andar();
		gato.comer();
		gato.som();
		gato.dormir();
		
		System.out.println("");
		System.out.println("°°°°°°°°°°°°°°°°°CACHORRO°°°°°°°°°°°°°°°°");
		cachorro.setNome("Belinha ");
		cachorro.setSexo("F");
		cachorro.setRaca("Shih Tzu");
		
		
		System.out.println(cachorro.getnome());
		System.out.println(cachorro.getSexo());
		System.out.println(cachorro.getRaca());
		cachorro.andar();
		cachorro.comer();
		cachorro.som();
		cachorro.dormir();
		
	}

}
