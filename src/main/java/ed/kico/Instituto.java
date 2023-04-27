package ed.kico;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Kico";
		p.apellidos = "Carbonell";
		p.cicloformativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());
	}
}
