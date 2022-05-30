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
import javax.swing.text.View;

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

public class Padel1 extends JPanel implements ActionListener {

	JButton pa1lu9;
	JButton pa1lu10;
	JButton pa1ma9;
	JButton pa1mi9;
	JButton pa1ju9;
	JButton pa1vi9;
	JButton pa1sa9;
	JButton pa1do9;
	JButton pa1lu11;
	JButton pa1lu12;
	JButton pa1lu13;
	JButton pa1lu15;
	JButton pa1lu16;
	JButton pa1lu17;
	JButton pa1lu18;
	JButton pa1lu19;
	JButton pa1lu20;
	JButton pa1ma20;
	JButton pa1ma19;
	JButton pa1ma18;
	JButton pa1ma17;
	JButton pa1ma16;
	JButton pa1ma15;
	JButton pa1ma13;
	JButton pa1ma12;
	JButton pa1ma11;
	JButton pa1ma10;
	JButton pa1mi20;
	JButton pa1mi19;
	JButton pa1mi18;
	JButton pa1mi17;
	JButton pa1mi16;
	JButton pa1mi15;
	JButton pa1mi13;
	JButton pa1mi12;
	JButton pa1mi11;
	JButton pa1mi10;
	JButton pa1ju20;
	JButton pa1ju19;
	JButton pa1ju18;
	JButton pa1ju17;
	JButton pa1ju16;
	JButton pa1ju15;
	JButton pa1ju13;
	JButton pa1ju12;
	JButton pa1ju11;
	JButton pa1ju10;
	JButton pa1vi20;
	JButton pa1vi19;
	JButton pa1vi18;
	JButton pa1vi17;
	JButton pa1vi16;
	JButton pa1vi15;
	JButton pa1vi13;
	JButton pa1vi12;
	JButton pa1vi11;
	JButton pa1vi10;
	JButton pa1sa20;
	JButton pa1sa19;
	JButton pa1sa18;
	JButton pa1sa17;
	JButton pa1sa16;
	JButton pa1sa15;
	JButton pa1sa13;
	JButton pa1sa12;
	JButton pa1sa11;
	JButton pa1sa10;
	JButton pa1do20;
	JButton pa1do19;
	JButton pa1do18;
	JButton pa1do17;
	JButton pa1do16;
	JButton pa1do15;
	JButton pa1do13;
	JButton pa1do12;
	JButton pa1do11;
	JButton pa1do10;
	JButton btnPista1;
	JButton btnPista2;

