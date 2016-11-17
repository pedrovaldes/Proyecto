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
import java.util.Date;

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
import java.awt.SystemColor;

public class ProyectoGUI {
	private Calculos calculos;
	private JTextField txtNombreModificar;
	private JTextField txtFechaModificar;
	private JLabel Dia1;
	private JLabel Dia2;
	private JLabel Dia3;
	private JLabel Dia4;
	private JLabel Dia5;
	private JLabel Dia6;
	private JLabel Dia7;
	private JLabel Dia8;
	private JLabel Dia9;
	private JLabel Dia10;
	private JLabel Dia11;
	private JLabel Dia12;
	private JLabel Dia13;
	private JLabel Dia14;
	private JLabel Dia15;
	private JLabel Dia16;
	private JLabel Dia17;
	private JLabel Dia18;
	private JLabel Dia19;
	private JLabel Dia20;
	private JLabel Dia21;
	private JLabel Dia22;
	private JLabel Dia23;
	private JLabel Dia24;
	private JLabel Dia25;
	private JLabel Dia26;
	private JLabel Dia27;
	private JLabel Dia28;
	private JLabel Dia29;
	private JLabel Dia30;
	
	private JLabel lblListado;
	
	private JTextField txtNombreCrear;
	private JTextField txtFechaCrear;
	private JTextField txtDescripcionCrear;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnCrearCrear;
	private JButton btnEliminar;
	private JButton btnVerLista;
	private JTextField txtBuscarEventos;
	private JTextField txtTipoCrear;

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
		frame.getContentPane().setBackground(new Color(250, 250, 210));
		frame.setBackground(Color.BLUE);
		Calculos calculos = new Calculos();
		frame.pack();
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);

		
//////////////////////////////////////////////////////////////////////////////
////////////////////////////////CALENDARIO////////////////////////////////////		
//////////////////////////////////////////////////////////////////////////////		
		
		JPanel panelDias = new JPanel();   ////PANEL CALENDARIO
		panelDias.setBounds(41, 40, 393, 290);
		frame.getContentPane().add(panelDias);
		panelDias.setLayout(null);
		
		JLabel Dia1 = new JLabel("1");
		Dia1.setHorizontalAlignment(SwingConstants.CENTER);
		Dia1.setBounds(10, 34, 46, 41);
		panelDias.add(Dia1);
		
		JLabel Dia2 = new JLabel("2");
		Dia2.setHorizontalAlignment(SwingConstants.CENTER);
		Dia2.setBounds(66, 34, 46, 41);
		panelDias.add(Dia2);
		
		JLabel Dia3 = new JLabel("3");
		Dia3.setHorizontalAlignment(SwingConstants.CENTER);
		Dia3.setBounds(122, 34, 46, 41);
		panelDias.add(Dia3);
		
		JLabel Dia4 = new JLabel("4");
		Dia4.setHorizontalAlignment(SwingConstants.CENTER);
		Dia4.setBounds(180, 34, 46, 41);
		panelDias.add(Dia4);
		
		JLabel Dia5 = new JLabel("5");
		Dia5.setHorizontalAlignment(SwingConstants.CENTER);
		Dia5.setBounds(236, 34, 46, 41);
		panelDias.add(Dia5);
		
		JLabel Dia6 = new JLabel("6");
		Dia6.setHorizontalAlignment(SwingConstants.CENTER);
		Dia6.setBounds(288, 34, 46, 41);
		panelDias.add(Dia6);		
		
		JLabel Dia7 = new JLabel("7");
		Dia7.setHorizontalAlignment(SwingConstants.CENTER);
		Dia7.setBounds(337, 34, 46, 41);
		panelDias.add(Dia7);
		
		JLabel Dia8 = new JLabel("8");
		Dia8.setHorizontalAlignment(SwingConstants.CENTER);
		Dia8.setBounds(10, 86, 46, 41);
		panelDias.add(Dia8);
		
		JLabel Dia9 = new JLabel("9");
		Dia9.setBounds(66, 86, 46, 41);
		panelDias.add(Dia9);
		
		JLabel Dia10 = new JLabel("10");
		Dia10.setBounds(122, 86, 46, 41);
		panelDias.add(Dia10);
		
		JLabel Dia11 = new JLabel("11");
		Dia11.setBounds(180, 86, 46, 41);
		panelDias.add(Dia11);
		
		JLabel Dia12 = new JLabel("12");
		Dia12.setBounds(236, 86, 46, 41);
		panelDias.add(Dia12);
		
		JLabel Dia13 = new JLabel("13");
		Dia13.setBounds(288, 86, 46, 41);
		panelDias.add(Dia13);
		
		JLabel Dia14 = new JLabel("14");
		Dia14.setBounds(337, 86, 46, 41);
		panelDias.add(Dia14);
		
		JLabel Dia15 = new JLabel("15");
		Dia15.setBounds(10, 138, 46, 41);
		panelDias.add(Dia15);
		
		JLabel Dia16 = new JLabel("16");
		Dia16.setBounds(66, 138, 46, 41);
		panelDias.add(Dia16);
		
		JLabel Dia17 = new JLabel("17");
		Dia17.setBounds(122, 138, 46, 41);
		panelDias.add(Dia17);
		
		JLabel Dia18 = new JLabel("18");
		Dia18.setBounds(180, 138, 46, 41);
		panelDias.add(Dia18);
		
		JLabel Dia19 = new JLabel("19");
		Dia19.setBounds(236, 138, 46, 41);
		panelDias.add(Dia19);
		
		JLabel Dia20 = new JLabel("20");
		Dia20.setBounds(288, 138, 46, 41);
		panelDias.add(Dia20);
		
		JLabel Dia21 = new JLabel("21");
		Dia21.setBounds(337, 138, 46, 41);
		panelDias.add(Dia21);
		
		JLabel Dia22 = new JLabel("22");
		Dia22.setBounds(10, 190, 46, 41);
		panelDias.add(Dia22);
		
		JLabel Dia23 = new JLabel("23");
		Dia23.setBounds(66, 190, 46, 41);
		panelDias.add(Dia23);
		
		JLabel Dia24 = new JLabel("24");
		Dia24.setBounds(122, 190, 46, 41);
		panelDias.add(Dia24);
		
		JLabel Dia25 = new JLabel("25");
		Dia25.setBounds(180, 190, 46, 41);
		panelDias.add(Dia25);
		
		JLabel Dia26 = new JLabel("26");
		Dia26.setBounds(236, 190, 46, 41);
		panelDias.add(Dia26);
		
		JLabel Dia27 = new JLabel("27");
		Dia27.setBounds(288, 190, 46, 41);
		panelDias.add(Dia27);
		
		JLabel Dia28 = new JLabel("28");
		Dia28.setBounds(337, 190, 46, 41);
		panelDias.add(Dia28);
		
		JLabel Dia29 = new JLabel("29");
		Dia29.setBounds(10, 242, 46, 41);
		panelDias.add(Dia29);
		
		Dia30 = new JLabel("30");
		Dia30.setBounds(66, 242, 46, 41);
		panelDias.add(Dia30);

		
