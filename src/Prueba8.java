
public class Prueba8 {

	public Prueba8() {
	}
	public static int sumatoria=0;
	
	public static void main(String[] args) {
		
			int sumaTmp=0;
			for (int i = 0; i <10; i++) {
				sumaTmp = sumaTmp + i;
			}
			System.out.println(sumaTmp); 
			
			System.out.println(sumaRecursiva(9));
	}
	
	public static int sumaRecursiva(int n) { 
		int res=0;

		if (n==1) {

			return 1;
		}else {
			
			res= n + sumaRecursiva(n-1); 
		}
		return res;
	}
}
