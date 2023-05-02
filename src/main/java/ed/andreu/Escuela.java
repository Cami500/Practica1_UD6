package ed.andreu;

public class Escuela {
	public static void main(String[] args) {
		Persona p = new Persona();
		
		p.nombre = "Andreu";
		p.apellidos = "Puchades Pascual";
		p.cicloFormativo = "1º DAW";
		p.cualquiera = 2023;
		
		System.out.println(p.toString());
	}
}