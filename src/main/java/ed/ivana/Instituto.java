package ed.ivana;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Ivana";
		p.apellido = "Plamenova";
		p.ciclo_formativo = "1º DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
