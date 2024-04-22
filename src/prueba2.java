
public class prueba2 {

	public prueba2() {
	}

	public static void main(String[] args) {
		
		 Punto punto=new Punto(20, 30);
	     Punto pCopia=(Punto)punto.clone();
	        
        System.out.println("punto "+ punto);
        System.out.println("copia "+ pCopia);


	}
	
	public static class Punto implements Cloneable{
	    private int x;
	    private int y;
	   public Punto(int x, int y) {
	        this.x = x;
		    this.y = y;
	    }
	    public Punto() {
	        x=0;
	        y=0;
	    }
	    public Object clone(){
	        Object obj=null;
	        try{
	            obj=super.clone();
	        }catch(CloneNotSupportedException ex){
	            System.out.println(" no se puede duplicar");
	        }
	        return obj;
	    }
	    public void trasladar(int dx, int dy){
	        x+=dx;
	        y+=dy;
	    }
	    public String toString(){
	        String texto="origen: ("+x+", "+y+")";
	        return texto;
	    }
	} 

}
