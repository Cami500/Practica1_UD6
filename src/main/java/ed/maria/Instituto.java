package ed.maria;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Maria";
	public static final String kAPELLIDOS_ALUMNO = "Ruiz";
	public static final String kCICLO_FORMATIVO = "1º DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
