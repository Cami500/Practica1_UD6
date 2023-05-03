package ed.jaume;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Jaume";
		p.apellido = "Moltó";
		p.cicloformativo = "1º DAM";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
