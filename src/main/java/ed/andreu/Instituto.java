package ed.andreu;

public class Instituto {
	public static void main(String[] args) {
		Alumno p = new Alumno();
		
		p.nombre = "Andreu";
		p.apellidos = "Puchades Pascual";
		p.cicloFormativo = "1º DAW";
		p.cualquiera = 2023;
		
		System.out.println(p.toString());
	}
}