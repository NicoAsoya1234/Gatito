package py.edu.facitec.proyecto_ventas.modelo.dao;

import java.util.List;

import py.edu.facitec.proyecto_ventas.modelo.entidades.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria> {

	public CategoriaDAO() {
		super(Categoria.class);
	}

	@Override
	public List<Categoria> recuperarPorFiltro(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
