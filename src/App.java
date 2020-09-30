import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App {
	
	JFrame frame, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9,  frame10;
	JTextArea loginTextA;
	Font bankNameF = new Font("Helvetica", Font.PLAIN, 45);
	Font bigButtonF = new Font("Helvetica", Font.PLAIN, 25);
	Font normalF = new Font("Helvetica", Font.PLAIN, 20);
	
	lHandler lHandler = new lHandler();
	l2Handler l2Handler = new l2Handler();
	consultaHandler consultaHandler = new consultaHandler();
	retirarHandler retirarHandler = new retirarHandler();
	ingresarHandler ingresarHandler = new ingresarHandler();
	revisionHandler revisionHandler = new revisionHandler();
	


	public static void main(String[] args) {
		new App();
	}
	
	public App() {
	
		frame = new JFrame("Banco Popular");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(5, 163, 171));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setOpacity(1);
		
		
		
		JPanel bankNameP = new JPanel();
		bankNameP.setBounds(100, 100, 600, 150);
		bankNameP.setBackground(new Color(5, 163, 171));
		JLabel bankNameL = new JLabel("<html>Banco <b>Popular</b></html>");
		bankNameL.setForeground(Color.white);
		bankNameL.setFont(bankNameF);
		bankNameP.add(bankNameL);
		frame.getContentPane().add(bankNameP);
		
		JPanel createAccBP = new JPanel();
		createAccBP.setBounds(250, 250, 300, 150);
		createAccBP.setLayout(new GridLayout(2,1,0,1));
		frame.add(createAccBP);
		
		JButton loginButton = new JButton("Login");
		loginButton.setForeground(Color.black);
		loginButton.setFont(bigButtonF);
		loginButton.setFocusPainted(false);
		loginButton.addActionListener(lHandler);
		createAccBP.add(loginButton);
		
		
		JButton createAccButton = new JButton("Create New Account");
		createAccButton.setForeground(Color.black);
		createAccButton.setFont(bigButtonF);
		createAccButton.setFocusPainted(false);
		createAccBP.add(createAccButton);

		
		frame.setVisible(true);
	}
	
	public void loginScreen() {       //Pantalla de login, añadir que si el logueo está mal haga algo, automaticamente pasa a la siguiente por ahora
	
		frame2 = new JFrame("User Access");
		frame2.setSize(800, 600);
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame2.getContentPane().setBackground(new Color(5, 163, 171));
		frame2.setLayout(null);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);
		frame2.setOpacity(1);
		
		
		loginTextA = new JTextArea("         Por favor ingrese su nombre y cédula para continuar.");
		loginTextA.setBounds(100, 100, 600, 40);
		loginTextA.setForeground(Color.black);
		loginTextA.setOpaque(false);
		loginTextA.setFont(normalF);
		loginTextA.setEditable(false);
		loginTextA.setWrapStyleWord(true);
		frame2.add(loginTextA);
		
		
		JLabel loginUserL = new JLabel("Nombre:");
		loginUserL.setBounds(280, 200, 80, 25);
		frame2.add(loginUserL);
		
		JLabel loginCedulaL = new JLabel("Cédula:");
		loginCedulaL.setBounds(280, 230, 80, 25);
		frame2.add(loginCedulaL);
		
		JButton loginloginB = new JButton("Login");
		loginloginB.setBounds(380, 290, 80, 25);
		loginloginB.addActionListener(l2Handler);
		frame2.add(loginloginB);
		
		JButton loginBackB = new JButton("Back");
		loginBackB.setBounds(380, 320, 80, 25);
		frame2.add(loginBackB);
		
		JTextField loginField = new JTextField();
		loginField.setBounds(335, 200, 195, 25);
		frame2.add(loginField);
		
		JPasswordField loginCedField = new JPasswordField();
		loginCedField.setBounds(335, 230, 195, 25);
		frame2.add(loginCedField);
		
		frame2.setVisible(true);
		
	}
	
	public void AccountsScreen() {
		
		frame2.dispose();
		
		frame3 = new JFrame("User Access");
		frame3.setSize(800, 600);
		frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame3.getContentPane().setBackground(new Color(5, 163, 171));
		frame3.setLayout(null);
		frame3.setResizable(false);
		frame3.setLocationRelativeTo(null);
		frame3.setOpacity(1);
		
		
		loginTextA.setText("¡Bienvenido de vuelta!");
		
		JPanel AccountsBP = new JPanel();
		AccountsBP.setBounds(250, 250, 300, 200);
		AccountsBP.setLayout(new GridLayout(4,1,0,1));
		frame3.add(AccountsBP);
		
		JButton ingdineroB = new JButton("Ingresar Dinero");
		ingdineroB.setForeground(Color.black);
		ingdineroB.setFont(bigButtonF);
		ingdineroB.setFocusPainted(false);
		ingdineroB.addActionListener(ingresarHandler);
		AccountsBP.add(ingdineroB);
		
		JButton retdineroB = new JButton("Retirar Dinero");
		retdineroB.setForeground(Color.black);
		retdineroB.setFont(bigButtonF);
		retdineroB.setFocusPainted(false);
		retdineroB.addActionListener(retirarHandler);
		AccountsBP.add(retdineroB);
		
		JButton consaldoB = new JButton("Consultar Saldo");
		consaldoB.setForeground(Color.black);
		consaldoB.setFont(bigButtonF);
		consaldoB.setFocusPainted(false);
		consaldoB.addActionListener(consultaHandler);
		AccountsBP.add(consaldoB);
		
		JButton revmensualB = new JButton("Revisión Mensual");
		revmensualB.setForeground(Color.black);
		revmensualB.setFont(bigButtonF);
		revmensualB.setFocusPainted(false);
		revmensualB.addActionListener(revisionHandler);
		AccountsBP.add(revmensualB);
		
		frame3.setVisible(true);

	}
	
	public void IngresarDinero() {
		
		
		loginTextA.setText("¿A cual cuenta desea ingresar saldo?");

		
		JPanel idCuentas = new JPanel();
		idCuentas.setBounds(250, 250, 300, 200);
		idCuentas.setLayout(new GridLayout(3,1,0,1));
		frame2.add(idCuentas);
		
		JButton CC = new JButton();
		CC.setForeground(Color.black);
		CC.setFont(bigButtonF);
		CC.setFocusPainted(false);
		CC.addActionListener(lHandler);
		CC.add(idCuentas);
		
		JButton CV = new JButton();
		CV.setForeground(Color.black);
		CV.setFont(bigButtonF);
		CV.setFocusPainted(false);
		CV.addActionListener(lHandler);
		CV.add(idCuentas);
		
		JButton FI = new JButton();
		FI.setForeground(Color.black);
		FI.setFont(bigButtonF);
		FI.setFocusPainted(false);
		FI.addActionListener(lHandler);
		FI.add(idCuentas);
	}
	
	public void RetirarDinero() {
		
		loginTextA.setText("¿De cual cuenta desea retirar saldo?");

		
		JPanel idCuentas = new JPanel();
		idCuentas.setBounds(250, 250, 300, 200);
		idCuentas.setLayout(new GridLayout(2,1,0,1));
		frame2.add(idCuentas);
		
		JButton CC = new JButton();
		CC.setForeground(Color.black);
		CC.setFont(bigButtonF);
		CC.setFocusPainted(false);
		CC.addActionListener(lHandler);
		CC.add(idCuentas);
		
		JButton FI = new JButton();
		FI.setForeground(Color.black);
		FI.setFont(bigButtonF);
		FI.setFocusPainted(false);
		FI.addActionListener(lHandler);
		FI.add(idCuentas);

		
	}
	
	public void ConsultarSaldo() {
		
		loginTextA.setText("¿De cual cuenta desea consultar el saldo?");
		
		JPanel idCuentas = new JPanel();
		idCuentas.setBounds(250, 250, 300, 200);
		idCuentas.setLayout(new GridLayout(3,1,0,1));
		frame2.add(idCuentas);
		
		JButton CC = new JButton();
		CC.setForeground(Color.black);
		CC.setFont(bigButtonF);
		CC.setFocusPainted(false);
		CC.addActionListener(lHandler);
		CC.add(idCuentas);
		
		JButton CV = new JButton();
		CV.setForeground(Color.black);
		CV.setFont(bigButtonF);
		CV.setFocusPainted(false);
		CV.addActionListener(lHandler);
		CV.add(idCuentas);
		
		JButton FI = new JButton();
		FI.setForeground(Color.black);
		FI.setFont(bigButtonF);
		FI.setFocusPainted(false);
		FI.addActionListener(lHandler);
		FI.add(idCuentas);
	}
	
	public void RevisionMensual() {

	}
	
	public class lHandler implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
			
			loginScreen();
		
	}
	}
	
	public class l2Handler implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
		
			AccountsScreen();
			
		}
	

}
	public class consultaHandler implements ActionListener{
		
		public void actionPerformed (ActionEvent e) {
		
			ConsultarSaldo();
			
		}
	

}
	public class retirarHandler implements ActionListener{
	
	public void actionPerformed (ActionEvent e) {
	
		RetirarDinero();
		
	}


}
	public class ingresarHandler implements ActionListener{
	
	public void actionPerformed (ActionEvent e) {
	
		IngresarDinero();
		
	}


}
	public class revisionHandler implements ActionListener{
	
	public void actionPerformed (ActionEvent e) {
	
		RevisionMensual();
		
	}


}
	

}
