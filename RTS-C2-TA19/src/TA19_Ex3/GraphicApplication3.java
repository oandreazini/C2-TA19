package TA19_Ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Font;

public class GraphicApplication3 extends JFrame {

	private JPanel contentPane;
	

	

	/**
	 * Panel de aplicacion
	 */
	public GraphicApplication3 () {
		// Titulo de la ventana
		setTitle("Sistemas");

		// Coordenadas etc
		setBounds(300, 200, 700, 398);

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
	

		sistem();
	}
	
	public void sistem() {
		
		//Creo un nuevo grupo de botones
		ButtonGroup ButtonGroup = new ButtonGroup();
        
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(60, 59, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
        getContentPane().add(rdbtnNewRadioButton);
        ButtonGroup.add(rdbtnNewRadioButton);
        rdbtnNewRadioButton.setActionCommand("Windows");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(60, 85, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
        getContentPane().add(rdbtnNewRadioButton_1);
        ButtonGroup.add(rdbtnNewRadioButton_1);
        rdbtnNewRadioButton_1.setActionCommand("Linux");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(60, 111, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
        getContentPane().add(rdbtnNewRadioButton_2);
        ButtonGroup.add(rdbtnNewRadioButton_2);
        rdbtnNewRadioButton_2.setActionCommand("Mac");
		getContentPane().add(rdbtnNewRadioButton_2);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(376, 59, 125, 23);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setActionCommand("Programación");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(375, 85, 126, 23);
		contentPane.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setActionCommand("Diseño gráfico");
		
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(376, 111, 125, 23);
		contentPane.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setActionCommand("Administración");
	
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setValue(0);
		slider.setBounds(60, 246, 240, 45);
		contentPane.add(slider);
		
		// Creamos el boton de resultados
		Button resultButton = new Button("Resultados");
		
		// Creamos un listener para la accion de pulsar el boton
		ActionListener actLis = new ActionListener() {
					
		// Creamos una accion a realizar cuando se pulse el boton resultado
		public void actionPerformed(ActionEvent sistem) {
			//TODO FALTA CORREGIR LOS CHECKBOX 
			// Extraemos el valor del JRadioButton
			String resultSistem = ButtonGroup.getSelection().getActionCommand();
			
			// Extraemos el valor del JCheckBox
			String resultHabilitis = " ";
			String resultHabilitis_1 = " ";
			String resultHabilitis_2 = " ";
			
			if(chckbxNewCheckBox.isSelected() == true) {
				 resultHabilitis = chckbxNewCheckBox.getText();
			}
			if (chckbxNewCheckBox_1.isSelected() == true) {
				 resultHabilitis_1 = chckbxNewCheckBox_1.getText();
			} 
			if (chckbxNewCheckBox_2.isSelected() == true) {
				 resultHabilitis_2 = chckbxNewCheckBox_2.getText();
			}
			
			// Extraemos el valor del slider
			int timePc = slider.getValue();
						
			// Mostramos el saludo al nombre en otra ventana
			JOptionPane.showMessageDialog(null, "El sistema operativo que elegiste es " +resultSistem+ " y las habilidades son " +resultHabilitis +
					resultHabilitis_1 +  resultHabilitis_2 +" y las horas dedicadas al PC son: " +timePc);
			System.exit(0);
			}
		};
		
		// Introducimos la accion al boton creado
		resultButton.addActionListener(actLis);
				
		resultButton.setBounds(376, 247, 89, 29);
		contentPane.add(resultButton);
		
		/* Etiquetas */
		JLabel lblNewLabel = new JLabel("Horas dedicas al PC:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(61, 215, 134, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elige uno de los sistemas operativos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(60, 32, 200, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Elije tus especialidades (una, varias o ninguna):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(355, 31, 300, 23);
		contentPane.add(lblNewLabel_2);
		
		        
		
		
	}
}
