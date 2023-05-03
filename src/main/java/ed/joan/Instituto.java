package ed.joan;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();

		String camilo = "Camilo";
		p.nombre = camilo;
		String juan = "Juan";
		p.apellidos = juan;
		String cl = "1º DAM/DAW";
		p.ciclo_formativo = cl;
		int a = 2023;
		p.anyo = a;
		
		System.out.println(p.toString());

	}

}