	/**
	 * Create the this.
	 */
	public Padel1() {
		setLayout(null);
		// ---------------------------------------------------------CREAR
		// BOTONES--------------------------------------------------
		pa1lu9 = new JButton("");
		pa1lu10 = new JButton("");
		pa1ma9 = new JButton("");
		pa1mi9 = new JButton("");
		pa1ju9 = new JButton("");
		pa1vi9 = new JButton("");
		pa1sa9 = new JButton("");
		pa1do9 = new JButton("");
		pa1lu11 = new JButton("");
		pa1lu12 = new JButton("");
		pa1lu13 = new JButton("");
		pa1lu15 = new JButton("");
		pa1lu16 = new JButton("");
		pa1lu17 = new JButton("");
		pa1lu18 = new JButton("");
		pa1lu19 = new JButton("");
		pa1lu20 = new JButton("");
		pa1ma20 = new JButton("");
		pa1ma19 = new JButton("");
		pa1ma18 = new JButton("");
		pa1ma17 = new JButton("");
		pa1ma16 = new JButton("");
		pa1ma15 = new JButton("");
		pa1ma13 = new JButton("");
		pa1ma12 = new JButton("");
		pa1ma11 = new JButton("");
		pa1ma10 = new JButton("");
		pa1mi20 = new JButton("");
		pa1mi19 = new JButton("");
		pa1mi18 = new JButton("");
		pa1mi17 = new JButton("");
		pa1mi16 = new JButton("");
		pa1mi15 = new JButton("");
		pa1mi13 = new JButton("");
		pa1mi12 = new JButton("");
		pa1mi11 = new JButton("");
		pa1mi10 = new JButton("");
		pa1ju20 = new JButton("");
		pa1ju19 = new JButton("");
		pa1ju18 = new JButton("");
		pa1ju17 = new JButton("");
		pa1ju16 = new JButton("");
		pa1ju15 = new JButton("");
		pa1ju13 = new JButton("");
		pa1ju12 = new JButton("");
		pa1ju11 = new JButton("");
		pa1ju10 = new JButton("");
		pa1vi20 = new JButton("");
		pa1vi19 = new JButton("");
		pa1vi18 = new JButton("");
		pa1vi17 = new JButton("");
		pa1vi16 = new JButton("");
		pa1vi15 = new JButton("");
		pa1vi13 = new JButton("");
		pa1vi12 = new JButton("");
		pa1vi11 = new JButton("");
		pa1vi10 = new JButton("");
		pa1sa20 = new JButton("");
		pa1sa19 = new JButton("");
		pa1sa18 = new JButton("");
		pa1sa17 = new JButton("");
		pa1sa16 = new JButton("");
		pa1sa15 = new JButton("");
		pa1sa13 = new JButton("");
		pa1sa12 = new JButton("");
		pa1sa11 = new JButton("");
		pa1sa10 = new JButton("");
		pa1do20 = new JButton("");
		pa1do19 = new JButton("");
		pa1do18 = new JButton("");
		pa1do17 = new JButton("");
		pa1do16 = new JButton("");
		pa1do15 = new JButton("");
		pa1do13 = new JButton("");
		pa1do12 = new JButton("");
		pa1do11 = new JButton("");
		pa1do10 = new JButton("");
		btnPista1 = new JButton("PISTA 1");
		btnPista2 = new JButton("PISTA 2");

		// -------------------------------------------------------------------------------------------------------------------------------
		JLabel lblNewLabel = new JLabel("09:00 - 10:00");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(23, 57, 119, 30);
		this.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("10:00 - 11:00");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 98, 119, 30);
		this.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("11:00 - 12:00");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(23, 139, 119, 30);
		this.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("12:00 - 13:00");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(23, 180, 119, 30);
		this.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("13:00 - 14:00");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_1.setBounds(23, 221, 119, 30);
		this.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("15:00 - 16:00");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_2.setBounds(23, 267, 119, 30);
		this.add(lblNewLabel_1_1_1_2);

		JLabel lblNewLabel_1_1_1_3 = new JLabel("16:00 - 17:00");
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_3.setBounds(23, 308, 119, 30);
		this.add(lblNewLabel_1_1_1_3);

		JLabel lblNewLabel_1_1_1_4 = new JLabel("17:00 - 18:00");
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_4.setBounds(23, 347, 119, 30);
		this.add(lblNewLabel_1_1_1_4);

		JLabel lblNewLabel_1_1_1_5 = new JLabel("18:00 - 19:00");
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_5.setBounds(23, 387, 119, 30);
		this.add(lblNewLabel_1_1_1_5);

		JLabel lblNewLabel_1_1_1_6 = new JLabel("19:00 - 20:00");
		lblNewLabel_1_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_6.setBounds(23, 428, 119, 31);
		this.add(lblNewLabel_1_1_1_6);

		JLabel lblNewLabel_1_1_1_7 = new JLabel("20:00 - 21:00");
		lblNewLabel_1_1_1_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1_7.setBounds(23, 467, 119, 30);
		this.add(lblNewLabel_1_1_1_7);

		pa1lu9.setBounds(149, 57, 100, 40);
		this.add(pa1lu9);

		pa1lu10.setBounds(149, 97, 100, 40);
		this.add(pa1lu10);

		pa1ma9.setBounds(249, 57, 100, 40);
		this.add(pa1ma9);

		pa1mi9.setBounds(349, 57, 100, 40);
		this.add(pa1mi9);

		pa1ju9.setBounds(449, 57, 100, 40);
		this.add(pa1ju9);

		pa1vi9.setBounds(549, 57, 100, 40);
		this.add(pa1vi9);

		pa1sa9.setBounds(649, 57, 100, 40);
		this.add(pa1sa9);

		pa1do9.setBounds(749, 57, 100, 40);
		this.add(pa1do9);

		pa1lu11.setBounds(149, 137, 100, 40);
		this.add(pa1lu11);

		pa1lu12.setBounds(149, 177, 100, 40);
		this.add(pa1lu12);

		pa1lu13.setBounds(149, 217, 100, 40);
		this.add(pa1lu13);

		pa1lu15.setBounds(149, 267, 100, 40);
		this.add(pa1lu15);

