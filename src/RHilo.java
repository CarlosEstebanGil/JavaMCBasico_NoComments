
public class RHilo implements Runnable {
	String nombre=null;
	
	public RHilo() {
	}
	public RHilo(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(nombre + "  " + Integer.toString(i));
		}
		
	}

}
