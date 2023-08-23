import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.awt.event.ActionEvent;

public class aplicacionGrafica extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(45, 69, 128, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(45, 95, 128, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(45, 121, 128, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel = new JLabel("Elige SO:");
		lblNewLabel.setBounds(61, 38, 71, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Elige especialidad");
		lblNewLabel_1.setBounds(273, 38, 107, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programación");
		chckbxNewCheckBox.setBounds(273, 69, 128, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(273, 95, 128, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(273, 121, 128, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setBounds(117, 166, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("10");
		lblNewLabel_3.setBounds(303, 166, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setBounds(212, 166, 29, 14);
		contentPane.add(lblNewLabel_4);

		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(117, 177, 200, 26);
		contentPane.add(slider);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String so = "";
				Enumeration<AbstractButton> radio_opciones = buttonGroup.getElements();
				List<String> especialidades = new ArrayList<>();
				int valor = slider.getValue();
				
				while (radio_opciones.hasMoreElements()) {
					
				    AbstractButton boton = radio_opciones.nextElement();
				    if (boton.isSelected()) {
				    	
				        so = boton.getText();
				        break;
				    }
				}
				if (chckbxNewCheckBox.isSelected()) {
					
				    especialidades.add(chckbxNewCheckBox.getText());
				}
				if (chckbxNewCheckBox_1.isSelected()) {
					
				    especialidades.add(chckbxNewCheckBox_1.getText());
				}
				if (chckbxNewCheckBox_2.isSelected()) {
					
				    especialidades.add(chckbxNewCheckBox_2.getText());
				}
				if (especialidades.isEmpty() == true) {
					
					especialidades.add("Ninguna");
				}
				
				JOptionPane.showMessageDialog(null, "Tu SO preferido es: "+so+"\nTus especialidades son: "+especialidades+"\nTus horas en el ordenador son: "+valor);
			}
		});
		btnNewButton.setBounds(172, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Horas en el PC");
		lblNewLabel_5.setBounds(179, 143, 107, 14);
		contentPane.add(lblNewLabel_5);
	}
}