package ed.kico;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "Kico";
		p.apellidos = "Carbonell";
		p.cicloformativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
