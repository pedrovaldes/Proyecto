import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JTextArea;

public class ProyectoGUI {
	private Calculos calculos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoGUI window = new ProyectoGUI();
					//((Window) window.frame).setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public ProyectoGUI(){
		Aplicacion();
	}
		
	public void Aplicacion(){
		JFrame frame = new JFrame ("");
		Calculos calculos = new Calculos();
		frame.pack();
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 31, 393, 299);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("CALENDARIO");
		label.setBounds(161, 11, 65, 14);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBounds(10, 34, 46, 41);
		panel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("2");
		label_1.setBounds(66, 34, 46, 41);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setBounds(122, 34, 46, 41);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setBounds(180, 34, 46, 41);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setBounds(236, 34, 46, 41);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("6");
		label_5.setBounds(288, 34, 46, 41);
		panel.add(label_5);		
		
		JLabel label_6 = new JLabel("8");
		label_6.setBounds(10, 86, 46, 41);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("15");
		label_7.setBounds(10, 138, 46, 41);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("22");
		label_8.setBounds(10, 190, 46, 41);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("29");
		label_9.setBounds(10, 242, 46, 41);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("9");
		label_10.setBounds(66, 86, 46, 41);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("16");
		label_11.setBounds(66, 138, 46, 41);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("23");
		label_12.setBounds(66, 190, 46, 41);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("30");
		label_13.setBounds(66, 242, 46, 41);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("10");
		label_14.setBounds(122, 86, 46, 41);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("17");
		label_15.setBounds(122, 138, 46, 41);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("24");
		label_16.setBounds(122, 190, 46, 41);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("11");
		label_17.setBounds(180, 86, 46, 41);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("18");
		label_18.setBounds(180, 138, 46, 41);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("25");
		label_19.setBounds(180, 190, 46, 41);
		panel.add(label_19);
		
		JLabel label_20 = new JLabel("12");
		label_20.setBounds(236, 86, 46, 41);
		panel.add(label_20);
		
		JLabel label_21 = new JLabel("19");
		label_21.setBounds(236, 138, 46, 41);
		panel.add(label_21);
		
		JLabel label_22 = new JLabel("26");
		label_22.setBounds(236, 190, 46, 41);
		panel.add(label_22);
		
		JLabel label_23 = new JLabel("13");
		label_23.setBounds(288, 86, 46, 41);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("20");
		label_24.setBounds(288, 138, 46, 41);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("27");
		label_25.setBounds(288, 190, 46, 41);
		panel.add(label_25);
		
		JLabel label_30 = new JLabel("7");
		label_30.setBounds(337, 34, 46, 41);
		panel.add(label_30);
		
		JLabel label_31 = new JLabel("14");
		label_31.setBounds(337, 86, 46, 41);
		panel.add(label_31);
		
		JLabel label_32 = new JLabel("21");
		label_32.setBounds(337, 138, 46, 41);
		panel.add(label_32);
		
		JLabel label_33 = new JLabel("28");
		label_33.setBounds(337, 190, 46, 41);
		panel.add(label_33);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(41, 341, 198, 145);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 148, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 42, 148, 20);
		panel_1.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(36, 73, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(36, 94, 89, 23);
		panel_1.add(btnModificar);
		
		JButton button = new JButton("Eliminar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(36, 114, 89, 23);
		panel_1.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(249, 341, 185, 145);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EVENTO");
		lblNewLabel_1.setBounds(64, 5, 93, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel label_26 = new JLabel("Nombre: ");
		label_26.setBounds(10, 24, 116, 14);
		panel_2.add(label_26);
		
		JLabel label_28 = new JLabel("Tipo: ");
		label_28.setBounds(10, 74, 116, 14);
		panel_2.add(label_28);
		
		JLabel label_27 = new JLabel("Descripcion: ");
		label_27.setBounds(10, 99, 116, 14);
		panel_2.add(label_27);
		
		JLabel label_29 = new JLabel("Fecha: ");
		label_29.setBounds(10, 49, 116, 14);
		panel_2.add(label_29);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(500, 11, 400, 501);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(25, 25, 347, 453);
		panel_3.add(panel_5);
		
		JLabel lblListadoDe = new JLabel("LISTADO DE:");
		lblListadoDe.setBounds(136, 11, 80, 14);
		panel_5.add(lblListadoDe);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(27, 36, 134, 20);
		panel_5.add(comboBox_2);
		
		JLabel lblNewLabel_2 = new JLabel("\"EVENTOS\"");
		lblNewLabel_2.setBounds(27, 67, 285, 347);
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 452, 501);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 527, 294, 253);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Modificar");
		lblNewLabel_3.setBounds(77, 5, 60, 14);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 30, 66, 14);
		panel_6.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(104, 32, 141, 20);
		panel_6.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(104, 68, 141, 20);
		panel_6.add(textField_1);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 71, 46, 14);
		panel_6.add(lblFecha);
		
		JLabel lblTipo = new JLabel("Tipo: ");
		lblTipo.setBounds(10, 104, 46, 14);
		panel_6.add(lblTipo);
		
		JLabel lblDescripcion = new JLabel("Descripcion: ");
		lblDescripcion.setBounds(10, 123, 82, 14);
		panel_6.add(lblDescripcion);
		
		JButton btnCrear = new JButton("Cambiar");
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrear.setBounds(84, 217, 89, 23);
		panel_6.add(btnCrear);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(104, 134, 141, 70);
		panel_6.add(textArea);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(104, 101, 141, 22);
		panel_6.add(comboBox_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(346, 525, 357, 253);
		frame.getContentPane().add(panel_7);
		
		JLabel lblCrear = new JLabel("CREAR");
		lblCrear.setBounds(91, 5, 46, 14);
		panel_7.add(lblCrear);
		
		JLabel label_35 = new JLabel("Nombre: ");
		label_35.setBounds(10, 30, 72, 14);
		panel_7.add(label_35);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 27, 141, 20);
		panel_7.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(148, 60, 141, 20);
		panel_7.add(textField_5);
		
		JLabel label_36 = new JLabel("Fecha:");
		label_36.setBounds(10, 61, 46, 14);
		panel_7.add(label_36);
		
		JLabel label_37 = new JLabel("Tipo: ");
		label_37.setBounds(10, 92, 46, 14);
		panel_7.add(label_37);
		
		JLabel label_38 = new JLabel("Descripcion: ");
		label_38.setBounds(10, 123, 89, 14);
		panel_7.add(label_38);
		
		JButton button_1 = new JButton("Crear");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(118, 217, 89, 23);
		panel_7.add(button_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(148, 93, 141, 22);
		panel_7.add(comboBox_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(148, 123, 141, 73);
		panel_7.add(textArea_1);
		
	}
}


