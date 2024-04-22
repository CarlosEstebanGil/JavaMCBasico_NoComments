import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class prueba1 {

	public prueba1() {
		 
	}

	public static void main(String[] args) {
		
		char c1='C';
		char c2= new Character('A');
		String strIncompleteName ="RLITOS \"Esteban\"  \n GIL";
		String name = Character.toString(c1) + Character.toString(c2) + strIncompleteName;
		System.out.println(name);
		
		
		StringBuffer sb = new StringBuffer();
		
		name = sb.append(c1).append(c2).append(strIncompleteName).toString();
		System.out.println(name);
		
		
		name="carlitos";
		System.out.println(name.charAt(0)); 
		System.out.println("----------------------------------------------------------"); 
		
		char[] nameInArray=new char[] {'c','a','r','l','i','t','o','s'};
		for (int i = 0; i < nameInArray.length; i++) {
			System.out.println(Character.toString(nameInArray[i]));
		}
		
		System.out.println("_____________________________________________________________"); 
		
		Character[] nameInWrappersArray= new Character[nameInArray.length]; 
																	
	
		nameInWrappersArray[0]=new Character('c');
		nameInWrappersArray[1]=new Character('a');
		nameInWrappersArray[2]=new Character('r');
		nameInWrappersArray[3]=new Character('l');
		nameInWrappersArray[4]=new Character('i');
		nameInWrappersArray[5]=new Character('t');
		nameInWrappersArray[6]=new Character('o');
		nameInWrappersArray[7]=new Character('s');
		
		
				
		for (Character character : nameInWrappersArray) {
			System.out.println(character.toString());
		}
		
		
		
		Persona p1= new Persona("carlitos", 41); 
												
		
		Persona p2= new Persona("noemi", 73);Persona p3= new Persona("natalia", 40);
		
		
		List<Persona> myArrListOfPersons = new ArrayList<>();
		myArrListOfPersons.add(p1);myArrListOfPersons.add(p2);myArrListOfPersons.add(p3);
		
		for (Persona persona : myArrListOfPersons) {
			System.out.println(persona.toString());
		}
		
		if (p1.compareTo(p2)>0) 
			System.out.println("p1 es mayor edad que p2 ");
		else if (p1.compareTo(p2) == 0) 
			System.out.println("p1 es igual que p2");
		else
			System.out.println("p1 es menor edad que p2" );
		
		
		Collections.sort(myArrListOfPersons);

		for (Persona personaTmp : myArrListOfPersons) {
			System.out.println(personaTmp.toString());
		}
	}

	static class Persona implements Comparable<Persona>{ 
		
		private String nombre; private int edad;
		
		
		public Persona() {}
		public Persona(String nombre,int edad) {
			this.nombre = nombre; this.edad=edad;
		}
		
		
	    public int compareTo(Persona p) { 
	        return this.edad - p.edad; 
	    } 
	    
	    
	    public String toString() {
			return "nombre: " + this.nombre + " edad: " + this.edad; }
	    
	    public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
	} 
	
}

