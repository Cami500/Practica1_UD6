package ed.camilo;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Eric";
		p.apellidos = "Camps Palmer";
		p.cicloFormativo = "1º DAW";
		p.anyo = 2022;
		
		System.out.println(p.toString());

	}

}
