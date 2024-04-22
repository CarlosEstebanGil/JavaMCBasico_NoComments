
public class MiSingletonResourceManager {
	
	public static String[] instance=null; 
	
	private MiSingletonResourceManager() {
		
	}
	
	public static String[]  getInstance() { 
		synchronized (MiSingletonResourceManager.class) {
			if (instance==null) {
				instance=new String[1000]; 
				System.out.println("SE HA CREADO UNA INSTANCIA DEL RECURSO");
				for (int i = 0; i < instance.length; i++) {
					instance[i]=new String("RECURSO");
				}
			}
			return instance;
		}
	}

	
}
