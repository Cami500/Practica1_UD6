package ed.javier;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Javier";
		p.apellidos = "Guijarro";
		p.cicloFormativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
