package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class VentanaAutocar extends JFrame {

	private JPanel contentPane;
	private JTextField textResMarca;
	private JTextField textResKm;
	private JTextField textResModelo;
	private JTextField textResMatricula;
	private ArrayList<Autocar> listaAutocar;
	private JTextField textResPlazas;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAutocar frame = new VentanaAutocar();
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
	public VentanaAutocar() {
		this.listaAutocar = new ArrayList<Autocar>();
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][101.00,grow][87.00,grow][36.00,grow][7.00][41.00][41.00,grow][][grow]", "[][][][21.00][][grow]"));
		
		
		
		JLabel lblTituloGestion = new JLabel("Gestión autocares");
		lblTituloGestion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTituloGestion.setOpaque(true);
		lblTituloGestion.setBackground(new Color(0, 0, 0));
		lblTituloGestion.setForeground(new Color(255, 255, 255));
		contentPane.add(lblTituloGestion, "cell 0 0 9 1");
		
		JLabel lblTitMatricula = new JLabel("Matrícula:");
		contentPane.add(lblTitMatricula, "cell 1 1,alignx trailing");
		
		textResMatricula = new JTextField();
		contentPane.add(textResMatricula, "cell 2 1 2 1,growx");
		textResMatricula.setColumns(10);
		
		JLabel lblTitMarca = new JLabel("Marca:");
		contentPane.add(lblTitMarca, "cell 1 2,alignx trailing");
		
		textResMarca = new JTextField();
		contentPane.add(textResMarca, "cell 2 2 2 1,growx");
		textResMarca.setColumns(10);
		
		JLabel lblTitModelo = new JLabel("Modelo:");
		contentPane.add(lblTitModelo, "cell 5 2,alignx trailing");
		
		textResModelo = new JTextField();
		contentPane.add(textResModelo, "cell 6 2 3 1,growx");
		textResModelo.setColumns(10);
		
		JLabel lblTitKm = new JLabel("Kilómetros");
		contentPane.add(lblTitKm, "cell 1 3,alignx trailing");
		
		textResKm = new JTextField();
		contentPane.add(textResKm, "cell 2 3 2 1,growx");
		textResKm.setColumns(10);
		
		JLabel lblTitPlazas = new JLabel("Plazas:");
		contentPane.add(lblTitPlazas, "cell 5 3,alignx trailing");
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textResPlazas = new JTextField();
		contentPane.add(textResPlazas, "cell 6 3,growx");
		textResPlazas.setColumns(10);
		contentPane.add(btnInsertar, "cell 2 4 2 1");
		
		JButton btnMostrar = new JButton("Mostrar Datos");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertar();
				
			}
		});
		contentPane.add(btnMostrar, "cell 4 4 3 1");
		
		JTextPane textResMostrar = new JTextPane();
		contentPane.add(textResMostrar, "cell 1 5 8 1,grow");
		mostrar();
		
	}

	protected void insertar() {
		
		
		String matricula=textResMatricula.getText();
		String marca=textResMarca.getText();
		String modelo=textResModelo.getText();
		//int km=Integer.parseInt.getText();
		//int plazas=

		
		if (matricula==null || matricula.isBlank() ||
			marca==null || marca.isBlank()||
			modelo==null || modelo.isBlank()) {
			JOptionPane.showMessageDialog(this, 
					"Introduzca todos los datos", 
					"Faltan datos", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		Autocar a = new Autocar();
		if (!listaAutocar.contains(a)) {
			listaAutocar.add(a);
			
		} else {
			JOptionPane.showMessageDialog(this, 
					"Ya existe Este vehículo",
					"Vehículo Existente", JOptionPane.ERROR_MESSAGE);
		}
	}


	private void mostrar() {
		
		
	}

		

}
