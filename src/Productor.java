import java.util.List;

public class Productor implements Runnable {
	private List<String> productos=null;
	
	public Productor(List<String> productosParam) {
		 this.productos=productosParam;
	}

	@Override
	public void run() {
		while(true) { 
			try {	  
				Thread.sleep(4000);			
				
				synchronized (productos) {		
					productos.add("producto");		
					productos.notify();			
												
					System.out.println("Agregué un producto a la lista");
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
