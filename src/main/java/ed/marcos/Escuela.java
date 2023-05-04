package ed.marcos;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.n = "Marcos";
		p.c = "Sanz";
		p.cl = "1º DAM/DAW";
		p.a = 2023;
		
		System.out.println(p.toString());

	}

}
