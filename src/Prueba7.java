import java.util.ArrayList;
import java.util.List;

public class Prueba7 {
	
	//HILOS (THREADS)
	
	public Prueba7() {
	}

	public static String nombre="Main";
	
	public static void main(String[] args) throws Exception{
		HHilo miHilo1 = new HHilo("HILO 1");

		miHilo1.sleep(50);
		miHilo1.start();
		miHilo1.join();
		

		Thread miHilo2 = new Thread(new RHilo("HILO 2"));
	
		miHilo2.start();
		miHilo2.join();
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("[A]Ejecutandose....");
			}
		};
		Thread miHilo3 = new Thread(r);
		miHilo3.start();

		if (!miHilo3.isAlive()) {
			miHilo3.start();
		} 
		miHilo3.join();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(nombre + "  " + Integer.toString(i));
			Thread.sleep(10);
			
		}
		
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				String[] strArr=MiSingletonResourceManager.getInstance();
				for (int i = 0; i < strArr.length; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread h1= new Thread ( r1);
		h1.start();
		Thread h2= new Thread ( r1);
		h2.start();
		
		vida=10;
		recibirGolpe(12);
		
		Productor productor=new Productor(productos);
		Consumidor consumidor1 = new Consumidor(productos,"consumidor1");
		Consumidor consumidor2 = new Consumidor(productos,"consumidor2");
		Consumidor consumidor3 = new Consumidor(productos,"consumidor3");
		Consumidor consumidor4 = new Consumidor(productos,"consumidor4");
		
		Thread t00=new Thread(productor);
		
		Thread t01=new Thread(consumidor1);
		Thread t02=new Thread(consumidor2);
		Thread t03=new Thread(consumidor3);
		Thread t04=new Thread(consumidor4);
		
		t00.start();
		
		t01.start();
		t02.start();
		t03.start();
		t04.start();
		
	}
	public static int vida=0;
	public static int curacion=5;
	
	public static void recibirGolpe(int cantidad) {
		vida=vida-cantidad;		//(a)
		vida=vida + curacion;	//(b)
	}
	
	public static boolean estaMuerto() {
		return (vida<=0);
	}
	
	public static List<String> productos = new ArrayList<String>();
	
}
