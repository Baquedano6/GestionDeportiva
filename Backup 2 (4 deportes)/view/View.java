package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
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
		
		
		
		
		//***********************************************************************************************************
		//----------------------------------------------GESTION DE CAMBIOS DE PANTALLAS----------------------------------------
		
		JButton home = new JButton("Home");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panelPadel.setVisible(true);
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		menuBar.add(home);
		
		JMenu mnNewMenu = new JMenu("Ayuda");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ayuda al usuario");
		mnNewMenu.add(mntmNewMenuItem);
				
	}
	
}
