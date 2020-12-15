public class HomeClass{
	public class Krysha(){
		public Krysha(){
			buildKrysha();	
		}
		public void buildKrysha(){
			System.out.println("Заложен фундамент!");
		}
	}
	
	public static void main(String[] argv){
		System.out.println("Init Home!");
		System.out.println("Заложен фундамент!");
		Krysha krysha = new Krysha();
	}
}