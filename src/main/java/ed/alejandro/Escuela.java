package ed.alejandro;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.n = "Alejandro";
		p.c = "Pons";
		p.cl = "1º DAW";
		p.a = 2023;
		
		System.out.println(p.toString());

	}

}
