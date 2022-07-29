package TA19_Ex1;

import javax.swing.*;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraphicApplication extends JFrame {
	
	private JPanel contentPane;
	
	/**
	 * Panel de aplicacion
	 */
	public GraphicApplication () {
		// Titulo de la ventana
		setTitle("Saludador");
		
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
		// Etiqueta saludar
		JLabel labelAskName = new JLabel("¡Escribe un nombre para saludar!");
		labelAskName.setBounds(145,22,200,20);
		contentPane.add(labelAskName);
		
		// Rellenar con nombre
		JTextField nameTextField  = new JTextField();
		nameTextField.setBounds(180, 67, 120, 20);
		contentPane.add(nameTextField);
		
		// Creamos el boton de saludar
		Button hiButton = new Button("¡Saludar!");
		
		// Creamos un listener para la accion de pulsar el boton
		ActionListener actLis = new ActionListener() {
			// Creamos una accion a realizar cuando se pulse el boton
			public void actionPerformed(ActionEvent hiEvent) {
				// Extraemos el nombre introducido
				String name = nameTextField.getText();
				
				// Mostramos el saludo al nombre en otra ventana
				JOptionPane.showMessageDialog(null, "¡Hola "+name+"!");
			}
		};
		// Introducimos la accion al boton creado
		hiButton.addActionListener(actLis);
		
		hiButton.setBounds(195, 132, 89, 29);
		contentPane.add(hiButton);
	}
}