//////////////////////////////////////////////////////////////////////////////
/////////////////OPCIONES (AGREGAR, QUITAR, ELIMINAR EVENTO)//////////////////
//////////////////////////////////////////////////////////////////////////////
		
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(41, 341, 198, 145);
		frame.getContentPane().add(panelOpciones);
		panelOpciones.setLayout(null);
		
		JComboBox cbOpcionDia = new JComboBox();
		cbOpcionDia.setBounds(10, 11, 148, 20);
		panelOpciones.add(cbOpcionDia);
		
		JComboBox cbOpcionHora = new JComboBox();
		cbOpcionHora.setBounds(10, 42, 148, 20);
		panelOpciones.add(cbOpcionHora);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(new Color(60, 179, 113));
		btnAgregar.addActionListener(new MiListener());
		btnAgregar.setBounds(36, 73, 89, 23);
		panelOpciones.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(255, 255, 0));
		btnModificar.addActionListener(new MiListener());
		btnModificar.setBounds(36, 94, 89, 23);
		panelOpciones.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(new Color(255, 0, 0));
		btnEliminar.addActionListener(new MiListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(36, 114, 89, 23);
		panelOpciones.add(btnEliminar);
		
//////////////////////////////////////////////////////////////////////////////
/////////////////////////EVENTO SELECCIONADO//////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

		JPanel panelEvento = new JPanel();
		panelEvento.setBounds(249, 341, 185, 145);
		frame.getContentPane().add(panelEvento);
		panelEvento.setLayout(null);
		
		JLabel lblEvento = new JLabel("Evento");
		lblEvento.setForeground(new Color(255, 140, 0));
		lblEvento.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 13));
		lblEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblEvento.setBounds(10, 5, 165, 14);
		panelEvento.add(lblEvento);
		
		JLabel lblNombreEvento = new JLabel("Nombre: ");
		lblNombreEvento.setBounds(10, 24, 56, 14);
		panelEvento.add(lblNombreEvento);
		
		JLabel lblNombreSelect = new JLabel("");
		lblNombreSelect.setBounds(76, 24, 99, 14);
		panelEvento.add(lblNombreSelect);
		
		JLabel lblFechaEvento = new JLabel("Fecha: ");
		lblFechaEvento.setBounds(10, 49, 56, 14);
		panelEvento.add(lblFechaEvento);
		
		JLabel lblFechaSelect = new JLabel("");
		lblFechaSelect.setBounds(76, 49, 99, 14);
		panelEvento.add(lblFechaSelect);
		
		JLabel lblTipoEvento = new JLabel("Tipo: ");
		lblTipoEvento.setBounds(10, 74, 56, 14);
		panelEvento.add(lblTipoEvento);
		
		JLabel lblTipoSelect = new JLabel("");
		lblTipoSelect.setBounds(76, 74, 99, 14);
		panelEvento.add(lblTipoSelect);
		
		JLabel lblDescripcionEvento = new JLabel("Descripcion: ");
		lblDescripcionEvento.setBounds(10, 99, 66, 14);
		panelEvento.add(lblDescripcionEvento);
		
		JLabel lblDescripcionSelect = new JLabel("");
		lblDescripcionSelect.setVerticalAlignment(SwingConstants.TOP);
		lblDescripcionSelect.setBounds(76, 99, 99, 35);
		panelEvento.add(lblDescripcionSelect);
		
