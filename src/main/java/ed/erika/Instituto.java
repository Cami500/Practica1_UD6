package ed.erika;

public class Instituto {

	public static final String ERIKA = "Erika";
	public static final String BALLESTEROS = "Ballesteros";
	public static final String CICLO_FORMATIVO = "1º DAM";
	public static final int ANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = ERIKA;
		p.apellidos = BALLESTEROS;
		p.cicloFormativo = CICLO_FORMATIVO;
		p.anyo = ANYO;
		
		System.out.println(p.toString());

	}

}
