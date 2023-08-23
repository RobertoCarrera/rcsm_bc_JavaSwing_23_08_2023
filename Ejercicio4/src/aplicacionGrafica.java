import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class aplicacionGrafica extends JFrame {

	private JPanel contentPane;
	private JTextField operador1;
	private JTextField operador2;
	private JTextField total;
	private JButton btnSumar;
	private JButton btnRestar;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JButton btnSalir;
	private JButton btnAbout;
	private JLabel lblTotal;
	private JLabel lblValor1;
	private JLabel lblValor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aplicacionGrafica frame = new aplicacionGrafica();
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
	public aplicacionGrafica() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operador1 = new JTextField();
		operador1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		operador1.setBounds(10, 58, 89, 50);
		contentPane.add(operador1);
		operador1.setColumns(10);
		//Así se centra el texto del JField
		operador1.setHorizontalAlignment(JTextField.CENTER);
		
		operador2 = new JTextField();
		operador2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		operador2.setColumns(10);
		operador2.setBounds(125, 58, 89, 50);
		contentPane.add(operador2);
		operador2.setHorizontalAlignment(JTextField.CENTER);
		
		total = new JTextField();
		total.setFont(new Font("Tahoma", Font.PLAIN, 20));
		total.setColumns(10);
		total.setBounds(236, 58, 188, 50);
		contentPane.add(total);
		total.setHorizontalAlignment(JTextField.CENTER);
		
		btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Aplicación creada por Roberto Carrera en el Bootcamp de Grupo Castilla");
			}
		});
		btnAbout.setBounds(10, 200, 89, 23);
		contentPane.add(btnAbout);
				
		lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotal.setBounds(303, 22, 75, 25);
		contentPane.add(lblTotal);
		
		lblValor2 = new JLabel("Valor 2");
		lblValor2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor2.setBounds(148, 22, 75, 25);
		contentPane.add(lblValor2);
		
		lblValor1 = new JLabel("Valor 1");
		lblValor1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValor1.setBounds(33, 22, 75, 25);
		contentPane.add(lblValor1);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSumar.setForeground(new Color(0, 128, 255));
		btnSumar.setBounds(10, 119, 89, 23);
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int op1 = convertirAInteger(operador1.getText());
				int op2 = convertirAInteger(operador2.getText());
				String total_texto = "";
				
				int total_calculo = op1 + op2;
				total_texto = convertirAString(total_calculo);
				
				total.setText(total_texto);
			}
		});
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRestar.setForeground(new Color(255, 128, 255));
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int op1 = convertirAInteger(operador1.getText());
				int op2 = convertirAInteger(operador2.getText());
				String total_texto = "";
				
				int total_calculo = op1 - op2;
				total_texto = convertirAString(total_calculo);
				
				total.setText(total_texto);
			}
		});
		btnRestar.setBounds(125, 119, 89, 23);
		contentPane.add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMultiplicar.setForeground(new Color(0, 128, 128));
		btnMultiplicar.setBounds(236, 119, 89, 23);
		contentPane.add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int op1 = convertirAInteger(operador1.getText());
				int op2 = convertirAInteger(operador2.getText());
				String total_texto = "";
				
				int total_calculo = op1 * op2;
				total_texto = convertirAString(total_calculo);
				
				total.setText(total_texto);
			}
		});
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDividir.setForeground(new Color(128, 0, 255));
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int op1 = convertirAInteger(operador1.getText());
				int op2 = convertirAInteger(operador2.getText());
				String total_texto = "";
				
				int total_calculo = op1 / op2;
				total_texto = convertirAString(total_calculo);
				
				total.setText(total_texto);
			}
		});
		btnDividir.setBounds(125, 119, 89, 23);
		btnDividir.setBounds(335, 119, 89, 23);
		contentPane.add(btnDividir);
		
		//De esta manera se crea un botón que cierre la aplicación
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Este es el comando
				System.exit(0);
			}
		});
		btnSalir.setBounds(10, 227, 89, 23);
		contentPane.add(btnSalir);
	}
	
	private static int convertirAInteger(String operador_introducido) {
		
		int operador_convertido = 0;
		
		operador_convertido = Integer.parseInt(operador_introducido);
		
		return operador_convertido;
	}
	
	private static String convertirAString(int total) {
		
		String total_convertido = "";
		
		total_convertido = Integer.toString(total);
		
		return total_convertido;
	}
}
