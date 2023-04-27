package ed.izan;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "Izan";
		p.apellidos = "Blanes";
		p.cicloFormativo = "1º DAM";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
