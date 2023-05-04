package ed.alvaro;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Alvaro";
		p.apellidos = "Lucas";
		p.cicloFormativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
