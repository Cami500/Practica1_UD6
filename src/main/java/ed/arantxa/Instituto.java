package ed.arantxa;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Arantxa";
		p.apellidos = "Gandia";
		p.ciclo_formativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
