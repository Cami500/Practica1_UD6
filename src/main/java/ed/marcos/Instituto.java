package ed.marcos;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Marcos";
		p.apellidos = "Sanz";
		p.cicloFormativo = "1º DAM/DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
