package py.edu.facitec.proyecto_ventas.modelo.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import py.edu.facitec.proyecto_ventas.util.ConnectionHelper;

public abstract class GenericDAO <T>{
	
	private Class<T> clase;
	
	public GenericDAO(Class<T> clase) {
		this.clase = clase;
	}

	protected Session getSession() {
		return ConnectionHelper.getSessionFactory().getCurrentSession();
	}
	
	protected void iniciarTransaccion() {
		if( ! getSession().getTransaction().isActive() ) {
			getSession().beginTransaction();
		}
	}
	
	public void guardar(T entity) throws Exception{
		iniciarTransaccion();
		try {
			getSession().merge(entity);
			getSession().getTransaction().commit();
		} catch (Exception e) {
			getSession().getTransaction().rollback();
			throw e;
		}
	}
	
	public void eliminar(T entity) throws Exception{
		iniciarTransaccion();
		try {
			getSession().remove(entity);
			getSession().getTransaction().commit();
		} catch (Exception e) {
			getSession().getTransaction().rollback();
			throw e;
		}
	}
	
	public T recuperarPorId(Serializable id) {
		iniciarTransaccion();
		T result = getSession().get(clase, id);
		getSession().getTransaction().commit();
		return result;
	}
	
	public List<T> recuperarTodo(){
		iniciarTransaccion();
		Query<T> query = getSession().createQuery(
				"from "+clase.getName()+" order by id" ,clase);
		List<T> lista = query.getResultList();
		getSession().getTransaction().commit();
		return lista;
	}
	
	abstract public List<T> recuperarPorFiltro(String filtro);

}






