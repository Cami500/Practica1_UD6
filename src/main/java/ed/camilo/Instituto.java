package ed.camilo;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Nuria";
	public static final String kAPELLIDOS_ALUMNO = "Boronat";
	public static final String kCICLO_FORMATIVO = "1º DAW";
	public static final int Kanyo = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.anyo = Kanyo;
		
		System.out.println(p.toString());

	}

}
