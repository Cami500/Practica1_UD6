package ed.camilo;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Nuria";
		p.apellidos = "Boronat";
		p.cicloFormativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
