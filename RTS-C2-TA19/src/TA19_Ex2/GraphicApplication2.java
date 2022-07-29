package TA19_Ex2;

import java.awt.*;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GraphicApplication2 extends JFrame{
	
	private JPanel contentPane;

	/**
	 * Panel de aplicacion
	 */
	public GraphicApplication2 () {
		// Titulo de la ventana
		setTitle("Películas");

		// Coordenadas etc
		setBounds(400, 200, 500, 300);

		// Cerrar tambien el programa
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hacer visible la ventana
		setVisible(true);

		// Inicializamos el panel
		contentPane = new JPanel();

		// Indicamos diseno
		contentPane.setLayout(null);

		// Asignar panel de la ventana
		setContentPane(contentPane);

		hiContent();
	}

	public void hiContent() {
		// Etiqueta añadir pelicula
		JLabel labelFilm = new JLabel("Escribe el título de una película");
		labelFilm.setBounds(40,22,200,20);
		contentPane.add(labelFilm);

		// Rellenar con nombre
		JTextField nameTextField  = new JTextField();
		nameTextField.setBounds(60, 67, 120, 20);
		contentPane.add(nameTextField);

		// Creamos el boton para anadir
		Button addButton = new Button("Añadir");

		
	

		addButton.setBounds(40, 132, 89, 29);
		contentPane.add(addButton);
	}
}