//////////////////////////////////////////////////////////////////////////////
/////////////////////////VENTANA AGREGAR EVENTO///////////////////////////////
//////////////////////////////////////////////////////////////////////////////
		
		JPanel panelModificar = new JPanel();
		panelModificar.setBackground(Color.ORANGE);
		panelModificar.setBounds(10, 527, 379, 167);
		frame.getContentPane().add(panelModificar);
		panelModificar.setLayout(null);
		
		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setForeground(new Color(245, 255, 250));
		lblModificar.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificar.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblModificar.setBounds(10, 5, 358, 14);
		panelModificar.add(lblModificar);
		
		JLabel lblModNombre = new JLabel("Nombre: ");
		lblModNombre.setBounds(10, 30, 66, 14);
		panelModificar.add(lblModNombre);
		
		txtNombreModificar = new JTextField();
		txtNombreModificar.setBounds(62, 30, 183, 20);
		panelModificar.add(txtNombreModificar);
		txtNombreModificar.setColumns(10);
		
		txtFechaModificar = new JTextField();
		txtFechaModificar.setColumns(10);
		txtFechaModificar.setBounds(62, 55, 183, 20);
		panelModificar.add(txtFechaModificar);
		
		JTextArea txtDecripcion = new JTextArea();
		txtDecripcion.setBounds(72, 105, 173, 51);
		panelModificar.add(txtDecripcion);
		
		JLabel lblModFecha = new JLabel("Fecha:");
		lblModFecha.setBounds(10, 55, 46, 14);
		panelModificar.add(lblModFecha);
		
		JLabel lblModTipo = new JLabel("Tipo: ");
		lblModTipo.setBounds(10, 80, 46, 14);
		panelModificar.add(lblModTipo);
		
		JLabel lblModDescripcion = new JLabel("Descripcion: ");
		lblModDescripcion.setBounds(10, 123, 66, 14);
		panelModificar.add(lblModDescripcion);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(62, 80, 183, 20);
		panelModificar.add(comboBox_3);
		
		JButton btnModificarModificar = new JButton("CAMBIAR");
		btnModificarModificar.setBackground(new Color(0, 204, 0));
		btnModificarModificar.setBounds(266, 55, 89, 64);
		panelModificar.add(btnModificarModificar);
		
		
