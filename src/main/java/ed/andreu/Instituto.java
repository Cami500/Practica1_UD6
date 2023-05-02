package ed.andreu;

public class Instituto {
	final static String kNOMBRE_ALUMNO = "Camilo";
	final static String kAPELLIDOS_ALUMNO = "Juan";
	final static String kCICLO_FORMATIVO = "1º DAM/DAW";
	final static int kANYO = 2023;

	public static void main(String[] args) {
		Alumno p = new Alumno();
		
		p.nombre = "Andreu";
		p.apellidos = "Puchades Pascual";
		p.cicloFormativo = "1º DAW";
		p.cualquiera = 2023;
		
		System.out.println(p.toString());
	}
}