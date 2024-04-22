import java.util.Random;

public class Prueba5 {

	public Prueba5() {
	}
	
	public static void main(String[] args) {
		
		int [] [] matrizDeInts = new int[2][2];
		
		for (int i = 0; i < matrizDeInts.length; i++) {
			for (int j = 0; j < matrizDeInts.length; j++) {
				matrizDeInts[i][j]=new Random().nextInt();
			}
		}
		
		for (int i = 0; i < matrizDeInts.length; i++) {
			for (int j = 0; j < matrizDeInts.length; j++) {
				System.out.println(Integer.toString(matrizDeInts[i][j]));
			}
		}
		
		System.out.println("________________________________________________________");
		

			matrizDeInts=new int[3][3];
			matrizDeInts[0][0]=1; matrizDeInts[0][1]=2;matrizDeInts[0][2]=8;
			matrizDeInts[1][0]=2; matrizDeInts[1][1]=1;matrizDeInts[1][2]=0;
			matrizDeInts[2][0]=7; matrizDeInts[2][1]=6;matrizDeInts[2][2]=5;
			
			
			for (int i = 0; i < matrizDeInts.length; i++) {
				System.out.println(Integer.toString(matrizDeInts[i][i]));
			}
		   
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < matrizDeInts.length; i++) {
				for (int j = 0; j < matrizDeInts.length; j++) {
					if (i==j) 
						System.out.print(i);
					else
						System.out.print(0);
				}
				System.out.print("\n");
			}
	}
	
	

}
