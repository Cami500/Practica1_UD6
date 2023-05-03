package ed.roger;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Roger";
		p.apellido = "Moll";
		p.cicloFormativo = "1º DAM";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
