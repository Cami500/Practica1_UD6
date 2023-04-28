package ed.tatiana;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();

		String nombre = "Camilo";
		p.nombre = nombre;
		String apellido = "Juan";
		p.apellidos = apellido;
		String ciclo_formativo = "1º DAM/DAW";
		p.ciclo_formativo = ciclo_formativo;
		int anyo = 2023;
		p.anyo = anyo;
		
		System.out.println(p.toString());

	}

}
