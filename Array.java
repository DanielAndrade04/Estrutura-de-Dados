public class Array {
	
		//Atributos da Classe
		public int[]a = new int [100];
		
		
		// Metodo Construtor da Classe
		public Array() {
			
		}
		
	}
  
  *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
  
  
public class TestaArray {

	public static void main(String[]args) {
		
		Array v = new Array();
		v.a[1]=24;
		v.a[2]=8;

		System.out.println(v.a[1]+v.a[2]);
		
	}
	
}
