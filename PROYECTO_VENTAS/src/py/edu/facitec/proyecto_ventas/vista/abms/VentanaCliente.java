package py.edu.facitec.proyecto_ventas.vista.abms;

import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import py.edu.facitec.proyecto_ventas.controladores.VentanaClienteController;
import py.edu.facitec.proyecto_ventas.util.FechaUtil;
import py.edu.facitec.reutilizacion.ventanas.VentanaGenerica;

public class VentanaCliente extends VentanaGenerica {

	private static final long serialVersionUID = 1L;
	private JTextField tNombre;
	private JTextField tApellido;
	private JTextField tDocumento;
	private JTextField tTelefono;
	private JTextField tEmail;
	private JFormattedTextField tFechaRegistro;
	private JCheckBox checkActivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCliente dialog = new VentanaCliente();
					dialog.setUpController();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//metodo que crea una instancia del controlador
	public VentanaClienteController setUpController() {
		return new VentanaClienteController(this);
	}

	/**
	 * Create the dialog.
	 */
	public VentanaCliente() {
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(12, 28, 92, 15);
		getPanelFormulario().add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Apellido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(12, 55, 92, 15);
		getPanelFormulario().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(12, 82, 92, 15);
		getPanelFormulario().add(lblNewLabel_1);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(12, 109, 92, 15);
		getPanelFormulario().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(12, 136, 92, 15);
		getPanelFormulario().add(lblEmail);
		
		JLabel lblFRegistro = new JLabel("F. Registro");
		lblFRegistro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFRegistro.setBounds(12, 163, 92, 15);
		getPanelFormulario().add(lblFRegistro);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setBounds(12, 190, 92, 15);
		getPanelFormulario().add(lblEstado);
		
		tNombre = new JTextField();
		tNombre.setBounds(112, 26, 266, 19);
		getPanelFormulario().add(tNombre);
		tNombre.setColumns(10);
		
		tApellido = new JTextField();
		tApellido.setColumns(10);
		tApellido.setBounds(112, 53, 266, 19);
		getPanelFormulario().add(tApellido);
		
		tDocumento = new JTextField();
		tDocumento.setColumns(10);
		tDocumento.setBounds(112, 80, 146, 19);
		getPanelFormulario().add(tDocumento);
		
		tTelefono = new JTextField();
		tTelefono.setColumns(10);
		tTelefono.setBounds(112, 107, 146, 19);
		getPanelFormulario().add(tTelefono);
		
		tEmail = new JTextField();
		tEmail.setColumns(10);
		tEmail.setBounds(112, 134, 266, 19);
		getPanelFormulario().add(tEmail);
		
		tFechaRegistro = new JFormattedTextField(FechaUtil.getMascara());
		tFechaRegistro.setBounds(112, 161, 139, 19);
		getPanelFormulario().add(tFechaRegistro);
		
		checkActivo = new JCheckBox("Activo");
		checkActivo.setSelected(true);
		checkActivo.setBounds(112, 186, 129, 23);
		getPanelFormulario().add(checkActivo);
		//setBounds(100, 100, 450, 300);

	}

	@Override
	protected String getTitulo() {
		return "Registro de clientes";
	}

	@Override
	protected String getTituloFormulario() {
		return "Datos del cliente";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public JTextField gettApellido() {
		return tApellido;
	}

	public JTextField gettDocumento() {
		return tDocumento;
	}

	public JTextField gettTelefono() {
		return tTelefono;
	}

	public JTextField gettEmail() {
		return tEmail;
	}

	public JFormattedTextField gettFechaRegistro() {
		return tFechaRegistro;
	}

	public JCheckBox getCheckActivo() {
		return checkActivo;
	}
	
}







