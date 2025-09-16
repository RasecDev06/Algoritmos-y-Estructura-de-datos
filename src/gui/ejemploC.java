package gui;

import padre.Persona;
import hijo.Alumno;
import hijo.Docente;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ejemploC extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemploC frame = new ejemploC();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejemploC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 414, 425);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Persona p = new Persona("Juan", "Matos",18);
		listado(p);
		
		Alumno a = new Alumno("Marco", "Salazar", 23, 14, 16, 15);
		listado(a);
		
		Docente d = new Docente("Pedro", "Rojas", 31, 100, 35.9);
		listado(d);
	}
	
//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	
//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	//Metodos tipo void con parametros:
	void listado(Persona x) {
		imprimir(">>> PERSONA");
		imprimir(x.datosCompletos());
		imprimir("Correo : " + x.generarCorreo());
		imprimir("");
	}
	
	void listado(Alumno x) {
		imprimir(">>> ALUMNO");
		imprimir(x.datosCompletos());
		imprimir("Correo : " + x.generarCorreo());
		imprimir("Promedio : " + x.promedio());
		imprimir("");
	}
	
	void listado(Docente x) {
		imprimir(">>> Docente");
		imprimir(x.datosCompletos());
		imprimir("Correo : " + x.generarCorreo());
		imprimir("Sueldo : " + x.calcularSueldo());
	}
	
}
