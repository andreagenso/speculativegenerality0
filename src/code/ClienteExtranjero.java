package code;

public class ClienteExtranjero extends Cliente {
	
	protected Double patrimonio;
	
	public ClienteExtranjero(String ci, String nombre, String direccion, String telefono, Nit nit){
		super(ci, nombre, direccion, telefono, nit);
	}
	
	public void declararPatrimonio(Double patrimonio){
		this.patrimonio = patrimonio;
	}
}
