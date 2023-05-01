package ed.arthur;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Arthur";
		p.c = "Dias";
		p.cicloFormativo = "1º DAW";
		p.a = 2023;
		
		System.out.println(p.toString());

	}

}
