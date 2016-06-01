package code;

public class Nit {
	
	protected String nroNit;
	protected String direccion;
	protected String telefono;
		
	public Nit(String nroNit, String direccion, String telefono){
		this.nroNit = nroNit;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getDatosNit(){		
		return (nroNit + " " + direccion + " " + telefono);
	}
}