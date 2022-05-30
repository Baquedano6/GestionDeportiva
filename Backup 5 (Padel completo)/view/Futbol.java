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

public class Futbol extends JPanel implements ActionListener {
	

	JButton fulu9;
	JButton fulu10;
	JButton fuma9;
	JButton fumi9;
	JButton fuju9;
	JButton fuvi9;
	JButton fusa9;
	JButton fudo9;
	JButton fulu11;
	JButton fulu12;
	JButton fulu13;
	JButton fulu15;
	JButton fulu16;
	JButton fulu17;
	JButton fulu18;
	JButton fulu19;
	JButton fulu20;
	JButton fuma20;
	JButton fuma19;
	JButton fuma18;
	JButton fuma17;
	JButton fuma16;
	JButton fuma15;
	JButton fuma13;
	JButton fuma12;
	JButton fuma11;
	JButton fuma10;
	JButton fumi20;
	JButton fumi19;
	JButton fumi18;
	JButton fumi17;
	JButton fumi16;
	JButton fumi15;
	JButton fumi13;
	JButton fumi12;
	JButton fumi11;
	JButton fumi10;
	JButton fuju20;
	JButton fuju19;
	JButton fuju18;
	JButton fuju17;
	JButton fuju16;
	JButton fuju15;
	JButton fuju13;
	JButton fuju12;
	JButton fuju11;
	JButton fuju10;
	JButton fuvi20;
	JButton fuvi19;
	JButton fuvi18;
	JButton fuvi17;
	JButton fuvi16;
	JButton fuvi15;
	JButton fuvi13;
	JButton fuvi12;
	JButton fuvi11;
	JButton fuvi10;
	JButton fusa20;
	JButton fusa19;
	JButton fusa18;
	JButton fusa17;
	JButton fusa16;
	JButton fusa15;
	JButton fusa13;
	JButton fusa12;
	JButton fusa11;
	JButton fusa10;
	JButton fudo20;
	JButton fudo19;
	JButton fudo18;
	JButton fudo17;
	JButton fudo16;
	JButton fudo15;
	JButton fudo13;
	JButton fudo12;
	JButton fudo11;
	JButton fudo10;
	/**
	 * Create the this.
	 */
	public Futbol() {
		setLayout(null);

		// ---------------------------------------------------------CREAR BOTONES--------------------------------------------------
		 fulu9 = new JButton("");
		 fulu10 = new JButton("");
		 fuma9 = new JButton("");
		 fumi9 = new JButton("");
		 fuju9 = new JButton("");
		 fuvi9 = new JButton("");
		 fusa9 = new JButton("");
		 fudo9 = new JButton("");
		 fulu11 = new JButton("");
		 fulu12 = new JButton("");
		 fulu13 = new JButton("");
		 fulu15 = new JButton("");
		 fulu16 = new JButton("");
		 fulu17 = new JButton("");
		 fulu18 = new JButton("");
		 fulu19 = new JButton("");
		 fulu20 = new JButton("");
		 fuma20 = new JButton("");
		 fuma19 = new JButton("");
		 fuma18 = new JButton("");
		 fuma17 = new JButton("");
		 fuma16 = new JButton("");
		 fuma15 = new JButton("");
		 fuma13 = new JButton("");
		 fuma12 = new JButton("");
		 fuma11 = new JButton("");
		 fuma10 = new JButton("");
		 fumi20 = new JButton("");
		 fumi19 = new JButton("");
		 fumi18 = new JButton("");
		 fumi17 = new JButton("");
		 fumi16 = new JButton("");
		 fumi15 = new JButton("");
		 fumi13 = new JButton("");
		 fumi12 = new JButton("");
		 fumi11 = new JButton("");
		 fumi10 = new JButton("");
		 fuju20 = new JButton("");
		 fuju19 = new JButton("");
		 fuju18 = new JButton("");
		 fuju17 = new JButton("");
		 fuju16 = new JButton("");
		 fuju15 = new JButton("");
		 fuju13 = new JButton("");
		 fuju12 = new JButton("");
		 fuju11 = new JButton("");
		 fuju10 = new JButton("");
		 fuvi20 = new JButton("");
		 fuvi19 = new JButton("");
		 fuvi18 = new JButton("");
		 fuvi17 = new JButton("");
		 fuvi16 = new JButton("");
		 fuvi15 = new JButton("");
		 fuvi13 = new JButton("");
		 fuvi12 = new JButton("");
		 fuvi11 = new JButton("");
		 fuvi10 = new JButton("");
		 fusa20 = new JButton("");
		 fusa19 = new JButton("");
		 fusa18 = new JButton("");
		 fusa17 = new JButton("");
		 fusa16 = new JButton("");
		 fusa15 = new JButton("");
		 fusa13 = new JButton("");
		 fusa12 = new JButton("");
		 fusa11 = new JButton("");
		 fusa10 = new JButton("");
		 fudo20 = new JButton("");
		 fudo19 = new JButton("");
		 fudo18 = new JButton("");
		 fudo17 = new JButton("");
		 fudo16 = new JButton("");
		 fudo15 = new JButton("");
		 fudo13 = new JButton("");
		 fudo12 = new JButton("");
		 fudo11 = new JButton("");
		 fudo10 = new JButton("");

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

		fulu9.setBounds(149, 57, 100, 40);
		this.add(fulu9);

		fulu10.setBounds(149, 97, 100, 40);
		this.add(fulu10);

		fuma9.setBounds(249, 57, 100, 40);
		this.add(fuma9);

		fumi9.setBounds(349, 57, 100, 40);
		this.add(fumi9);

		fuju9.setBounds(449, 57, 100, 40);
		this.add(fuju9);

		fuvi9.setBounds(549, 57, 100, 40);
		this.add(fuvi9);

		fusa9.setBounds(649, 57, 100, 40);
		this.add(fusa9);

		fudo9.setBounds(749, 57, 100, 40);
		this.add(fudo9);

		fulu11.setBounds(149, 137, 100, 40);
		this.add(fulu11);

		fulu12.setBounds(149, 177, 100, 40);
		this.add(fulu12);

		fulu13.setBounds(149, 217, 100, 40);
		this.add(fulu13);

		fulu15.setBounds(149, 267, 100, 40);
		this.add(fulu15);

		fulu16.setBounds(149, 307, 100, 40);
		this.add(fulu16);

		fulu17.setBounds(149, 347, 100, 40);
		this.add(fulu17);

		fulu18.setBounds(149, 387, 100, 40);
		this.add(fulu18);

		fulu19.setBounds(149, 427, 100, 40);
		this.add(fulu19);

		fulu20.setBounds(149, 467, 100, 40);
		this.add(fulu20);

		fuma20.setBounds(249, 467, 100, 40);
		this.add(fuma20);

		fuma19.setBounds(249, 427, 100, 40);
		this.add(fuma19);

		fuma18.setBounds(249, 387, 100, 40);
		this.add(fuma18);

		fuma17.setBounds(249, 347, 100, 40);
		this.add(fuma17);

		fuma16.setBounds(249, 307, 100, 40);
		this.add(fuma16);

		fuma15.setBounds(249, 267, 100, 40);
		this.add(fuma15);

		fuma13.setBounds(249, 217, 100, 40);
		this.add(fuma13);

		fuma12.setBounds(249, 177, 100, 40);
		this.add(fuma12);

		fuma11.setBounds(249, 137, 100, 40);
		this.add(fuma11);

		fuma10.setBounds(249, 97, 100, 40);
		this.add(fuma10);

		fumi20.setBounds(349, 467, 100, 40);
		this.add(fumi20);

		fumi19.setBounds(349, 427, 100, 40);
		this.add(fumi19);

		fumi18.setBounds(349, 387, 100, 40);
		this.add(fumi18);

		fumi17.setBounds(349, 347, 100, 40);
		this.add(fumi17);

		fumi16.setBounds(349, 307, 100, 40);
		this.add(fumi16);

		fumi15.setBounds(349, 267, 100, 40);
		this.add(fumi15);

		fumi13.setBounds(349, 217, 100, 40);
		this.add(fumi13);

		fumi12.setBounds(349, 177, 100, 40);
		this.add(fumi12);

		fumi11.setBounds(349, 137, 100, 40);
		this.add(fumi11);

		fumi10.setBounds(349, 97, 100, 40);
		this.add(fumi10);

		fuju20.setBounds(449, 467, 100, 40);
		this.add(fuju20);

		fuju19.setBounds(449, 427, 100, 40);
		this.add(fuju19);

		fuju18.setBounds(449, 387, 100, 40);
		this.add(fuju18);

		fuju17.setBounds(449, 347, 100, 40);
		this.add(fuju17);

		fuju16.setBounds(449, 307, 100, 40);
		this.add(fuju16);

		fuju15.setBounds(449, 267, 100, 40);
		this.add(fuju15);

		fuju13.setBounds(449, 217, 100, 40);
		this.add(fuju13);

		fuju12.setBounds(449, 177, 100, 40);
		this.add(fuju12);

		fuju11.setBounds(449, 137, 100, 40);
		this.add(fuju11);

		fuju10.setBounds(449, 97, 100, 40);
		this.add(fuju10);

		fuvi20.setBounds(549, 467, 100, 40);
		this.add(fuvi20);

		fuvi19.setBounds(549, 427, 100, 40);
		this.add(fuvi19);

		fuvi18.setBounds(549, 387, 100, 40);
		this.add(fuvi18);

		fuvi17.setBounds(549, 347, 100, 40);
		this.add(fuvi17);

		fuvi16.setBounds(549, 307, 100, 40);
		this.add(fuvi16);

		fuvi15.setBounds(549, 267, 100, 40);
		this.add(fuvi15);

		fuvi13.setBounds(549, 217, 100, 40);
		this.add(fuvi13);

		fuvi12.setBounds(549, 177, 100, 40);
		this.add(fuvi12);

		fuvi11.setBounds(549, 137, 100, 40);
		this.add(fuvi11);

		fuvi10.setBounds(549, 97, 100, 40);
		this.add(fuvi10);

		fusa20.setBounds(649, 467, 100, 40);
		this.add(fusa20);

		fusa19.setBounds(649, 427, 100, 40);
		this.add(fusa19);

		fusa18.setBounds(649, 387, 100, 40);
		this.add(fusa18);

		fusa17.setBounds(649, 347, 100, 40);
		this.add(fusa17);

		fusa16.setBounds(649, 307, 100, 40);
		this.add(fusa16);

		fusa15.setBounds(649, 267, 100, 40);
		this.add(fusa15);

		fusa13.setBounds(649, 217, 100, 40);
		this.add(fusa13);

		fusa12.setBounds(649, 177, 100, 40);
		this.add(fusa12);

		fusa11.setBounds(649, 137, 100, 40);
		this.add(fusa11);

		fusa10.setBounds(649, 97, 100, 40);
		this.add(fusa10);

		fudo20.setBounds(749, 467, 100, 40);
		this.add(fudo20);

		fudo19.setBounds(749, 427, 100, 40);
		this.add(fudo19);

		fudo18.setBounds(749, 387, 100, 40);
		this.add(fudo18);

		fudo17.setBounds(749, 347, 100, 40);
		this.add(fudo17);

		fudo16.setBounds(749, 307, 100, 40);
		this.add(fudo16);

		fudo15.setBounds(749, 267, 100, 40);
		this.add(fudo15);

		fudo13.setBounds(749, 217, 100, 40);
		this.add(fudo13);

		fudo12.setBounds(749, 177, 100, 40);
		this.add(fudo12);

		fudo11.setBounds(749, 137, 100, 40);
		this.add(fudo11);

		fudo10.setBounds(749, 97, 100, 40);
		this.add(fudo10);

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

		JLabel lblNewLabel_2 = new JLabel("FUTBOL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 46));
		lblNewLabel_2.setBounds(917, 38, 195, 66);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Futbol.class.getResource("/images/futbol.jpg")));
		
