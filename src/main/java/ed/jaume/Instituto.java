package ed.jaume;

public class Instituto {

	public static final String kJAUME = "Jaume";
	public static final String kMIROCORCOLES = "Miro";
	public static final String k1ºDAW = "1º DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kJAUME;
		p.apellidos = kMIROCORCOLES;
		p.cicloFormativo = k1ºDAW;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
