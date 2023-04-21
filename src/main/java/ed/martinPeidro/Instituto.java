package ed.martinPeidro;

public class Instituto {

	private static final int ANYO = 2023;
	private static final String CICLO_FORMATIVO = "1º DAM";
	private static final String APELLIDOS_ALUMNO = "Peidro";
	private static final String NOMBRE_ALUMNO = "Martín";

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		
		p.nombre = NOMBRE_ALUMNO;
		
		p.apellidos = APELLIDOS_ALUMNO;
		
		p.cicloFormativo = CICLO_FORMATIVO;
		
		p.anyo = ANYO;
		
		System.out.println(p.toString());

	}

}
