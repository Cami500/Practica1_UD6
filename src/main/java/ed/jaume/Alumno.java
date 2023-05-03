package ed.jaume;

public class Alumno {
	
	
	public String nombre;
	public String apellido;
	public int anyo;
	public String cicloformativo;
	
	@Override
	public String toString() {
		
		return  "n = " + nombre + System.lineSeparator() +
				"c = " + apellido + System.lineSeparator() +
				"a = " + anyo + System.lineSeparator() +
				"cl = " + cicloformativo;
				
		
	}

}
