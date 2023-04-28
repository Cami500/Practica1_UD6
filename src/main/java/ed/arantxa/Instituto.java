package ed.arantxa;

public class Instituto {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "Arantxa";
		p.apellidos = "Gandia";
		p.ciclo_formativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
