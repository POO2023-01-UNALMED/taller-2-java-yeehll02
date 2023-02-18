package test;


public class Auto {
	public String modelo;
	public int precio;
	public Asiento [] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int numeroAsientos=0;
		for (int i=0; i<asientos.length; i++ ) {
				if(asientos[i] != null) {
					numeroAsientos++;
				}
		}
		return numeroAsientos;
	}
	
	
	public String verificarIntegridad() {
		if(registro==motor.registro) {
			for(int i=0; i<asientos.length; i++ ) {
				if (asientos[i] != null && asientos[i].registro != registro) {
					return "Las piezas no son originales";
				}
			}
			return "Auto original";
			
		} else {
			return "Las piezas no son originales";
			
		}
		
	}
}
