package ed.kico;

public class Instituto {

	public static String kNOMBRE_ALUMNO = "Kico";
	public static String kAPELLIDO_ALUMNO = "Carbonell";
	public static String kCICLO_FORMATIVO = "1º DAW";
	public static int kANYO = 2023;
	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Kico";
		p.apellidos = "Carbonell";
		p.cicloformativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());
	}
}
