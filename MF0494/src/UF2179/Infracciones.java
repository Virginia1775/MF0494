package UF2179;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Infracciones extends JFrame {

	private JPanel contentPane;
	private JTextField txtMatricula;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JComboBox comboBoxSancion;
	private JLabel lblImporte;
	private JTextArea textAreaMostrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infracciones frame = new Infracciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Infracciones() {
		setTitle("INFRACCIONES");
		setFont(new Font("Dialog", Font.BOLD, 18));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Virginia\\Pictures\\Saved Pictures\\71494590.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][][][]", "[][][][][][grow]"));
		
		JLabel lblMatrícula = new JLabel("Matr\u00EDcula");
		lblMatrícula.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblMatrícula, "cell 0 0,alignx trailing");
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(txtMatricula, "cell 1 0 2 1,growx");
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_1, "cell 3 0,alignx center");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(txtNombre, "cell 4 0,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_2, "cell 0 1,alignx trailing");
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(txtApellidos, "cell 1 1 4 1,growx");
		txtApellidos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sancion");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel, "cell 0 2,alignx trailing");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 2 4 1,grow");
		
		 comboBoxSancion = new JComboBox();
		comboBoxSancion.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculaPrecio();
			}
		});
		scrollPane.setViewportView(comboBoxSancion);
		comboBoxSancion.setModel(new DefaultComboBoxModel(new String[] {"No llevar Casco", "Conduccion Temeraria"}));
		comboBoxSancion.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_3 = new JLabel("Importe");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel_3, "cell 0 3");
		
		lblImporte = new JLabel("");
		lblImporte.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblImporte, "cell 2 3");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraResultado();
				
			}
		});
		contentPane.add(btnAceptar, "cell 0 4 5 1,alignx center");
		
		 textAreaMostrar = new JTextArea();
		contentPane.add(textAreaMostrar, "cell 1 5 4 1,grow");
	}

	protected void muestraResultado() {
		int importe = Integer.parseInt(lblImporte.getText());
		double descuento=importe/2;
		double precioFinal= importe-descuento;
		
		String seleccionado = (String) comboBoxSancion.getSelectedItem();
		textAreaMostrar.setText(textAreaMostrar.getText()+ "Conductor "+txtNombre.getText()+ " "+ txtApellidos.getText()+
			    "\n"+ " Infracción: "+seleccionado+ "\n"+  "importe: "+importe+"\n"+
			     " pronto pago: "+descuento + precioFinal+"\n");
			
		
	}

	protected void calculaPrecio() {
		String seleccionado = (String) comboBoxSancion.getSelectedItem();
		if (seleccionado.equals("No llevar casco")) {
			lblImporte.setText("200");
		
		} else {
			lblImporte.setText("500");
		}
		
	}

}
