package py.edu.facitec.proyecto_ventas.controladores;

import javax.swing.JOptionPane;

import py.edu.facitec.proyecto_ventas.modelo.dao.ClienteDAO;
import py.edu.facitec.proyecto_ventas.modelo.entidades.Cliente;
import py.edu.facitec.proyecto_ventas.util.FechaUtil;
import py.edu.facitec.proyecto_ventas.vista.abms.VentanaCliente;
import py.edu.facitec.reutilizacion.intefaces.AccionesABM;

public class VentanaClienteController implements AccionesABM{
	
	private VentanaCliente vCliente;
	private ClienteDAO dao;
	private Cliente cliente;

	public VentanaClienteController(VentanaCliente vCliente) {
		this.vCliente = vCliente;
		this.vCliente.getMiToolbar().setAcciones(this);
		
		dao = new ClienteDAO();
		estadoInicial(true);
	}
	
	private void estadoInicial(boolean esInicial) {
		vCliente.gettNombre().setEnabled( ! esInicial);
		vCliente.gettApellido().setEnabled( ! esInicial);
		vCliente.gettDocumento().setEnabled( ! esInicial);
		vCliente.gettTelefono().setEnabled( ! esInicial);
		vCliente.gettEmail().setEnabled( ! esInicial);
		vCliente.gettFechaRegistro().setEnabled( ! esInicial);
		vCliente.getCheckActivo().setEnabled( ! esInicial);
		
		vCliente.getMiToolbar().estadoInicial(esInicial);
		
		
	}
	private void limpiarCampos() {
		vCliente.gettNombre().setText("");
		vCliente.gettApellido().setText("");
		vCliente.gettDocumento().setText("");
		vCliente.gettTelefono().setText("");
		vCliente.gettEmail().setText("");
		vCliente.gettFechaRegistro().setValue(null);
		vCliente.getCheckActivo().setEnabled(true);

		
		
		
	}

	@Override
	public void cancelar() {
		estadoInicial(true);
		limpiarCampos();
	}

	@Override
	public void eliminar() {
		System.out.println("eliminar cliente");
	}

	@Override
	public void guardar() {
		cliente = new Cliente();
		cliente.setNombre(vCliente.gettNombre().getText());
		cliente.setApellido(vCliente.gettApellido().getText());
		cliente.setDocumento(vCliente.gettDocumento().getText());
		cliente.setEmail(vCliente.gettEmail().getText());
		cliente.setFechaRegistro(FechaUtil.convertirStringADate(vCliente.gettFechaRegistro().getText()));
		cliente.setActivo(vCliente.getCheckActivo().isSelected());
		
		try {
			dao.guardar(cliente);
			estadoInicial(true);
			limpiarCampos();
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(vCliente, "No se pudo guardar el cliente ");
		}
	}

	@Override
	public void modificar() {
		estadoInicial(false);
	}

	@Override
	public void nuevo() {
		estadoInicial(false);
	}

	@Override
	public void salir() {
		vCliente.dispose();
	}
	
	
	
}





