package ed.kico;

public class Alumno {
	
	
	public String nombre;
	public String apellidos;
	public int anyo;
	public String cicloformativo;
	
	@Override
	public String toString() {
		
		return  "n = " + nombre + System.lineSeparator() +
				"c = " + apellidos + System.lineSeparator() +
				"a = " + anyo + System.lineSeparator() +
				"cl = " + cicloformativo;
				
		
	}

}
