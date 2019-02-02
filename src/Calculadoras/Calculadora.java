package Calculadoras;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculadora {

	private JFrame frame;
	private JTextField textDisplay;
	
	
	double primerNumero;
	double segundoNumero;
	double resultado;
	String operaciones;
	String respuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 388, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 22));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(79, 69, 268, 51);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 135, 59, 57);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(79, 135, 59, 57);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(148, 135, 59, 57);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 203, 59, 57);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(79, 203, 59, 57);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(148, 203, 59, 57);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 271, 59, 57);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(79, 271, 59, 57);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(148, 271, 59, 57);
		frame.getContentPane().add(btn3);
		
		JButton btnDividido = new JButton("/");
		btnDividido.setBackground(Color.PINK);
		btnDividido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operaciones="/";
				
				
			}
		});
		btnDividido.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDividido.setBounds(217, 135, 59, 57);
		frame.getContentPane().add(btnDividido);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.setBackground(Color.PINK);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operaciones="*";
				
			}
		});
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiplicar.setBounds(217, 203, 59, 57);
		frame.getContentPane().add(btnMultiplicar);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBackground(Color.PINK);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operaciones="-";
				
			}
		});
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMenos.setBounds(220, 271, 59, 57);
		frame.getContentPane().add(btnMenos);
		
		JButton btnMas = new JButton("+");
		btnMas.setBackground(Color.PINK);
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				primerNumero = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operaciones="+";
				
			}
		});
		btnMas.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMas.setBounds(220, 339, 59, 57);
		frame.getContentPane().add(btnMas);
		
		JButton btnMasMenos = new JButton("+/-");
		btnMasMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(textDisplay.getText());
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
				
				
				
			}
		});
		btnMasMenos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMasMenos.setBounds(148, 339, 59, 57);
		frame.getContentPane().add(btnMasMenos);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btnPunto.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btnPunto.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPunto.setBounds(79, 339, 59, 57);
		frame.getContentPane().add(btnPunto);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 339, 59, 57);
		frame.getContentPane().add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(Color.PINK);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String respuesta;
				
				segundoNumero =Double.parseDouble(textDisplay.getText());
				
				if (operaciones == "+")
				{
				resultado = primerNumero + segundoNumero;
				respuesta = String.format("%.2f", resultado);
				textDisplay.setText(respuesta);
				}

				else if (operaciones == "-")
				{
				resultado = primerNumero - segundoNumero;
				respuesta = String.format("%.2f", resultado);
				textDisplay.setText(respuesta);
				}

				else if (operaciones == "*")
				{
				resultado = primerNumero * segundoNumero;
				respuesta = String.format("%.2f", resultado);
				textDisplay.setText(respuesta);
				}

				else if (operaciones=="/")
				{
				resultado = primerNumero / segundoNumero;
				respuesta = String.format("%.2f", resultado);
				textDisplay.setText(respuesta);
				}
				else if (operaciones=="%")
				{
				resultado = primerNumero % segundoNumero;
				respuesta = String.format("%.2f", resultado);
				textDisplay.setText(respuesta);
				}
				
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIgual.setBounds(287, 271, 59, 125);
		frame.getContentPane().add(btnIgual);
		
		JButton btnPorcentaje = new JButton("%");
		btnPorcentaje.setBackground(Color.PINK);
		btnPorcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operaciones="%";
				
			}
		});
		btnPorcentaje.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPorcentaje.setBounds(287, 203, 59, 57);
		frame.getContentPane().add(btnPorcentaje);
		
		JButton btnAtras = new JButton("<-");
		btnAtras.setBackground(Color.PINK);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnAtras = null;
				if(textDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length()-1);
					btnAtras = strB.toString();
					textDisplay.setText(btnAtras);
				}
				
				
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAtras.setBounds(287, 135, 59, 57);
		frame.getContentPane().add(btnAtras);
		
		JButton btnBorrar = new JButton("C");
		btnBorrar.setBackground(Color.PINK);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textDisplay.setText(null);
				
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBorrar.setBounds(10, 67, 59, 57);
		frame.getContentPane().add(btnBorrar);
		
		JLabel lblMiPrimerCalculadora = new JLabel("MI PRIMER CALCULADORA");
		lblMiPrimerCalculadora.setForeground(new Color(255, 0, 0));
		lblMiPrimerCalculadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiPrimerCalculadora.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lblMiPrimerCalculadora.setBounds(10, 11, 337, 47);
		frame.getContentPane().add(lblMiPrimerCalculadora);
	}
}
