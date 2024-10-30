package py.edu.facitec.proyecto_ventas.modelo.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendedores")
public class Vendedor extends Persona {
	
	private Date fechaNacimiento;

	public Vendedor() {
		
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