		lblNewLabel_3.setBounds(871, 115, 280, 310);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\u00A1Se tu mejor version!");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 20));
		lblNewLabel_4.setBounds(905, 437, 225, 30);
		this.add(lblNewLabel_4);

		// --------------------------------------------ACTION LISTENER-----------------------------------------------------------
		fulu9.addActionListener(this);
		fulu10.addActionListener(this);
		fulu11.addActionListener(this);
		fulu12.addActionListener(this);
		fulu13.addActionListener(this);
		fulu15.addActionListener(this);
		fulu16.addActionListener(this);
		fulu17.addActionListener(this);
		fulu18.addActionListener(this);
		fulu19.addActionListener(this);
		fulu20.addActionListener(this);

		fuma9.addActionListener(this);
		fuma10.addActionListener(this);
		fuma11.addActionListener(this);
		fuma12.addActionListener(this);
		fuma13.addActionListener(this);
		fuma15.addActionListener(this);
		fuma16.addActionListener(this);
		fuma17.addActionListener(this);
		fuma18.addActionListener(this);
		fuma19.addActionListener(this);
		fuma20.addActionListener(this);

		fumi9.addActionListener(this);
		fumi10.addActionListener(this);
		fumi11.addActionListener(this);
		fumi12.addActionListener(this);
		fumi13.addActionListener(this);
		fumi15.addActionListener(this);
		fumi16.addActionListener(this);
		fumi17.addActionListener(this);
		fumi18.addActionListener(this);
		fumi19.addActionListener(this);
		fumi20.addActionListener(this);

