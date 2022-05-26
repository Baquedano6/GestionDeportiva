package view;

/*import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.ScheduleUser;*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
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

public class Perfil extends JPanel implements ActionListener {
	

	JButton perfillu9;
	JButton perfillu10;
	JButton perfilma9;
	JButton perfilmi9;
	JButton perfilju9;
	JButton perfilvi9;
	JButton perfilsa9;
	JButton perfildo9;
	JButton perfillu11;
	JButton perfillu12;
	JButton perfillu13;
	JButton perfillu15;
	JButton perfillu16;
	JButton perfillu17;
	JButton perfillu18;
	JButton perfillu19;
	JButton perfillu20;
	JButton perfilma20;
	JButton perfilma19;
	JButton perfilma18;
	JButton perfilma17;
	JButton perfilma16;
	JButton perfilma15;
	JButton perfilma13;
	JButton perfilma12;
	JButton perfilma11;
	JButton perfilma10;
	JButton perfilmi20;
	JButton perfilmi19;
	JButton perfilmi18;
	JButton perfilmi17;
	JButton perfilmi16;
	JButton perfilmi15;
	JButton perfilmi13;
	JButton perfilmi12;
	JButton perfilmi11;
	JButton perfilmi10;
	JButton perfilju20;
	JButton perfilju19;
	JButton perfilju18;
	JButton perfilju17;
	JButton perfilju16;
	JButton perfilju15;
	JButton perfilju13;
	JButton perfilju12;
	JButton perfilju11;
	JButton perfilju10;
	JButton perfilvi20;
	JButton perfilvi19;
	JButton perfilvi18;
	JButton perfilvi17;
	JButton perfilvi16;
	JButton perfilvi15;
	JButton perfilvi13;
	JButton perfilvi12;
	JButton perfilvi11;
	JButton perfilvi10;
	JButton perfilsa20;
	JButton perfilsa19;
	JButton perfilsa18;
	JButton perfilsa17;
	JButton perfilsa16;
	JButton perfilsa15;
	JButton perfilsa13;
	JButton perfilsa12;
	JButton perfilsa11;
	JButton perfilsa10;
	JButton perfildo20;
	JButton perfildo19;
	JButton perfildo18;
	JButton perfildo17;
	JButton perfildo16;
	JButton perfildo15;
	JButton perfildo13;
	JButton perfildo12;
	JButton perfildo11;
	JButton perfildo10;
	/**
	 * Create the this.
	 */
	public Perfil() {
		setLayout(null);

		// ---------------------------------------------------------CREAR BOTONES--------------------------------------------------
		 perfillu9 = new JButton("");
		 perfillu9.setEnabled(false);
		 perfillu10 = new JButton("");
		 perfillu10.setEnabled(false);
		 perfilma9 = new JButton("");
		 perfilma9.setEnabled(false);
		 perfilmi9 = new JButton("");
		 perfilmi9.setEnabled(false);
		 perfilju9 = new JButton("");
		 perfilju9.setEnabled(false);
		 perfilvi9 = new JButton("");
		 perfilvi9.setEnabled(false);
		 perfilsa9 = new JButton("");
		 perfilsa9.setEnabled(false);
		 perfildo9 = new JButton("");
		 perfildo9.setEnabled(false);
		 perfillu11 = new JButton("");
		 perfillu11.setEnabled(false);
		 perfillu12 = new JButton("");
		 perfillu12.setEnabled(false);
		 perfillu13 = new JButton("");
		 perfillu13.setEnabled(false);
		 perfillu15 = new JButton("");
		 perfillu15.setEnabled(false);
		 perfillu16 = new JButton("");
		 perfillu16.setEnabled(false);
		 perfillu17 = new JButton("");
		 perfillu17.setEnabled(false);
		 perfillu18 = new JButton("");
		 perfillu18.setEnabled(false);
		 perfillu19 = new JButton("");
		 perfillu19.setEnabled(false);
		 perfillu20 = new JButton("");
		 perfillu20.setEnabled(false);
		 perfilma20 = new JButton("");
		 perfilma20.setEnabled(false);
		 perfilma19 = new JButton("");
		 perfilma19.setEnabled(false);
		 perfilma18 = new JButton("");
		 perfilma18.setEnabled(false);
		 perfilma17 = new JButton("");
		 perfilma17.setEnabled(false);
		 perfilma16 = new JButton("");
		 perfilma16.setEnabled(false);
		 perfilma15 = new JButton("");
		 perfilma15.setEnabled(false);
		 perfilma13 = new JButton("");
		 perfilma13.setEnabled(false);
		 perfilma12 = new JButton("");
		 perfilma12.setEnabled(false);
		 perfilma11 = new JButton("");
		 perfilma11.setEnabled(false);
		 perfilma10 = new JButton("");
		 perfilma10.setEnabled(false);
		 perfilmi20 = new JButton("");
		 perfilmi20.setEnabled(false);
		 perfilmi19 = new JButton("");
		 perfilmi19.setEnabled(false);
		 perfilmi18 = new JButton("");
		 perfilmi18.setEnabled(false);
		 perfilmi17 = new JButton("");
		 perfilmi17.setEnabled(false);
		 perfilmi16 = new JButton("");
		 perfilmi16.setEnabled(false);
		 perfilmi15 = new JButton("");
		 perfilmi15.setEnabled(false);
		 perfilmi13 = new JButton("");
		 perfilmi13.setEnabled(false);
		 perfilmi12 = new JButton("");
		 perfilmi12.setEnabled(false);
		 perfilmi11 = new JButton("");
		 perfilmi11.setEnabled(false);
		 perfilmi10 = new JButton("");
		 perfilmi10.setEnabled(false);
		 perfilju20 = new JButton("");
		 perfilju20.setEnabled(false);
		 perfilju19 = new JButton("");
		 perfilju19.setEnabled(false);
		 perfilju18 = new JButton("");
		 perfilju18.setEnabled(false);
		 perfilju17 = new JButton("");
		 perfilju17.setEnabled(false);
		 perfilju16 = new JButton("");
		 perfilju16.setEnabled(false);
		 perfilju15 = new JButton("");
		 perfilju15.setEnabled(false);
		 perfilju13 = new JButton("");
		 perfilju13.setEnabled(false);
		 perfilju12 = new JButton("");
		 perfilju12.setEnabled(false);
		 perfilju11 = new JButton("");
		 perfilju11.setEnabled(false);
		 perfilju10 = new JButton("");
		 perfilju10.setEnabled(false);
		 perfilvi20 = new JButton("");
		 perfilvi20.setEnabled(false);
		 perfilvi19 = new JButton("");
		 perfilvi19.setEnabled(false);
		 perfilvi18 = new JButton("");
		 perfilvi18.setEnabled(false);
		 perfilvi17 = new JButton("");
		 perfilvi17.setEnabled(false);
		 perfilvi16 = new JButton("");
		 perfilvi16.setEnabled(false);
		 perfilvi15 = new JButton("");
		 perfilvi15.setEnabled(false);
		 perfilvi13 = new JButton("");
		 perfilvi13.setEnabled(false);
		 perfilvi12 = new JButton("");
		 perfilvi12.setEnabled(false);
		 perfilvi11 = new JButton("");
		 perfilvi11.setEnabled(false);
		 perfilvi10 = new JButton("");
		 perfilvi10.setEnabled(false);
		 perfilsa20 = new JButton("");
		 perfilsa20.setEnabled(false);
		 perfilsa19 = new JButton("");
		 perfilsa19.setEnabled(false);
		 perfilsa18 = new JButton("");
		 perfilsa18.setEnabled(false);
		 perfilsa17 = new JButton("");
		 perfilsa17.setEnabled(false);
		 perfilsa16 = new JButton("");
		 perfilsa16.setEnabled(false);
		 perfilsa15 = new JButton("");
		 perfilsa15.setEnabled(false);
		 perfilsa13 = new JButton("");
		 perfilsa13.setEnabled(false);
		 perfilsa12 = new JButton("");
		 perfilsa12.setEnabled(false);
		 perfilsa11 = new JButton("");
		 perfilsa11.setEnabled(false);
		 perfilsa10 = new JButton("");
		 perfilsa10.setEnabled(false);
		 perfildo20 = new JButton("");
		 perfildo20.setEnabled(false);
		 perfildo19 = new JButton("");
		 perfildo19.setEnabled(false);
		 perfildo18 = new JButton("");
		 perfildo18.setEnabled(false);
		 perfildo17 = new JButton("");
		 perfildo17.setEnabled(false);
		 perfildo16 = new JButton("");
		 perfildo16.setEnabled(false);
		 perfildo15 = new JButton("");
		 perfildo15.setEnabled(false);
		 perfildo13 = new JButton("");
		 perfildo13.setEnabled(false);
		 perfildo12 = new JButton("");
		 perfildo12.setEnabled(false);
		 perfildo11 = new JButton("");
		 perfildo11.setEnabled(false);
		 perfildo10 = new JButton("");
		 perfildo10.setEnabled(false);

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

		perfillu9.setBounds(149, 57, 100, 40);
		this.add(perfillu9);

		perfillu10.setBounds(149, 97, 100, 40);
		this.add(perfillu10);

		perfilma9.setBounds(249, 57, 100, 40);
		this.add(perfilma9);

		perfilmi9.setBounds(349, 57, 100, 40);
		this.add(perfilmi9);

		perfilju9.setBounds(449, 57, 100, 40);
		this.add(perfilju9);

		perfilvi9.setBounds(549, 57, 100, 40);
		this.add(perfilvi9);

		perfilsa9.setBounds(649, 57, 100, 40);
		this.add(perfilsa9);

		perfildo9.setBounds(749, 57, 100, 40);
		this.add(perfildo9);

		perfillu11.setBounds(149, 137, 100, 40);
		this.add(perfillu11);

		perfillu12.setBounds(149, 177, 100, 40);
		this.add(perfillu12);

		perfillu13.setBounds(149, 217, 100, 40);
		this.add(perfillu13);

		perfillu15.setBounds(149, 267, 100, 40);
		this.add(perfillu15);

		perfillu16.setBounds(149, 307, 100, 40);
		this.add(perfillu16);

		perfillu17.setBounds(149, 347, 100, 40);
		this.add(perfillu17);

		perfillu18.setBounds(149, 387, 100, 40);
		this.add(perfillu18);

		perfillu19.setBounds(149, 427, 100, 40);
		this.add(perfillu19);

		perfillu20.setBounds(149, 467, 100, 40);
		this.add(perfillu20);

		perfilma20.setBounds(249, 467, 100, 40);
		this.add(perfilma20);

		perfilma19.setBounds(249, 427, 100, 40);
		this.add(perfilma19);

		perfilma18.setBounds(249, 387, 100, 40);
		this.add(perfilma18);

		perfilma17.setBounds(249, 347, 100, 40);
		this.add(perfilma17);

		perfilma16.setBounds(249, 307, 100, 40);
		this.add(perfilma16);

		perfilma15.setBounds(249, 267, 100, 40);
		this.add(perfilma15);

		perfilma13.setBounds(249, 217, 100, 40);
		this.add(perfilma13);

		perfilma12.setBounds(249, 177, 100, 40);
		this.add(perfilma12);

		perfilma11.setBounds(249, 137, 100, 40);
		this.add(perfilma11);

		perfilma10.setBounds(249, 97, 100, 40);
		this.add(perfilma10);

		perfilmi20.setBounds(349, 467, 100, 40);
		this.add(perfilmi20);

		perfilmi19.setBounds(349, 427, 100, 40);
		this.add(perfilmi19);

		perfilmi18.setBounds(349, 387, 100, 40);
		this.add(perfilmi18);

		perfilmi17.setBounds(349, 347, 100, 40);
		this.add(perfilmi17);

		perfilmi16.setBounds(349, 307, 100, 40);
		this.add(perfilmi16);

		perfilmi15.setBounds(349, 267, 100, 40);
		this.add(perfilmi15);

		perfilmi13.setBounds(349, 217, 100, 40);
		this.add(perfilmi13);

		perfilmi12.setBounds(349, 177, 100, 40);
		this.add(perfilmi12);

		perfilmi11.setBounds(349, 137, 100, 40);
		this.add(perfilmi11);

		perfilmi10.setBounds(349, 97, 100, 40);
		this.add(perfilmi10);

		perfilju20.setBounds(449, 467, 100, 40);
		this.add(perfilju20);

		perfilju19.setBounds(449, 427, 100, 40);
		this.add(perfilju19);

		perfilju18.setBounds(449, 387, 100, 40);
		this.add(perfilju18);

		perfilju17.setBounds(449, 347, 100, 40);
		this.add(perfilju17);

		perfilju16.setBounds(449, 307, 100, 40);
		this.add(perfilju16);

		perfilju15.setBounds(449, 267, 100, 40);
		this.add(perfilju15);

		perfilju13.setBounds(449, 217, 100, 40);
		this.add(perfilju13);

		perfilju12.setBounds(449, 177, 100, 40);
		this.add(perfilju12);

		perfilju11.setBounds(449, 137, 100, 40);
		this.add(perfilju11);

		perfilju10.setBounds(449, 97, 100, 40);
		this.add(perfilju10);

		perfilvi20.setBounds(549, 467, 100, 40);
		this.add(perfilvi20);

		perfilvi19.setBounds(549, 427, 100, 40);
		this.add(perfilvi19);

		perfilvi18.setBounds(549, 387, 100, 40);
		this.add(perfilvi18);

		perfilvi17.setBounds(549, 347, 100, 40);
		this.add(perfilvi17);

		perfilvi16.setBounds(549, 307, 100, 40);
		this.add(perfilvi16);

		perfilvi15.setBounds(549, 267, 100, 40);
		this.add(perfilvi15);

		perfilvi13.setBounds(549, 217, 100, 40);
		this.add(perfilvi13);

		perfilvi12.setBounds(549, 177, 100, 40);
		this.add(perfilvi12);

		perfilvi11.setBounds(549, 137, 100, 40);
		this.add(perfilvi11);

		perfilvi10.setBounds(549, 97, 100, 40);
		this.add(perfilvi10);

		perfilsa20.setBounds(649, 467, 100, 40);
		this.add(perfilsa20);

		perfilsa19.setBounds(649, 427, 100, 40);
		this.add(perfilsa19);

		perfilsa18.setBounds(649, 387, 100, 40);
		this.add(perfilsa18);

		perfilsa17.setBounds(649, 347, 100, 40);
		this.add(perfilsa17);

		perfilsa16.setBounds(649, 307, 100, 40);
		this.add(perfilsa16);

		perfilsa15.setBounds(649, 267, 100, 40);
		this.add(perfilsa15);

		perfilsa13.setBounds(649, 217, 100, 40);
		this.add(perfilsa13);

		perfilsa12.setBounds(649, 177, 100, 40);
		this.add(perfilsa12);

		perfilsa11.setBounds(649, 137, 100, 40);
		this.add(perfilsa11);

		perfilsa10.setBounds(649, 97, 100, 40);
		this.add(perfilsa10);

		perfildo20.setBounds(749, 467, 100, 40);
		this.add(perfildo20);

		perfildo19.setBounds(749, 427, 100, 40);
		this.add(perfildo19);

		perfildo18.setBounds(749, 387, 100, 40);
		this.add(perfildo18);

		perfildo17.setBounds(749, 347, 100, 40);
		this.add(perfildo17);

		perfildo16.setBounds(749, 307, 100, 40);
		this.add(perfildo16);

		perfildo15.setBounds(749, 267, 100, 40);
		this.add(perfildo15);

		perfildo13.setBounds(749, 217, 100, 40);
		this.add(perfildo13);

		perfildo12.setBounds(749, 177, 100, 40);
		this.add(perfildo12);

		perfildo11.setBounds(749, 137, 100, 40);
		this.add(perfildo11);

		perfildo10.setBounds(749, 97, 100, 40);
		this.add(perfildo10);

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

		JLabel lblNewLabel_2 = new JLabel("MI PERFIL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 46));
		lblNewLabel_2.setBounds(908, 38, 254, 66);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Perfil.class.getResource("/images/perfil.png")));
		
		lblNewLabel_3.setBounds(927, 115, 213, 229);
		this.add(lblNewLabel_3);

		// --------------------------------------------ACTION LISTENER-----------------------------------------------------------
		perfillu9.addActionListener(this);
		perfillu10.addActionListener(this);
		perfillu11.addActionListener(this);
		perfillu12.addActionListener(this);
		perfillu13.addActionListener(this);
		perfillu15.addActionListener(this);
		perfillu16.addActionListener(this);
		perfillu17.addActionListener(this);
		perfillu18.addActionListener(this);
		perfillu19.addActionListener(this);
		perfillu20.addActionListener(this);

		perfilma9.addActionListener(this);
		perfilma10.addActionListener(this);
		perfilma11.addActionListener(this);
		perfilma12.addActionListener(this);
		perfilma13.addActionListener(this);
		perfilma15.addActionListener(this);
		perfilma16.addActionListener(this);
		perfilma17.addActionListener(this);
		perfilma18.addActionListener(this);
		perfilma19.addActionListener(this);
		perfilma20.addActionListener(this);

		perfilmi9.addActionListener(this);
		perfilmi10.addActionListener(this);
		perfilmi11.addActionListener(this);
		perfilmi12.addActionListener(this);
		perfilmi13.addActionListener(this);
		perfilmi15.addActionListener(this);
		perfilmi16.addActionListener(this);
		perfilmi17.addActionListener(this);
		perfilmi18.addActionListener(this);
		perfilmi19.addActionListener(this);
		perfilmi20.addActionListener(this);

		perfilju9.addActionListener(this);
		perfilju10.addActionListener(this);
		perfilju11.addActionListener(this);
		perfilju12.addActionListener(this);
		perfilju13.addActionListener(this);
		perfilju15.addActionListener(this);
		perfilju16.addActionListener(this);
		perfilju17.addActionListener(this);
		perfilju18.addActionListener(this);
		perfilju19.addActionListener(this);
		perfilju20.addActionListener(this);

		perfilvi9.addActionListener(this);
		perfilvi10.addActionListener(this);
		perfilvi11.addActionListener(this);
		perfilvi12.addActionListener(this);
		perfilvi13.addActionListener(this);
		perfilvi15.addActionListener(this);
		perfilvi16.addActionListener(this);
		perfilvi17.addActionListener(this);
		perfilvi18.addActionListener(this);
		perfilvi19.addActionListener(this);
		perfilvi20.addActionListener(this);

		perfilsa9.addActionListener(this);
		perfilsa10.addActionListener(this);
		perfilsa11.addActionListener(this);
		perfilsa12.addActionListener(this);
		perfilsa13.addActionListener(this);
		perfilsa15.addActionListener(this);
		perfilsa16.addActionListener(this);
		perfilsa17.addActionListener(this);
		perfilsa18.addActionListener(this);
		perfilsa19.addActionListener(this);
		perfilsa20.addActionListener(this);

		perfildo9.addActionListener(this);
		perfildo10.addActionListener(this);
		perfildo11.addActionListener(this);
		perfildo12.addActionListener(this);
		perfildo13.addActionListener(this);
		perfildo15.addActionListener(this);
		perfildo16.addActionListener(this);
		perfildo17.addActionListener(this);
		perfildo18.addActionListener(this);
		perfildo19.addActionListener(this);
		perfildo20.addActionListener(this);

		// --------------------------------------BUSQUEDA PREVIA DE REGISTROS------------------------------
		// System.out.println("Record is inserted in the table
		// successbally..................");
		ScheduleUser su2 = new ScheduleUser();
		List<String> idList = su2.previusPerfil();
		//ScheduleUser su3 = new ScheduleUser();
		//List<String> nombreList = su3.previus2();
		// System.out.println(nombreList);

		for (int i = 0; i < idList.size(); i++) {
			if (idList.get(i).equals("balu9")) {
				perfillu9.setBackground(Color.RED);
				perfillu9.setContentAreaFilled(false);
				perfillu9.setOpaque(true);
				perfillu9.setEnabled(true);
				perfillu9.setText("Baloncesto");
			} else if (idList.get(i).equals("balu10")) {
				perfillu10.setBackground(Color.RED);
				perfillu10.setContentAreaFilled(false);
				perfillu10.setOpaque(true);
				perfillu10.setEnabled(true);
				perfillu10.setText("Baloncesto");
			} else if (idList.get(i).equals("balu11")) {
				perfillu11.setBackground(Color.RED);
				perfillu11.setContentAreaFilled(false);
				perfillu11.setOpaque(true);
				perfillu11.setEnabled(true);
				perfillu11.setText("Baloncesto");
			} else if (idList.get(i).equals("balu12")) {
				perfillu12.setBackground(Color.RED);
				perfillu12.setContentAreaFilled(false);
				perfillu12.setOpaque(true);
				perfillu12.setEnabled(true);
				perfillu12.setText("Baloncesto");
			} else if (idList.get(i).equals("balu13")) {
				perfillu13.setBackground(Color.RED);
				perfillu13.setContentAreaFilled(false);
				perfillu13.setOpaque(true);
				perfillu13.setEnabled(true);
				perfillu13.setText("Baloncesto");
			} else if (idList.get(i).equals("balu15")) {
				perfillu15.setBackground(Color.RED);
				perfillu15.setContentAreaFilled(false);
				perfillu15.setOpaque(true);
				perfillu15.setEnabled(true);
				perfillu15.setText("Baloncesto");
			} else if (idList.get(i).equals("balu16")) {
				perfillu16.setBackground(Color.RED);
				perfillu16.setContentAreaFilled(false);
				perfillu16.setOpaque(true);
				perfillu16.setEnabled(true);
				perfillu16.setText("Baloncesto");
			} else if (idList.get(i).equals("balu17")) {
				perfillu17.setBackground(Color.RED);
				perfillu17.setContentAreaFilled(false);
				perfillu17.setOpaque(true);
				perfillu17.setEnabled(true);
				perfillu17.setText("Baloncesto");
			} else if (idList.get(i).equals("balu18")) {
				perfillu18.setBackground(Color.RED);
				perfillu18.setContentAreaFilled(false);
				perfillu18.setOpaque(true);
				perfillu18.setEnabled(true);
				perfillu18.setText("Baloncesto");
			} else if (idList.get(i).equals("balu19")) {
				perfillu19.setBackground(Color.RED);
				perfillu19.setContentAreaFilled(false);
				perfillu19.setOpaque(true);
				perfillu19.setEnabled(true);
				perfillu19.setText("Baloncesto");
			} else if (idList.get(i).equals("balu20")) {
				perfillu20.setBackground(Color.RED);
				perfillu20.setContentAreaFilled(false);
				perfillu20.setOpaque(true);
				perfillu20.setEnabled(true);
				perfillu20.setText("Baloncesto");
				
				
				
			} else if (idList.get(i).equals("palu9")) {
				perfillu9.setBackground(Color.RED);
				perfillu9.setContentAreaFilled(false);
				perfillu9.setOpaque(true);
				perfillu9.setEnabled(true);
				perfillu9.setText("Padel");
			} else if (idList.get(i).equals("palu10")) {
				perfillu10.setBackground(Color.RED);
				perfillu10.setContentAreaFilled(false);
				perfillu10.setOpaque(true);
				perfillu10.setEnabled(true);
				perfillu10.setText("Padel");
			} else if (idList.get(i).equals("palu11")) {
				perfillu11.setBackground(Color.RED);
				perfillu11.setContentAreaFilled(false);
				perfillu11.setOpaque(true);
				perfillu11.setEnabled(true);
				perfillu11.setText("Padel");
			} else if (idList.get(i).equals("palu12")) {
				perfillu12.setBackground(Color.RED);
				perfillu12.setContentAreaFilled(false);
				perfillu12.setOpaque(true);
				perfillu12.setEnabled(true);
				perfillu12.setText("Padel");
			} else if (idList.get(i).equals("palu13")) {
				perfillu13.setBackground(Color.RED);
				perfillu13.setContentAreaFilled(false);
				perfillu13.setOpaque(true);
				perfillu13.setEnabled(true);
				perfillu13.setText("Padel");
			} else if (idList.get(i).equals("palu15")) {
				perfillu15.setBackground(Color.RED);
				perfillu15.setContentAreaFilled(false);
				perfillu15.setOpaque(true);
				perfillu15.setEnabled(true);
				perfillu15.setText("Padel");
			} else if (idList.get(i).equals("palu16")) {
				perfillu16.setBackground(Color.RED);
				perfillu16.setContentAreaFilled(false);
				perfillu16.setOpaque(true);
				perfillu16.setEnabled(true);
				perfillu16.setText("Padel");
			} else if (idList.get(i).equals("palu17")) {
				perfillu17.setBackground(Color.RED);
				perfillu17.setContentAreaFilled(false);
				perfillu17.setOpaque(true);
				perfillu17.setEnabled(true);
				perfillu17.setText("Padel");
			} else if (idList.get(i).equals("palu18")) {
				perfillu18.setBackground(Color.RED);
				perfillu18.setContentAreaFilled(false);
				perfillu18.setOpaque(true);
				perfillu18.setEnabled(true);
				perfillu18.setText("Padel");
			} else if (idList.get(i).equals("palu19")) {
				perfillu19.setBackground(Color.RED);
				perfillu19.setContentAreaFilled(false);
				perfillu19.setOpaque(true);
				perfillu19.setEnabled(true);
				perfillu19.setText("Padel");
			} else if (idList.get(i).equals("palu20")) {
				perfillu20.setBackground(Color.RED);
				perfillu20.setContentAreaFilled(false);
				perfillu20.setOpaque(true);
				perfillu20.setEnabled(true);
				perfillu20.setText("Padel");
				
				

			} else if (idList.get(i).equals("fulu9")) {
				perfillu9.setBackground(Color.RED);
				perfillu9.setContentAreaFilled(false);
				perfillu9.setOpaque(true);
				perfillu9.setEnabled(true);
				perfillu9.setText("Futbol");
			} else if (idList.get(i).equals("fulu10")) {
				perfillu10.setBackground(Color.RED);
				perfillu10.setContentAreaFilled(false);
				perfillu10.setOpaque(true);
				perfillu10.setEnabled(true);
				perfillu10.setText("Futbol");
			} else if (idList.get(i).equals("fulu11")) {
				perfillu11.setBackground(Color.RED);
				perfillu11.setContentAreaFilled(false);
				perfillu11.setOpaque(true);
				perfillu11.setEnabled(true);
				perfillu11.setText("Futbol");
			} else if (idList.get(i).equals("fulu12")) {
				perfillu12.setBackground(Color.RED);
				perfillu12.setContentAreaFilled(false);
				perfillu12.setOpaque(true);
				perfillu12.setEnabled(true);
				perfillu12.setText("Futbol");
			} else if (idList.get(i).equals("fulu13")) {
				perfillu13.setBackground(Color.RED);
				perfillu13.setContentAreaFilled(false);
				perfillu13.setOpaque(true);
				perfillu13.setEnabled(true);
				perfillu13.setText("Futbol");
			} else if (idList.get(i).equals("fulu15")) {
				perfillu15.setBackground(Color.RED);
				perfillu15.setContentAreaFilled(false);
				perfillu15.setOpaque(true);
				perfillu15.setEnabled(true);
				perfillu15.setText("Futbol");
			} else if (idList.get(i).equals("fulu16")) {
				perfillu16.setBackground(Color.RED);
				perfillu16.setContentAreaFilled(false);
				perfillu16.setOpaque(true);
				perfillu16.setEnabled(true);
				perfillu16.setText("Futbol");
			} else if (idList.get(i).equals("fulu17")) {
				perfillu17.setBackground(Color.RED);
				perfillu17.setContentAreaFilled(false);
				perfillu17.setOpaque(true);
				perfillu17.setEnabled(true);
				perfillu17.setText("Futbol");
			} else if (idList.get(i).equals("fulu18")) {
				perfillu18.setBackground(Color.RED);
				perfillu18.setContentAreaFilled(false);
				perfillu18.setOpaque(true);
				perfillu18.setEnabled(true);
				perfillu18.setText("Futbol");
			} else if (idList.get(i).equals("fulu19")) {
				perfillu19.setBackground(Color.RED);
				perfillu19.setContentAreaFilled(false);
				perfillu19.setOpaque(true);
				perfillu19.setEnabled(true);
				perfillu19.setText("Futbol");
			} else if (idList.get(i).equals("fulu20")) {
				perfillu20.setBackground(Color.RED);
				perfillu20.setContentAreaFilled(false);
				perfillu20.setOpaque(true);
				perfillu20.setEnabled(true);
				perfillu20.setText("Futbol");
				
				
				
			} else if (idList.get(i).equals("telu9")) {
				perfillu9.setBackground(Color.RED);
				perfillu9.setContentAreaFilled(false);
				perfillu9.setOpaque(true);
				perfillu9.setEnabled(true);
				perfillu9.setText("Tenis");
			} else if (idList.get(i).equals("telu10")) {
				perfillu10.setBackground(Color.RED);
				perfillu10.setContentAreaFilled(false);
				perfillu10.setOpaque(true);
				perfillu10.setEnabled(true);
				perfillu10.setText("Tenis");
			} else if (idList.get(i).equals("telu11")) {
				perfillu11.setBackground(Color.RED);
				perfillu11.setContentAreaFilled(false);
				perfillu11.setOpaque(true);
				perfillu11.setEnabled(true);
				perfillu11.setText("Tenis");
			} else if (idList.get(i).equals("telu12")) {
				perfillu12.setBackground(Color.RED);
				perfillu12.setContentAreaFilled(false);
				perfillu12.setOpaque(true);
				perfillu12.setEnabled(true);
				perfillu12.setText("Tenis");
			} else if (idList.get(i).equals("telu13")) {
				perfillu13.setBackground(Color.RED);
				perfillu13.setContentAreaFilled(false);
				perfillu13.setOpaque(true);
				perfillu13.setEnabled(true);
				perfillu13.setText("Tenis");
			} else if (idList.get(i).equals("telu15")) {
				perfillu15.setBackground(Color.RED);
				perfillu15.setContentAreaFilled(false);
				perfillu15.setOpaque(true);
				perfillu15.setEnabled(true);
				perfillu15.setText("Tenis");
			} else if (idList.get(i).equals("telu16")) {
				perfillu16.setBackground(Color.RED);
				perfillu16.setContentAreaFilled(false);
				perfillu16.setOpaque(true);
				perfillu16.setEnabled(true);
				perfillu16.setText("Tenis");
			} else if (idList.get(i).equals("telu17")) {
				perfillu17.setBackground(Color.RED);
				perfillu17.setContentAreaFilled(false);
				perfillu17.setOpaque(true);
				perfillu17.setEnabled(true);
				perfillu17.setText("Tenis");
			} else if (idList.get(i).equals("telu18")) {
				perfillu18.setBackground(Color.RED);
				perfillu18.setContentAreaFilled(false);
				perfillu18.setOpaque(true);
				perfillu18.setEnabled(true);
				perfillu18.setText("Tenis");
			} else if (idList.get(i).equals("telu19")) {
				perfillu19.setBackground(Color.RED);
				perfillu19.setContentAreaFilled(false);
				perfillu19.setOpaque(true);
				perfillu19.setEnabled(true);
				perfillu19.setText("Tenis");
			} else if (idList.get(i).equals("telu20")) {
				perfillu20.setBackground(Color.RED);
				perfillu20.setContentAreaFilled(false);
				perfillu20.setOpaque(true);
				perfillu20.setEnabled(true);
				perfillu20.setText("Tenis");
				
				


			} 			
			else if (idList.get(i).equals("bama9")) {
				perfilma9.setBackground(Color.RED);
				perfilma9.setContentAreaFilled(false);
				perfilma9.setOpaque(true);
				perfilma9.setEnabled(true);
				perfilma9.setText("Baloncesto");
			} else if (idList.get(i).equals("bama10")) {
				perfilma10.setBackground(Color.RED);
				perfilma10.setContentAreaFilled(false);
				perfilma10.setOpaque(true);
				perfilma10.setEnabled(true);
				perfilma10.setText("Baloncesto");
			} else if (idList.get(i).equals("bama11")) {
				perfilma11.setBackground(Color.RED);
				perfilma11.setContentAreaFilled(false);
				perfilma11.setOpaque(true);
				perfilma11.setEnabled(true);
				perfilma11.setText("Baloncesto");
			} else if (idList.get(i).equals("bama12")) {
				perfilma12.setBackground(Color.RED);
				perfilma12.setContentAreaFilled(false);
				perfilma12.setOpaque(true);
				perfilma12.setEnabled(true);
				perfilma12.setText("Baloncesto");
			} else if (idList.get(i).equals("bama13")) {
				perfilma13.setBackground(Color.RED);
				perfilma13.setContentAreaFilled(false);
				perfilma13.setOpaque(true);
				perfilma13.setEnabled(true);
				perfilma13.setText("Baloncesto");
			} else if (idList.get(i).equals("bama15")) {
				perfilma15.setBackground(Color.RED);
				perfilma15.setContentAreaFilled(false);
				perfilma15.setOpaque(true);
				perfilma15.setEnabled(true);
				perfilma15.setText("Baloncesto");
			} else if (idList.get(i).equals("bama16")) {
				perfilma16.setBackground(Color.RED);
				perfilma16.setContentAreaFilled(false);
				perfilma16.setOpaque(true);
				perfilma16.setEnabled(true);
				perfilma16.setText("Baloncesto");
			} else if (idList.get(i).equals("bama17")) {
				perfilma17.setBackground(Color.RED);
				perfilma17.setContentAreaFilled(false);
				perfilma17.setOpaque(true);
				perfilma17.setEnabled(true);
				perfilma17.setText("Baloncesto");
			} else if (idList.get(i).equals("bama18")) {
				perfilma18.setBackground(Color.RED);
				perfilma18.setContentAreaFilled(false);
				perfilma18.setOpaque(true);
				perfilma18.setEnabled(true);
				perfilma18.setText("Baloncesto");
			} else if (idList.get(i).equals("bama19")) {
				perfilma19.setBackground(Color.RED);
				perfilma19.setContentAreaFilled(false);
				perfilma19.setOpaque(true);
				perfilma19.setEnabled(true);
				perfilma19.setText("Baloncesto");
			} else if (idList.get(i).equals("bama20")) {
				perfilma20.setBackground(Color.RED);
				perfilma20.setContentAreaFilled(false);
				perfilma20.setOpaque(true);
				perfilma20.setEnabled(true);
				perfilma20.setText("Baloncesto");			
				
			} else if (idList.get(i).equals("pama9")) {
				perfilma9.setBackground(Color.RED);
				perfilma9.setContentAreaFilled(false);
				perfilma9.setOpaque(true);
				perfilma9.setEnabled(true);
				perfilma9.setText("Padel");
			} else if (idList.get(i).equals("pama10")) {
				perfilma10.setBackground(Color.RED);
				perfilma10.setContentAreaFilled(false);
				perfilma10.setOpaque(true);
				perfilma10.setEnabled(true);
				perfilma10.setText("Padel");
			} else if (idList.get(i).equals("pama11")) {
				perfilma11.setBackground(Color.RED);
				perfilma11.setContentAreaFilled(false);
				perfilma11.setOpaque(true);
				perfilma11.setEnabled(true);
				perfilma11.setText("Padel");
			} else if (idList.get(i).equals("pama12")) {
				perfilma12.setBackground(Color.RED);
				perfilma12.setContentAreaFilled(false);
				perfilma12.setOpaque(true);
				perfilma12.setEnabled(true);
				perfilma12.setText("Padel");
			} else if (idList.get(i).equals("pama13")) {
				perfilma13.setBackground(Color.RED);
				perfilma13.setContentAreaFilled(false);
				perfilma13.setOpaque(true);
				perfilma13.setEnabled(true);
				perfilma13.setText("Padel");
			} else if (idList.get(i).equals("pama15")) {
				perfilma15.setBackground(Color.RED);
				perfilma15.setContentAreaFilled(false);
				perfilma15.setOpaque(true);
				perfilma15.setEnabled(true);
				perfilma15.setText("Padel");
			} else if (idList.get(i).equals("pama16")) {
				perfilma16.setBackground(Color.RED);
				perfilma16.setContentAreaFilled(false);
				perfilma16.setOpaque(true);
				perfilma16.setEnabled(true);
				perfilma16.setText("Padel");
			} else if (idList.get(i).equals("pama17")) {
				perfilma17.setBackground(Color.RED);
				perfilma17.setContentAreaFilled(false);
				perfilma17.setOpaque(true);
				perfilma17.setEnabled(true);
				perfilma17.setText("Padel");
			} else if (idList.get(i).equals("pama18")) {
				perfilma18.setBackground(Color.RED);
				perfilma18.setContentAreaFilled(false);
				perfilma18.setOpaque(true);
				perfilma18.setEnabled(true);
				perfilma18.setText("Padel");
			} else if (idList.get(i).equals("pama19")) {
				perfilma19.setBackground(Color.RED);
				perfilma19.setContentAreaFilled(false);
				perfilma19.setOpaque(true);
				perfilma19.setEnabled(true);
				perfilma19.setText("Padel");
			} else if (idList.get(i).equals("pama20")) {
				perfilma20.setBackground(Color.RED);
				perfilma20.setContentAreaFilled(false);
				perfilma20.setOpaque(true);
				perfilma20.setEnabled(true);
				perfilma20.setText("Padel");
								
			} else if (idList.get(i).equals("fuma9")) {
				perfilma9.setBackground(Color.RED);
				perfilma9.setContentAreaFilled(false);
				perfilma9.setOpaque(true);
				perfilma9.setEnabled(true);
				perfilma9.setText("Futbol");
			} else if (idList.get(i).equals("fuma10")) {
				perfilma10.setBackground(Color.RED);
				perfilma10.setContentAreaFilled(false);
				perfilma10.setOpaque(true);
				perfilma10.setEnabled(true);
				perfilma10.setText("Futbol");
			} else if (idList.get(i).equals("fuma11")) {
				perfilma11.setBackground(Color.RED);
				perfilma11.setContentAreaFilled(false);
				perfilma11.setOpaque(true);
				perfilma11.setEnabled(true);
				perfilma11.setText("Futbol");
			} else if (idList.get(i).equals("fuma12")) {
				perfilma12.setBackground(Color.RED);
				perfilma12.setContentAreaFilled(false);
				perfilma12.setOpaque(true);
				perfilma12.setEnabled(true);
				perfilma12.setText("Futbol");
			} else if (idList.get(i).equals("fuma13")) {
				perfilma13.setBackground(Color.RED);
				perfilma13.setContentAreaFilled(false);
				perfilma13.setOpaque(true);
				perfilma13.setEnabled(true);
				perfilma13.setText("Futbol");
			} else if (idList.get(i).equals("fuma15")) {
				perfilma15.setBackground(Color.RED);
				perfilma15.setContentAreaFilled(false);
				perfilma15.setOpaque(true);
				perfilma15.setEnabled(true);
				perfilma15.setText("Futbol");
			} else if (idList.get(i).equals("fuma16")) {
				perfilma16.setBackground(Color.RED);
				perfilma16.setContentAreaFilled(false);
				perfilma16.setOpaque(true);
				perfilma16.setEnabled(true);
				perfilma16.setText("Futbol");
			} else if (idList.get(i).equals("fuma17")) {
				perfilma17.setBackground(Color.RED);
				perfilma17.setContentAreaFilled(false);
				perfilma17.setOpaque(true);
				perfilma17.setEnabled(true);
				perfilma17.setText("Futbol");
			} else if (idList.get(i).equals("fuma18")) {
				perfilma18.setBackground(Color.RED);
				perfilma18.setContentAreaFilled(false);
				perfilma18.setOpaque(true);
				perfilma18.setEnabled(true);
				perfilma18.setText("Futbol");
			} else if (idList.get(i).equals("fuma19")) {
				perfilma19.setBackground(Color.RED);
				perfilma19.setContentAreaFilled(false);
				perfilma19.setOpaque(true);
				perfilma19.setEnabled(true);
				perfilma19.setText("Futbol");
			} else if (idList.get(i).equals("fuma20")) {
				perfilma20.setBackground(Color.RED);
				perfilma20.setContentAreaFilled(false);
				perfilma20.setOpaque(true);
				perfilma20.setEnabled(true);
				perfilma20.setText("Futbol");
				
			} else if (idList.get(i).equals("tema9")) {
				perfilma9.setBackground(Color.RED);
				perfilma9.setContentAreaFilled(false);
				perfilma9.setOpaque(true);
				perfilma9.setEnabled(true);
				perfilma9.setText("Tenis");
			} else if (idList.get(i).equals("tema10")) {
				perfilma10.setBackground(Color.RED);
				perfilma10.setContentAreaFilled(false);
				perfilma10.setOpaque(true);
				perfilma10.setEnabled(true);
				perfilma10.setText("Tenis");
			} else if (idList.get(i).equals("tema11")) {
				perfilma11.setBackground(Color.RED);
				perfilma11.setContentAreaFilled(false);
				perfilma11.setOpaque(true);
				perfilma11.setEnabled(true);
				perfilma11.setText("Tenis");
			} else if (idList.get(i).equals("tema12")) {
				perfilma12.setBackground(Color.RED);
				perfilma12.setContentAreaFilled(false);
				perfilma12.setOpaque(true);
				perfilma12.setEnabled(true);
				perfilma12.setText("Tenis");
			} else if (idList.get(i).equals("tema13")) {
				perfilma13.setBackground(Color.RED);
				perfilma13.setContentAreaFilled(false);
				perfilma13.setOpaque(true);
				perfilma13.setEnabled(true);
				perfilma13.setText("Tenis");
			} else if (idList.get(i).equals("tema15")) {
				perfilma15.setBackground(Color.RED);
				perfilma15.setContentAreaFilled(false);
				perfilma15.setOpaque(true);
				perfilma15.setEnabled(true);
				perfilma15.setText("Tenis");
			} else if (idList.get(i).equals("tema16")) {
				perfilma16.setBackground(Color.RED);
				perfilma16.setContentAreaFilled(false);
				perfilma16.setOpaque(true);
				perfilma16.setEnabled(true);
				perfilma16.setText("Tenis");
			} else if (idList.get(i).equals("tema17")) {
				perfilma17.setBackground(Color.RED);
				perfilma17.setContentAreaFilled(false);
				perfilma17.setOpaque(true);
				perfilma17.setEnabled(true);
				perfilma17.setText("Tenis");
			} else if (idList.get(i).equals("tema18")) {
				perfilma18.setBackground(Color.RED);
				perfilma18.setContentAreaFilled(false);
				perfilma18.setOpaque(true);
				perfilma18.setEnabled(true);
				perfilma18.setText("Tenis");
			} else if (idList.get(i).equals("tema19")) {
				perfilma19.setBackground(Color.RED);
				perfilma19.setContentAreaFilled(false);
				perfilma19.setOpaque(true);
				perfilma19.setEnabled(true);
				perfilma19.setText("Tenis");
			} else if (idList.get(i).equals("tema20")) {
				perfilma20.setBackground(Color.RED);
				perfilma20.setContentAreaFilled(false);
				perfilma20.setOpaque(true);
				perfilma20.setEnabled(true);
				perfilma20.setText("Tenis");
				

			} 			
			else if (idList.get(i).equals("bami9")) {
				perfilmi9.setBackground(Color.RED);
				perfilmi9.setContentAreaFilled(false);
				perfilmi9.setOpaque(true);
				perfilmi9.setEnabled(true);
				perfilmi9.setText("Baloncesto");
			} else if (idList.get(i).equals("bami10")) {
				perfilmi10.setBackground(Color.RED);
				perfilmi10.setContentAreaFilled(false);
				perfilmi10.setOpaque(true);
				perfilmi10.setEnabled(true);
				perfilmi10.setText("Baloncesto");
			} else if (idList.get(i).equals("bami11")) {
				perfilmi11.setBackground(Color.RED);
				perfilmi11.setContentAreaFilled(false);
				perfilmi11.setOpaque(true);
				perfilmi11.setEnabled(true);
				perfilmi11.setText("Baloncesto");
			} else if (idList.get(i).equals("bami12")) {
				perfilmi12.setBackground(Color.RED);
				perfilmi12.setContentAreaFilled(false);
				perfilmi12.setOpaque(true);
				perfilmi12.setEnabled(true);
				perfilmi12.setText("Baloncesto");
			} else if (idList.get(i).equals("bami13")) {
				perfilmi13.setBackground(Color.RED);
				perfilmi13.setContentAreaFilled(false);
				perfilmi13.setOpaque(true);
				perfilmi13.setEnabled(true);
				perfilmi13.setText("Baloncesto");
			} else if (idList.get(i).equals("bami15")) {
				perfilmi15.setBackground(Color.RED);
				perfilmi15.setContentAreaFilled(false);
				perfilmi15.setOpaque(true);
				perfilmi15.setEnabled(true);
				perfilmi15.setText("Baloncesto");
			} else if (idList.get(i).equals("bami16")) {
				perfilmi16.setBackground(Color.RED);
				perfilmi16.setContentAreaFilled(false);
				perfilmi16.setOpaque(true);
				perfilmi16.setEnabled(true);
				perfilmi16.setText("Baloncesto");
			} else if (idList.get(i).equals("bami17")) {
				perfilmi17.setBackground(Color.RED);
				perfilmi17.setContentAreaFilled(false);
				perfilmi17.setOpaque(true);
				perfilmi17.setEnabled(true);
				perfilmi17.setText("Baloncesto");
			} else if (idList.get(i).equals("bami18")) {
				perfilmi18.setBackground(Color.RED);
				perfilmi18.setContentAreaFilled(false);
				perfilmi18.setOpaque(true);
				perfilmi18.setEnabled(true);
				perfilmi18.setText("Baloncesto");
			} else if (idList.get(i).equals("bami19")) {
				perfilmi19.setBackground(Color.RED);
				perfilmi19.setContentAreaFilled(false);
				perfilmi19.setOpaque(true);
				perfilmi19.setEnabled(true);
				perfilmi19.setText("Baloncesto");
			} else if (idList.get(i).equals("bami20")) {
				perfilmi20.setBackground(Color.RED);
				perfilmi20.setContentAreaFilled(false);
				perfilmi20.setOpaque(true);
				perfilmi20.setEnabled(true);
				perfilmi20.setText("Baloncesto");
				
				
				
			} else if (idList.get(i).equals("pami9")) {
				perfilmi9.setBackground(Color.RED);
				perfilmi9.setContentAreaFilled(false);
				perfilmi9.setOpaque(true);
				perfilmi9.setEnabled(true);
				perfilmi9.setText("Padel");
			} else if (idList.get(i).equals("pami10")) {
				perfilmi10.setBackground(Color.RED);
				perfilmi10.setContentAreaFilled(false);
				perfilmi10.setOpaque(true);
				perfilmi10.setEnabled(true);
				perfilmi10.setText("Padel");
			} else if (idList.get(i).equals("pami11")) {
				perfilmi11.setBackground(Color.RED);
				perfilmi11.setContentAreaFilled(false);
				perfilmi11.setOpaque(true);
				perfilmi11.setEnabled(true);
				perfilmi11.setText("Padel");
			} else if (idList.get(i).equals("pami12")) {
				perfilmi12.setBackground(Color.RED);
				perfilmi12.setContentAreaFilled(false);
				perfilmi12.setOpaque(true);
				perfilmi12.setEnabled(true);
				perfilmi12.setText("Padel");
			} else if (idList.get(i).equals("pami13")) {
				perfilmi13.setBackground(Color.RED);
				perfilmi13.setContentAreaFilled(false);
				perfilmi13.setOpaque(true);
				perfilmi13.setEnabled(true);
				perfilmi13.setText("Padel");
			} else if (idList.get(i).equals("pami15")) {
				perfilmi15.setBackground(Color.RED);
				perfilmi15.setContentAreaFilled(false);
				perfilmi15.setOpaque(true);
				perfilmi15.setEnabled(true);
				perfilmi15.setText("Padel");
			} else if (idList.get(i).equals("pami16")) {
				perfilmi16.setBackground(Color.RED);
				perfilmi16.setContentAreaFilled(false);
				perfilmi16.setOpaque(true);
				perfilmi16.setEnabled(true);
				perfilmi16.setText("Padel");
			} else if (idList.get(i).equals("pami17")) {
				perfilmi17.setBackground(Color.RED);
				perfilmi17.setContentAreaFilled(false);
				perfilmi17.setOpaque(true);
				perfilmi17.setEnabled(true);
				perfilmi17.setText("Padel");
			} else if (idList.get(i).equals("pami18")) {
				perfilmi18.setBackground(Color.RED);
				perfilmi18.setContentAreaFilled(false);
				perfilmi18.setOpaque(true);
				perfilmi18.setEnabled(true);
				perfilmi18.setText("Padel");
			} else if (idList.get(i).equals("pami19")) {
				perfilmi19.setBackground(Color.RED);
				perfilmi19.setContentAreaFilled(false);
				perfilmi19.setOpaque(true);
				perfilmi19.setEnabled(true);
				perfilmi19.setText("Padel");
			} else if (idList.get(i).equals("pami20")) {
				perfilmi20.setBackground(Color.RED);
				perfilmi20.setContentAreaFilled(false);
				perfilmi20.setOpaque(true);
				perfilmi20.setEnabled(true);
				perfilmi20.setText("Padel");
				
				

			} else if (idList.get(i).equals("fumi9")) {
				perfilmi9.setBackground(Color.RED);
				perfilmi9.setContentAreaFilled(false);
				perfilmi9.setOpaque(true);
				perfilmi9.setEnabled(true);
				perfilmi9.setText("Futbol");
			} else if (idList.get(i).equals("fumi10")) {
				perfilmi10.setBackground(Color.RED);
				perfilmi10.setContentAreaFilled(false);
				perfilmi10.setOpaque(true);
				perfilmi10.setEnabled(true);
				perfilmi10.setText("Futbol");
			} else if (idList.get(i).equals("fumi11")) {
				perfilmi11.setBackground(Color.RED);
				perfilmi11.setContentAreaFilled(false);
				perfilmi11.setOpaque(true);
				perfilmi11.setEnabled(true);
				perfilmi11.setText("Futbol");
			} else if (idList.get(i).equals("fumi12")) {
				perfilmi12.setBackground(Color.RED);
				perfilmi12.setContentAreaFilled(false);
				perfilmi12.setOpaque(true);
				perfilmi12.setEnabled(true);
				perfilmi12.setText("Futbol");
			} else if (idList.get(i).equals("fumi13")) {
				perfilmi13.setBackground(Color.RED);
				perfilmi13.setContentAreaFilled(false);
				perfilmi13.setOpaque(true);
				perfilmi13.setEnabled(true);
				perfilmi13.setText("Futbol");
			} else if (idList.get(i).equals("fumi15")) {
				perfilmi15.setBackground(Color.RED);
				perfilmi15.setContentAreaFilled(false);
				perfilmi15.setOpaque(true);
				perfilmi15.setEnabled(true);
				perfilmi15.setText("Futbol");
			} else if (idList.get(i).equals("fumi16")) {
				perfilmi16.setBackground(Color.RED);
				perfilmi16.setContentAreaFilled(false);
				perfilmi16.setOpaque(true);
				perfilmi16.setEnabled(true);
				perfilmi16.setText("Futbol");
			} else if (idList.get(i).equals("fumi17")) {
				perfilmi17.setBackground(Color.RED);
				perfilmi17.setContentAreaFilled(false);
				perfilmi17.setOpaque(true);
				perfilmi17.setEnabled(true);
				perfilmi17.setText("Futbol");
			} else if (idList.get(i).equals("fumi18")) {
				perfilmi18.setBackground(Color.RED);
				perfilmi18.setContentAreaFilled(false);
				perfilmi18.setOpaque(true);
				perfilmi18.setEnabled(true);
				perfilmi18.setText("Futbol");
			} else if (idList.get(i).equals("fumi19")) {
				perfilmi19.setBackground(Color.RED);
				perfilmi19.setContentAreaFilled(false);
				perfilmi19.setOpaque(true);
				perfilmi19.setEnabled(true);
				perfilmi19.setText("Futbol");
			} else if (idList.get(i).equals("fumi20")) {
				perfilmi20.setBackground(Color.RED);
				perfilmi20.setContentAreaFilled(false);
				perfilmi20.setOpaque(true);
				perfilmi20.setEnabled(true);
				perfilmi20.setText("Futbol");
				
				
				
			} else if (idList.get(i).equals("temi9")) {
				perfilmi9.setBackground(Color.RED);
				perfilmi9.setContentAreaFilled(false);
				perfilmi9.setOpaque(true);
				perfilmi9.setEnabled(true);
				perfilmi9.setText("Tenis");
			} else if (idList.get(i).equals("temi10")) {
				perfilmi10.setBackground(Color.RED);
				perfilmi10.setContentAreaFilled(false);
				perfilmi10.setOpaque(true);
				perfilmi10.setEnabled(true);
				perfilmi10.setText("Tenis");
			} else if (idList.get(i).equals("temi11")) {
				perfilmi11.setBackground(Color.RED);
				perfilmi11.setContentAreaFilled(false);
				perfilmi11.setOpaque(true);
				perfilmi11.setEnabled(true);
				perfilmi11.setText("Tenis");
			} else if (idList.get(i).equals("temi12")) {
				perfilmi12.setBackground(Color.RED);
				perfilmi12.setContentAreaFilled(false);
				perfilmi12.setOpaque(true);
				perfilmi12.setEnabled(true);
				perfilmi12.setText("Tenis");
			} else if (idList.get(i).equals("temi13")) {
				perfilmi13.setBackground(Color.RED);
				perfilmi13.setContentAreaFilled(false);
				perfilmi13.setOpaque(true);
				perfilmi13.setEnabled(true);
				perfilmi13.setText("Tenis");
			} else if (idList.get(i).equals("temi15")) {
				perfilmi15.setBackground(Color.RED);
				perfilmi15.setContentAreaFilled(false);
				perfilmi15.setOpaque(true);
				perfilmi15.setEnabled(true);
				perfilmi15.setText("Tenis");
			} else if (idList.get(i).equals("temi16")) {
				perfilmi16.setBackground(Color.RED);
				perfilmi16.setContentAreaFilled(false);
				perfilmi16.setOpaque(true);
				perfilmi16.setEnabled(true);
				perfilmi16.setText("Tenis");
			} else if (idList.get(i).equals("temi17")) {
				perfilmi17.setBackground(Color.RED);
				perfilmi17.setContentAreaFilled(false);
				perfilmi17.setOpaque(true);
				perfilmi17.setEnabled(true);
				perfilmi17.setText("Tenis");
			} else if (idList.get(i).equals("temi18")) {
				perfilmi18.setBackground(Color.RED);
				perfilmi18.setContentAreaFilled(false);
				perfilmi18.setOpaque(true);
				perfilmi18.setEnabled(true);
				perfilmi18.setText("Tenis");
			} else if (idList.get(i).equals("temi19")) {
				perfilmi19.setBackground(Color.RED);
				perfilmi19.setContentAreaFilled(false);
				perfilmi19.setOpaque(true);
				perfilmi19.setEnabled(true);
				perfilmi19.setText("Tenis");
			} else if (idList.get(i).equals("temi20")) {
				perfilmi20.setBackground(Color.RED);
				perfilmi20.setContentAreaFilled(false);
				perfilmi20.setOpaque(true);
				perfilmi20.setEnabled(true);
				perfilmi20.setText("Tenis");
				

			} 			
			else if (idList.get(i).equals("baju9")) {
				perfilju9.setBackground(Color.RED);
				perfilju9.setContentAreaFilled(false);
				perfilju9.setOpaque(true);
				perfilju9.setEnabled(true);
				perfilju9.setText("Baloncesto");
			} else if (idList.get(i).equals("baju10")) {
				perfilju10.setBackground(Color.RED);
				perfilju10.setContentAreaFilled(false);
				perfilju10.setOpaque(true);
				perfilju10.setEnabled(true);
				perfilju10.setText("Baloncesto");
			} else if (idList.get(i).equals("baju11")) {
				perfilju11.setBackground(Color.RED);
				perfilju11.setContentAreaFilled(false);
				perfilju11.setOpaque(true);
				perfilju11.setEnabled(true);
				perfilju11.setText("Baloncesto");
			} else if (idList.get(i).equals("baju12")) {
				perfilju12.setBackground(Color.RED);
				perfilju12.setContentAreaFilled(false);
				perfilju12.setOpaque(true);
				perfilju12.setEnabled(true);
				perfilju12.setText("Baloncesto");
			} else if (idList.get(i).equals("baju13")) {
				perfilju13.setBackground(Color.RED);
				perfilju13.setContentAreaFilled(false);
				perfilju13.setOpaque(true);
				perfilju13.setEnabled(true);
				perfilju13.setText("Baloncesto");
			} else if (idList.get(i).equals("baju15")) {
				perfilju15.setBackground(Color.RED);
				perfilju15.setContentAreaFilled(false);
				perfilju15.setOpaque(true);
				perfilju15.setEnabled(true);
				perfilju15.setText("Baloncesto");
			} else if (idList.get(i).equals("baju16")) {
				perfilju16.setBackground(Color.RED);
				perfilju16.setContentAreaFilled(false);
				perfilju16.setOpaque(true);
				perfilju16.setEnabled(true);
				perfilju16.setText("Baloncesto");
			} else if (idList.get(i).equals("baju17")) {
				perfilju17.setBackground(Color.RED);
				perfilju17.setContentAreaFilled(false);
				perfilju17.setOpaque(true);
				perfilju17.setEnabled(true);
				perfilju17.setText("Baloncesto");
			} else if (idList.get(i).equals("baju18")) {
				perfilju18.setBackground(Color.RED);
				perfilju18.setContentAreaFilled(false);
				perfilju18.setOpaque(true);
				perfilju18.setEnabled(true);
				perfilju18.setText("Baloncesto");
			} else if (idList.get(i).equals("baju19")) {
				perfilju19.setBackground(Color.RED);
				perfilju19.setContentAreaFilled(false);
				perfilju19.setOpaque(true);
				perfilju19.setEnabled(true);
				perfilju19.setText("Baloncesto");
			} else if (idList.get(i).equals("baju20")) {
				perfilju20.setBackground(Color.RED);
				perfilju20.setContentAreaFilled(false);
				perfilju20.setOpaque(true);
				perfilju20.setEnabled(true);
				perfilju20.setText("Baloncesto");
				
				
				
			} else if (idList.get(i).equals("paju9")) {
				perfilju9.setBackground(Color.RED);
				perfilju9.setContentAreaFilled(false);
				perfilju9.setOpaque(true);
				perfilju9.setEnabled(true);
				perfilju9.setText("Padel");
			} else if (idList.get(i).equals("paju10")) {
				perfilju10.setBackground(Color.RED);
				perfilju10.setContentAreaFilled(false);
				perfilju10.setOpaque(true);
				perfilju10.setEnabled(true);
				perfilju10.setText("Padel");
			} else if (idList.get(i).equals("paju11")) {
				perfilju11.setBackground(Color.RED);
				perfilju11.setContentAreaFilled(false);
				perfilju11.setOpaque(true);
				perfilju11.setEnabled(true);
				perfilju11.setText("Padel");
			} else if (idList.get(i).equals("paju12")) {
				perfilju12.setBackground(Color.RED);
				perfilju12.setContentAreaFilled(false);
				perfilju12.setOpaque(true);
				perfilju12.setEnabled(true);
				perfilju12.setText("Padel");
			} else if (idList.get(i).equals("paju13")) {
				perfilju13.setBackground(Color.RED);
				perfilju13.setContentAreaFilled(false);
				perfilju13.setOpaque(true);
				perfilju13.setEnabled(true);
				perfilju13.setText("Padel");
			} else if (idList.get(i).equals("paju15")) {
				perfilju15.setBackground(Color.RED);
				perfilju15.setContentAreaFilled(false);
				perfilju15.setOpaque(true);
				perfilju15.setEnabled(true);
				perfilju15.setText("Padel");
			} else if (idList.get(i).equals("paju16")) {
				perfilju16.setBackground(Color.RED);
				perfilju16.setContentAreaFilled(false);
				perfilju16.setOpaque(true);
				perfilju16.setEnabled(true);
				perfilju16.setText("Padel");
			} else if (idList.get(i).equals("paju17")) {
				perfilju17.setBackground(Color.RED);
				perfilju17.setContentAreaFilled(false);
				perfilju17.setOpaque(true);
				perfilju17.setEnabled(true);
				perfilju17.setText("Padel");
			} else if (idList.get(i).equals("paju18")) {
				perfilju18.setBackground(Color.RED);
				perfilju18.setContentAreaFilled(false);
				perfilju18.setOpaque(true);
				perfilju18.setEnabled(true);
				perfilju18.setText("Padel");
			} else if (idList.get(i).equals("paju19")) {
				perfilju19.setBackground(Color.RED);
				perfilju19.setContentAreaFilled(false);
				perfilju19.setOpaque(true);
				perfilju19.setEnabled(true);
				perfilju19.setText("Padel");
			} else if (idList.get(i).equals("paju20")) {
				perfilju20.setBackground(Color.RED);
				perfilju20.setContentAreaFilled(false);
				perfilju20.setOpaque(true);
				perfilju20.setEnabled(true);
				perfilju20.setText("Padel");
				
				

			} else if (idList.get(i).equals("fuju9")) {
				perfilju9.setBackground(Color.RED);
				perfilju9.setContentAreaFilled(false);
				perfilju9.setOpaque(true);
				perfilju9.setEnabled(true);
				perfilju9.setText("Futbol");
			} else if (idList.get(i).equals("fuju10")) {
				perfilju10.setBackground(Color.RED);
				perfilju10.setContentAreaFilled(false);
				perfilju10.setOpaque(true);
				perfilju10.setEnabled(true);
				perfilju10.setText("Futbol");
			} else if (idList.get(i).equals("fuju11")) {
				perfilju11.setBackground(Color.RED);
				perfilju11.setContentAreaFilled(false);
				perfilju11.setOpaque(true);
				perfilju11.setEnabled(true);
				perfilju11.setText("Futbol");
			} else if (idList.get(i).equals("fuju12")) {
				perfilju12.setBackground(Color.RED);
				perfilju12.setContentAreaFilled(false);
				perfilju12.setOpaque(true);
				perfilju12.setEnabled(true);
				perfilju12.setText("Futbol");
			} else if (idList.get(i).equals("fuju13")) {
				perfilju13.setBackground(Color.RED);
				perfilju13.setContentAreaFilled(false);
				perfilju13.setOpaque(true);
				perfilju13.setEnabled(true);
				perfilju13.setText("Futbol");
			} else if (idList.get(i).equals("fuju15")) {
				perfilju15.setBackground(Color.RED);
				perfilju15.setContentAreaFilled(false);
				perfilju15.setOpaque(true);
				perfilju15.setEnabled(true);
				perfilju15.setText("Futbol");
			} else if (idList.get(i).equals("fuju16")) {
				perfilju16.setBackground(Color.RED);
				perfilju16.setContentAreaFilled(false);
				perfilju16.setOpaque(true);
				perfilju16.setEnabled(true);
				perfilju16.setText("Futbol");
			} else if (idList.get(i).equals("fuju17")) {
				perfilju17.setBackground(Color.RED);
				perfilju17.setContentAreaFilled(false);
				perfilju17.setOpaque(true);
				perfilju17.setEnabled(true);
				perfilju17.setText("Futbol");
			} else if (idList.get(i).equals("fuju18")) {
				perfilju18.setBackground(Color.RED);
				perfilju18.setContentAreaFilled(false);
				perfilju18.setOpaque(true);
				perfilju18.setEnabled(true);
				perfilju18.setText("Futbol");
			} else if (idList.get(i).equals("fuju19")) {
				perfilju19.setBackground(Color.RED);
				perfilju19.setContentAreaFilled(false);
				perfilju19.setOpaque(true);
				perfilju19.setEnabled(true);
				perfilju19.setText("Futbol");
			} else if (idList.get(i).equals("fuju20")) {
				perfilju20.setBackground(Color.RED);
				perfilju20.setContentAreaFilled(false);
				perfilju20.setOpaque(true);
				perfilju20.setEnabled(true);
				perfilju20.setText("Futbol");
				
				
				
			} else if (idList.get(i).equals("teju9")) {
				perfilju9.setBackground(Color.RED);
				perfilju9.setContentAreaFilled(false);
				perfilju9.setOpaque(true);
				perfilju9.setEnabled(true);
				perfilju9.setText("Tenis");
			} else if (idList.get(i).equals("teju10")) {
				perfilju10.setBackground(Color.RED);
				perfilju10.setContentAreaFilled(false);
				perfilju10.setOpaque(true);
				perfilju10.setEnabled(true);
				perfilju10.setText("Tenis");
			} else if (idList.get(i).equals("teju11")) {
				perfilju11.setBackground(Color.RED);
				perfilju11.setContentAreaFilled(false);
				perfilju11.setOpaque(true);
				perfilju11.setEnabled(true);
				perfilju11.setText("Tenis");
			} else if (idList.get(i).equals("teju12")) {
				perfilju12.setBackground(Color.RED);
				perfilju12.setContentAreaFilled(false);
				perfilju12.setOpaque(true);
				perfilju12.setEnabled(true);
				perfilju12.setText("Tenis");
			} else if (idList.get(i).equals("teju13")) {
				perfilju13.setBackground(Color.RED);
				perfilju13.setContentAreaFilled(false);
				perfilju13.setOpaque(true);
				perfilju13.setEnabled(true);
				perfilju13.setText("Tenis");
			} else if (idList.get(i).equals("teju15")) {
				perfilju15.setBackground(Color.RED);
				perfilju15.setContentAreaFilled(false);
				perfilju15.setOpaque(true);
				perfilju15.setEnabled(true);
				perfilju15.setText("Tenis");
			} else if (idList.get(i).equals("teju16")) {
				perfilju16.setBackground(Color.RED);
				perfilju16.setContentAreaFilled(false);
				perfilju16.setOpaque(true);
				perfilju16.setEnabled(true);
				perfilju16.setText("Tenis");
			} else if (idList.get(i).equals("teju17")) {
				perfilju17.setBackground(Color.RED);
				perfilju17.setContentAreaFilled(false);
				perfilju17.setOpaque(true);
				perfilju17.setEnabled(true);
				perfilju17.setText("Tenis");
			} else if (idList.get(i).equals("teju18")) {
				perfilju18.setBackground(Color.RED);
				perfilju18.setContentAreaFilled(false);
				perfilju18.setOpaque(true);
				perfilju18.setEnabled(true);
				perfilju18.setText("Tenis");
			} else if (idList.get(i).equals("teju19")) {
				perfilju19.setBackground(Color.RED);
				perfilju19.setContentAreaFilled(false);
				perfilju19.setOpaque(true);
				perfilju19.setEnabled(true);
				perfilju19.setText("Tenis");
			} else if (idList.get(i).equals("teju20")) {
				perfilju20.setBackground(Color.RED);
				perfilju20.setContentAreaFilled(false);
				perfilju20.setOpaque(true);
				perfilju20.setEnabled(true);
				perfilju20.setText("Tenis");
				

			} 			
			else if (idList.get(i).equals("bavi9")) {
				perfilvi9.setBackground(Color.RED);
				perfilvi9.setContentAreaFilled(false);
				perfilvi9.setOpaque(true);
				perfilvi9.setEnabled(true);
				perfilvi9.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi10")) {
				perfilvi10.setBackground(Color.RED);
				perfilvi10.setContentAreaFilled(false);
				perfilvi10.setOpaque(true);
				perfilvi10.setEnabled(true);
				perfilvi10.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi11")) {
				perfilvi11.setBackground(Color.RED);
				perfilvi11.setContentAreaFilled(false);
				perfilvi11.setOpaque(true);
				perfilvi11.setEnabled(true);
				perfilvi11.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi12")) {
				perfilvi12.setBackground(Color.RED);
				perfilvi12.setContentAreaFilled(false);
				perfilvi12.setOpaque(true);
				perfilvi12.setEnabled(true);
				perfilvi12.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi13")) {
				perfilvi13.setBackground(Color.RED);
				perfilvi13.setContentAreaFilled(false);
				perfilvi13.setOpaque(true);
				perfilvi13.setEnabled(true);
				perfilvi13.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi15")) {
				perfilvi15.setBackground(Color.RED);
				perfilvi15.setContentAreaFilled(false);
				perfilvi15.setOpaque(true);
				perfilvi15.setEnabled(true);
				perfilvi15.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi16")) {
				perfilvi16.setBackground(Color.RED);
				perfilvi16.setContentAreaFilled(false);
				perfilvi16.setOpaque(true);
				perfilvi16.setEnabled(true);
				perfilvi16.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi17")) {
				perfilvi17.setBackground(Color.RED);
				perfilvi17.setContentAreaFilled(false);
				perfilvi17.setOpaque(true);
				perfilvi17.setEnabled(true);
				perfilvi17.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi18")) {
				perfilvi18.setBackground(Color.RED);
				perfilvi18.setContentAreaFilled(false);
				perfilvi18.setOpaque(true);
				perfilvi18.setEnabled(true);
				perfilvi18.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi19")) {
				perfilvi19.setBackground(Color.RED);
				perfilvi19.setContentAreaFilled(false);
				perfilvi19.setOpaque(true);
				perfilvi19.setEnabled(true);
				perfilvi19.setText("Baloncesto");
			} else if (idList.get(i).equals("bavi20")) {
				perfilvi20.setBackground(Color.RED);
				perfilvi20.setContentAreaFilled(false);
				perfilvi20.setOpaque(true);
				perfilvi20.setEnabled(true);
				perfilvi20.setText("Baloncesto");
				
				
				
			} else if (idList.get(i).equals("pavi9")) {
				perfilvi9.setBackground(Color.RED);
				perfilvi9.setContentAreaFilled(false);
				perfilvi9.setOpaque(true);
				perfilvi9.setEnabled(true);
				perfilvi9.setText("Padel");
			} else if (idList.get(i).equals("pavi10")) {
				perfilvi10.setBackground(Color.RED);
				perfilvi10.setContentAreaFilled(false);
				perfilvi10.setOpaque(true);
				perfilvi10.setEnabled(true);
				perfilvi10.setText("Padel");
			} else if (idList.get(i).equals("pavi11")) {
				perfilvi11.setBackground(Color.RED);
				perfilvi11.setContentAreaFilled(false);
				perfilvi11.setOpaque(true);
				perfilvi11.setEnabled(true);
				perfilvi11.setText("Padel");
			} else if (idList.get(i).equals("pavi12")) {
				perfilvi12.setBackground(Color.RED);
				perfilvi12.setContentAreaFilled(false);
				perfilvi12.setOpaque(true);
				perfilvi12.setEnabled(true);
				perfilvi12.setText("Padel");
			} else if (idList.get(i).equals("pavi13")) {
				perfilvi13.setBackground(Color.RED);
				perfilvi13.setContentAreaFilled(false);
				perfilvi13.setOpaque(true);
				perfilvi13.setEnabled(true);
				perfilvi13.setText("Padel");
			} else if (idList.get(i).equals("pavi15")) {
				perfilvi15.setBackground(Color.RED);
				perfilvi15.setContentAreaFilled(false);
				perfilvi15.setOpaque(true);
				perfilvi15.setEnabled(true);
				perfilvi15.setText("Padel");
			} else if (idList.get(i).equals("pavi16")) {
				perfilvi16.setBackground(Color.RED);
				perfilvi16.setContentAreaFilled(false);
				perfilvi16.setOpaque(true);
				perfilvi16.setEnabled(true);
				perfilvi16.setText("Padel");
			} else if (idList.get(i).equals("pavi17")) {
				perfilvi17.setBackground(Color.RED);
				perfilvi17.setContentAreaFilled(false);
				perfilvi17.setOpaque(true);
				perfilvi17.setEnabled(true);
				perfilvi17.setText("Padel");
			} else if (idList.get(i).equals("pavi18")) {
				perfilvi18.setBackground(Color.RED);
				perfilvi18.setContentAreaFilled(false);
				perfilvi18.setOpaque(true);
				perfilvi18.setEnabled(true);
				perfilvi18.setText("Padel");
			} else if (idList.get(i).equals("pavi19")) {
				perfilvi19.setBackground(Color.RED);
				perfilvi19.setContentAreaFilled(false);
				perfilvi19.setOpaque(true);
				perfilvi19.setEnabled(true);
				perfilvi19.setText("Padel");
			} else if (idList.get(i).equals("pavi20")) {
				perfilvi20.setBackground(Color.RED);
				perfilvi20.setContentAreaFilled(false);
				perfilvi20.setOpaque(true);
				perfilvi20.setEnabled(true);
				perfilvi20.setText("Padel");
				
				

			} else if (idList.get(i).equals("fuvi9")) {
				perfilvi9.setBackground(Color.RED);
				perfilvi9.setContentAreaFilled(false);
				perfilvi9.setOpaque(true);
				perfilvi9.setEnabled(true);
				perfilvi9.setText("Futbol");
			} else if (idList.get(i).equals("fuvi10")) {
				perfilvi10.setBackground(Color.RED);
				perfilvi10.setContentAreaFilled(false);
				perfilvi10.setOpaque(true);
				perfilvi10.setEnabled(true);
				perfilvi10.setText("Futbol");
			} else if (idList.get(i).equals("fuvi11")) {
				perfilvi11.setBackground(Color.RED);
				perfilvi11.setContentAreaFilled(false);
				perfilvi11.setOpaque(true);
				perfilvi11.setEnabled(true);
				perfilvi11.setText("Futbol");
			} else if (idList.get(i).equals("fuvi12")) {
				perfilvi12.setBackground(Color.RED);
				perfilvi12.setContentAreaFilled(false);
				perfilvi12.setOpaque(true);
				perfilvi12.setEnabled(true);
				perfilvi12.setText("Futbol");
			} else if (idList.get(i).equals("fuvi13")) {
				perfilvi13.setBackground(Color.RED);
				perfilvi13.setContentAreaFilled(false);
				perfilvi13.setOpaque(true);
				perfilvi13.setEnabled(true);
				perfilvi13.setText("Futbol");
			} else if (idList.get(i).equals("fuvi15")) {
				perfilvi15.setBackground(Color.RED);
				perfilvi15.setContentAreaFilled(false);
				perfilvi15.setOpaque(true);
				perfilvi15.setEnabled(true);
				perfilvi15.setText("Futbol");
			} else if (idList.get(i).equals("fuvi16")) {
				perfilvi16.setBackground(Color.RED);
				perfilvi16.setContentAreaFilled(false);
				perfilvi16.setOpaque(true);
				perfilvi16.setEnabled(true);
				perfilvi16.setText("Futbol");
			} else if (idList.get(i).equals("fuvi17")) {
				perfilvi17.setBackground(Color.RED);
				perfilvi17.setContentAreaFilled(false);
				perfilvi17.setOpaque(true);
				perfilvi17.setEnabled(true);
				perfilvi17.setText("Futbol");
			} else if (idList.get(i).equals("fuvi18")) {
				perfilvi18.setBackground(Color.RED);
				perfilvi18.setContentAreaFilled(false);
				perfilvi18.setOpaque(true);
				perfilvi18.setEnabled(true);
				perfilvi18.setText("Futbol");
			} else if (idList.get(i).equals("fuvi19")) {
				perfilvi19.setBackground(Color.RED);
				perfilvi19.setContentAreaFilled(false);
				perfilvi19.setOpaque(true);
				perfilvi19.setEnabled(true);
				perfilvi19.setText("Futbol");
			} else if (idList.get(i).equals("fuvi20")) {
				perfilvi20.setBackground(Color.RED);
				perfilvi20.setContentAreaFilled(false);
				perfilvi20.setOpaque(true);
				perfilvi20.setEnabled(true);
				perfilvi20.setText("Futbol");
				
				
				
			} else if (idList.get(i).equals("tevi9")) {
				perfilvi9.setBackground(Color.RED);
				perfilvi9.setContentAreaFilled(false);
				perfilvi9.setOpaque(true);
				perfilvi9.setEnabled(true);
				perfilvi9.setText("Tenis");
			} else if (idList.get(i).equals("tevi10")) {
				perfilvi10.setBackground(Color.RED);
				perfilvi10.setContentAreaFilled(false);
				perfilvi10.setOpaque(true);
				perfilvi10.setEnabled(true);
				perfilvi10.setText("Tenis");
			} else if (idList.get(i).equals("tevi11")) {
				perfilvi11.setBackground(Color.RED);
				perfilvi11.setContentAreaFilled(false);
				perfilvi11.setOpaque(true);
				perfilvi11.setEnabled(true);
				perfilvi11.setText("Tenis");
			} else if (idList.get(i).equals("tevi12")) {
				perfilvi12.setBackground(Color.RED);
				perfilvi12.setContentAreaFilled(false);
				perfilvi12.setOpaque(true);
				perfilvi12.setEnabled(true);
				perfilvi12.setText("Tenis");
			} else if (idList.get(i).equals("tevi13")) {
				perfilvi13.setBackground(Color.RED);
				perfilvi13.setContentAreaFilled(false);
				perfilvi13.setOpaque(true);
				perfilvi13.setEnabled(true);
				perfilvi13.setText("Tenis");
			} else if (idList.get(i).equals("tevi15")) {
				perfilvi15.setBackground(Color.RED);
				perfilvi15.setContentAreaFilled(false);
				perfilvi15.setOpaque(true);
				perfilvi15.setEnabled(true);
				perfilvi15.setText("Tenis");
			} else if (idList.get(i).equals("tevi16")) {
				perfilvi16.setBackground(Color.RED);
				perfilvi16.setContentAreaFilled(false);
				perfilvi16.setOpaque(true);
				perfilvi16.setEnabled(true);
				perfilvi16.setText("Tenis");
			} else if (idList.get(i).equals("tevi17")) {
				perfilvi17.setBackground(Color.RED);
				perfilvi17.setContentAreaFilled(false);
				perfilvi17.setOpaque(true);
				perfilvi17.setEnabled(true);
				perfilvi17.setText("Tenis");
			} else if (idList.get(i).equals("tevi18")) {
				perfilvi18.setBackground(Color.RED);
				perfilvi18.setContentAreaFilled(false);
				perfilvi18.setOpaque(true);
				perfilvi18.setEnabled(true);
				perfilvi18.setText("Tenis");
			} else if (idList.get(i).equals("tevi19")) {
				perfilvi19.setBackground(Color.RED);
				perfilvi19.setContentAreaFilled(false);
				perfilvi19.setOpaque(true);
				perfilvi19.setEnabled(true);
				perfilvi19.setText("Tenis");
			} else if (idList.get(i).equals("tevi20")) {
				perfilvi20.setBackground(Color.RED);
				perfilvi20.setContentAreaFilled(false);
				perfilvi20.setOpaque(true);
				perfilvi20.setEnabled(true);
				perfilvi20.setText("Tenis");
				

			} 			
			else if (idList.get(i).equals("basa9")) {
				perfilsa9.setBackground(Color.RED);
				perfilsa9.setContentAreaFilled(false);
				perfilsa9.setOpaque(true);
				perfilsa9.setEnabled(true);
				perfilsa9.setText("Baloncesto");
			} else if (idList.get(i).equals("basa10")) {
				perfilsa10.setBackground(Color.RED);
				perfilsa10.setContentAreaFilled(false);
				perfilsa10.setOpaque(true);
				perfilsa10.setEnabled(true);
				perfilsa10.setText("Baloncesto");
			} else if (idList.get(i).equals("basa11")) {
				perfilsa11.setBackground(Color.RED);
				perfilsa11.setContentAreaFilled(false);
				perfilsa11.setOpaque(true);
				perfilsa11.setEnabled(true);
				perfilsa11.setText("Baloncesto");
			} else if (idList.get(i).equals("basa12")) {
				perfilsa12.setBackground(Color.RED);
				perfilsa12.setContentAreaFilled(false);
				perfilsa12.setOpaque(true);
				perfilsa12.setEnabled(true);
				perfilsa12.setText("Baloncesto");
			} else if (idList.get(i).equals("basa13")) {
				perfilsa13.setBackground(Color.RED);
				perfilsa13.setContentAreaFilled(false);
				perfilsa13.setOpaque(true);
				perfilsa13.setEnabled(true);
				perfilsa13.setText("Baloncesto");
			} else if (idList.get(i).equals("basa15")) {
				perfilsa15.setBackground(Color.RED);
				perfilsa15.setContentAreaFilled(false);
				perfilsa15.setOpaque(true);
				perfilsa15.setEnabled(true);
				perfilsa15.setText("Baloncesto");
			} else if (idList.get(i).equals("basa16")) {
				perfilsa16.setBackground(Color.RED);
				perfilsa16.setContentAreaFilled(false);
				perfilsa16.setOpaque(true);
				perfilsa16.setEnabled(true);
				perfilsa16.setText("Baloncesto");
			} else if (idList.get(i).equals("basa17")) {
				perfilsa17.setBackground(Color.RED);
				perfilsa17.setContentAreaFilled(false);
				perfilsa17.setOpaque(true);
				perfilsa17.setEnabled(true);
				perfilsa17.setText("Baloncesto");
			} else if (idList.get(i).equals("basa18")) {
				perfilsa18.setBackground(Color.RED);
				perfilsa18.setContentAreaFilled(false);
				perfilsa18.setOpaque(true);
				perfilsa18.setEnabled(true);
				perfilsa18.setText("Baloncesto");
			} else if (idList.get(i).equals("basa19")) {
				perfilsa19.setBackground(Color.RED);
				perfilsa19.setContentAreaFilled(false);
				perfilsa19.setOpaque(true);
				perfilsa19.setEnabled(true);
				perfilsa19.setText("Baloncesto");
			} else if (idList.get(i).equals("basa20")) {
				perfilsa20.setBackground(Color.RED);
				perfilsa20.setContentAreaFilled(false);
				perfilsa20.setOpaque(true);
				perfilsa20.setEnabled(true);
				perfilsa20.setText("Baloncesto");
				
				
				
			} else if (idList.get(i).equals("pasa9")) {
				perfilsa9.setBackground(Color.RED);
				perfilsa9.setContentAreaFilled(false);
				perfilsa9.setOpaque(true);
				perfilsa9.setEnabled(true);
				perfilsa9.setText("Padel");
			} else if (idList.get(i).equals("pasa10")) {
				perfilsa10.setBackground(Color.RED);
				perfilsa10.setContentAreaFilled(false);
				perfilsa10.setOpaque(true);
				perfilsa10.setEnabled(true);
				perfilsa10.setText("Padel");
			} else if (idList.get(i).equals("pasa11")) {
				perfilsa11.setBackground(Color.RED);
				perfilsa11.setContentAreaFilled(false);
				perfilsa11.setOpaque(true);
				perfilsa11.setEnabled(true);
				perfilsa11.setText("Padel");
			} else if (idList.get(i).equals("pasa12")) {
				perfilsa12.setBackground(Color.RED);
				perfilsa12.setContentAreaFilled(false);
				perfilsa12.setOpaque(true);
				perfilsa12.setEnabled(true);
				perfilsa12.setText("Padel");
			} else if (idList.get(i).equals("pasa13")) {
				perfilsa13.setBackground(Color.RED);
				perfilsa13.setContentAreaFilled(false);
				perfilsa13.setOpaque(true);
				perfilsa13.setEnabled(true);
				perfilsa13.setText("Padel");
			} else if (idList.get(i).equals("pasa15")) {
				perfilsa15.setBackground(Color.RED);
				perfilsa15.setContentAreaFilled(false);
				perfilsa15.setOpaque(true);
				perfilsa15.setEnabled(true);
				perfilsa15.setText("Padel");
			} else if (idList.get(i).equals("pasa16")) {
				perfilsa16.setBackground(Color.RED);
				perfilsa16.setContentAreaFilled(false);
				perfilsa16.setOpaque(true);
				perfilsa16.setEnabled(true);
				perfilsa16.setText("Padel");
			} else if (idList.get(i).equals("pasa17")) {
				perfilsa17.setBackground(Color.RED);
				perfilsa17.setContentAreaFilled(false);
				perfilsa17.setOpaque(true);
				perfilsa17.setEnabled(true);
				perfilsa17.setText("Padel");
			} else if (idList.get(i).equals("pasa18")) {
				perfilsa18.setBackground(Color.RED);
				perfilsa18.setContentAreaFilled(false);
				perfilsa18.setOpaque(true);
				perfilsa18.setEnabled(true);
				perfilsa18.setText("Padel");
			} else if (idList.get(i).equals("pasa19")) {
				perfilsa19.setBackground(Color.RED);
				perfilsa19.setContentAreaFilled(false);
				perfilsa19.setOpaque(true);
				perfilsa19.setEnabled(true);
				perfilsa19.setText("Padel");
			} else if (idList.get(i).equals("pasa20")) {
				perfilsa20.setBackground(Color.RED);
				perfilsa20.setContentAreaFilled(false);
				perfilsa20.setOpaque(true);
				perfilsa20.setEnabled(true);
				perfilsa20.setText("Padel");
				
				

			} else if (idList.get(i).equals("fusa9")) {
				perfilsa9.setBackground(Color.RED);
				perfilsa9.setContentAreaFilled(false);
				perfilsa9.setOpaque(true);
				perfilsa9.setEnabled(true);
				perfilsa9.setText("Futbol");
			} else if (idList.get(i).equals("fusa10")) {
				perfilsa10.setBackground(Color.RED);
				perfilsa10.setContentAreaFilled(false);
				perfilsa10.setOpaque(true);
				perfilsa10.setEnabled(true);
				perfilsa10.setText("Futbol");
			} else if (idList.get(i).equals("fusa11")) {
				perfilsa11.setBackground(Color.RED);
				perfilsa11.setContentAreaFilled(false);
				perfilsa11.setOpaque(true);
				perfilsa11.setEnabled(true);
				perfilsa11.setText("Futbol");
			} else if (idList.get(i).equals("fusa12")) {
				perfilsa12.setBackground(Color.RED);
				perfilsa12.setContentAreaFilled(false);
				perfilsa12.setOpaque(true);
				perfilsa12.setEnabled(true);
				perfilsa12.setText("Futbol");
			} else if (idList.get(i).equals("fusa13")) {
				perfilsa13.setBackground(Color.RED);
				perfilsa13.setContentAreaFilled(false);
				perfilsa13.setOpaque(true);
				perfilsa13.setEnabled(true);
				perfilsa13.setText("Futbol");
			} else if (idList.get(i).equals("fusa15")) {
				perfilsa15.setBackground(Color.RED);
				perfilsa15.setContentAreaFilled(false);
				perfilsa15.setOpaque(true);
				perfilsa15.setEnabled(true);
				perfilsa15.setText("Futbol");
			} else if (idList.get(i).equals("fusa16")) {
				perfilsa16.setBackground(Color.RED);
				perfilsa16.setContentAreaFilled(false);
				perfilsa16.setOpaque(true);
				perfilsa16.setEnabled(true);
				perfilsa16.setText("Futbol");
			} else if (idList.get(i).equals("fusa17")) {
				perfilsa17.setBackground(Color.RED);
				perfilsa17.setContentAreaFilled(false);
				perfilsa17.setOpaque(true);
				perfilsa17.setEnabled(true);
				perfilsa17.setText("Futbol");
			} else if (idList.get(i).equals("fusa18")) {
				perfilsa18.setBackground(Color.RED);
				perfilsa18.setContentAreaFilled(false);
				perfilsa18.setOpaque(true);
				perfilsa18.setEnabled(true);
				perfilsa18.setText("Futbol");
			} else if (idList.get(i).equals("fusa19")) {
				perfilsa19.setBackground(Color.RED);
				perfilsa19.setContentAreaFilled(false);
				perfilsa19.setOpaque(true);
				perfilsa19.setEnabled(true);
				perfilsa19.setText("Futbol");
			} else if (idList.get(i).equals("fusa20")) {
				perfilsa20.setBackground(Color.RED);
				perfilsa20.setContentAreaFilled(false);
				perfilsa20.setOpaque(true);
				perfilsa20.setEnabled(true);
				perfilsa20.setText("Futbol");
				
				
				
			} else if (idList.get(i).equals("tesa9")) {
				perfilsa9.setBackground(Color.RED);
				perfilsa9.setContentAreaFilled(false);
				perfilsa9.setOpaque(true);
				perfilsa9.setEnabled(true);
				perfilsa9.setText("Tenis");
			} else if (idList.get(i).equals("tesa10")) {
				perfilsa10.setBackground(Color.RED);
				perfilsa10.setContentAreaFilled(false);
				perfilsa10.setOpaque(true);
				perfilsa10.setEnabled(true);
				perfilsa10.setText("Tenis");
			} else if (idList.get(i).equals("tesa11")) {
				perfilsa11.setBackground(Color.RED);
				perfilsa11.setContentAreaFilled(false);
				perfilsa11.setOpaque(true);
				perfilsa11.setEnabled(true);
				perfilsa11.setText("Tenis");
			} else if (idList.get(i).equals("tesa12")) {
				perfilsa12.setBackground(Color.RED);
				perfilsa12.setContentAreaFilled(false);
				perfilsa12.setOpaque(true);
				perfilsa12.setEnabled(true);
				perfilsa12.setText("Tenis");
			} else if (idList.get(i).equals("tesa13")) {
				perfilsa13.setBackground(Color.RED);
				perfilsa13.setContentAreaFilled(false);
				perfilsa13.setOpaque(true);
				perfilsa13.setEnabled(true);
				perfilsa13.setText("Tenis");
			} else if (idList.get(i).equals("tesa15")) {
				perfilsa15.setBackground(Color.RED);
				perfilsa15.setContentAreaFilled(false);
				perfilsa15.setOpaque(true);
				perfilsa15.setEnabled(true);
				perfilsa15.setText("Tenis");
			} else if (idList.get(i).equals("tesa16")) {
				perfilsa16.setBackground(Color.RED);
				perfilsa16.setContentAreaFilled(false);
				perfilsa16.setOpaque(true);
				perfilsa16.setEnabled(true);
				perfilsa16.setText("Tenis");
			} else if (idList.get(i).equals("tesa17")) {
				perfilsa17.setBackground(Color.RED);
				perfilsa17.setContentAreaFilled(false);
				perfilsa17.setOpaque(true);
				perfilsa17.setEnabled(true);
				perfilsa17.setText("Tenis");
			} else if (idList.get(i).equals("tesa18")) {
				perfilsa18.setBackground(Color.RED);
				perfilsa18.setContentAreaFilled(false);
				perfilsa18.setOpaque(true);
				perfilsa18.setEnabled(true);
				perfilsa18.setText("Tenis");
			} else if (idList.get(i).equals("tesa19")) {
				perfilsa19.setBackground(Color.RED);
				perfilsa19.setContentAreaFilled(false);
				perfilsa19.setOpaque(true);
				perfilsa19.setEnabled(true);
				perfilsa19.setText("Tenis");
			} else if (idList.get(i).equals("tesa20")) {
				perfilsa20.setBackground(Color.RED);
				perfilsa20.setContentAreaFilled(false);
				perfilsa20.setOpaque(true);
				perfilsa20.setEnabled(true);
				perfilsa20.setText("Tenis");
				

			} 			
			else if (idList.get(i).equals("bado9")) {
				perfildo9.setBackground(Color.RED);
				perfildo9.setContentAreaFilled(false);
				perfildo9.setOpaque(true);
				perfildo9.setEnabled(true);
				perfildo9.setText("Baloncesto");
			} else if (idList.get(i).equals("bado10")) {
				perfildo10.setBackground(Color.RED);
				perfildo10.setContentAreaFilled(false);
				perfildo10.setOpaque(true);
				perfildo10.setEnabled(true);
				perfildo10.setText("Baloncesto");
			} else if (idList.get(i).equals("bado11")) {
				perfildo11.setBackground(Color.RED);
				perfildo11.setContentAreaFilled(false);
				perfildo11.setOpaque(true);
				perfildo11.setEnabled(true);
				perfildo11.setText("Baloncesto");
			} else if (idList.get(i).equals("bado12")) {
				perfildo12.setBackground(Color.RED);
				perfildo12.setContentAreaFilled(false);
				perfildo12.setOpaque(true);
				perfildo12.setEnabled(true);
				perfildo12.setText("Baloncesto");
			} else if (idList.get(i).equals("bado13")) {
				perfildo13.setBackground(Color.RED);
				perfildo13.setContentAreaFilled(false);
				perfildo13.setOpaque(true);
				perfildo13.setEnabled(true);
				perfildo13.setText("Baloncesto");
			} else if (idList.get(i).equals("bado15")) {
				perfildo15.setBackground(Color.RED);
				perfildo15.setContentAreaFilled(false);
				perfildo15.setOpaque(true);
				perfildo15.setEnabled(true);
				perfildo15.setText("Baloncesto");
			} else if (idList.get(i).equals("bado16")) {
				perfildo16.setBackground(Color.RED);
				perfildo16.setContentAreaFilled(false);
				perfildo16.setOpaque(true);
				perfildo16.setEnabled(true);
				perfildo16.setText("Baloncesto");
			} else if (idList.get(i).equals("bado17")) {
				perfildo17.setBackground(Color.RED);
				perfildo17.setContentAreaFilled(false);
				perfildo17.setOpaque(true);
				perfildo17.setEnabled(true);
				perfildo17.setText("Baloncesto");
			} else if (idList.get(i).equals("bado18")) {
				perfildo18.setBackground(Color.RED);
				perfildo18.setContentAreaFilled(false);
				perfildo18.setOpaque(true);
				perfildo18.setEnabled(true);
				perfildo18.setText("Baloncesto");
			} else if (idList.get(i).equals("bado19")) {
				perfildo19.setBackground(Color.RED);
				perfildo19.setContentAreaFilled(false);
				perfildo19.setOpaque(true);
				perfildo19.setEnabled(true);
				perfildo19.setText("Baloncesto");
			} else if (idList.get(i).equals("bado20")) {
				perfildo20.setBackground(Color.RED);
				perfildo20.setContentAreaFilled(false);
				perfildo20.setOpaque(true);
				perfildo20.setEnabled(true);
				perfildo20.setText("Baloncesto");
				
				
				
			} else if (idList.get(i).equals("pado9")) {
				perfildo9.setBackground(Color.RED);
				perfildo9.setContentAreaFilled(false);
				perfildo9.setOpaque(true);
				perfildo9.setEnabled(true);
				perfildo9.setText("Padel");
			} else if (idList.get(i).equals("pado10")) {
				perfildo10.setBackground(Color.RED);
				perfildo10.setContentAreaFilled(false);
				perfildo10.setOpaque(true);
				perfildo10.setEnabled(true);
				perfildo10.setText("Padel");
			} else if (idList.get(i).equals("pado11")) {
				perfildo11.setBackground(Color.RED);
				perfildo11.setContentAreaFilled(false);
				perfildo11.setOpaque(true);
				perfildo11.setEnabled(true);
				perfildo11.setText("Padel");
			} else if (idList.get(i).equals("pado12")) {
				perfildo12.setBackground(Color.RED);
				perfildo12.setContentAreaFilled(false);
				perfildo12.setOpaque(true);
				perfildo12.setEnabled(true);
				perfildo12.setText("Padel");
			} else if (idList.get(i).equals("pado13")) {
				perfildo13.setBackground(Color.RED);
				perfildo13.setContentAreaFilled(false);
				perfildo13.setOpaque(true);
				perfildo13.setEnabled(true);
				perfildo13.setText("Padel");
			} else if (idList.get(i).equals("pado15")) {
				perfildo15.setBackground(Color.RED);
				perfildo15.setContentAreaFilled(false);
				perfildo15.setOpaque(true);
				perfildo15.setEnabled(true);
				perfildo15.setText("Padel");
			} else if (idList.get(i).equals("pado16")) {
				perfildo16.setBackground(Color.RED);
				perfildo16.setContentAreaFilled(false);
				perfildo16.setOpaque(true);
				perfildo16.setEnabled(true);
				perfildo16.setText("Padel");
			} else if (idList.get(i).equals("pado17")) {
				perfildo17.setBackground(Color.RED);
				perfildo17.setContentAreaFilled(false);
				perfildo17.setOpaque(true);
				perfildo17.setEnabled(true);
				perfildo17.setText("Padel");
			} else if (idList.get(i).equals("pado18")) {
				perfildo18.setBackground(Color.RED);
				perfildo18.setContentAreaFilled(false);
				perfildo18.setOpaque(true);
				perfildo18.setEnabled(true);
				perfildo18.setText("Padel");
			} else if (idList.get(i).equals("pado19")) {
				perfildo19.setBackground(Color.RED);
				perfildo19.setContentAreaFilled(false);
				perfildo19.setOpaque(true);
				perfildo19.setEnabled(true);
				perfildo19.setText("Padel");
			} else if (idList.get(i).equals("pado20")) {
				perfildo20.setBackground(Color.RED);
				perfildo20.setContentAreaFilled(false);
				perfildo20.setOpaque(true);
				perfildo20.setEnabled(true);
				perfildo20.setText("Padel");
				
				

			} else if (idList.get(i).equals("fudo9")) {
				perfildo9.setBackground(Color.RED);
				perfildo9.setContentAreaFilled(false);
				perfildo9.setOpaque(true);
				perfildo9.setEnabled(true);
				perfildo9.setText("Futbol");
			} else if (idList.get(i).equals("fudo10")) {
				perfildo10.setBackground(Color.RED);
				perfildo10.setContentAreaFilled(false);
				perfildo10.setOpaque(true);
				perfildo10.setEnabled(true);
				perfildo10.setText("Futbol");
			} else if (idList.get(i).equals("fudo11")) {
				perfildo11.setBackground(Color.RED);
				perfildo11.setContentAreaFilled(false);
				perfildo11.setOpaque(true);
				perfildo11.setEnabled(true);
				perfildo11.setText("Futbol");
			} else if (idList.get(i).equals("fudo12")) {
				perfildo12.setBackground(Color.RED);
				perfildo12.setContentAreaFilled(false);
				perfildo12.setOpaque(true);
				perfildo12.setEnabled(true);
				perfildo12.setText("Futbol");
			} else if (idList.get(i).equals("fudo13")) {
				perfildo13.setBackground(Color.RED);
				perfildo13.setContentAreaFilled(false);
				perfildo13.setOpaque(true);
				perfildo13.setEnabled(true);
				perfildo13.setText("Futbol");
			} else if (idList.get(i).equals("fudo15")) {
				perfildo15.setBackground(Color.RED);
				perfildo15.setContentAreaFilled(false);
				perfildo15.setOpaque(true);
				perfildo15.setEnabled(true);
				perfildo15.setText("Futbol");
			} else if (idList.get(i).equals("fudo16")) {
				perfildo16.setBackground(Color.RED);
				perfildo16.setContentAreaFilled(false);
				perfildo16.setOpaque(true);
				perfildo16.setEnabled(true);
				perfildo16.setText("Futbol");
			} else if (idList.get(i).equals("fudo17")) {
				perfildo17.setBackground(Color.RED);
				perfildo17.setContentAreaFilled(false);
				perfildo17.setOpaque(true);
				perfildo17.setEnabled(true);
				perfildo17.setText("Futbol");
			} else if (idList.get(i).equals("fudo18")) {
				perfildo18.setBackground(Color.RED);
				perfildo18.setContentAreaFilled(false);
				perfildo18.setOpaque(true);
				perfildo18.setEnabled(true);
				perfildo18.setText("Futbol");
			} else if (idList.get(i).equals("fudo19")) {
				perfildo19.setBackground(Color.RED);
				perfildo19.setContentAreaFilled(false);
				perfildo19.setOpaque(true);
				perfildo19.setEnabled(true);
				perfildo19.setText("Futbol");
			} else if (idList.get(i).equals("fudo20")) {
				perfildo20.setBackground(Color.RED);
				perfildo20.setContentAreaFilled(false);
				perfildo20.setOpaque(true);
				perfildo20.setEnabled(true);
				perfildo20.setText("Futbol");
				
				
				
			} else if (idList.get(i).equals("tedo9")) {
				perfildo9.setBackground(Color.RED);
				perfildo9.setContentAreaFilled(false);
				perfildo9.setOpaque(true);
				perfildo9.setEnabled(true);
				perfildo9.setText("Tenis");
			} else if (idList.get(i).equals("tedo10")) {
				perfildo10.setBackground(Color.RED);
				perfildo10.setContentAreaFilled(false);
				perfildo10.setOpaque(true);
				perfildo10.setEnabled(true);
				perfildo10.setText("Tenis");
			} else if (idList.get(i).equals("tedo11")) {
				perfildo11.setBackground(Color.RED);
				perfildo11.setContentAreaFilled(false);
				perfildo11.setOpaque(true);
				perfildo11.setEnabled(true);
				perfildo11.setText("Tenis");
			} else if (idList.get(i).equals("tedo12")) {
				perfildo12.setBackground(Color.RED);
				perfildo12.setContentAreaFilled(false);
				perfildo12.setOpaque(true);
				perfildo12.setEnabled(true);
				perfildo12.setText("Tenis");
			} else if (idList.get(i).equals("tedo13")) {
				perfildo13.setBackground(Color.RED);
				perfildo13.setContentAreaFilled(false);
				perfildo13.setOpaque(true);
				perfildo13.setEnabled(true);
				perfildo13.setText("Tenis");
			} else if (idList.get(i).equals("tedo15")) {
				perfildo15.setBackground(Color.RED);
				perfildo15.setContentAreaFilled(false);
				perfildo15.setOpaque(true);
				perfildo15.setEnabled(true);
				perfildo15.setText("Tenis");
			} else if (idList.get(i).equals("tedo16")) {
				perfildo16.setBackground(Color.RED);
				perfildo16.setContentAreaFilled(false);
				perfildo16.setOpaque(true);
				perfildo16.setEnabled(true);
				perfildo16.setText("Tenis");
			} else if (idList.get(i).equals("tedo17")) {
				perfildo17.setBackground(Color.RED);
				perfildo17.setContentAreaFilled(false);
				perfildo17.setOpaque(true);
				perfildo17.setEnabled(true);
				perfildo17.setText("Tenis");
			} else if (idList.get(i).equals("tedo18")) {
				perfildo18.setBackground(Color.RED);
				perfildo18.setContentAreaFilled(false);
				perfildo18.setOpaque(true);
				perfildo18.setEnabled(true);
				perfildo18.setText("Tenis");
			} else if (idList.get(i).equals("tedo19")) {
				perfildo19.setBackground(Color.RED);
				perfildo19.setContentAreaFilled(false);
				perfildo19.setOpaque(true);
				perfildo19.setEnabled(true);
				perfildo19.setText("Tenis");
			} else if (idList.get(i).equals("tedo20")) {
				perfildo20.setBackground(Color.RED);
				perfildo20.setContentAreaFilled(false);
				perfildo20.setOpaque(true);
				perfildo20.setEnabled(true);
				perfildo20.setText("Tenis");
				
			}
		}
	}

	//------------------------------------------------------------------------------------------------------------------------------------------------
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==this.perfillu9) {
				perfillu9.setBackground(Color.WHITE);
				perfillu9.setContentAreaFilled(false);
				perfillu9.setOpaque(true);
				perfillu9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfillu10) {
				perfillu10.setBackground(Color.WHITE);
				perfillu10.setContentAreaFilled(false);
				perfillu10.setOpaque(true);
				perfillu10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfillu11) {
				perfillu11.setBackground(Color.WHITE);
				perfillu11.setContentAreaFilled(false);
				perfillu11.setOpaque(true);
				perfillu11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu11";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu12) {
				perfillu12.setBackground(Color.WHITE);
				perfillu12.setContentAreaFilled(false);
				perfillu12.setOpaque(true);
				perfillu12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu12";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu13) {
				perfillu13.setBackground(Color.WHITE);
				perfillu13.setContentAreaFilled(false);
				perfillu13.setOpaque(true);
				perfillu13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu13";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu15) {
				perfillu15.setBackground(Color.WHITE);
				perfillu15.setContentAreaFilled(false);
				perfillu15.setOpaque(true);
				perfillu15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu15";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu16) {
				perfillu16.setBackground(Color.WHITE);
				perfillu16.setContentAreaFilled(false);
				perfillu16.setOpaque(true);
				perfillu16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu16";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu17) {
				perfillu17.setBackground(Color.WHITE);
				perfillu17.setContentAreaFilled(false);
				perfillu17.setOpaque(true);
				perfillu17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu17";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu18) {
				perfillu18.setBackground(Color.WHITE);
				perfillu18.setContentAreaFilled(false);
				perfillu18.setOpaque(true);
				perfillu18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu18";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu19) {
				perfillu19.setBackground(Color.WHITE);
				perfillu19.setContentAreaFilled(false);
				perfillu19.setOpaque(true);
				perfillu19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu19";
				su.deletebooking(id);
			}else if (e.getSource()==perfillu20) {
				perfillu20.setBackground(Color.WHITE);
				perfillu20.setContentAreaFilled(false);
				perfillu20.setOpaque(true);
				perfillu20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "lu20";
				su.deletebooking(id);
				
				
			}else if (e.getSource()==this.perfilma9) {
				perfilma9.setBackground(Color.WHITE);
				perfilma9.setContentAreaFilled(false);
				perfilma9.setOpaque(true);
				perfilma9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilma10) {
				perfilma10.setBackground(Color.WHITE);
				perfilma10.setContentAreaFilled(false);
				perfilma10.setOpaque(true);
				perfilma10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilma11) {
				perfilma11.setBackground(Color.WHITE);
				perfilma11.setContentAreaFilled(false);
				perfilma11.setOpaque(true);
				perfilma11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma11";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma12) {
				perfilma12.setBackground(Color.WHITE);
				perfilma12.setContentAreaFilled(false);
				perfilma12.setOpaque(true);
				perfilma12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma12";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma13) {
				perfilma13.setBackground(Color.WHITE);
				perfilma13.setContentAreaFilled(false);
				perfilma13.setOpaque(true);
				perfilma13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma13";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma15) {
				perfilma15.setBackground(Color.WHITE);
				perfilma15.setContentAreaFilled(false);
				perfilma15.setOpaque(true);
				perfilma15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma15";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma16) {
				perfilma16.setBackground(Color.WHITE);
				perfilma16.setContentAreaFilled(false);
				perfilma16.setOpaque(true);
				perfilma16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma16";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma17) {
				perfilma17.setBackground(Color.WHITE);
				perfilma17.setContentAreaFilled(false);
				perfilma17.setOpaque(true);
				perfilma17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma17";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma18) {
				perfilma18.setBackground(Color.WHITE);
				perfilma18.setContentAreaFilled(false);
				perfilma18.setOpaque(true);
				perfilma18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma18";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma19) {
				perfilma19.setBackground(Color.WHITE);
				perfilma19.setContentAreaFilled(false);
				perfilma19.setOpaque(true);
				perfilma19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma19";
				su.deletebooking(id);
			}else if (e.getSource()==perfilma20) {
				perfilma20.setBackground(Color.WHITE);
				perfilma20.setContentAreaFilled(false);
				perfilma20.setOpaque(true);
				perfilma20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ma20";
				su.deletebooking(id);
				
				
			}else if (e.getSource()==this.perfilmi9) {
				perfilmi9.setBackground(Color.WHITE);
				perfilmi9.setContentAreaFilled(false);
				perfilmi9.setOpaque(true);
				perfilmi9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilmi10) {
				perfilmi10.setBackground(Color.WHITE);
				perfilmi10.setContentAreaFilled(false);
				perfilmi10.setOpaque(true);
				perfilmi10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilmi11) {
				perfilmi11.setBackground(Color.WHITE);
				perfilmi11.setContentAreaFilled(false);
				perfilmi11.setOpaque(true);
				perfilmi11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi11";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi12) {
				perfilmi12.setBackground(Color.WHITE);
				perfilmi12.setContentAreaFilled(false);
				perfilmi12.setOpaque(true);
				perfilmi12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi12";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi13) {
				perfilmi13.setBackground(Color.WHITE);
				perfilmi13.setContentAreaFilled(false);
				perfilmi13.setOpaque(true);
				perfilmi13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi13";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi15) {
				perfilmi15.setBackground(Color.WHITE);
				perfilmi15.setContentAreaFilled(false);
				perfilmi15.setOpaque(true);
				perfilmi15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi15";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi16) {
				perfilmi16.setBackground(Color.WHITE);
				perfilmi16.setContentAreaFilled(false);
				perfilmi16.setOpaque(true);
				perfilmi16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi16";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi17) {
				perfilmi17.setBackground(Color.WHITE);
				perfilmi17.setContentAreaFilled(false);
				perfilmi17.setOpaque(true);
				perfilmi17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi17";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi18) {
				perfilmi18.setBackground(Color.WHITE);
				perfilmi18.setContentAreaFilled(false);
				perfilmi18.setOpaque(true);
				perfilmi18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi18";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi19) {
				perfilmi19.setBackground(Color.WHITE);
				perfilmi19.setContentAreaFilled(false);
				perfilmi19.setOpaque(true);
				perfilmi19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi19";
				su.deletebooking(id);
			}else if (e.getSource()==perfilmi20) {
				perfilmi20.setBackground(Color.WHITE);
				perfilmi20.setContentAreaFilled(false);
				perfilmi20.setOpaque(true);
				perfilmi20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "mi20";
				su.deletebooking(id);
				
				
			}else if (e.getSource()==this.perfilju9) {
				perfilju9.setBackground(Color.WHITE);
				perfilju9.setContentAreaFilled(false);
				perfilju9.setOpaque(true);
				perfilju9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilju10) {
				perfilju10.setBackground(Color.WHITE);
				perfilju10.setContentAreaFilled(false);
				perfilju10.setOpaque(true);
				perfilju10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilju11) {
				perfilju11.setBackground(Color.WHITE);
				perfilju11.setContentAreaFilled(false);
				perfilju11.setOpaque(true);
				perfilju11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju11";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju12) {
				perfilju12.setBackground(Color.WHITE);
				perfilju12.setContentAreaFilled(false);
				perfilju12.setOpaque(true);
				perfilju12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju12";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju13) {
				perfilju13.setBackground(Color.WHITE);
				perfilju13.setContentAreaFilled(false);
				perfilju13.setOpaque(true);
				perfilju13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju13";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju15) {
				perfilju15.setBackground(Color.WHITE);
				perfilju15.setContentAreaFilled(false);
				perfilju15.setOpaque(true);
				perfilju15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju15";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju16) {
				perfilju16.setBackground(Color.WHITE);
				perfilju16.setContentAreaFilled(false);
				perfilju16.setOpaque(true);
				perfilju16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju16";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju17) {
				perfilju17.setBackground(Color.WHITE);
				perfilju17.setContentAreaFilled(false);
				perfilju17.setOpaque(true);
				perfilju17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju17";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju18) {
				perfilju18.setBackground(Color.WHITE);
				perfilju18.setContentAreaFilled(false);
				perfilju18.setOpaque(true);
				perfilju18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju18";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju19) {
				perfilju19.setBackground(Color.WHITE);
				perfilju19.setContentAreaFilled(false);
				perfilju19.setOpaque(true);
				perfilju19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju19";
				su.deletebooking(id);
			}else if (e.getSource()==perfilju20) {
				perfilju20.setBackground(Color.WHITE);
				perfilju20.setContentAreaFilled(false);
				perfilju20.setOpaque(true);
				perfilju20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "ju20";
				su.deletebooking(id);
				
				
			}else if (e.getSource()==this.perfilvi9) {
				perfilvi9.setBackground(Color.WHITE);
				perfilvi9.setContentAreaFilled(false);
				perfilvi9.setOpaque(true);
				perfilvi9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilvi10) {
				perfilvi10.setBackground(Color.WHITE);
				perfilvi10.setContentAreaFilled(false);
				perfilvi10.setOpaque(true);
				perfilvi10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilvi11) {
				perfilvi11.setBackground(Color.WHITE);
				perfilvi11.setContentAreaFilled(false);
				perfilvi11.setOpaque(true);
				perfilvi11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi11";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi12) {
				perfilvi12.setBackground(Color.WHITE);
				perfilvi12.setContentAreaFilled(false);
				perfilvi12.setOpaque(true);
				perfilvi12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi12";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi13) {
				perfilvi13.setBackground(Color.WHITE);
				perfilvi13.setContentAreaFilled(false);
				perfilvi13.setOpaque(true);
				perfilvi13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi13";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi15) {
				perfilvi15.setBackground(Color.WHITE);
				perfilvi15.setContentAreaFilled(false);
				perfilvi15.setOpaque(true);
				perfilvi15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi15";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi16) {
				perfilvi16.setBackground(Color.WHITE);
				perfilvi16.setContentAreaFilled(false);
				perfilvi16.setOpaque(true);
				perfilvi16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi16";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi17) {
				perfilvi17.setBackground(Color.WHITE);
				perfilvi17.setContentAreaFilled(false);
				perfilvi17.setOpaque(true);
				perfilvi17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi17";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi18) {
				perfilvi18.setBackground(Color.WHITE);
				perfilvi18.setContentAreaFilled(false);
				perfilvi18.setOpaque(true);
				perfilvi18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi18";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi19) {
				perfilvi19.setBackground(Color.WHITE);
				perfilvi19.setContentAreaFilled(false);
				perfilvi19.setOpaque(true);
				perfilvi19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi19";
				su.deletebooking(id);
			}else if (e.getSource()==perfilvi20) {
				perfilvi20.setBackground(Color.WHITE);
				perfilvi20.setContentAreaFilled(false);
				perfilvi20.setOpaque(true);
				perfilvi20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "vi20";
				su.deletebooking(id);
				
				
			}else if (e.getSource()==this.perfilsa9) {
				perfilsa9.setBackground(Color.WHITE);
				perfilsa9.setContentAreaFilled(false);
				perfilsa9.setOpaque(true);
				perfilsa9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilsa10) {
				perfilsa10.setBackground(Color.WHITE);
				perfilsa10.setContentAreaFilled(false);
				perfilsa10.setOpaque(true);
				perfilsa10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfilsa11) {
				perfilsa11.setBackground(Color.WHITE);
				perfilsa11.setContentAreaFilled(false);
				perfilsa11.setOpaque(true);
				perfilsa11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa11";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa12) {
				perfilsa12.setBackground(Color.WHITE);
				perfilsa12.setContentAreaFilled(false);
				perfilsa12.setOpaque(true);
				perfilsa12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa12";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa13) {
				perfilsa13.setBackground(Color.WHITE);
				perfilsa13.setContentAreaFilled(false);
				perfilsa13.setOpaque(true);
				perfilsa13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa13";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa15) {
				perfilsa15.setBackground(Color.WHITE);
				perfilsa15.setContentAreaFilled(false);
				perfilsa15.setOpaque(true);
				perfilsa15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa15";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa16) {
				perfilsa16.setBackground(Color.WHITE);
				perfilsa16.setContentAreaFilled(false);
				perfilsa16.setOpaque(true);
				perfilsa16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa16";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa17) {
				perfilsa17.setBackground(Color.WHITE);
				perfilsa17.setContentAreaFilled(false);
				perfilsa17.setOpaque(true);
				perfilsa17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa17";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa18) {
				perfilsa18.setBackground(Color.WHITE);
				perfilsa18.setContentAreaFilled(false);
				perfilsa18.setOpaque(true);
				perfilsa18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa18";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa19) {
				perfilsa19.setBackground(Color.WHITE);
				perfilsa19.setContentAreaFilled(false);
				perfilsa19.setOpaque(true);
				perfilsa19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa19";
				su.deletebooking(id);
			}else if (e.getSource()==perfilsa20) {
				perfilsa20.setBackground(Color.WHITE);
				perfilsa20.setContentAreaFilled(false);
				perfilsa20.setOpaque(true);
				perfilsa20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "sa20";
				su.deletebooking(id);
				
				
			}else if (e.getSource()==this.perfildo9) {
				perfildo9.setBackground(Color.WHITE);
				perfildo9.setContentAreaFilled(false);
				perfildo9.setOpaque(true);
				perfildo9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do9";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfildo10) {
				perfildo10.setBackground(Color.WHITE);
				perfildo10.setContentAreaFilled(false);
				perfildo10.setOpaque(true);
				perfildo10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do10";
				su.deletebooking(id);
			}else if (e.getSource()==this.perfildo11) {
				perfildo11.setBackground(Color.WHITE);
				perfildo11.setContentAreaFilled(false);
				perfildo11.setOpaque(true);
				perfildo11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do11";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo12) {
				perfildo12.setBackground(Color.WHITE);
				perfildo12.setContentAreaFilled(false);
				perfildo12.setOpaque(true);
				perfildo12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do12";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo13) {
				perfildo13.setBackground(Color.WHITE);
				perfildo13.setContentAreaFilled(false);
				perfildo13.setOpaque(true);
				perfildo13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do13";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo15) {
				perfildo15.setBackground(Color.WHITE);
				perfildo15.setContentAreaFilled(false);
				perfildo15.setOpaque(true);
				perfildo15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do15";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo16) {
				perfildo16.setBackground(Color.WHITE);
				perfildo16.setContentAreaFilled(false);
				perfildo16.setOpaque(true);
				perfildo16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do16";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo17) {
				perfildo17.setBackground(Color.WHITE);
				perfildo17.setContentAreaFilled(false);
				perfildo17.setOpaque(true);
				perfildo17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do17";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo18) {
				perfildo18.setBackground(Color.WHITE);
				perfildo18.setContentAreaFilled(false);
				perfildo18.setOpaque(true);
				perfildo18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do18";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo19) {
				perfildo19.setBackground(Color.WHITE);
				perfildo19.setContentAreaFilled(false);
				perfildo19.setOpaque(true);
				perfildo19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do19";
				su.deletebooking(id);
			}else if (e.getSource()==perfildo20) {
				perfildo20.setBackground(Color.WHITE);
				perfildo20.setContentAreaFilled(false);
				perfildo20.setOpaque(true);
				perfildo20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "do20";
				su.deletebooking(id);
						
	        }else {
	        	JOptionPane.showMessageDialog(null, "Error", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }

	}

}
