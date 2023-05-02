package ed.camilo;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.n = "Nuria";
		p.c = "Juan";
		p.cl = "1º DAM/DAW";
		p.a = 2023;
		
		System.out.println(p.toString());

	}

}
