package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ScheduleUser;

public class Padel2 extends JPanel implements ActionListener {
	

	JButton pa2lu9;
	JButton pa2lu10;
	JButton pa2ma9;
	JButton pa2mi9;
	JButton pa2ju9;
	JButton pa2vi9;
	JButton pa2sa9;
	JButton pa2do9;
	JButton pa2lu11;
	JButton pa2lu12;
	JButton pa2lu13;
	JButton pa2lu15;
	JButton pa2lu16;
	JButton pa2lu17;
	JButton pa2lu18;
	JButton pa2lu19;
	JButton pa2lu20;
	JButton pa2ma20;
	JButton pa2ma19;
	JButton pa2ma18;
	JButton pa2ma17;
	JButton pa2ma16;
	JButton pa2ma15;
	JButton pa2ma13;
	JButton pa2ma12;
	JButton pa2ma11;
	JButton pa2ma10;
	JButton pa2mi20;
	JButton pa2mi19;
	JButton pa2mi18;
	JButton pa2mi17;
	JButton pa2mi16;
	JButton pa2mi15;
	JButton pa2mi13;
	JButton pa2mi12;
	JButton pa2mi11;
	JButton pa2mi10;
	JButton pa2ju20;
	JButton pa2ju19;
	JButton pa2ju18;
	JButton pa2ju17;
	JButton pa2ju16;
	JButton pa2ju15;
	JButton pa2ju13;
	JButton pa2ju12;
	JButton pa2ju11;
	JButton pa2ju10;
	JButton pa2vi20;
	JButton pa2vi19;
	JButton pa2vi18;
	JButton pa2vi17;
	JButton pa2vi16;
	JButton pa2vi15;
	JButton pa2vi13;
	JButton pa2vi12;
	JButton pa2vi11;
	JButton pa2vi10;
	JButton pa2sa20;
	JButton pa2sa19;
	JButton pa2sa18;
	JButton pa2sa17;
	JButton pa2sa16;
	JButton pa2sa15;
	JButton pa2sa13;
	JButton pa2sa12;
	JButton pa2sa11;
	JButton pa2sa10;
	JButton pa2do20;
	JButton pa2do19;
	JButton pa2do18;
	JButton pa2do17;
	JButton pa2do16;
	JButton pa2do15;
	JButton pa2do13;
	JButton pa2do12;
	JButton pa2do11;
	JButton pa2do10;
	JButton btnPista1;
	JButton btnPista2;
	/**
	 * Create the this.
	 */
	public Padel2() {
		setLayout(null);
		// ---------------------------------------------------------CREAR BOTONES--------------------------------------------------
		 pa2lu9 = new JButton("");
		 pa2lu10 = new JButton("");
		 pa2ma9 = new JButton("");
		 pa2mi9 = new JButton("");
		 pa2ju9 = new JButton("");
		 pa2vi9 = new JButton("");
		 pa2sa9 = new JButton("");
		 pa2do9 = new JButton("");
		 pa2lu11 = new JButton("");
		 pa2lu12 = new JButton("");
		 pa2lu13 = new JButton("");
		 pa2lu15 = new JButton("");
		 pa2lu16 = new JButton("");
		 pa2lu17 = new JButton("");
		 pa2lu18 = new JButton("");
		 pa2lu19 = new JButton("");
		 pa2lu20 = new JButton("");
		 pa2ma20 = new JButton("");
		 pa2ma19 = new JButton("");
		 pa2ma18 = new JButton("");
		 pa2ma17 = new JButton("");
		 pa2ma16 = new JButton("");
		 pa2ma15 = new JButton("");
		 pa2ma13 = new JButton("");
		 pa2ma12 = new JButton("");
		 pa2ma11 = new JButton("");
		 pa2ma10 = new JButton("");
		 pa2mi20 = new JButton("");
		 pa2mi19 = new JButton("");
		 pa2mi18 = new JButton("");
		 pa2mi17 = new JButton("");
		 pa2mi16 = new JButton("");
		 pa2mi15 = new JButton("");
		 pa2mi13 = new JButton("");
		 pa2mi12 = new JButton("");
		 pa2mi11 = new JButton("");
		 pa2mi10 = new JButton("");
		 pa2ju20 = new JButton("");
		 pa2ju19 = new JButton("");
		 pa2ju18 = new JButton("");
		 pa2ju17 = new JButton("");
		 pa2ju16 = new JButton("");
		 pa2ju15 = new JButton("");
		 pa2ju13 = new JButton("");
		 pa2ju12 = new JButton("");
		 pa2ju11 = new JButton("");
		 pa2ju10 = new JButton("");
		 pa2vi20 = new JButton("");
		 pa2vi19 = new JButton("");
		 pa2vi18 = new JButton("");
		 pa2vi17 = new JButton("");
		 pa2vi16 = new JButton("");
		 pa2vi15 = new JButton("");
		 pa2vi13 = new JButton("");
		 pa2vi12 = new JButton("");
		 pa2vi11 = new JButton("");
		 pa2vi10 = new JButton("");
		 pa2sa20 = new JButton("");
		 pa2sa19 = new JButton("");
		 pa2sa18 = new JButton("");
		 pa2sa17 = new JButton("");
		 pa2sa16 = new JButton("");
		 pa2sa15 = new JButton("");
		 pa2sa13 = new JButton("");
		 pa2sa12 = new JButton("");
		 pa2sa11 = new JButton("");
		 pa2sa10 = new JButton("");
		 pa2do20 = new JButton("");
		 pa2do19 = new JButton("");
		 pa2do18 = new JButton("");
		 pa2do17 = new JButton("");
		 pa2do16 = new JButton("");
		 pa2do15 = new JButton("");
		 pa2do13 = new JButton("");
		 pa2do12 = new JButton("");
		 pa2do11 = new JButton("");
		 pa2do10 = new JButton("");
		 btnPista1= new JButton("PISTA 1");
		 btnPista2= new JButton("PISTA 2");
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

		pa2lu9.setBounds(149, 57, 100, 40);
		this.add(pa2lu9);

		pa2lu10.setBounds(149, 97, 100, 40);
		this.add(pa2lu10);

		pa2ma9.setBounds(249, 57, 100, 40);
		this.add(pa2ma9);

		pa2mi9.setBounds(349, 57, 100, 40);
		this.add(pa2mi9);

		pa2ju9.setBounds(449, 57, 100, 40);
		this.add(pa2ju9);

		pa2vi9.setBounds(549, 57, 100, 40);
		this.add(pa2vi9);

		pa2sa9.setBounds(649, 57, 100, 40);
		this.add(pa2sa9);

		pa2do9.setBounds(749, 57, 100, 40);
		this.add(pa2do9);

		pa2lu11.setBounds(149, 137, 100, 40);
		this.add(pa2lu11);

		pa2lu12.setBounds(149, 177, 100, 40);
		this.add(pa2lu12);

		pa2lu13.setBounds(149, 217, 100, 40);
		this.add(pa2lu13);

		pa2lu15.setBounds(149, 267, 100, 40);
		this.add(pa2lu15);

		pa2lu16.setBounds(149, 307, 100, 40);
		this.add(pa2lu16);

		pa2lu17.setBounds(149, 347, 100, 40);
		this.add(pa2lu17);

		pa2lu18.setBounds(149, 387, 100, 40);
		this.add(pa2lu18);

		pa2lu19.setBounds(149, 427, 100, 40);
		this.add(pa2lu19);

		pa2lu20.setBounds(149, 467, 100, 40);
		this.add(pa2lu20);

		pa2ma20.setBounds(249, 467, 100, 40);
		this.add(pa2ma20);

		pa2ma19.setBounds(249, 427, 100, 40);
		this.add(pa2ma19);

		pa2ma18.setBounds(249, 387, 100, 40);
		this.add(pa2ma18);

		pa2ma17.setBounds(249, 347, 100, 40);
		this.add(pa2ma17);

		pa2ma16.setBounds(249, 307, 100, 40);
		this.add(pa2ma16);

		pa2ma15.setBounds(249, 267, 100, 40);
		this.add(pa2ma15);

		pa2ma13.setBounds(249, 217, 100, 40);
		this.add(pa2ma13);

		pa2ma12.setBounds(249, 177, 100, 40);
		this.add(pa2ma12);

		pa2ma11.setBounds(249, 137, 100, 40);
		this.add(pa2ma11);

		pa2ma10.setBounds(249, 97, 100, 40);
		this.add(pa2ma10);

		pa2mi20.setBounds(349, 467, 100, 40);
		this.add(pa2mi20);

		pa2mi19.setBounds(349, 427, 100, 40);
		this.add(pa2mi19);

		pa2mi18.setBounds(349, 387, 100, 40);
		this.add(pa2mi18);

		pa2mi17.setBounds(349, 347, 100, 40);
		this.add(pa2mi17);

		pa2mi16.setBounds(349, 307, 100, 40);
		this.add(pa2mi16);

		pa2mi15.setBounds(349, 267, 100, 40);
		this.add(pa2mi15);

		pa2mi13.setBounds(349, 217, 100, 40);
		this.add(pa2mi13);

		pa2mi12.setBounds(349, 177, 100, 40);
		this.add(pa2mi12);

		pa2mi11.setBounds(349, 137, 100, 40);
		this.add(pa2mi11);

		pa2mi10.setBounds(349, 97, 100, 40);
		this.add(pa2mi10);

		pa2ju20.setBounds(449, 467, 100, 40);
		this.add(pa2ju20);

		pa2ju19.setBounds(449, 427, 100, 40);
		this.add(pa2ju19);

		pa2ju18.setBounds(449, 387, 100, 40);
		this.add(pa2ju18);

		pa2ju17.setBounds(449, 347, 100, 40);
		this.add(pa2ju17);

		pa2ju16.setBounds(449, 307, 100, 40);
		this.add(pa2ju16);

		pa2ju15.setBounds(449, 267, 100, 40);
		this.add(pa2ju15);

		pa2ju13.setBounds(449, 217, 100, 40);
		this.add(pa2ju13);

		pa2ju12.setBounds(449, 177, 100, 40);
		this.add(pa2ju12);

		pa2ju11.setBounds(449, 137, 100, 40);
		this.add(pa2ju11);

		pa2ju10.setBounds(449, 97, 100, 40);
		this.add(pa2ju10);

		pa2vi20.setBounds(549, 467, 100, 40);
		this.add(pa2vi20);

		pa2vi19.setBounds(549, 427, 100, 40);
		this.add(pa2vi19);

		pa2vi18.setBounds(549, 387, 100, 40);
		this.add(pa2vi18);

		pa2vi17.setBounds(549, 347, 100, 40);
		this.add(pa2vi17);

		pa2vi16.setBounds(549, 307, 100, 40);
		this.add(pa2vi16);

		pa2vi15.setBounds(549, 267, 100, 40);
		this.add(pa2vi15);

		pa2vi13.setBounds(549, 217, 100, 40);
		this.add(pa2vi13);

		pa2vi12.setBounds(549, 177, 100, 40);
		this.add(pa2vi12);

		pa2vi11.setBounds(549, 137, 100, 40);
		this.add(pa2vi11);

		pa2vi10.setBounds(549, 97, 100, 40);
		this.add(pa2vi10);

		pa2sa20.setBounds(649, 467, 100, 40);
		this.add(pa2sa20);

		pa2sa19.setBounds(649, 427, 100, 40);
		this.add(pa2sa19);

		pa2sa18.setBounds(649, 387, 100, 40);
		this.add(pa2sa18);

		pa2sa17.setBounds(649, 347, 100, 40);
		this.add(pa2sa17);

		pa2sa16.setBounds(649, 307, 100, 40);
		this.add(pa2sa16);

		pa2sa15.setBounds(649, 267, 100, 40);
		this.add(pa2sa15);

		pa2sa13.setBounds(649, 217, 100, 40);
		this.add(pa2sa13);

		pa2sa12.setBounds(649, 177, 100, 40);
		this.add(pa2sa12);

		pa2sa11.setBounds(649, 137, 100, 40);
		this.add(pa2sa11);

		pa2sa10.setBounds(649, 97, 100, 40);
		this.add(pa2sa10);

		pa2do20.setBounds(749, 467, 100, 40);
		this.add(pa2do20);

		pa2do19.setBounds(749, 427, 100, 40);
		this.add(pa2do19);

		pa2do18.setBounds(749, 387, 100, 40);
		this.add(pa2do18);

		pa2do17.setBounds(749, 347, 100, 40);
		this.add(pa2do17);

		pa2do16.setBounds(749, 307, 100, 40);
		this.add(pa2do16);

		pa2do15.setBounds(749, 267, 100, 40);
		this.add(pa2do15);

		pa2do13.setBounds(749, 217, 100, 40);
		this.add(pa2do13);

		pa2do12.setBounds(749, 177, 100, 40);
		this.add(pa2do12);

		pa2do11.setBounds(749, 137, 100, 40);
		this.add(pa2do11);

		pa2do10.setBounds(749, 97, 100, 40);
		this.add(pa2do10);

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
		lblNewLabel_2.setBounds(917, 38, 195, 66);
		this.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Padel1.class.getResource("/images/padel.jpg")));
		
		lblNewLabel_3.setBounds(871, 115, 280, 310);
		this.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\u00A1Se tu mejor version!");
		lblNewLabel_4.setFont(new Font("Verdana", Font.ITALIC, 20));
		lblNewLabel_4.setBounds(905, 437, 225, 30);
		this.add(lblNewLabel_4);
		
		btnPista1.setBounds(900, 100, 100, 30);
		add(btnPista1);
	
		btnPista2.setBounds(1011, 100, 100, 30);
		add(btnPista2);

		// --------------------------------------------ACTION LISTENER-----------------------------------------------------------
		pa2lu9.addActionListener(this);
		pa2lu10.addActionListener(this);
		pa2lu11.addActionListener(this);
		pa2lu12.addActionListener(this);
		pa2lu13.addActionListener(this);
		pa2lu15.addActionListener(this);
		pa2lu16.addActionListener(this);
		pa2lu17.addActionListener(this);
		pa2lu18.addActionListener(this);
		pa2lu19.addActionListener(this);
		pa2lu20.addActionListener(this);

		pa2ma9.addActionListener(this);
		pa2ma10.addActionListener(this);
		pa2ma11.addActionListener(this);
		pa2ma12.addActionListener(this);
		pa2ma13.addActionListener(this);
		pa2ma15.addActionListener(this);
		pa2ma16.addActionListener(this);
		pa2ma17.addActionListener(this);
		pa2ma18.addActionListener(this);
		pa2ma19.addActionListener(this);
		pa2ma20.addActionListener(this);

		pa2mi9.addActionListener(this);
		pa2mi10.addActionListener(this);
		pa2mi11.addActionListener(this);
		pa2mi12.addActionListener(this);
		pa2mi13.addActionListener(this);
		pa2mi15.addActionListener(this);
		pa2mi16.addActionListener(this);
		pa2mi17.addActionListener(this);
		pa2mi18.addActionListener(this);
		pa2mi19.addActionListener(this);
		pa2mi20.addActionListener(this);

		pa2ju9.addActionListener(this);
		pa2ju10.addActionListener(this);
		pa2ju11.addActionListener(this);
		pa2ju12.addActionListener(this);
		pa2ju13.addActionListener(this);
		pa2ju15.addActionListener(this);
		pa2ju16.addActionListener(this);
		pa2ju17.addActionListener(this);
		pa2ju18.addActionListener(this);
		pa2ju19.addActionListener(this);
		pa2ju20.addActionListener(this);

		pa2vi9.addActionListener(this);
		pa2vi10.addActionListener(this);
		pa2vi11.addActionListener(this);
		pa2vi12.addActionListener(this);
		pa2vi13.addActionListener(this);
		pa2vi15.addActionListener(this);
		pa2vi16.addActionListener(this);
		pa2vi17.addActionListener(this);
		pa2vi18.addActionListener(this);
		pa2vi19.addActionListener(this);
		pa2vi20.addActionListener(this);

		pa2sa9.addActionListener(this);
		pa2sa10.addActionListener(this);
		pa2sa11.addActionListener(this);
		pa2sa12.addActionListener(this);
		pa2sa13.addActionListener(this);
		pa2sa15.addActionListener(this);
		pa2sa16.addActionListener(this);
		pa2sa17.addActionListener(this);
		pa2sa18.addActionListener(this);
		pa2sa19.addActionListener(this);
		pa2sa20.addActionListener(this);

		pa2do9.addActionListener(this);
		pa2do10.addActionListener(this);
		pa2do11.addActionListener(this);
		pa2do12.addActionListener(this);
		pa2do13.addActionListener(this);
		pa2do15.addActionListener(this);
		pa2do16.addActionListener(this);
		pa2do17.addActionListener(this);
		pa2do18.addActionListener(this);
		pa2do19.addActionListener(this);
		pa2do20.addActionListener(this);
		
		btnPista1.addActionListener(this);
		btnPista2.addActionListener(this);
		// --------------------------------------BUSQUEDA PREVIA HUECOS LIBRES------------------------------
		
		ScheduleUser su = new ScheduleUser();
		int contlu9 = su.contPadel("lu9");
		pa2lu9.setText("Plazas libres:"+ (4-contlu9));
		int contlu10 = su.contPadel("lu10");
		pa2lu10.setText("Plazas libres:"+ (4-contlu10));
		int contlu11 = su.contPadel("lu11");
		pa2lu11.setText("Plazas libres:"+ (4-contlu11));
		int contlu12 = su.contPadel("lu12");
		pa2lu12.setText("Plazas libres:"+ (4-contlu12));
		int contlu13 = su.contPadel("lu13");
		pa2lu13.setText("Plazas libres:"+ (4-contlu13));
		int contlu15 = su.contPadel("lu15");
		pa2lu15.setText("Plazas libres:"+ (4-contlu15));
		int contlu16 = su.contPadel("lu16");
		pa2lu16.setText("Plazas libres:"+ (4-contlu16));
		int contlu17 = su.contPadel("lu17");
		pa2lu17.setText("Plazas libres:"+ (4-contlu17));
		int contlu18 = su.contPadel("lu18");
		pa2lu18.setText("Plazas libres:"+ (4-contlu18));
		int contlu19 = su.contPadel("lu19");
		pa2lu19.setText("Plazas libres:"+ (4-contlu19));
		int contlu20 = su.contPadel("lu20");
		pa2lu20.setText("Plazas libres:"+ (4-contlu20));
		
		int contma9 = su.contPadel("ma9");
		pa2ma9.setText("Plazas libres:"+ (4-contma9));
		int contma10 = su.contPadel("ma10");
		pa2ma10.setText("Plazas libres:"+ (4-contma10));
		int contma11 = su.contPadel("ma11");
		pa2ma11.setText("Plazas libres:"+ (4-contma11));
		int contma12 = su.contPadel("ma12");
		pa2ma12.setText("Plazas libres:"+ (4-contma12));
		int contma13 = su.contPadel("ma13");
		pa2ma13.setText("Plazas libres:"+ (4-contma13));
		int contma15 = su.contPadel("ma15");
		pa2ma15.setText("Plazas libres:"+ (4-contma15));
		int contma16 = su.contPadel("ma16");
		pa2ma16.setText("Plazas libres:"+ (4-contma16));
		int contma17 = su.contPadel("ma17");
		pa2ma17.setText("Plazas libres:"+ (4-contma17));
		int contma18 = su.contPadel("ma18");
		pa2ma18.setText("Plazas libres:"+ (4-contma18));
		int contma19 = su.contPadel("ma19");
		pa2ma19.setText("Plazas libres:"+ (4-contma19));
		int contma20 = su.contPadel("ma20");
		pa2ma20.setText("Plazas libres:"+ (4-contma20));
		
		int contmi9 = su.contPadel("mi9");
		pa2mi9.setText("Plazas libres:"+ (4-contmi9));
		int contmi10 = su.contPadel("mi10");
		pa2mi10.setText("Plazas libres:"+ (4-contmi10));
		int contmi11 = su.contPadel("mi11");
		pa2mi11.setText("Plazas libres:"+ (4-contmi11));
		int contmi12 = su.contPadel("mi12");
		pa2mi12.setText("Plazas libres:"+ (4-contmi12));
		int contmi13 = su.contPadel("mi13");
		pa2mi13.setText("Plazas libres:"+ (4-contmi13));
		int contmi15 = su.contPadel("mi15");
		pa2mi15.setText("Plazas libres:"+ (4-contmi15));
		int contmi16 = su.contPadel("mi16");
		pa2mi16.setText("Plazas libres:"+ (4-contmi16));
		int contmi17 = su.contPadel("mi17");
		pa2mi17.setText("Plazas libres:"+ (4-contmi17));
		int contmi18 = su.contPadel("mi18");
		pa2mi18.setText("Plazas libres:"+ (4-contmi18));
		int contmi19 = su.contPadel("mi19");
		pa2mi19.setText("Plazas libres:"+ (4-contmi19));
		int contmi20 = su.contPadel("mi20");
		pa2mi20.setText("Plazas libres:"+ (4-contmi20));
		
		int contju9 = su.contPadel("ju9");
		pa2ju9.setText("Plazas libres:"+ (4-contju9));
		int contju10 = su.contPadel("ju10");
		pa2ju10.setText("Plazas libres:"+ (4-contju10));
		int contju11 = su.contPadel("ju11");
		pa2ju11.setText("Plazas libres:"+ (4-contju11));
		int contju12 = su.contPadel("ju12");
		pa2ju12.setText("Plazas libres:"+ (4-contju12));
		int contju13 = su.contPadel("ju13");
		pa2ju13.setText("Plazas libres:"+ (4-contju13));
		int contju15 = su.contPadel("ju15");
		pa2ju15.setText("Plazas libres:"+ (4-contju15));
		int contju16 = su.contPadel("ju16");
		pa2ju16.setText("Plazas libres:"+ (4-contju16));
		int contju17 = su.contPadel("ju17");
		pa2ju17.setText("Plazas libres:"+ (4-contju17));
		int contju18 = su.contPadel("ju18");
		pa2ju18.setText("Plazas libres:"+ (4-contju18));
		int contju19 = su.contPadel("ju19");
		pa2ju19.setText("Plazas libres:"+ (4-contju19));
		int contju20 = su.contPadel("ju20");
		pa2ju20.setText("Plazas libres:"+ (4-contju20));
		
		int contvi9 = su.contPadel("vi9");
		pa2vi9.setText("Plazas libres:"+ (4-contvi9));
		int contvi10 = su.contPadel("vi10");
		pa2vi10.setText("Plazas libres:"+ (4-contvi10));
		int contvi11 = su.contPadel("vi11");
		pa2vi11.setText("Plazas libres:"+ (4-contvi11));
		int contvi12 = su.contPadel("vi12");
		pa2vi12.setText("Plazas libres:"+ (4-contvi12));
		int contvi13 = su.contPadel("vi13");
		pa2vi13.setText("Plazas libres:"+ (4-contvi13));
		int contvi15 = su.contPadel("vi15");
		pa2vi15.setText("Plazas libres:"+ (4-contvi15));
		int contvi16 = su.contPadel("vi16");
		pa2vi16.setText("Plazas libres:"+ (4-contvi16));
		int contvi17 = su.contPadel("vi17");
		pa2vi17.setText("Plazas libres:"+ (4-contvi17));
		int contvi18 = su.contPadel("vi18");
		pa2vi18.setText("Plazas libres:"+ (4-contvi18));
		int contvi19 = su.contPadel("vi19");
		pa2vi19.setText("Plazas libres:"+ (4-contvi19));
		int contvi20 = su.contPadel("vi20");
		pa2vi20.setText("Plazas libres:"+ (4-contvi20));
	
		int contsa9 = su.contPadel("sa9");
		pa2sa9.setText("Plazas libres:"+ (4-contsa9));
		int contsa10 = su.contPadel("sa10");
		pa2sa10.setText("Plazas libres:"+ (4-contsa10));
		int contsa11 = su.contPadel("sa11");
		pa2sa11.setText("Plazas libres:"+ (4-contsa11));
		int contsa12 = su.contPadel("sa12");
		pa2sa12.setText("Plazas libres:"+ (4-contsa12));
		int contsa13 = su.contPadel("sa13");
		pa2sa13.setText("Plazas libres:"+ (4-contsa13));
		int contsa15 = su.contPadel("sa15");
		pa2sa15.setText("Plazas libres:"+ (4-contsa15));
		int contsa16 = su.contPadel("sa16");
		pa2sa16.setText("Plazas libres:"+ (4-contsa16));
		int contsa17 = su.contPadel("sa17");
		pa2sa17.setText("Plazas libres:"+ (4-contsa17));
		int contsa18 = su.contPadel("sa18");
		pa2sa18.setText("Plazas libres:"+ (4-contsa18));
		int contsa19 = su.contPadel("sa19");
		pa2sa19.setText("Plazas libres:"+ (4-contsa19));
		int contsa20 = su.contPadel("sa20");
		pa2sa20.setText("Plazas libres:"+ (4-contsa20));
		
		int contdo9 = su.contPadel("do9");
		pa2do9.setText("Plazas libres:"+ (4-contdo9));
		int contdo10 = su.contPadel("do10");
		pa2do10.setText("Plazas libres:"+ (4-contdo10));
		int contdo11 = su.contPadel("do11");
		pa2do11.setText("Plazas libres:"+ (4-contdo11));
		int contdo12 = su.contPadel("do12");
		pa2do12.setText("Plazas libres:"+ (4-contdo12));
		int contdo13 = su.contPadel("do13");
		pa2do13.setText("Plazas libres:"+ (4-contdo13));
		int contdo15 = su.contPadel("do15");
		pa2do15.setText("Plazas libres:"+ (4-contdo15));
		int contdo16 = su.contPadel("do16");
		pa2do16.setText("Plazas libres:"+ (4-contdo16));
		int contdo17 = su.contPadel("do17");
		pa2do17.setText("Plazas libres:"+ (4-contdo17));
		int contdo18 = su.contPadel("do18");
		pa2do18.setText("Plazas libres:"+ (4-contdo18));
		int contdo19 = su.contPadel("do19");
		pa2do19.setText("Plazas libres:"+ (4-contdo19));
		int contdo20 = su.contPadel("do20");
		pa2do20.setText("Plazas libres:"+ (4-contdo20));
	}

	//---------------------------------------------------------------------------------------------------------------------------------
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==this.pa2lu9) {
				JTextField field1 = new JTextField();
				JTextField field2 = new JTextField();
				JTextField field3 = new JTextField();
				JTextField field4 = new JTextField();

				ScheduleUser su2 = new ScheduleUser();
				List<String> idList = su2.previus();
				ScheduleUser su3 = new ScheduleUser();
				List<String> nombreList = su3.previus2();

				for (int i = 0; i < idList.size(); i++) {
					if (idList.get(i).equals("pa21lu9")) {
						field1.setText(nombreList.get(i));
						field1.setEditable(false);
					} else if (idList.get(i).equals("pa22lu9")) {
						field2.setText(nombreList.get(i));
						field2.setEditable(false);
					} else if (idList.get(i).equals("pa23lu9")) {
						field3.setText(nombreList.get(i));
						field3.setEditable(false);
					} else if (idList.get(i).equals("pa24lu9")) {
						field4.setText(nombreList.get(i));
						field4.setEditable(false);
					}
				}
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
					if (field1.isEditable()==true && !jugador1.isBlank()) {
					    String id = "pa21lu9";
					    su2.bookingPadel(id, jugador1);
					}
					if (field2.isEditable()==true && !jugador2.isBlank()) {
					    String id = "pa22lu9";
					    su2.bookingPadel(id, jugador2);
					} 
					if (field3.isEditable()==true && !jugador3.isBlank()) {
					    String id = "pa23lu9";
					    su2.bookingPadel(id, jugador3);
					} 
					if (field4.isEditable()==true && !jugador4.isBlank()) {
					    String id = "pa24lu9";
					    su2.bookingPadel(id, jugador4);
					} 

				}			
				//-----------------------------------------------------------------------
			} else if (e.getSource()==this.pa2lu10) {
				
				JTextField field1 = new JTextField();
				JTextField field2 = new JTextField();
				JTextField field3 = new JTextField();
				JTextField field4 = new JTextField();

				ScheduleUser su2 = new ScheduleUser();
				List<String> idList = su2.previus();
				ScheduleUser su3 = new ScheduleUser();
				List<String> nombreList = su3.previus2();

				for (int i = 0; i < idList.size(); i++) {
					if (idList.get(i).equals("pa21lu10")) {
						field1.setText(nombreList.get(i));
						field1.setEditable(false);
					} else if (idList.get(i).equals("pa22lu10")) {
						field2.setText(nombreList.get(i));
						field2.setEditable(false);
					} else if (idList.get(i).equals("pa23lu10")) {
						field3.setText(nombreList.get(i));
						field3.setEditable(false);
					} else if (idList.get(i).equals("pa24lu10")) {
						field4.setText(nombreList.get(i));
						field4.setEditable(false);
					}
				}
				//-------------------------------------
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
					if (field1.isEditable()==true && !jugador1.isBlank()) {
					    String id = "pa21lu10";
					    su2.bookingPadel(id, jugador1);
					}
					if (field2.isEditable()==true && !jugador2.isBlank()) {
					    String id = "pa22lu10";
					    su2.bookingPadel(id, jugador2);
					} 
					if (field3.isEditable()==true && !jugador3.isBlank()) {
					    String id = "pa23lu10";
					    su2.bookingPadel(id, jugador3);
					} 
					if (field4.isEditable()==true && !jugador4.isBlank()) {
					    String id = "pa24lu10";
					    su2.bookingPadel(id, jugador4);
					} 

				}			
				} else if (e.getSource()==this.pa2lu11) {
				
				JTextField field1 = new JTextField();
				JTextField field2 = new JTextField();
				JTextField field3 = new JTextField();
				JTextField field4 = new JTextField();

				ScheduleUser su2 = new ScheduleUser();
				List<String> idList = su2.previus();
				ScheduleUser su3 = new ScheduleUser();
				List<String> nombreList = su3.previus2();

				for (int i = 0; i < idList.size(); i++) {
					if (idList.get(i).equals("pa21lu11")) {
						field1.setText(nombreList.get(i));
						field1.setEditable(false);
					} else if (idList.get(i).equals("pa22lu11")) {
						field2.setText(nombreList.get(i));
						field2.setEditable(false);
					} else if (idList.get(i).equals("pa23lu11")) {
						field3.setText(nombreList.get(i));
						field3.setEditable(false);
					} else if (idList.get(i).equals("pa24lu11")) {
						field4.setText(nombreList.get(i));
						field4.setEditable(false);
					}
				}
				//-------------------------------------
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
					if (field1.isEditable()==true && !jugador1.isBlank()) {
					    String id = "pa21lu11";
					    su2.bookingPadel(id, jugador1);
					}
					if (field2.isEditable()==true && !jugador2.isBlank()) {
					    String id = "pa22lu11";
					    su2.bookingPadel(id, jugador2);
					} 
					if (field3.isEditable()==true && !jugador3.isBlank()) {
					    String id = "pa23lu11";
					    su2.bookingPadel(id, jugador3);
					} 
					if (field4.isEditable()==true && !jugador4.isBlank()) {
					    String id = "pa24lu11";
					    su2.bookingPadel(id, jugador4);
					} 

				}
				} else if (e.getSource()==this.pa2lu12) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu12")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu12")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu12")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu12")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu12";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu12";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu12";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu12";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu13) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu13")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu13")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu13")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu13")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu13";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu13";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu13";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu13";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu15) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu15")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu15")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu15")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu15")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu15";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu15";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu15";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu15";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu16) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu16")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu16")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu16")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu16")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu16";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu16";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu16";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu16";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu17) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu17")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu17")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu17")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu17")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu17";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu17";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu17";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu17";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu18) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu18")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu18")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu18")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu18")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu18";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu18";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu18";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu18";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu19) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu19")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu19")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu19")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu19")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu19";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu19";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu19";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu19";
						    su2.bookingPadel(id, jugador4);
						} 

					}
				} else if (e.getSource()==this.pa2lu20) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21lu20")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22lu20")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23lu20")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24lu20")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21lu20";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22lu20";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23lu20";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24lu20";
						    su2.bookingPadel(id, jugador4);
						} 

					}
			//**************************MARTEEEEEEES********************************	
				} else if (e.getSource()==this.pa2ma9) {
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21ma9")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22ma9")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23ma9")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24ma9")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21ma9";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22ma9";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23ma9";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24ma9";
						    su2.bookingPadel(id, jugador4);
						} 

					}			
					//-----------------------------------------------------------------------
				} else if (e.getSource()==this.pa2ma10) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21ma10")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22ma10")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23ma10")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24ma10")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21ma10";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22ma10";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23ma10";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24ma10";
						    su2.bookingPadel(id, jugador4);
						} 

					}			
					} else if (e.getSource()==this.pa2ma11) {
					
					JTextField field1 = new JTextField();
					JTextField field2 = new JTextField();
					JTextField field3 = new JTextField();
					JTextField field4 = new JTextField();

					ScheduleUser su2 = new ScheduleUser();
					List<String> idList = su2.previus();
					ScheduleUser su3 = new ScheduleUser();
					List<String> nombreList = su3.previus2();

					for (int i = 0; i < idList.size(); i++) {
						if (idList.get(i).equals("pa21ma11")) {
							field1.setText(nombreList.get(i));
							field1.setEditable(false);
						} else if (idList.get(i).equals("pa22ma11")) {
							field2.setText(nombreList.get(i));
							field2.setEditable(false);
						} else if (idList.get(i).equals("pa23ma11")) {
							field3.setText(nombreList.get(i));
							field3.setEditable(false);
						} else if (idList.get(i).equals("pa24ma11")) {
							field4.setText(nombreList.get(i));
							field4.setEditable(false);
						}
					}
					//-------------------------------------
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
						if (field1.isEditable()==true && !jugador1.isBlank()) {
						    String id = "pa21ma11";
						    su2.bookingPadel(id, jugador1);
						}
						if (field2.isEditable()==true && !jugador2.isBlank()) {
						    String id = "pa22ma11";
						    su2.bookingPadel(id, jugador2);
						} 
						if (field3.isEditable()==true && !jugador3.isBlank()) {
						    String id = "pa23ma11";
						    su2.bookingPadel(id, jugador3);
						} 
						if (field4.isEditable()==true && !jugador4.isBlank()) {
						    String id = "pa24ma11";
						    su2.bookingPadel(id, jugador4);
						} 

					}
					} else if (e.getSource()==this.pa2ma12) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma12")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma12")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma12")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma12")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma12";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma12";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma12";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma12";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma13) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma13")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma13")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma13")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma13")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma13";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma13";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma13";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma13";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma15) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma15")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma15")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma15")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma15")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma15";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma15";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma15";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma15";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma16) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma16")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma16")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma16")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma16")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma16";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma16";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma16";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma16";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma17) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma17")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma17")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma17")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma17")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma17";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma17";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma17";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma17";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma18) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma18")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma18")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma18")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma18")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma18";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma18";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma18";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma18";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma19) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma19")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma19")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma19")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma19")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma19";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma19";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma19";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma19";
							    su2.bookingPadel(id, jugador4);
							} 

						}
					} else if (e.getSource()==this.pa2ma20) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21ma20")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22ma20")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23ma20")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24ma20")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21ma20";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22ma20";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23ma20";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24ma20";
							    su2.bookingPadel(id, jugador4);
							} 

						}
			//*******************************************************************************
					} else if (e.getSource()==this.pa2mi9) {
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21mi9")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22mi9")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23mi9")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24mi9")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21mi9";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22mi9";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23mi9";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24mi9";
							    su2.bookingPadel(id, jugador4);
							} 

						}			
						//-----------------------------------------------------------------------
					} else if (e.getSource()==this.pa2mi10) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21mi10")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22mi10")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23mi10")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24mi10")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21mi10";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22mi10";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23mi10";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24mi10";
							    su2.bookingPadel(id, jugador4);
							} 

						}			
						} else if (e.getSource()==this.pa2mi11) {
						
						JTextField field1 = new JTextField();
						JTextField field2 = new JTextField();
						JTextField field3 = new JTextField();
						JTextField field4 = new JTextField();

						ScheduleUser su2 = new ScheduleUser();
						List<String> idList = su2.previus();
						ScheduleUser su3 = new ScheduleUser();
						List<String> nombreList = su3.previus2();

						for (int i = 0; i < idList.size(); i++) {
							if (idList.get(i).equals("pa21mi11")) {
								field1.setText(nombreList.get(i));
								field1.setEditable(false);
							} else if (idList.get(i).equals("pa22mi11")) {
								field2.setText(nombreList.get(i));
								field2.setEditable(false);
							} else if (idList.get(i).equals("pa23mi11")) {
								field3.setText(nombreList.get(i));
								field3.setEditable(false);
							} else if (idList.get(i).equals("pa24mi11")) {
								field4.setText(nombreList.get(i));
								field4.setEditable(false);
							}
						}
						//-------------------------------------
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
							if (field1.isEditable()==true && !jugador1.isBlank()) {
							    String id = "pa21mi11";
							    su2.bookingPadel(id, jugador1);
							}
							if (field2.isEditable()==true && !jugador2.isBlank()) {
							    String id = "pa22mi11";
							    su2.bookingPadel(id, jugador2);
							} 
							if (field3.isEditable()==true && !jugador3.isBlank()) {
							    String id = "pa23mi11";
							    su2.bookingPadel(id, jugador3);
							} 
							if (field4.isEditable()==true && !jugador4.isBlank()) {
							    String id = "pa24mi11";
							    su2.bookingPadel(id, jugador4);
							} 

						}
						} else if (e.getSource()==this.pa2mi12) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi12")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi12")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi12")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi12")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi12";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi12";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi12";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi12";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi13) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi13")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi13")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi13")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi13")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi13";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi13";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi13";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi13";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi15) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi15")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi15")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi15")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi15")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi15";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi15";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi15";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi15";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi16) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi16")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi16")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi16")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi16")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi16";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi16";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi16";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi16";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi17) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi17")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi17")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi17")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi17")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi17";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi17";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi17";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi17";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi18) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi18")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi18")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi18")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi18")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi18";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi18";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi18";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi18";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi19) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi19")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi19")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi19")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi19")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi19";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi19";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi19";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi19";
								    su2.bookingPadel(id, jugador4);
								} 

							}
						} else if (e.getSource()==this.pa2mi20) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21mi20")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22mi20")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23mi20")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24mi20")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21mi20";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22mi20";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23mi20";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24mi20";
								    su2.bookingPadel(id, jugador4);
								} 

							}
				//**********************************************************************
						} else if (e.getSource()==this.pa2ju9) {
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21ju9")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22ju9")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23ju9")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24ju9")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21ju9";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22ju9";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23ju9";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24ju9";
								    su2.bookingPadel(id, jugador4);
								} 

							}			
							//-----------------------------------------------------------------------
						} else if (e.getSource()==this.pa2ju10) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21ju10")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22ju10")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23ju10")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24ju10")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21ju10";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22ju10";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23ju10";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24ju10";
								    su2.bookingPadel(id, jugador4);
								} 

							}			
							} else if (e.getSource()==this.pa2ju11) {
							
							JTextField field1 = new JTextField();
							JTextField field2 = new JTextField();
							JTextField field3 = new JTextField();
							JTextField field4 = new JTextField();

							ScheduleUser su2 = new ScheduleUser();
							List<String> idList = su2.previus();
							ScheduleUser su3 = new ScheduleUser();
							List<String> nombreList = su3.previus2();

							for (int i = 0; i < idList.size(); i++) {
								if (idList.get(i).equals("pa21ju11")) {
									field1.setText(nombreList.get(i));
									field1.setEditable(false);
								} else if (idList.get(i).equals("pa22ju11")) {
									field2.setText(nombreList.get(i));
									field2.setEditable(false);
								} else if (idList.get(i).equals("pa23ju11")) {
									field3.setText(nombreList.get(i));
									field3.setEditable(false);
								} else if (idList.get(i).equals("pa24ju11")) {
									field4.setText(nombreList.get(i));
									field4.setEditable(false);
								}
							}
							//-------------------------------------
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
								if (field1.isEditable()==true && !jugador1.isBlank()) {
								    String id = "pa21ju11";
								    su2.bookingPadel(id, jugador1);
								}
								if (field2.isEditable()==true && !jugador2.isBlank()) {
								    String id = "pa22ju11";
								    su2.bookingPadel(id, jugador2);
								} 
								if (field3.isEditable()==true && !jugador3.isBlank()) {
								    String id = "pa23ju11";
								    su2.bookingPadel(id, jugador3);
								} 
								if (field4.isEditable()==true && !jugador4.isBlank()) {
								    String id = "pa24ju11";
								    su2.bookingPadel(id, jugador4);
								} 

							}
							} else if (e.getSource()==this.pa2ju12) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju12")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju12")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju12")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju12")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju12";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju12";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju12";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju12";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju13) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju13")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju13")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju13")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju13")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju13";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju13";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju13";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju13";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju15) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju15")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju15")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju15")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju15")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju15";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju15";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju15";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju15";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju16) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju16")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju16")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju16")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju16")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju16";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju16";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju16";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju16";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju17) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju17")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju17")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju17")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju17")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju17";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju17";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju17";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju17";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju18) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju18")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju18")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju18")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju18")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju18";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju18";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju18";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju18";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju19) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju19")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju19")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju19")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju19")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju19";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju19";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju19";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju19";
									    su2.bookingPadel(id, jugador4);
									} 

								}
							} else if (e.getSource()==this.pa2ju20) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21ju20")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22ju20")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23ju20")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24ju20")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21ju20";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22ju20";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23ju20";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24ju20";
									    su2.bookingPadel(id, jugador4);
									} 

								}
					//***********************************************************************
							} else if (e.getSource()==this.pa2vi9) {
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21vi9")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22vi9")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23vi9")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24vi9")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21vi9";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22vi9";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23vi9";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24vi9";
									    su2.bookingPadel(id, jugador4);
									} 

								}			
								//-----------------------------------------------------------------------
							} else if (e.getSource()==this.pa2vi10) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21vi10")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22vi10")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23vi10")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24vi10")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21vi10";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22vi10";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23vi10";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24vi10";
									    su2.bookingPadel(id, jugador4);
									} 

								}			
								} else if (e.getSource()==this.pa2vi11) {
								
								JTextField field1 = new JTextField();
								JTextField field2 = new JTextField();
								JTextField field3 = new JTextField();
								JTextField field4 = new JTextField();

								ScheduleUser su2 = new ScheduleUser();
								List<String> idList = su2.previus();
								ScheduleUser su3 = new ScheduleUser();
								List<String> nombreList = su3.previus2();

								for (int i = 0; i < idList.size(); i++) {
									if (idList.get(i).equals("pa21vi11")) {
										field1.setText(nombreList.get(i));
										field1.setEditable(false);
									} else if (idList.get(i).equals("pa22vi11")) {
										field2.setText(nombreList.get(i));
										field2.setEditable(false);
									} else if (idList.get(i).equals("pa23vi11")) {
										field3.setText(nombreList.get(i));
										field3.setEditable(false);
									} else if (idList.get(i).equals("pa24vi11")) {
										field4.setText(nombreList.get(i));
										field4.setEditable(false);
									}
								}
								//-------------------------------------
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
									if (field1.isEditable()==true && !jugador1.isBlank()) {
									    String id = "pa21vi11";
									    su2.bookingPadel(id, jugador1);
									}
									if (field2.isEditable()==true && !jugador2.isBlank()) {
									    String id = "pa22vi11";
									    su2.bookingPadel(id, jugador2);
									} 
									if (field3.isEditable()==true && !jugador3.isBlank()) {
									    String id = "pa23vi11";
									    su2.bookingPadel(id, jugador3);
									} 
									if (field4.isEditable()==true && !jugador4.isBlank()) {
									    String id = "pa24vi11";
									    su2.bookingPadel(id, jugador4);
									} 

								}
								} else if (e.getSource()==this.pa2vi12) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi12")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi12")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi12")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi12")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi12";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi12";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi12";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi12";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi13) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi13")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi13")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi13")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi13")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi13";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi13";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi13";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi13";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi15) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi15")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi15")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi15")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi15")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi15";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi15";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi15";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi15";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi16) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi16")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi16")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi16")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi16")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi16";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi16";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi16";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi16";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi17) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi17")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi17")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi17")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi17")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi17";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi17";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi17";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi17";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi18) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi18")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi18")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi18")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi18")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi18";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi18";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi18";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi18";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi19) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi19")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi19")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi19")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi19")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi19";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi19";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi19";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi19";
										    su2.bookingPadel(id, jugador4);
										} 

									}
								} else if (e.getSource()==this.pa2vi20) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21vi20")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22vi20")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23vi20")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24vi20")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21vi20";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22vi20";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23vi20";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24vi20";
										    su2.bookingPadel(id, jugador4);
										} 

									}
					//************************************************************************
								} else if (e.getSource()==this.pa2sa9) {
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21sa9")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22sa9")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23sa9")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24sa9")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21sa9";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22sa9";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23sa9";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24sa9";
										    su2.bookingPadel(id, jugador4);
										} 

									}			
									//-----------------------------------------------------------------------
								} else if (e.getSource()==this.pa2sa10) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21sa10")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22sa10")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23sa10")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24sa10")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21sa10";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22sa10";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23sa10";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24sa10";
										    su2.bookingPadel(id, jugador4);
										} 

									}			
									} else if (e.getSource()==this.pa2sa11) {
									
									JTextField field1 = new JTextField();
									JTextField field2 = new JTextField();
									JTextField field3 = new JTextField();
									JTextField field4 = new JTextField();

									ScheduleUser su2 = new ScheduleUser();
									List<String> idList = su2.previus();
									ScheduleUser su3 = new ScheduleUser();
									List<String> nombreList = su3.previus2();

									for (int i = 0; i < idList.size(); i++) {
										if (idList.get(i).equals("pa21sa11")) {
											field1.setText(nombreList.get(i));
											field1.setEditable(false);
										} else if (idList.get(i).equals("pa22sa11")) {
											field2.setText(nombreList.get(i));
											field2.setEditable(false);
										} else if (idList.get(i).equals("pa23sa11")) {
											field3.setText(nombreList.get(i));
											field3.setEditable(false);
										} else if (idList.get(i).equals("pa24sa11")) {
											field4.setText(nombreList.get(i));
											field4.setEditable(false);
										}
									}
									//-------------------------------------
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
										if (field1.isEditable()==true && !jugador1.isBlank()) {
										    String id = "pa21sa11";
										    su2.bookingPadel(id, jugador1);
										}
										if (field2.isEditable()==true && !jugador2.isBlank()) {
										    String id = "pa22sa11";
										    su2.bookingPadel(id, jugador2);
										} 
										if (field3.isEditable()==true && !jugador3.isBlank()) {
										    String id = "pa23sa11";
										    su2.bookingPadel(id, jugador3);
										} 
										if (field4.isEditable()==true && !jugador4.isBlank()) {
										    String id = "pa24sa11";
										    su2.bookingPadel(id, jugador4);
										} 

									}
									} else if (e.getSource()==this.pa2sa12) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa12")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa12")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa12")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa12")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa12";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa12";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa12";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa12";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa13) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa13")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa13")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa13")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa13")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa13";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa13";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa13";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa13";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa15) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa15")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa15")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa15")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa15")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa15";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa15";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa15";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa15";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa16) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa16")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa16")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa16")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa16")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa16";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa16";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa16";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa16";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa17) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa17")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa17")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa17")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa17")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa17";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa17";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa17";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa17";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa18) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa18")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa18")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa18")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa18")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa18";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa18";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa18";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa18";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa19) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa19")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa19")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa19")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa19")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa19";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa19";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa19";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa19";
											    su2.bookingPadel(id, jugador4);
											} 

										}
									} else if (e.getSource()==this.pa2sa20) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21sa20")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22sa20")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23sa20")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24sa20")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21sa20";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22sa20";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23sa20";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24sa20";
											    su2.bookingPadel(id, jugador4);
											} 

										}
						//*********************************************************************
									} else if (e.getSource()==this.pa2do9) {
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21do9")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22do9")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23do9")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24do9")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21do9";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22do9";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23do9";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24do9";
											    su2.bookingPadel(id, jugador4);
											} 

										}			
										//-----------------------------------------------------------------------
									} else if (e.getSource()==this.pa2do10) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21do10")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22do10")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23do10")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24do10")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21do10";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22do10";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23do10";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24do10";
											    su2.bookingPadel(id, jugador4);
											} 

										}			
										} else if (e.getSource()==this.pa2do11) {
										
										JTextField field1 = new JTextField();
										JTextField field2 = new JTextField();
										JTextField field3 = new JTextField();
										JTextField field4 = new JTextField();

										ScheduleUser su2 = new ScheduleUser();
										List<String> idList = su2.previus();
										ScheduleUser su3 = new ScheduleUser();
										List<String> nombreList = su3.previus2();

										for (int i = 0; i < idList.size(); i++) {
											if (idList.get(i).equals("pa21do11")) {
												field1.setText(nombreList.get(i));
												field1.setEditable(false);
											} else if (idList.get(i).equals("pa22do11")) {
												field2.setText(nombreList.get(i));
												field2.setEditable(false);
											} else if (idList.get(i).equals("pa23do11")) {
												field3.setText(nombreList.get(i));
												field3.setEditable(false);
											} else if (idList.get(i).equals("pa24do11")) {
												field4.setText(nombreList.get(i));
												field4.setEditable(false);
											}
										}
										//-------------------------------------
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
											if (field1.isEditable()==true && !jugador1.isBlank()) {
											    String id = "pa21do11";
											    su2.bookingPadel(id, jugador1);
											}
											if (field2.isEditable()==true && !jugador2.isBlank()) {
											    String id = "pa22do11";
											    su2.bookingPadel(id, jugador2);
											} 
											if (field3.isEditable()==true && !jugador3.isBlank()) {
											    String id = "pa23do11";
											    su2.bookingPadel(id, jugador3);
											} 
											if (field4.isEditable()==true && !jugador4.isBlank()) {
											    String id = "pa24do11";
											    su2.bookingPadel(id, jugador4);
											} 

										}
										} else if (e.getSource()==this.pa2do12) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do12")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do12")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do12")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do12")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do12";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do12";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do12";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do12";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do13) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do13")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do13")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do13")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do13")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do13";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do13";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do13";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do13";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do15) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do15")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do15")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do15")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do15")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do15";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do15";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do15";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do15";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do16) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do16")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do16")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do16")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do16")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do16";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do16";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do16";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do16";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do17) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do17")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do17")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do17")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do17")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do17";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do17";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do17";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do17";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do18) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do18")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do18")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do18")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do18")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do18";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do18";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do18";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do18";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do19) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do19")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do19")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do19")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do19")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do19";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do19";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do19";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do19";
												    su2.bookingPadel(id, jugador4);
												} 

											}
										} else if (e.getSource()==this.pa2do20) {
											
											JTextField field1 = new JTextField();
											JTextField field2 = new JTextField();
											JTextField field3 = new JTextField();
											JTextField field4 = new JTextField();

											ScheduleUser su2 = new ScheduleUser();
											List<String> idList = su2.previus();
											ScheduleUser su3 = new ScheduleUser();
											List<String> nombreList = su3.previus2();

											for (int i = 0; i < idList.size(); i++) {
												if (idList.get(i).equals("pa21do20")) {
													field1.setText(nombreList.get(i));
													field1.setEditable(false);
												} else if (idList.get(i).equals("pa22do20")) {
													field2.setText(nombreList.get(i));
													field2.setEditable(false);
												} else if (idList.get(i).equals("pa23do20")) {
													field3.setText(nombreList.get(i));
													field3.setEditable(false);
												} else if (idList.get(i).equals("pa24do20")) {
													field4.setText(nombreList.get(i));
													field4.setEditable(false);
												}
											}
											//-------------------------------------
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
												if (field1.isEditable()==true && !jugador1.isBlank()) {
												    String id = "pa21do20";
												    su2.bookingPadel(id, jugador1);
												}
												if (field2.isEditable()==true && !jugador2.isBlank()) {
												    String id = "pa22do20";
												    su2.bookingPadel(id, jugador2);
												} 
												if (field3.isEditable()==true && !jugador3.isBlank()) {
												    String id = "pa23do20";
												    su2.bookingPadel(id, jugador3);
												} 
												if (field4.isEditable()==true && !jugador4.isBlank()) {
												    String id = "pa24do20";
												    su2.bookingPadel(id, jugador4);
												} 

											}
											// ***********************************************************
										} else if (e.getSource() == this.btnPista2) {
										} else if (e.getSource() == this.btnPista1) {

											/*
											 * panelPadel.setVisible(false); Padel2 panelPadel2 = new Padel2();
											 * frame.getContentPane().add(panelPadel2, "name_1012574314747200");
											 * panelPadel2.setLayout(null); panelPadel2.setVisible(true);
											 */

										} else {
											JOptionPane.showMessageDialog(null, "Error", "ERROR_MESSAGE",
													JOptionPane.ERROR_MESSAGE);
										}

									}

}