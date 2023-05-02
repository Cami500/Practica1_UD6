package ed.doha;

public class Instituto {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "Doha";
		p.apellidos = "Aliat";
		p.cicloFormativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
