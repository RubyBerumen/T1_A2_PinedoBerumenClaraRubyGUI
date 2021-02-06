import javax.swing.*;
import java.awt.*;

class VentanaFormulario extends JFrame{
	
	public VentanaFormulario(){
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,500);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("<<<Formulario de registro>>>");
		txtTitulo.setBounds(25, 5, 300, 20);
		add(txtTitulo);
		
		JLabel txt1 = new JLabel("From option");
		txt1.setBounds(25, 30, 150, 25);
		add(txt1);
		
		JLabel txt2 = new JLabel("Include the following:");
		txt2.setBounds(25, 60, 150, 25);
		add(txt2);
		
		JCheckBox check1 = new JCheckBox("A title for your form");
		check1.setBounds(25, 80, 150, 25);
		add(check1);
		JTextField txtF1 = new JTextField("Subscribe to our mailing list");
		txtF1.setBounds(25, 105, 200, 25);
		add(txtF1);
		
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("only required fields");
		radio1.setBounds(25, 150, 150, 25);
		bg.add(radio1);
		add(radio1);
		JRadioButton radio2 = new JRadioButton("all fields");
		radio2.setBounds(25, 170, 150, 25);
		bg.add(radio2);
		add(radio2);
		
		
		JCheckBox check2 = new JCheckBox("interest group fields");
		check2.setBounds(25, 210, 150, 25);
		add(check2);
		JCheckBox check3 = new JCheckBox("required field indicators");
		check3.setBounds(25, 230, 150, 25);
		add(check3);
		
		
		JLabel txt3 = new JLabel("Set form width");
		txt3.setBounds(25, 270, 150, 25);
		add(txt3);
		JTextField txtF2 = new JTextField();
		txtF2.setBounds(25, 290, 200, 25);
		add(txtF2);
		
		
		JLabel txt4 = new JLabel("Enhance your form");
		txt4.setBounds(25, 340, 150, 25);
		add(txt4);
		JCheckBox check4 = new JCheckBox("enable evil popup mode");
		check4.setBounds(25, 360, 150, 25);
		add(check4);
		JCheckBox check5 = new JCheckBox("disable all");
		check5.setBounds(25, 380, 150, 25);
		add(check5);
		JCheckBox check6 = new JCheckBox("include archive link");
		check6.setBounds(25, 400, 150, 25);
		add(check6);
		JCheckBox check7 = new JCheckBox("include page link");
		check7.setBounds(25, 420, 150, 25);
		add(check7);
		
		
		JLabel txt5 = new JLabel("Preview");
		txt5.setBounds(260, 30, 150, 25);
		add(txt5);
		
		JLabel txt6 = new JLabel("Email Address");
		txt6.setBounds(270, 60, 150, 25);
		add(txt6);
		JFormattedTextField txtF3 = new JFormattedTextField();
		txtF3.setBounds(270, 80, 300, 25);
		add(txtF3);
		
		JLabel txt7 = new JLabel("First Name");
		txt7.setBounds(270, 110, 150, 25);
		add(txt7);
		JFormattedTextField txtF4 = new JFormattedTextField();
		txtF4.setBounds(270, 130, 300, 25);
		add(txtF4);
		
		JLabel txt8 = new JLabel("Last Name");
		txt8.setBounds(270, 160, 150, 25);
		add(txt8);
		JFormattedTextField txtF5 = new JFormattedTextField();
		txtF5.setBounds(270, 180, 300, 25);
		add(txtF5);
		
		Icon icon = new ImageIcon("./archivos/s1.jpg");
		JButton btn = new JButton(icon);
		btn.setBounds(270, 220, 90, 25);
		add(btn);
		
		
		JLabel txt9 = new JLabel("Copy/paste onto your site");
		txt9.setBounds(260, 270, 150, 25);
		add(txt9);
		
        JTextArea textField = new JTextArea();
        textField.setEditable(false);

        String str = "";
        for (int i = 0; i < 60; ++i)
            str += "Hola\n";
        textField.setText(str);

        JScrollPane scroll = new JScrollPane(textField);
        scroll.setBounds(260, 295, 300, 140);                    

        getContentPane().add(scroll);
        setLocationRelativeTo ( null );
           
		
		
		setVisible(true);
	}
	
}

public class FormularioLayoutNulo {

	public static void main(String[] args) {
		
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			System.out.println(UIManager.getInstalledLookAndFeels());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		
		
		new VentanaFormulario();
		
		
		
		
		

	}

}
