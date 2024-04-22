import java.util.Scanner;

public class Prueba3 {

	public Prueba3() {
	}

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre?");
		String nombreIngresado= inputScanner.next();
		System.out.println("Tu nombre es: " + nombreIngresado);
		
		System.out.println("Ingrese su edad:");
		int numeroIngresado = inputScanner.nextInt();
		System.out.println("Tu edad es:" + Integer.toString(numeroIngresado));
		
		inputScanner.close();
		
		
		String []arreglo = new String[2]; 
		
		
		arreglo[0]="carlitos";
		arreglo[1]="gil";
		for (String string : arreglo) { 
			System.out.println(string); 
		}
		
		System.out.println("______________________________________________________________");
		int[]arregloDeInts=new int[2];
		arregloDeInts[0]=1;
		arregloDeInts[1]=2;
		for (int i : arregloDeInts) { 
			System.out.println("numero: "+Integer.toString(i));
		} 
		

		int[]edades = new int[5];
		edades[0]=5;edades[1]=4;edades[2]=6;edades[3]=1;edades[4]=0;
		
		int max = edades[0]; 

		
		for (int i : edades) { 
			if(i>max) 
				max=i;
		}
		System.out.println("La edad mayor es "+ Integer.toString(max));
		
	}

}

