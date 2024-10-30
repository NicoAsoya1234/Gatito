package py.edu.facitec.proyecto_ventas.modelo.dao;

import java.util.List;

import org.hibernate.query.Query;

import py.edu.facitec.proyecto_ventas.modelo.entidades.Cliente;

public class ClienteDAO extends GenericDAO<Cliente>{
	
	public ClienteDAO() {
		super (Cliente.class);
		
	}

	@Override
	public List<Cliente> recuperarPorFiltro(String filtro) {
		iniciarTransaccion();
		String hql = "from cliente where upper(nombre) like :filtro "
				+ "or upper(apellido) like :filtro "
				+ "order id desc";
		Query<Cliente> query = getSession().createQuery(hql, Cliente.class);
		//pasamos los parametros
		query.setParameter("filtro", "%" + filtro.toUpperCase()+ "%");
		//recuperamos los resultados y cerramos la transaccion
		List<Cliente> lista = query.getResultList();
		getSession().getTransaction().commit();
		//devuelve la lista de resultados 
		return null;
	}
	

}