		pa1lu16.setBounds(149, 307, 100, 40);
		this.add(pa1lu16);

		pa1lu17.setBounds(149, 347, 100, 40);
		this.add(pa1lu17);

		pa1lu18.setBounds(149, 387, 100, 40);
		this.add(pa1lu18);

		pa1lu19.setBounds(149, 427, 100, 40);
		this.add(pa1lu19);

		pa1lu20.setBounds(149, 467, 100, 40);
		this.add(pa1lu20);

		pa1ma20.setBounds(249, 467, 100, 40);
		this.add(pa1ma20);

		pa1ma19.setBounds(249, 427, 100, 40);
		this.add(pa1ma19);

		pa1ma18.setBounds(249, 387, 100, 40);
		this.add(pa1ma18);

		pa1ma17.setBounds(249, 347, 100, 40);
		this.add(pa1ma17);

		pa1ma16.setBounds(249, 307, 100, 40);
		this.add(pa1ma16);

		pa1ma15.setBounds(249, 267, 100, 40);
		this.add(pa1ma15);

		pa1ma13.setBounds(249, 217, 100, 40);
		this.add(pa1ma13);

		pa1ma12.setBounds(249, 177, 100, 40);
		this.add(pa1ma12);

		pa1ma11.setBounds(249, 137, 100, 40);
		this.add(pa1ma11);

		pa1ma10.setBounds(249, 97, 100, 40);
		this.add(pa1ma10);

		pa1mi20.setBounds(349, 467, 100, 40);
		this.add(pa1mi20);

		pa1mi19.setBounds(349, 427, 100, 40);
		this.add(pa1mi19);

		pa1mi18.setBounds(349, 387, 100, 40);
		this.add(pa1mi18);

		pa1mi17.setBounds(349, 347, 100, 40);
		this.add(pa1mi17);

		pa1mi16.setBounds(349, 307, 100, 40);
		this.add(pa1mi16);

		pa1mi15.setBounds(349, 267, 100, 40);
		this.add(pa1mi15);

		pa1mi13.setBounds(349, 217, 100, 40);
		this.add(pa1mi13);

		pa1mi12.setBounds(349, 177, 100, 40);
		this.add(pa1mi12);

		pa1mi11.setBounds(349, 137, 100, 40);
		this.add(pa1mi11);

		pa1mi10.setBounds(349, 97, 100, 40);
		this.add(pa1mi10);

		pa1ju20.setBounds(449, 467, 100, 40);
		this.add(pa1ju20);

		pa1ju19.setBounds(449, 427, 100, 40);
		this.add(pa1ju19);

		pa1ju18.setBounds(449, 387, 100, 40);
		this.add(pa1ju18);

		pa1ju17.setBounds(449, 347, 100, 40);
		this.add(pa1ju17);

		pa1ju16.setBounds(449, 307, 100, 40);
		this.add(pa1ju16);

		pa1ju15.setBounds(449, 267, 100, 40);
		this.add(pa1ju15);

		pa1ju13.setBounds(449, 217, 100, 40);
		this.add(pa1ju13);

		pa1ju12.setBounds(449, 177, 100, 40);
		this.add(pa1ju12);

		pa1ju11.setBounds(449, 137, 100, 40);
		this.add(pa1ju11);

		pa1ju10.setBounds(449, 97, 100, 40);
		this.add(pa1ju10);

		pa1vi20.setBounds(549, 467, 100, 40);
		this.add(pa1vi20);

		pa1vi19.setBounds(549, 427, 100, 40);
		this.add(pa1vi19);

		pa1vi18.setBounds(549, 387, 100, 40);
		this.add(pa1vi18);

		pa1vi17.setBounds(549, 347, 100, 40);
		this.add(pa1vi17);

		pa1vi16.setBounds(549, 307, 100, 40);
		this.add(pa1vi16);

		pa1vi15.setBounds(549, 267, 100, 40);
		this.add(pa1vi15);

		pa1vi13.setBounds(549, 217, 100, 40);
		this.add(pa1vi13);

		pa1vi12.setBounds(549, 177, 100, 40);
		this.add(pa1vi12);

		pa1vi11.setBounds(549, 137, 100, 40);
		this.add(pa1vi11);

		pa1vi10.setBounds(549, 97, 100, 40);
		this.add(pa1vi10);

		pa1sa20.setBounds(649, 467, 100, 40);
		this.add(pa1sa20);

