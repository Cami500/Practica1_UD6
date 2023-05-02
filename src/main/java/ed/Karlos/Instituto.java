package ed.Karlos;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Karlos";
		p.apellidos = "Chávez";
		p.ciclo_formativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
