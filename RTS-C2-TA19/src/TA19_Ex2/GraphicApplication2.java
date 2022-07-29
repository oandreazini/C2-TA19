package TA19_Ex2;

import java.awt.*;
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
		setTitle("Peliculas");

		// Coordenadas etc
		setBounds(400, 200, 700, 300);

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

		Film();
	}

	public void Film() {
		// Etiqueta anadir pelicula
		JLabel labelInsertFilm = new JLabel("Escribe el titulo de una pelicula");
		labelInsertFilm.setBounds(40,22,200,20);
		contentPane.add(labelInsertFilm);

		// Rellenar con nombre
		JTextField nameTextField  = new JTextField();
		nameTextField.setBounds(60, 67, 150, 20);
		contentPane.add(nameTextField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(348, 67, 200, 21);
		contentPane.add(comboBox);
		
		JLabel labelFilm = new JLabel("Peliculas");
		labelFilm.setBounds(348, 26, 80, 13);
		contentPane.add(labelFilm);
		
		// Creamos el boton para anadir
		Button addButton = new Button("Insertar pelicula");

		// Creamos un listener para la accion de pulsar el boton
		ActionListener filmButtonActLis = new ActionListener() {
			// Creamos una accion a realizar cuando se pulse el boton
			public void actionPerformed(ActionEvent filmEvent) {
				// Extraemos el nombre introducido
				String name = nameTextField.getText();
				
				comboBox.addItem(name);
				
			}
		};
		
		// Insertamos el listener en el boton
		addButton.addActionListener(filmButtonActLis);
	
		// Insertamos la posicion del boton
		addButton.setBounds(60, 132, 100, 29);
		
		// Lo insertamos en el contenedor
		contentPane.add(addButton);
		
		
	}
}


