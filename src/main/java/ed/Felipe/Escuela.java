package ed.Felipe;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();

		String camilo = "Camilo";
		p.n = camilo;
		String juan = "Juan";
		p.c = juan;
		String cl = "1º DAM/DAW";
		p.cl = cl;
		p.a = 2023;
		
		System.out.println(p.toString());

	}

}
