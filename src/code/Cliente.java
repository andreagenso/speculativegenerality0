package code;

public class Cliente {
	protected String ci;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	protected Nit nit;
	
	public Cliente(String ci, String nombre, String direccion, String telefono, Nit nit){
		this.ci = ci;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nit = nit;
	}
	
	public void mostrarCliente(Cliente cliente){
		System.out.println("Datos del cliente:");
		System.out.println("\tCI: " + cliente.ci );
		System.out.println("\tNombre: " + cliente.nombre );
		System.out.println("\tDireccion: " + cliente.direccion );
		System.out.println("\tTelefono: " + cliente.telefono );
		System.out.println("\tNIT: " + cliente.nit.getDatosNit() );		
	}
	
}
