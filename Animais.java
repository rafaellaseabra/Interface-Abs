package Interface;

public class Animais extends Animal {
	
	   @Override
	   public void som() {
		   System.out.println( "emite um som");
		}
	   @Override
		public void dormir() {
		   System.out.println("dormir");
		}
		@Override
		public void comer(){
			System.out.println ("comer") ;
	   }
		@Override
		public void andar() {
			System.out.println("caminha");
		}

}
