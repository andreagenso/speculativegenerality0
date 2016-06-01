package code;

import java.util.ArrayList;

public class Venta {
	protected String codigo;
	protected java.util.Calendar fecha = java.util.Calendar.getInstance();
	protected Double descuento;
	protected Cliente cliente;
	protected ArrayList<Producto> detalleProductos = new ArrayList<Producto>();
	
	public Venta(java.util.Date fecha, Cliente cliente, ArrayList<Producto> detalleProductos, Double descuento) {
		this.codigo = java.util.UUID.randomUUID().toString() ;		
		this.descuento = descuento;
		this.detalleProductos = detalleProductos;
		this.cliente = cliente;
	}
	
		
	private Double totalVenta() {
		Double total = 0.0;
		
		for (int i=0;i<detalleProductos.size();i++) {
			total = total + detalleProductos.get(i).precioVenta;			
		}
		return total;
	}
	
	
	public void imprimirFactura(){
		System.out.println("Datos de la venta:");
		System.out.println("\tCodigo: " + codigo);
		System.out.println("\tFecha: " + fecha.get(java.util.Calendar.DAY_OF_MONTH) + 
				"/" + fecha.get(java.util.Calendar.MONTH) + "/" + fecha.get(java.util.Calendar.YEAR));
		System.out.println("\tDescuento: " + descuento);
		cliente.mostrarCliente(cliente);
		System.out.println("\tDetalle de productos: ");		
		for (int i=0;i<detalleProductos.size();i++) {
			detalleProductos.get(i).mostrarProducto();			
		}
		System.out.println("\tTOTAL: " + totalVenta());
		
	}
	
}