//////////////////////////////////////////////////////////////////////////////
///////////PANEL OPCIONES (AGREGAR, QUITAR, ELIMINAR EVENTO)//////////////////
//////////////////////////////////////////////////////////////////////////////
		
		JPanel panelCrear = new JPanel();
		panelCrear.setLayout(null);
		panelCrear.setBackground(Color.ORANGE);
		panelCrear.setBounds(417, 527, 379, 167);
		frame.getContentPane().add(panelCrear);
		
		JLabel lblCrear = new JLabel("Crear");
		lblCrear.setForeground(new Color(255, 255, 255));
		lblCrear.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrear.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		lblCrear.setBounds(10, 5, 359, 14);
		panelCrear.add(lblCrear);
		
		JLabel lblCrearNombre = new JLabel("Nombre: ");
		lblCrearNombre.setBounds(10, 30, 66, 14);
		panelCrear.add(lblCrearNombre);
		
		txtNombreCrear = new JTextField();
		txtNombreCrear.setColumns(10);
		txtNombreCrear.setBounds(62, 30, 183, 20);
		panelCrear.add(txtNombreCrear);
		
		txtFechaCrear = new JTextField();
		txtFechaCrear.setColumns(10);
		txtFechaCrear.setBounds(62, 55, 183, 20);
		panelCrear.add(txtFechaCrear);
		
		JLabel lblCrearFecha = new JLabel("Fecha:");
		lblCrearFecha.setBounds(10, 55, 46, 14);
		panelCrear.add(lblCrearFecha);
		
		JLabel lblCrearTipo = new JLabel("Tipo: ");
		lblCrearTipo.setBounds(10, 80, 46, 14);
		panelCrear.add(lblCrearTipo);
		
		JLabel lblCrearDescripcion = new JLabel("Descripcion: ");
		lblCrearDescripcion.setBounds(10, 123, 82, 14);
		panelCrear.add(lblCrearDescripcion);
		
		JTextArea txtDescripcionCrear = new JTextArea();
		txtDescripcionCrear.setBounds(72, 105, 173, 51);
		panelCrear.add(txtDescripcionCrear);
		
		JButton btnCrearCrear = new JButton("CREAR");
		btnCrearCrear.addActionListener(new MiListener(){
			public void actionPerformed(ActionEvent d)
		      {
				calculos.llenarEvento(txtNombreCrear.getText(), txtDescripcionCrear.getText(), txtFechaCrear.getText(), txtTipoCrear.getText(), "materia");
				lblListado.setText("Hola");
		      }
		});
		btnCrearCrear.setBackground(new Color(0, 204, 0));
		btnCrearCrear.setBounds(268, 51, 89, 64);
		panelCrear.add(btnCrearCrear);
		
		txtTipoCrear = new JTextField();
		txtTipoCrear.setBounds(62, 77, 183, 20);
		panelCrear.add(txtTipoCrear);
		txtTipoCrear.setColumns(10);
		
		JPanel panelFCalendario = new JPanel();
		panelFCalendario.setBounds(10, 11, 453, 501);
		frame.getContentPane().add(panelFCalendario);
		panelFCalendario.setBackground(Color.ORANGE);
		
				JLabel label = new JLabel("CALENDARIO");
				panelFCalendario.add(label);
				label.setForeground(new Color(255, 140, 0));
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 18));
		
//////////////////////////////////////////////////////////////////////////////
////////////////////////PANEL LISTADO POR TIPO////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
				
		JPanel panelFLista = new JPanel();
		panelFLista.setBackground(Color.ORANGE);
		panelFLista.setBounds(500, 11, 400, 501);
		frame.getContentPane().add(panelFLista);
		panelFLista.setLayout(null);
		
		JPanel panelLista = new JPanel();
		panelLista.setLayout(null);
		panelLista.setBounds(25, 25, 347, 453);
		panelFLista.add(panelLista);
		
		JLabel lblListadoPorTipo = new JLabel("Eventos En Tipo:");
		lblListadoPorTipo.setForeground(new Color(255, 140, 0));
		lblListadoPorTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblListadoPorTipo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblListadoPorTipo.setBounds(10, 11, 327, 14);
		panelLista.add(lblListadoPorTipo);
		
		lblListado = new JLabel("EVENTO");
		lblListado.setBounds(27, 67, 297, 362);
		panelLista.add(lblListado);
		
		JButton btnVerLista = new JButton("Buscar");
		btnVerLista.addActionListener(new MiListener());
		btnVerLista.setBackground(new Color(34, 139, 34));
		btnVerLista.setBounds(204, 36, 120, 23);
		panelLista.add(btnVerLista);
		
		txtBuscarEventos = new JTextField();
		txtBuscarEventos.setHorizontalAlignment(SwingConstants.CENTER);
		txtBuscarEventos.setBounds(20, 36, 132, 20);
		panelLista.add(txtBuscarEventos);
		txtBuscarEventos.setColumns(10);
		
	}

//////////////////////////////////////////////////////////////////////////////
//////////////////////////LISTENER BOTONES////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
	
	private class MiListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//AGREGAR UN EVENTO
			if (e.getSource() == btnCrearCrear){
				calculos.llenarEvento(txtNombreCrear.getText(), txtDescripcionCrear.getText(), txtFechaCrear.getText(), txtTipoCrear.getText(), "materia");
			}
		
			//BOTON PARA HACER LISTADO DE UN TIPOE SPECIFICO (Hay que hacer try y catch para el null.pointer)
			if (e.getSource() == btnVerLista){
				lblListado.setText(calculos.BuscarTipoEvento(txtBuscarEventos.getText()));
			}
			
			
		}
	}
}