		pa1sa19.setBounds(649, 427, 100, 40);
		this.add(pa1sa19);

		pa1sa18.setBounds(649, 387, 100, 40);
		this.add(pa1sa18);

		pa1sa17.setBounds(649, 347, 100, 40);
		this.add(pa1sa17);

		pa1sa16.setBounds(649, 307, 100, 40);
		this.add(pa1sa16);

		pa1sa15.setBounds(649, 267, 100, 40);
		this.add(pa1sa15);

		pa1sa13.setBounds(649, 217, 100, 40);
		this.add(pa1sa13);

		pa1sa12.setBounds(649, 177, 100, 40);
		this.add(pa1sa12);

		pa1sa11.setBounds(649, 137, 100, 40);
		this.add(pa1sa11);

		pa1sa10.setBounds(649, 97, 100, 40);
		this.add(pa1sa10);

		pa1do20.setBounds(749, 467, 100, 40);
		this.add(pa1do20);

		pa1do19.setBounds(749, 427, 100, 40);
		this.add(pa1do19);

		pa1do18.setBounds(749, 387, 100, 40);
		this.add(pa1do18);

		pa1do17.setBounds(749, 347, 100, 40);
		this.add(pa1do17);

		pa1do16.setBounds(749, 307, 100, 40);
		this.add(pa1do16);

		pa1do15.setBounds(749, 267, 100, 40);
		this.add(pa1do15);

		pa1do13.setBounds(749, 217, 100, 40);
		this.add(pa1do13);

		pa1do12.setBounds(749, 177, 100, 40);
		this.add(pa1do12);

		pa1do11.setBounds(749, 137, 100, 40);
		this.add(pa1do11);

		pa1do10.setBounds(749, 97, 100, 40);
		this.add(pa1do10);

		JLabel lblLunes = new JLabel("LUNES");
		lblLunes.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes.setBounds(149, 20, 100, 30);
		this.add(lblLunes);

		JLabel lblLunes_1 = new JLabel("MARTES");
		lblLunes_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes_1.setBounds(249, 20, 100, 30);
		this.add(lblLunes_1);

		JLabel lblLunes_1_1 = new JLabel("MIERCOLES");
		lblLunes_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes_1_1.setBounds(349, 20, 100, 30);
		this.add(lblLunes_1_1);

		JLabel lblLunes_1_2 = new JLabel("JUEVES");
		lblLunes_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes_1_2.setBounds(449, 20, 100, 30);
		this.add(lblLunes_1_2);

		JLabel lblLunes_1_3 = new JLabel("VIERNES");
		lblLunes_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes_1_3.setBounds(549, 20, 100, 30);
		this.add(lblLunes_1_3);

		JLabel lblLunes_1_4 = new JLabel("SABADO");
		lblLunes_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes_1_4.setBounds(649, 20, 100, 30);
		this.add(lblLunes_1_4);

		JLabel lblLunes_1_5 = new JLabel("DOMINGO");
		lblLunes_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunes_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLunes_1_5.setBounds(749, 20, 100, 30);
		this.add(lblLunes_1_5);

