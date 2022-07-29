package TA19_Ex4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;


public class GraphicApplication4 extends JFrame{
	
	private JPanel contentPane;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResult;
	private DecimalFormat numberFormat = new DecimalFormat("#.00");

	/**
	 * Panel de aplicacion
	 */
	public GraphicApplication4 () {
		// Titulo de la ventana
		setTitle("Mini-calculadora");

		// Coordenadas etc
		setBounds(400, 200, 700, 500);

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
		

		calculator();
	}

	public void calculator() {
		
		// Text primer numero
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(80, 118, 95, 20);
		contentPane.add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		// Texto segundo numero
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(211, 118, 95, 20);
		contentPane.add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		// Texto resultado
		textFieldResult = new JTextField();
		textFieldResult.setBounds(446, 118, 86, 20);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		
		/* Boton sumar */
		JButton buttonPlus = new JButton("+");
		buttonPlus.setBounds(77, 230, 89, 23);
		contentPane.add(buttonPlus);
		// Creamos un listener para el boton sumar
		ActionListener plusButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent plusEvent) {

				try {
					// Cambiamos de string a double
					String num1 = textFieldNum1.getText();
					double n1 = Double.parseDouble(num1);

					String num2 = textFieldNum2.getText();
					double n2 = Double.parseDouble(num2);

					// Calculamos la suma
					double result = n1+n2;

					// Pasamos el resultado al ultimo braquet de texto
					textFieldResult.setText(numberFormat.format(result));

					// Vaciamos primer y segundo numero
					textFieldNum1.setText("");
					textFieldNum2.setText("");

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonPlus.addActionListener(plusButtonActLis);
		
		
		/* Boton resta */
		JButton buttonMinus = new JButton("-");
		buttonMinus.setBounds(211, 230, 89, 23);
		contentPane.add(buttonMinus);
		// Creamos un listener para el boton restar
		ActionListener minusButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent minusEvent) {
				
				try {
					// Cambiamos de string a double
					String num1 = textFieldNum1.getText();
					double n1 = Double.parseDouble(num1);
					
					String num2 = textFieldNum2.getText();
					double n2 = Double.parseDouble(num2);
					
					// Calculamos la resta
					double result = n1-n2;
					
					// Pasamos el resultado al ultimo braquet de texto
					textFieldResult.setText(numberFormat.format(result));
					
					// Vaciamos primer y segundo numero
					textFieldNum1.setText("");
					textFieldNum2.setText("");

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonMinus.addActionListener(minusButtonActLis);
		
		
		/* Boton multiplicar  */
		JButton buttonProduct = new JButton("x");
		buttonProduct.setBounds(80, 306, 89, 23);
		contentPane.add(buttonProduct);
		// Creamos un listener para el boton multiplicar
		ActionListener productButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent productEvent) {
				
				try {
					// Cambiamos de string a double
					String num1 = textFieldNum1.getText();
					double n1 = Double.parseDouble(num1);
					
					String num2 = textFieldNum2.getText();
					double n2 = Double.parseDouble(num2);
					
					// Calculamos la multiplicacion
					double result = n1*n2;
					
					// Pasamos el resultado al ultimo braquet de texto
					textFieldResult.setText(numberFormat.format(result));
					
					// Vaciamos primer y segundo numero
					textFieldNum1.setText("");
					textFieldNum2.setText("");

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonProduct.addActionListener(productButtonActLis);
		
		
		/* Boton dividir  */
		JButton buttonDivision = new JButton("/");
		buttonDivision.setBounds(211, 306, 89, 23);
		contentPane.add(buttonDivision);
		// Creamos un listener para el boton dividir
		ActionListener divideButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent divideEvent) {
				
				try {
					// Cambiamos de string a double
					String num1 = textFieldNum1.getText();
					double n1 = Double.parseDouble(num1);
					
					String num2 = textFieldNum2.getText();
					double n2 = Double.parseDouble(num2);
					
					// Calculamos la division
					double result = n1/n2;
					
					// Pasamos el resultado al ultimo braquet de texto
					textFieldResult.setText(numberFormat.format(result));
					
					// Vaciamos primer y segundo numero
					textFieldNum1.setText("");
					textFieldNum2.setText("");

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonDivision.addActionListener(divideButtonActLis);
		
		
		/* Boton salir  */
		JButton buttonExit = new JButton("Salir");
		buttonExit.setBounds(446, 230, 89, 23);
		contentPane.add(buttonExit);
		// Creamos un listener para el boton salir
		ActionListener exitButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent exitEvent) {
				JOptionPane.showMessageDialog(null, "Gracias por su asistencia!");
				System.exit(0);
			}
		};
		buttonExit.addActionListener(exitButtonActLis);
		
		
		/* Boton about  */
		JButton buttonAbout = new JButton("About");
		buttonAbout.setBounds(446, 306, 89, 23);
		contentPane.add(buttonAbout);
		// Creamos un listener para el boton about
		ActionListener aboutButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent aboutEvent) {
				JOptionPane.showMessageDialog(null, "Hecho por Team 1.");
			}
		};
		buttonAbout.addActionListener(aboutButtonActLis);
		
		
		/* Etiquetas */
		JLabel labelNum1 = new JLabel("Primer operando");
		labelNum1.setBounds(80, 93, 120, 14);
		contentPane.add(labelNum1);
		
		JLabel labelNum2 = new JLabel("Segundo operando");
		labelNum2.setBounds(211, 93, 120, 14);
		contentPane.add(labelNum2);
		
		JLabel labelResult = new JLabel("Resultado");
		labelResult.setBounds(446, 93, 86, 14);
		contentPane.add(labelResult);
		
		JLabel labelOperaciones = new JLabel("Operandos");
		labelOperaciones.setBounds(161, 192, 86, 14);
		contentPane.add(labelOperaciones);
		
		JLabel labelEqual = new JLabel("=");
		labelEqual.setBounds(366, 121, 46, 14);
		contentPane.add(labelEqual);
		
	}
}