package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

import controller.ScheduleUser;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;

public class View implements ActionListener {
	public void actionPerformed(ActionEvent e) {}
	private JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Se anade para darle una apariencia grafica al programa acorde al sistema nativo sobre el cual se ejecuta
		
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setBounds(0, 0, 1200, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		// Al usar UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				// Tenemos que actualizar toda la apariencia de los componentes entonces con
				// esta linea hacemos que lo que depende del frame (que es todo) se actualice.
		SwingUtilities.updateComponentTreeUI(frame);
		
		//---------------------------------------------- CREACIoN PANELES----------------------------------------	
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_1012574314747200");
		panel.setLayout(null);
		
		
		Futbol panelFutbol = new Futbol();
		frame.getContentPane().add(panelFutbol, "name_1012574314747200");
		panelFutbol.setLayout(null);
		
		Baloncesto panelBaloncesto = new Baloncesto();
		frame.getContentPane().add(panelBaloncesto, "name_1012574314747200");
		panelBaloncesto.setLayout(null);
		
		Tenis panelTenis = new Tenis();
		frame.getContentPane().add(panelTenis, "name_1012574314747200");
		panelTenis.setLayout(null);
		
		Padel panelPadel = new Padel();
		frame.getContentPane().add(panelPadel, "name_1012574314747200");
		panelPadel.setLayout(null);
		
		Perfil panelPerfil = new Perfil();
		frame.getContentPane().add(panelPerfil, "name_1012574314747200");
		panelPadel.setLayout(null);
		
	//-------------------------------------------------------------------------------------------	
		
		JButton btnbaloncesto = new JButton("");
		btnbaloncesto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelBaloncesto.setVisible(true);
			}
		});
		btnbaloncesto.setIcon(new ImageIcon(View.class.getResource("/images/baloncesto.jpg")));
		btnbaloncesto.setBounds(40, 50, 300, 200);
		panel.add(btnbaloncesto);
		
		JButton btnfutbol = new JButton("");
		btnfutbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelFutbol.setVisible(true);
			}
		});
		btnfutbol.setIcon(new ImageIcon(View.class.getResource("/images/futbol.jpg")));
		btnfutbol.setBounds(440, 50, 300, 200);
		panel.add(btnfutbol);
		
		JButton btnpadel = new JButton("");
		btnpadel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelPadel.setVisible(true);
			}
		});
		btnpadel.setIcon(new ImageIcon(View.class.getResource("/images/padel.jpg")));
		btnpadel.setBounds(840, 50, 300, 200);
		panel.add(btnpadel);
		
		JButton btnpiscina = new JButton("");
		btnpiscina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				//panelPiscina.setVisible(true);
			}
		});
		btnpiscina.setIcon(new ImageIcon(View.class.getResource("/images/piscina.jpg")));
		btnpiscina.setBounds(40, 312, 300, 200);
		panel.add(btnpiscina);
		
		JButton btntenis = new JButton("");
		btntenis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelTenis.setVisible(true);
			}
		});
		btntenis.setIcon(new ImageIcon(View.class.getResource("/images/tenis.jpg")));
		btntenis.setBounds(440, 312, 300, 200);
		panel.add(btntenis);
		
		JButton btnvoley = new JButton("");
		btnvoley.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				//panelVoley.setVisible(true);
			}
		});
		btnvoley.setIcon(new ImageIcon(View.class.getResource("/images/voley.jpg")));
		btnvoley.setBounds(840, 312, 300, 200);
		panel.add(btnvoley);
				

		
		
		
		//***********************************************************************************************************
		//----------------------------------------------GESTION DE CAMBIOS DE PANTALLAS----------------------------------------
		
		JButton home = new JButton("Home");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPadel.setVisible(false);
				panelFutbol.setVisible(false);
				panelTenis.setVisible(false);
				panelBaloncesto.setVisible(false);
				panelPerfil.setVisible(false);
				//panelVoley.setVisible(false);
				//panelPiscina.setVisible(false);
				
				panel.setVisible(true);	
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		menuBar.add(home);
		
		JButton btnperfil = new JButton("Mi Perfil");
		btnperfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelPadel.setVisible(false);
				panelFutbol.setVisible(false);
				panelTenis.setVisible(false);
				panelBaloncesto.setVisible(false);
				panelPerfil.setVisible(false);
				//panelVoley.setVisible(false);
				//panelPiscina.setVisible(false);
				
				panelPerfil.setVisible(true);
				
			}
		});
		menuBar.add(btnperfil);
		
		JMenu mnNewMenu = new JMenu("Ayuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Manual de usuario");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature\n"
						+ " from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more\n"
						+ " obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the\n"
						+ " undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero,\n"
						+ " written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor\n"
						+ " sit amet..\", comes from a line in section 1.10.32", "INSTRUCCIONES", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Creditos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ruben Mediavilla Martinez\n Carlos Tejera Naz\n Luis Atero Gonzalez\n Victor Perez Baquedano", "AUTORES", JOptionPane.INFORMATION_MESSAGE);
				/*JTextField field1 = new JTextField();
				JTextField field2 = new JTextField();
				JTextField field3 = new JTextField();
				JTextField field4 = new JTextField();
				
				Object[] message = {
				    "Jugador 1:", field1,
				    "Jugador 2:", field2,
				    "Jugador 3:", field3,
				    "Jugador 4:", field4,
				};
				int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES", JOptionPane.OK_CANCEL_OPTION);
				if (option == JOptionPane.OK_OPTION)
				{
				    String jugador1 = field1.getText();
				    String jugador2 = field2.getText();
				    String jugador3 = field3.getText();
				    String jugador4 = field4.getText();
				}
				*/
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
				
	}
}
