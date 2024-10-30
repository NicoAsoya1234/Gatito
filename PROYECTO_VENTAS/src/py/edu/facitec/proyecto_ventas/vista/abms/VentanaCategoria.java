package py.edu.facitec.proyecto_ventas.vista.abms;

import java.awt.EventQueue;

import javax.swing.JDialog;

import py.edu.facitec.proyecto_ventas.controladores.VentanaCategoriaController;
import py.edu.facitec.reutilizacion.ventanas.VentanaGenerica;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaCategoria extends VentanaGenerica {

	private static final long serialVersionUID = 1L;
	private JTextField tDescripcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCategoria dialog = new VentanaCategoria();
					dialog.setUpController();//crea el controlador
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//metodo que crea una instancia del controlador
	public VentanaCategoriaController setUpController() {
		return new VentanaCategoriaController(this);
	}

	/**
	 * Create the dialog.
	 */
	public VentanaCategoria() {
		
		JLabel lblNewLabel = new JLabel("Descripción");
		lblNewLabel.setBounds(23, 31, 99, 15);
		getPanelFormulario().add(lblNewLabel);
		
		tDescripcion = new JTextField();
		tDescripcion.setBounds(121, 29, 257, 25);
		getPanelFormulario().add(tDescripcion);
		tDescripcion.setColumns(10);

	}

	@Override
	protected String getTitulo() {
		return "Registro de categorías";
	}

	@Override
	protected String getTituloFormulario() {
		return "Datos de la categoría";
	}

}





