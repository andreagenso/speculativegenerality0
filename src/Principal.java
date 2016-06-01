
import code.Cliente;
import code.ClienteExtranjero;
import code.Producto;
import code.Venta;
import code.Nit;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Nit nit1 = new Nit("538730", "Calle 25 de Mayo 56", "456974");
		Nit nit2 = new Nit("663873", "Calle Uruguay 47", "456974"); 
		
		Cliente cliente1 = new Cliente("538730", "Ana Rios", "Calle 25 de Mayo 56", "456974", nit1);
		Cliente cliente2 = new ClienteExtranjero("663873", "Pedro Mendez", "Calle Uruguay 47", "456974", nit2);
		
		Producto producto1 = new Producto("LAVA VAJILLAS OLA 500 ML", 10.5, 12.5);
		Producto producto2 = new Producto("CERA DE PISO LORITO 20ML", 8.5, 10.5);
		Producto producto3 = new Producto("DETERGENTE OMO 50GR", 2.5, 3.0);
		
		ArrayList<Producto> detalleProductos = new ArrayList<Producto>();
		
		detalleProductos.add(producto1);
		detalleProductos.add(producto2);		
		Venta venta1 = new Venta(java.util.Calendar.getInstance().getTime(), cliente1, detalleProductos, 0.0);
		
		detalleProductos.clear();
		detalleProductos.add(producto2);
		detalleProductos.add(producto3);
		Venta venta2 = new Venta(java.util.Calendar.getInstance().getTime(), cliente2, detalleProductos, 0.0);
		
		
		detalleProductos.clear();
		detalleProductos.add(producto1);
		detalleProductos.add(producto2);
		detalleProductos.add(producto3);
		Venta venta3 = new Venta(java.util.Calendar.getInstance().getTime(), cliente1, detalleProductos, 0.0);	
				
		venta1.imprimirFactura();
		venta2.imprimirFactura();
		venta3.imprimirFactura();				
	}

}
