package ed.kico;

public class Persona {
	
	
	public String nombre;
	public String apellidos;
	public int anyo;
	public String cicloformativo;
	
	@Override
	public String toString() {
		
		return  "nombre = " + nombre + System.lineSeparator() +
				"apellidos = " + apellidos + System.lineSeparator() +
				"anyo = " + anyo + System.lineSeparator() +
				"cicloformativo = " + cicloformativo;
				
		
	}

}
