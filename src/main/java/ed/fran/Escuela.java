package ed.fran;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre    = "Camilo";
		p.apellidos      = "Juan";
		p.cicloFormativo = "1º DAM/DAW";
		p.anyo           = 2023;
		
		System.out.println(p.toString());

	}

}