		fuju9.addActionListener(this);
		fuju10.addActionListener(this);
		fuju11.addActionListener(this);
		fuju12.addActionListener(this);
		fuju13.addActionListener(this);
		fuju15.addActionListener(this);
		fuju16.addActionListener(this);
		fuju17.addActionListener(this);
		fuju18.addActionListener(this);
		fuju19.addActionListener(this);
		fuju20.addActionListener(this);

		fuvi9.addActionListener(this);
		fuvi10.addActionListener(this);
		fuvi11.addActionListener(this);
		fuvi12.addActionListener(this);
		fuvi13.addActionListener(this);
		fuvi15.addActionListener(this);
		fuvi16.addActionListener(this);
		fuvi17.addActionListener(this);
		fuvi18.addActionListener(this);
		fuvi19.addActionListener(this);
		fuvi20.addActionListener(this);

		fusa9.addActionListener(this);
		fusa10.addActionListener(this);
		fusa11.addActionListener(this);
		fusa12.addActionListener(this);
		fusa13.addActionListener(this);
		fusa15.addActionListener(this);
		fusa16.addActionListener(this);
		fusa17.addActionListener(this);
		fusa18.addActionListener(this);
		fusa19.addActionListener(this);
		fusa20.addActionListener(this);

		fudo9.addActionListener(this);
		fudo10.addActionListener(this);
		fudo11.addActionListener(this);
		fudo12.addActionListener(this);
		fudo13.addActionListener(this);
		fudo15.addActionListener(this);
		fudo16.addActionListener(this);
		fudo17.addActionListener(this);
		fudo18.addActionListener(this);
		fudo19.addActionListener(this);
		fudo20.addActionListener(this);

