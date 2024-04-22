
public class HHilo extends Thread { 

	String nombre=null;
	
	public HHilo() {
	}

	public HHilo(String nombre) {
		this.nombre=nombre;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(nombre + "  " + Integer.toString(i));
			
		}
	}

	
}
