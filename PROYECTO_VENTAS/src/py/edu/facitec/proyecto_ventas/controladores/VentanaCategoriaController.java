package py.edu.facitec.proyecto_ventas.controladores;

import py.edu.facitec.proyecto_ventas.vista.abms.VentanaCategoria;
import py.edu.facitec.reutilizacion.intefaces.AccionesABM;

public class VentanaCategoriaController implements AccionesABM{
	
	private VentanaCategoria vCategoria;

	public VentanaCategoriaController(VentanaCategoria vCategoria) {
		this.vCategoria = vCategoria;
		this.vCategoria.getMiToolbar().setAcciones(this);
	}

	@Override
	public void cancelar() {
		System.out.println("cancelar categoria");
	}

	@Override
	public void eliminar() {
		System.out.println("eliminar categoria");
	}

	@Override
	public void guardar() {
		System.out.println("guardar categoria");
	}

	@Override
	public void modificar() {
		System.out.println("modificar categoria");
	}

	@Override
	public void nuevo() {
		System.out.println("nueva categoria");
	}

	@Override
	public void salir() {
		vCategoria.dispose();
	}
	
	
	
}





