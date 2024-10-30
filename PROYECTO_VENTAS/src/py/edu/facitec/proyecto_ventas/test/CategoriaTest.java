package py.edu.facitec.proyecto_ventas.test;

import java.util.List;

import py.edu.facitec.proyecto_ventas.modelo.dao.CategoriaDAO;
import py.edu.facitec.proyecto_ventas.modelo.entidades.Categoria;

public class CategoriaTest {

	public static void main(String[] args) {
		Categoria categoria = new Categoria();
		categoria.setDescripcion("JUGUETES");
		
		CategoriaDAO dao = new CategoriaDAO();
		try {
			dao.guardar(categoria);
		} catch (Exception e) {
			System.out.println("No se puedo guardar la categoria");
		}
		
		List<Categoria> lista = dao.recuperarTodo();
		for(Categoria c: lista) {
			System.out.println(c.getDescripcion());
		}
		
	}

}







