package code;

public class Producto {
	protected String codigo;
	protected String nombre;
	protected Double precioCompra;
	protected Double precioVenta;

	public Producto(String nombre, Double precioCompra, Double precioVenta) {
		this.codigo = java.util.UUID.randomUUID().toString() ;
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	
	protected void mostrarProducto(){
		System.out.println("\tCodigo:" + codigo);
		System.out.println("\tNombre:" + nombre);
		System.out.println("\tPrecio de venta:" + precioVenta);
	}
	
}
