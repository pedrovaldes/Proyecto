import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JTabbedPane;

public class Proyecto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto window = new Proyecto();
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
	public Proyecto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Calendario = new JPanel();
		frame.getContentPane().add(Calendario, BorderLayout.CENTER);
		Calendario.setLayout(null);
		
		JPanel Eventos = new JPanel();
		frame.getContentPane().add(Eventos, BorderLayout.EAST);
		Eventos.setLayout(new BorderLayout(0, 0));
		
		JPanel Botones = new JPanel();
		frame.getContentPane().add(Botones, BorderLayout.SOUTH);
		
		JButton btnNuevoEvento = new JButton("Nuevo Evento");
		Botones.add(btnNuevoEvento);
	}
}