		// --------------------------------------BUSQUEDA PREVIA DE REGISTROS------------------------------
		// System.out.println("Record is inserted in the table
		// successfully..................");
		ScheduleUser su2 = new ScheduleUser();
		List<String> idList = su2.previus();
		ScheduleUser su3 = new ScheduleUser();
		List<String> nombreList = su3.previus2();
		// System.out.println(nombreList);

		for (int i = 0; i < idList.size(); i++) {
			if (idList.get(i).equals("fulu9")) {
				fulu9.setBackground(Color.RED);
				fulu9.setEnabled(false);
				fulu9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu10")) {
				fulu10.setBackground(Color.RED);
				fulu10.setEnabled(false);
				fulu10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu11")) {
				fulu11.setBackground(Color.RED);
				fulu11.setEnabled(false);
				fulu11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu12")) {
				fulu12.setBackground(Color.RED);
				fulu12.setEnabled(false);
				fulu12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu13")) {
				fulu13.setBackground(Color.RED);
				fulu13.setEnabled(false);
				fulu13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu15")) {
				fulu15.setBackground(Color.RED);
				fulu15.setEnabled(false);
				fulu15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu16")) {
				fulu16.setBackground(Color.RED);
				fulu16.setEnabled(false);
				fulu16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu17")) {
				fulu17.setBackground(Color.RED);
				fulu17.setEnabled(false);
				fulu17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu18")) {
				fulu18.setBackground(Color.RED);
				fulu18.setEnabled(false);
				fulu18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu19")) {
				fulu19.setBackground(Color.RED);
				fulu19.setEnabled(false);
				fulu19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fulu20")) {
				fulu20.setBackground(Color.RED);
				fulu20.setEnabled(false);
				fulu20.setText(nombreList.get(i));

			} else if (idList.get(i).equals("fuma9")) {
				fuma9.setBackground(Color.RED);
				fuma9.setEnabled(false);
				fuma9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma10")) {
				fuma10.setBackground(Color.RED);
				fuma10.setEnabled(false);
				fuma10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma11")) {
				fuma11.setBackground(Color.RED);
				fuma11.setEnabled(false);
				fuma11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma12")) {
				fuma12.setBackground(Color.RED);
				fuma12.setEnabled(false);
				fuma12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma13")) {
				fuma13.setBackground(Color.RED);
				fuma13.setEnabled(false);
				fuma13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma15")) {
				fuma15.setBackground(Color.RED);
				fuma15.setEnabled(false);
				fuma15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma16")) {
				fuma16.setBackground(Color.RED);
				fuma16.setEnabled(false);
				fuma16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma17")) {
				fuma17.setBackground(Color.RED);
				fuma17.setEnabled(false);
				fuma17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma18")) {
				fuma18.setBackground(Color.RED);
				fuma18.setEnabled(false);
				fuma18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma19")) {
				fuma19.setBackground(Color.RED);
				fuma19.setEnabled(false);
				fuma19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuma20")) {
				fuma20.setBackground(Color.RED);
				fuma20.setEnabled(false);
				fuma20.setText(nombreList.get(i));

			} else if (idList.get(i).equals("fumi9")) {
				fumi9.setBackground(Color.RED);
				fumi9.setEnabled(false);
				fumi9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi10")) {
				fumi10.setBackground(Color.RED);
				fumi10.setEnabled(false);
				fumi10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi11")) {
				fumi11.setBackground(Color.RED);
				fumi11.setEnabled(false);
				fumi11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi12")) {
				fumi12.setBackground(Color.RED);
				fumi12.setEnabled(false);
				fumi12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi13")) {
				fumi13.setBackground(Color.RED);
				fumi13.setEnabled(false);
				fumi13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi15")) {
				fumi15.setBackground(Color.RED);
				fumi15.setEnabled(false);
				fumi15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi16")) {
				fumi16.setBackground(Color.RED);
				fumi16.setEnabled(false);
				fumi16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi17")) {
				fumi17.setBackground(Color.RED);
				fumi17.setEnabled(false);
				fumi17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi18")) {
				fumi18.setBackground(Color.RED);
				fumi18.setEnabled(false);
				fumi18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi19")) {
				fumi19.setBackground(Color.RED);
				fumi19.setEnabled(false);
				fumi19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fumi20")) {
				fumi20.setBackground(Color.RED);
				fumi20.setEnabled(false);
				fumi20.setText(nombreList.get(i));

			} else if (idList.get(i).equals("fuju9")) {
				fuju9.setBackground(Color.RED);
				fuju9.setEnabled(false);
				fuju9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju10")) {
				fuju10.setBackground(Color.RED);
				fuju10.setEnabled(false);
				fuju10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju11")) {
				fuju11.setBackground(Color.RED);
				fuju11.setEnabled(false);
				fuju11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju12")) {
				fuju12.setBackground(Color.RED);
				fuju12.setEnabled(false);
				fuju12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju13")) {
				fuju13.setBackground(Color.RED);
				fuju13.setEnabled(false);
				fuju13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju15")) {
				fuju15.setBackground(Color.RED);
				fuju15.setEnabled(false);
				fuju15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju16")) {
				fuju16.setBackground(Color.RED);
				fuju16.setEnabled(false);
				fuju16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju17")) {
				fuju17.setBackground(Color.RED);
				fuju17.setEnabled(false);
				fuju17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju18")) {
				fuju18.setBackground(Color.RED);
				fuju18.setEnabled(false);
				fuju18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju19")) {
				fuju19.setBackground(Color.RED);
				fuju19.setEnabled(false);
				fuju19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuju20")) {
				fuju20.setBackground(Color.RED);
				fuju20.setEnabled(false);
				fuju20.setText(nombreList.get(i));

			} else if (idList.get(i).equals("fuvi9")) {
				fuvi9.setBackground(Color.RED);
				fuvi9.setEnabled(false);
				fuvi9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi10")) {
				fuvi10.setBackground(Color.RED);
				fuvi10.setEnabled(false);
				fuvi10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi11")) {
				fuvi11.setBackground(Color.RED);
				fuvi11.setEnabled(false);
				fuvi11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi12")) {
				fuvi12.setBackground(Color.RED);
				fuvi12.setEnabled(false);
				fuvi12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi13")) {
				fuvi13.setBackground(Color.RED);
				fuvi13.setEnabled(false);
				fuvi13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi15")) {
				fuvi15.setBackground(Color.RED);
				fuvi15.setEnabled(false);
				fuvi15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi16")) {
				fuvi16.setBackground(Color.RED);
				fuvi16.setEnabled(false);
				fuvi16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi17")) {
				fuvi17.setBackground(Color.RED);
				fuvi17.setEnabled(false);
				fuvi17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi18")) {
				fuvi18.setBackground(Color.RED);
				fuvi18.setEnabled(false);
				fuvi18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi19")) {
				fuvi19.setBackground(Color.RED);
				fuvi19.setEnabled(false);
				fuvi19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fuvi20")) {
				fuvi20.setBackground(Color.RED);
				fuvi20.setEnabled(false);
				fuvi20.setText(nombreList.get(i));

			} else if (idList.get(i).equals("fusa9")) {
				fusa9.setBackground(Color.RED);
				fusa9.setEnabled(false);
				fusa9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa10")) {
				fusa10.setBackground(Color.RED);
				fusa10.setEnabled(false);
				fusa10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa11")) {
				fusa11.setBackground(Color.RED);
				fusa11.setEnabled(false);
				fusa11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa12")) {
				fusa12.setBackground(Color.RED);
				fusa12.setEnabled(false);
				fusa12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa13")) {
				fusa13.setBackground(Color.RED);
				fusa13.setEnabled(false);
				fusa13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa15")) {
				fusa15.setBackground(Color.RED);
				fusa15.setEnabled(false);
				fusa15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa16")) {
				fusa16.setBackground(Color.RED);
				fusa16.setEnabled(false);
				fusa16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa17")) {
				fusa17.setBackground(Color.RED);
				fusa17.setEnabled(false);
				fusa17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa18")) {
				fusa18.setBackground(Color.RED);
				fusa18.setEnabled(false);
				fusa18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa19")) {
				fusa19.setBackground(Color.RED);
				fusa19.setEnabled(false);
				fusa19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fusa20")) {
				fusa20.setBackground(Color.RED);
				fusa20.setEnabled(false);
				fusa20.setText(nombreList.get(i));

			} else if (idList.get(i).equals("fudo9")) {
				fudo9.setBackground(Color.RED);
				fudo9.setEnabled(false);
				fudo9.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo10")) {
				fudo10.setBackground(Color.RED);
				fudo10.setEnabled(false);
				fudo10.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo11")) {
				fudo11.setBackground(Color.RED);
				fudo11.setEnabled(false);
				fudo11.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo12")) {
				fudo12.setBackground(Color.RED);
				fudo12.setEnabled(false);
				fudo12.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo13")) {
				fudo13.setBackground(Color.RED);
				fudo13.setEnabled(false);
				fudo13.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo15")) {
				fudo15.setBackground(Color.RED);
				fudo15.setEnabled(false);
				fudo15.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo16")) {
				fudo16.setBackground(Color.RED);
				fudo16.setEnabled(false);
				fudo16.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo17")) {
				fudo17.setBackground(Color.RED);
				fudo17.setEnabled(false);
				fudo17.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo18")) {
				fudo18.setBackground(Color.RED);
				fudo18.setEnabled(false);
				fudo18.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo19")) {
				fudo19.setBackground(Color.RED);
				fudo19.setEnabled(false);
				fudo19.setText(nombreList.get(i));
			} else if (idList.get(i).equals("fudo20")) {
				fudo20.setBackground(Color.RED);
				fudo20.setEnabled(false);
				fudo20.setText(nombreList.get(i));
			}
		}
	}

	//----------------------------------------------------------------------------------------------------
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==this.fulu9) {
				fulu9.setBackground(Color.RED);
				fulu9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu9";
				su.booking(id);
				fulu9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==this.fulu10) {
				fulu10.setBackground(Color.RED);
				fulu10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu10";
				su.booking(id);
				fulu10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==this.fulu11) {
				fulu11.setBackground(Color.RED);
				fulu11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu11";
				su.booking(id);
				fulu11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu12) {
				fulu12.setBackground(Color.RED);
				fulu12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu12";
				su.booking(id);
				fulu12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu13) {
				fulu13.setBackground(Color.RED);
				fulu13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu13";
				su.booking(id);
				fulu13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu15) {
				fulu15.setBackground(Color.RED);
				fulu15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu15";
				su.booking(id);
				fulu15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu16) {
				fulu16.setBackground(Color.RED);
				fulu16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu16";
				su.booking(id);
				fulu16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu17) {
				fulu17.setBackground(Color.RED);
				fulu17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu17";
				su.booking(id);
				fulu17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu18) {
				fulu18.setBackground(Color.RED);
				fulu18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu18";
				su.booking(id);
				fulu18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu19) {
				fulu19.setBackground(Color.RED);
				fulu19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu19";
				su.booking(id);
				fulu19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fulu20) {
				fulu20.setBackground(Color.RED);
				fulu20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fulu20";
				su.booking(id);
				fulu20.setText(System.getProperty("user.name"));
				
				
			}else if (e.getSource()==fuma9) {
				fuma9.setBackground(Color.RED);
				fuma9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma9";
				su.booking(id);
				fuma9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma10) {
				fuma10.setBackground(Color.RED);
				fuma10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma10";
				su.booking(id);
				fuma10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma11) {
				fuma11.setBackground(Color.RED);
				fuma11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma11";
				su.booking(id);
				fuma11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma12) {
				fuma12.setBackground(Color.RED);
				fuma12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma12";
				su.booking(id);
				fuma12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma13) {
				fuma13.setBackground(Color.RED);
				fuma13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma13";
				su.booking(id);
				fuma13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma15) {
				fuma15.setBackground(Color.RED);
				fuma15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma15";
				su.booking(id);
				fuma15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma16) {
				fuma16.setBackground(Color.RED);
				fuma16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma16";
				su.booking(id);
				fuma16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma17) {
				fuma17.setBackground(Color.RED);
				fuma17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma17";
				su.booking(id);
				fuma17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma18) {
				fuma18.setBackground(Color.RED);
				fuma18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma18";
				su.booking(id);
				fuma18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma19) {
				fuma19.setBackground(Color.RED);
				fuma19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma19";
				su.booking(id);
				fuma19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuma20) {
				fuma20.setBackground(Color.RED);
				fuma20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuma20";
				su.booking(id);
				fuma20.setText(System.getProperty("user.name"));
				
				
			}else if (e.getSource()==fumi9) {
				fumi9.setBackground(Color.RED);
				fumi9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi9";
				su.booking(id);
				fumi9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi10) {
				fumi10.setBackground(Color.RED);
				fumi10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi10";
				su.booking(id);
				fumi10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi11) {
				fumi11.setBackground(Color.RED);
				fumi11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi11";
				su.booking(id);
				fumi11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi12) {
				fumi12.setBackground(Color.RED);
				fumi12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi12";
				su.booking(id);
				fumi12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi13) {
				fumi13.setBackground(Color.RED);
				fumi13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi13";
				su.booking(id);
				fumi13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi15) {
				fumi15.setBackground(Color.RED);
				fumi15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi15";
				su.booking(id);
				fumi15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi16) {
				fumi16.setBackground(Color.RED);
				fumi16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi16";
				su.booking(id);
				fumi16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi17) {
				fumi17.setBackground(Color.RED);
				fumi17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi17";
				su.booking(id);
				fumi17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi18) {
				fumi18.setBackground(Color.RED);
				fumi18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi18";
				su.booking(id);
				fumi18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi19) {
				fumi19.setBackground(Color.RED);
				fumi19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi19";
				su.booking(id);
				fumi19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fumi20) {
				fumi20.setBackground(Color.RED);
				fumi20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fumi20";
				su.booking(id);
				fumi20.setText(System.getProperty("user.name"));
				
				
			}else if (e.getSource()==fuju9) {
				fuju9.setBackground(Color.RED);
				fuju9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju9";
				su.booking(id);
				fuju9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju10) {
				fuju10.setBackground(Color.RED);
				fuju10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju10";
				su.booking(id);
				fuju10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju11) {
				fuju11.setBackground(Color.RED);
				fuju11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju11";
				su.booking(id);
				fuju11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju12) {
				fuju12.setBackground(Color.RED);
				fuju12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju12";
				su.booking(id);
				fuju12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju13) {
				fuju13.setBackground(Color.RED);
				fuju13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju13";
				su.booking(id);
				fuju13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju15) {
				fuju15.setBackground(Color.RED);
				fuju15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju15";
				su.booking(id);
				fuju15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju16) {
				fuju16.setBackground(Color.RED);
				fuju16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju16";
				su.booking(id);
				fuju16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju17) {
				fuju17.setBackground(Color.RED);
				fuju17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju17";
				su.booking(id);
				fuju17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju18) {
				fuju18.setBackground(Color.RED);
				fuju18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju18";
				su.booking(id);
				fuju18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju19) {
				fuju19.setBackground(Color.RED);
				fuju19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju19";
				su.booking(id);
				fuju19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuju20) {
				fuju20.setBackground(Color.RED);
				fuju20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuju20";
				su.booking(id);
				fuju20.setText(System.getProperty("user.name"));
				
				
			}else if (e.getSource()==fuvi9) {
				fuvi9.setBackground(Color.RED);
				fuvi9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi9";
				su.booking(id);
				fuvi9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi10) {
				fuvi10.setBackground(Color.RED);
				fuvi10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi10";
				su.booking(id);
				fuvi10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi11) {
				fuvi11.setBackground(Color.RED);
				fuvi11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi11";
				su.booking(id);
				fuvi11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi12) {
				fuvi12.setBackground(Color.RED);
				fuvi12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi12";
				su.booking(id);
				fuvi12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi13) {
				fuvi13.setBackground(Color.RED);
				fuvi13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi13";
				su.booking(id);
				fuvi13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi15) {
				fuvi15.setBackground(Color.RED);
				fuvi15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi15";
				su.booking(id);
				fuvi15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi16) {
				fuvi16.setBackground(Color.RED);
				fuvi16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi16";
				su.booking(id);
				fuvi16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi17) {
				fuvi17.setBackground(Color.RED);
				fuvi17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi17";
				su.booking(id);
				fuvi17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi18) {
				fuvi18.setBackground(Color.RED);
				fuvi18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi18";
				su.booking(id);
				fuvi18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi19) {
				fuvi19.setBackground(Color.RED);
				fuvi19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi19";
				su.booking(id);
				fuvi19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fuvi20) {
				fuvi20.setBackground(Color.RED);
				fuvi20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fuvi20";
				su.booking(id);
				fuvi20.setText(System.getProperty("user.name"));
				
				
			}else if (e.getSource()==fusa9) {
				fusa9.setBackground(Color.RED);
				fusa9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa9";
				su.booking(id);
				fusa9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa10) {
				fusa10.setBackground(Color.RED);
				fusa10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa10";
				su.booking(id);
				fusa10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa11) {
				fusa11.setBackground(Color.RED);
				fusa11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa11";
				su.booking(id);
				fusa11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa12) {
				fusa12.setBackground(Color.RED);
				fusa12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa12";
				su.booking(id);
				fusa12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa13) {
				fusa13.setBackground(Color.RED);
				fusa13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa13";
				su.booking(id);
				fusa13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa15) {
				fusa15.setBackground(Color.RED);
				fusa15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa15";
				su.booking(id);
				fusa15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa16) {
				fusa16.setBackground(Color.RED);
				fusa16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa16";
				su.booking(id);
				fusa16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa17) {
				fusa17.setBackground(Color.RED);
				fusa17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa17";
				su.booking(id);
				fusa17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa18) {
				fusa18.setBackground(Color.RED);
				fusa18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa18";
				su.booking(id);
				fusa18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa19) {
				fusa19.setBackground(Color.RED);
				fusa19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa19";
				su.booking(id);
				fusa19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fusa20) {
				fusa20.setBackground(Color.RED);
				fusa20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fusa20";
				su.booking(id);
				fusa20.setText(System.getProperty("user.name"));
				
				
			}else if (e.getSource()==fudo9) {
				fudo9.setBackground(Color.RED);
				fudo9.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo9";
				su.booking(id);
				fudo9.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo10) {
				fudo10.setBackground(Color.RED);
				fudo10.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo10";
				su.booking(id);
				fudo10.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo11) {
				fudo11.setBackground(Color.RED);
				fudo11.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo11";
				su.booking(id);
				fudo11.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo12) {
				fudo12.setBackground(Color.RED);
				fudo12.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo12";
				su.booking(id);
				fudo12.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo13) {
				fudo13.setBackground(Color.RED);
				fudo13.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo13";
				su.booking(id);
				fudo13.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo15) {
				fudo15.setBackground(Color.RED);
				fudo15.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo15";
				su.booking(id);
				fudo15.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo16) {
				fudo16.setBackground(Color.RED);
				fudo16.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo16";
				su.booking(id);
				fudo16.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo17) {
				fudo17.setBackground(Color.RED);
				fudo17.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo17";
				su.booking(id);
				fudo17.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo18) {
				fudo18.setBackground(Color.RED);
				fudo18.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo18";
				su.booking(id);
				fudo18.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo19) {
				fudo19.setBackground(Color.RED);
				fudo19.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo19";
				su.booking(id);
				fudo19.setText(System.getProperty("user.name"));
			}else if (e.getSource()==fudo20) {
				fudo20.setBackground(Color.RED);
				fudo20.setEnabled(false);
				ScheduleUser su = new ScheduleUser();
				String id = "fudo20";
				su.booking(id);
				fudo20.setText(System.getProperty("user.name"));
						
	        }else {
	        	JOptionPane.showMessageDialog(null, "Error", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }

	}

}
