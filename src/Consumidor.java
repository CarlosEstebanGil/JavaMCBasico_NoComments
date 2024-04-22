import java.util.List;

public class Consumidor implements Runnable {
	private String name="";
	private List<String> productos=null;
	
	public Consumidor(List<String> productosParam,String name) {
		this.name = name;
		 this.productos=productosParam;
	}

		

	@Override
	public void run() {
		try {
			synchronized(productos) { 
									  
				if(productos.size()==0) {
					System.out.println("no hay productos, me quedo acá hasta que me notifiquen que haya");
					productos.wait();   
										
										
					productos.remove(0); 
					System.out.println(name + " -> Consumí un producto de la lista");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
