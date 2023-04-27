package ed.izan;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Izan";
		p.apellidos = "Blanes";
		p.cicloFormativo = "1º DAM";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