		JLabel lblNewLabel_2 = new JLabel("PADEL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 46));
		lblNewLabel_2.setBounds(916, 20, 195, 66);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Padel1.class.getResource("/images/padel.jpg")));

		lblNewLabel_3.setBounds(870, 149, 280, 310);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\u00A1Se tu mejor version!");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 20));
		lblNewLabel_4.setBounds(905, 465, 225, 30);
		this.add(lblNewLabel_4);

		btnPista1.setBounds(900, 100, 100, 30);
		add(btnPista1);

		btnPista2.setBounds(1011, 100, 100, 30);
		add(btnPista2);

		// --------------------------------------------ACTION
		// LISTENER-----------------------------------------------------------
		pa1lu9.addActionListener(this);
		pa1lu10.addActionListener(this);
		pa1lu11.addActionListener(this);
		pa1lu12.addActionListener(this);
		pa1lu13.addActionListener(this);
		pa1lu15.addActionListener(this);
		pa1lu16.addActionListener(this);
		pa1lu17.addActionListener(this);
		pa1lu18.addActionListener(this);
		pa1lu19.addActionListener(this);
		pa1lu20.addActionListener(this);

		pa1ma9.addActionListener(this);
		pa1ma10.addActionListener(this);
		pa1ma11.addActionListener(this);
		pa1ma12.addActionListener(this);
		pa1ma13.addActionListener(this);
		pa1ma15.addActionListener(this);
		pa1ma16.addActionListener(this);
		pa1ma17.addActionListener(this);
		pa1ma18.addActionListener(this);
		pa1ma19.addActionListener(this);
		pa1ma20.addActionListener(this);

		pa1mi9.addActionListener(this);
		pa1mi10.addActionListener(this);
		pa1mi11.addActionListener(this);
		pa1mi12.addActionListener(this);
		pa1mi13.addActionListener(this);
		pa1mi15.addActionListener(this);
		pa1mi16.addActionListener(this);
		pa1mi17.addActionListener(this);
		pa1mi18.addActionListener(this);
		pa1mi19.addActionListener(this);
		pa1mi20.addActionListener(this);

		pa1ju9.addActionListener(this);
		pa1ju10.addActionListener(this);
		pa1ju11.addActionListener(this);
		pa1ju12.addActionListener(this);
		pa1ju13.addActionListener(this);
		pa1ju15.addActionListener(this);
		pa1ju16.addActionListener(this);
		pa1ju17.addActionListener(this);
		pa1ju18.addActionListener(this);
		pa1ju19.addActionListener(this);
		pa1ju20.addActionListener(this);

		pa1vi9.addActionListener(this);
		pa1vi10.addActionListener(this);
		pa1vi11.addActionListener(this);
		pa1vi12.addActionListener(this);
		pa1vi13.addActionListener(this);
		pa1vi15.addActionListener(this);
		pa1vi16.addActionListener(this);
		pa1vi17.addActionListener(this);
		pa1vi18.addActionListener(this);
		pa1vi19.addActionListener(this);
		pa1vi20.addActionListener(this);

		pa1sa9.addActionListener(this);
		pa1sa10.addActionListener(this);
		pa1sa11.addActionListener(this);
		pa1sa12.addActionListener(this);
		pa1sa13.addActionListener(this);
		pa1sa15.addActionListener(this);
		pa1sa16.addActionListener(this);
		pa1sa17.addActionListener(this);
		pa1sa18.addActionListener(this);
		pa1sa19.addActionListener(this);
		pa1sa20.addActionListener(this);

		pa1do9.addActionListener(this);
		pa1do10.addActionListener(this);
		pa1do11.addActionListener(this);
		pa1do12.addActionListener(this);
		pa1do13.addActionListener(this);
		pa1do15.addActionListener(this);
		pa1do16.addActionListener(this);
		pa1do17.addActionListener(this);
		pa1do18.addActionListener(this);
		pa1do19.addActionListener(this);
		pa1do20.addActionListener(this);

		btnPista1.addActionListener(this);
		btnPista2.addActionListener(this);
		// --------------------------------------BUSQUEDA PREVIA HUECOS
		// LIBRES------------------------------

		ScheduleUser su = new ScheduleUser();
		int contlu9 = su.contPadel("lu9");
		pa1lu9.setText("Plazas libres:" + (4 - contlu9));
		int contlu10 = su.contPadel("lu10");
		pa1lu10.setText("Plazas libres:" + (4 - contlu10));
		int contlu11 = su.contPadel("lu11");
		pa1lu11.setText("Plazas libres:" + (4 - contlu11));
		int contlu12 = su.contPadel("lu12");
		pa1lu12.setText("Plazas libres:" + (4 - contlu12));
		int contlu13 = su.contPadel("lu13");
		pa1lu13.setText("Plazas libres:" + (4 - contlu13));
		int contlu15 = su.contPadel("lu15");
		pa1lu15.setText("Plazas libres:" + (4 - contlu15));
		int contlu16 = su.contPadel("lu16");
		pa1lu16.setText("Plazas libres:" + (4 - contlu16));
		int contlu17 = su.contPadel("lu17");
		pa1lu17.setText("Plazas libres:" + (4 - contlu17));
		int contlu18 = su.contPadel("lu18");
		pa1lu18.setText("Plazas libres:" + (4 - contlu18));
		int contlu19 = su.contPadel("lu19");
		pa1lu19.setText("Plazas libres:" + (4 - contlu19));
		int contlu20 = su.contPadel("lu20");
		pa1lu20.setText("Plazas libres:" + (4 - contlu20));

		int contma9 = su.contPadel("ma9");
		pa1ma9.setText("Plazas libres:" + (4 - contma9));
		int contma10 = su.contPadel("ma10");
		pa1ma10.setText("Plazas libres:" + (4 - contma10));
		int contma11 = su.contPadel("ma11");
		pa1ma11.setText("Plazas libres:" + (4 - contma11));
		int contma12 = su.contPadel("ma12");
		pa1ma12.setText("Plazas libres:" + (4 - contma12));
		int contma13 = su.contPadel("ma13");
		pa1ma13.setText("Plazas libres:" + (4 - contma13));
		int contma15 = su.contPadel("ma15");
		pa1ma15.setText("Plazas libres:" + (4 - contma15));
		int contma16 = su.contPadel("ma16");
		pa1ma16.setText("Plazas libres:" + (4 - contma16));
		int contma17 = su.contPadel("ma17");
		pa1ma17.setText("Plazas libres:" + (4 - contma17));
		int contma18 = su.contPadel("ma18");
		pa1ma18.setText("Plazas libres:" + (4 - contma18));
		int contma19 = su.contPadel("ma19");
		pa1ma19.setText("Plazas libres:" + (4 - contma19));
		int contma20 = su.contPadel("ma20");
		pa1ma20.setText("Plazas libres:" + (4 - contma20));

		int contmi9 = su.contPadel("mi9");
		pa1mi9.setText("Plazas libres:" + (4 - contmi9));
		int contmi10 = su.contPadel("mi10");
		pa1mi10.setText("Plazas libres:" + (4 - contmi10));
		int contmi11 = su.contPadel("mi11");
		pa1mi11.setText("Plazas libres:" + (4 - contmi11));
		int contmi12 = su.contPadel("mi12");
		pa1mi12.setText("Plazas libres:" + (4 - contmi12));
		int contmi13 = su.contPadel("mi13");
		pa1mi13.setText("Plazas libres:" + (4 - contmi13));
		int contmi15 = su.contPadel("mi15");
		pa1mi15.setText("Plazas libres:" + (4 - contmi15));
		int contmi16 = su.contPadel("mi16");
		pa1mi16.setText("Plazas libres:" + (4 - contmi16));
		int contmi17 = su.contPadel("mi17");
		pa1mi17.setText("Plazas libres:" + (4 - contmi17));
		int contmi18 = su.contPadel("mi18");
		pa1mi18.setText("Plazas libres:" + (4 - contmi18));
		int contmi19 = su.contPadel("mi19");
		pa1mi19.setText("Plazas libres:" + (4 - contmi19));
		int contmi20 = su.contPadel("mi20");
		pa1mi20.setText("Plazas libres:" + (4 - contmi20));

		int contju9 = su.contPadel("ju9");
		pa1ju9.setText("Plazas libres:" + (4 - contju9));
		int contju10 = su.contPadel("ju10");
		pa1ju10.setText("Plazas libres:" + (4 - contju10));
		int contju11 = su.contPadel("ju11");
		pa1ju11.setText("Plazas libres:" + (4 - contju11));
		int contju12 = su.contPadel("ju12");
		pa1ju12.setText("Plazas libres:" + (4 - contju12));
		int contju13 = su.contPadel("ju13");
		pa1ju13.setText("Plazas libres:" + (4 - contju13));
		int contju15 = su.contPadel("ju15");
		pa1ju15.setText("Plazas libres:" + (4 - contju15));
		int contju16 = su.contPadel("ju16");
		pa1ju16.setText("Plazas libres:" + (4 - contju16));
		int contju17 = su.contPadel("ju17");
		pa1ju17.setText("Plazas libres:" + (4 - contju17));
		int contju18 = su.contPadel("ju18");
		pa1ju18.setText("Plazas libres:" + (4 - contju18));
		int contju19 = su.contPadel("ju19");
		pa1ju19.setText("Plazas libres:" + (4 - contju19));
		int contju20 = su.contPadel("ju20");
		pa1ju20.setText("Plazas libres:" + (4 - contju20));

		int contvi9 = su.contPadel("vi9");
		pa1vi9.setText("Plazas libres:" + (4 - contvi9));
		int contvi10 = su.contPadel("vi10");
		pa1vi10.setText("Plazas libres:" + (4 - contvi10));
		int contvi11 = su.contPadel("vi11");
		pa1vi11.setText("Plazas libres:" + (4 - contvi11));
		int contvi12 = su.contPadel("vi12");
		pa1vi12.setText("Plazas libres:" + (4 - contvi12));
		int contvi13 = su.contPadel("vi13");
		pa1vi13.setText("Plazas libres:" + (4 - contvi13));
		int contvi15 = su.contPadel("vi15");
		pa1vi15.setText("Plazas libres:" + (4 - contvi15));
		int contvi16 = su.contPadel("vi16");
		pa1vi16.setText("Plazas libres:" + (4 - contvi16));
		int contvi17 = su.contPadel("vi17");
		pa1vi17.setText("Plazas libres:" + (4 - contvi17));
		int contvi18 = su.contPadel("vi18");
		pa1vi18.setText("Plazas libres:" + (4 - contvi18));
		int contvi19 = su.contPadel("vi19");
		pa1vi19.setText("Plazas libres:" + (4 - contvi19));
		int contvi20 = su.contPadel("vi20");
		pa1vi20.setText("Plazas libres:" + (4 - contvi20));

		int contsa9 = su.contPadel("sa9");
		pa1sa9.setText("Plazas libres:" + (4 - contsa9));
		int contsa10 = su.contPadel("sa10");
		pa1sa10.setText("Plazas libres:" + (4 - contsa10));
		int contsa11 = su.contPadel("sa11");
		pa1sa11.setText("Plazas libres:" + (4 - contsa11));
		int contsa12 = su.contPadel("sa12");
		pa1sa12.setText("Plazas libres:" + (4 - contsa12));
		int contsa13 = su.contPadel("sa13");
		pa1sa13.setText("Plazas libres:" + (4 - contsa13));
		int contsa15 = su.contPadel("sa15");
		pa1sa15.setText("Plazas libres:" + (4 - contsa15));
		int contsa16 = su.contPadel("sa16");
		pa1sa16.setText("Plazas libres:" + (4 - contsa16));
		int contsa17 = su.contPadel("sa17");
		pa1sa17.setText("Plazas libres:" + (4 - contsa17));
		int contsa18 = su.contPadel("sa18");
		pa1sa18.setText("Plazas libres:" + (4 - contsa18));
		int contsa19 = su.contPadel("sa19");
		pa1sa19.setText("Plazas libres:" + (4 - contsa19));
		int contsa20 = su.contPadel("sa20");
		pa1sa20.setText("Plazas libres:" + (4 - contsa20));

		int contdo9 = su.contPadel("do9");
		pa1do9.setText("Plazas libres:" + (4 - contdo9));
		int contdo10 = su.contPadel("do10");
		pa1do10.setText("Plazas libres:" + (4 - contdo10));
		int contdo11 = su.contPadel("do11");
		pa1do11.setText("Plazas libres:" + (4 - contdo11));
		int contdo12 = su.contPadel("do12");
		pa1do12.setText("Plazas libres:" + (4 - contdo12));
		int contdo13 = su.contPadel("do13");
		pa1do13.setText("Plazas libres:" + (4 - contdo13));
		int contdo15 = su.contPadel("do15");
		pa1do15.setText("Plazas libres:" + (4 - contdo15));
		int contdo16 = su.contPadel("do16");
		pa1do16.setText("Plazas libres:" + (4 - contdo16));
		int contdo17 = su.contPadel("do17");
		pa1do17.setText("Plazas libres:" + (4 - contdo17));
		int contdo18 = su.contPadel("do18");
		pa1do18.setText("Plazas libres:" + (4 - contdo18));
		int contdo19 = su.contPadel("do19");
		pa1do19.setText("Plazas libres:" + (4 - contdo19));
		int contdo20 = su.contPadel("do20");
		pa1do20.setText("Plazas libres:" + (4 - contdo20));
	}

	// ---------------------------------------------------------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.pa1lu9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1lu10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1lu20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11lu20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12lu20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13lu20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14lu20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11lu20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12lu20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13lu20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14lu20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// **************************MARTEEEEEEES********************************
		} else if (e.getSource() == this.pa1ma9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1ma10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ma20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ma20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ma20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ma20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ma20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ma20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ma20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ma20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ma20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// *******************************************************************************
		} else if (e.getSource() == this.pa1mi9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1mi10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1mi20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11mi20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12mi20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13mi20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14mi20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11mi20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12mi20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13mi20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14mi20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// **********************************************************************
		} else if (e.getSource() == this.pa1ju9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1ju10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1ju20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11ju20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12ju20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13ju20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14ju20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11ju20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12ju20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13ju20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14ju20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// ***********************************************************************
		} else if (e.getSource() == this.pa1vi9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1vi10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1vi20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11vi20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12vi20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13vi20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14vi20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11vi20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12vi20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13vi20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14vi20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// ************************************************************************
		} else if (e.getSource() == this.pa1sa9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1sa10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1sa20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11sa20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12sa20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13sa20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14sa20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11sa20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12sa20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13sa20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14sa20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// *********************************************************************
		} else if (e.getSource() == this.pa1do9) {
			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do9")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do9")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do9")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do9")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do9";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do9";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do9";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do9";
					su2.bookingPadel(id, jugador4);
				}

			}
			// -----------------------------------------------------------------------
		} else if (e.getSource() == this.pa1do10) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do10")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do10")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do10")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do10")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do10";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do10";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do10";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do10";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do11) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do11")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do11")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do11")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do11")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do11";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do11";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do11";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do11";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do12) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do12")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do12")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do12")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do12")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do12";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do12";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do12";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do12";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do13) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do13")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do13")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do13")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do13")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do13";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do13";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do13";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do13";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do15) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do15")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do15")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do15")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do15")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do15";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do15";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do15";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do15";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do16) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do16")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do16")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do16")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do16")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do16";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do16";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do16";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do16";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do17) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do17")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do17")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do17")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do17")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do17";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do17";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do17";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do17";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do18) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do18")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do18")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do18")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do18")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do18";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do18";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do18";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do18";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do19) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do19")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do19")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do19")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do19")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do19";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do19";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do19";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do19";
					su2.bookingPadel(id, jugador4);
				}

			}
		} else if (e.getSource() == this.pa1do20) {

			JTextField field1 = new JTextField();
			JTextField field2 = new JTextField();
			JTextField field3 = new JTextField();
			JTextField field4 = new JTextField();

			ScheduleUser su2 = new ScheduleUser();
			List<String> idList = su2.previus();
			ScheduleUser su3 = new ScheduleUser();
			List<String> nombreList = su3.previus2();

			for (int i = 0; i < idList.size(); i++) {
				if (idList.get(i).equals("pa11do20")) {
					field1.setText(nombreList.get(i));
					field1.setEditable(false);
				} else if (idList.get(i).equals("pa12do20")) {
					field2.setText(nombreList.get(i));
					field2.setEditable(false);
				} else if (idList.get(i).equals("pa13do20")) {
					field3.setText(nombreList.get(i));
					field3.setEditable(false);
				} else if (idList.get(i).equals("pa14do20")) {
					field4.setText(nombreList.get(i));
					field4.setEditable(false);
				}
			}
			// -------------------------------------
			Object[] message = { "Jugador 1:", field1, "Jugador 2:", field2, "Jugador 3:", field3, "Jugador 4:",
					field4, };
			int option = JOptionPane.showConfirmDialog(null, message, "INTRODUZCA JUGADORES",
					JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
				String jugador1 = field1.getText();
				String jugador2 = field2.getText();
				String jugador3 = field3.getText();
				String jugador4 = field4.getText();
				if (field1.isEditable() == true && !jugador1.isBlank()) {
					String id = "pa11do20";
					su2.bookingPadel(id, jugador1);
				}
				if (field2.isEditable() == true && !jugador2.isBlank()) {
					String id = "pa12do20";
					su2.bookingPadel(id, jugador2);
				}
				if (field3.isEditable() == true && !jugador3.isBlank()) {
					String id = "pa13do20";
					su2.bookingPadel(id, jugador3);
				}
				if (field4.isEditable() == true && !jugador4.isBlank()) {
					String id = "pa14do20";
					su2.bookingPadel(id, jugador4);
				}

			}
			// ***********************************************************
		} else if (e.getSource() == this.btnPista1) {
		} else if (e.getSource() == this.btnPista2) {

			/*
			 * panelPadel.setVisible(false); Padel2 panelPadel2 = new Padel2();
			 * frame.getContentPane().add(panelPadel2, "name_1012574314747200");
			 * panelPadel2.setLayout(null); panelPadel2.setVisible(true);
			 */

		} else {
			JOptionPane.showMessageDialog(null, "Error", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
		}

	}
}
