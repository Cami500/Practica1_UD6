package ed.erika;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Erika";
		p.apellidos = "Ballesteros";
		p.cicloFormativo = "1º DAM";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
