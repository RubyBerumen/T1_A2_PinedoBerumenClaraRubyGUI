import javax.swing.*;
import java.awt.*;

class VentanaFormulario extends JFrame{
	
	public VentanaFormulario(){
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,510);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("Formulario de registro");
		txtTitulo.setBounds(0, 0, 300, 20);
		add(txtTitulo);
		
		JLabel txt1 = new JLabel("From option");
		txt1.setBounds(25, 30, 150, 25);
		add(txt1);
		
		JLabel txt2 = new JLabel("Include the following:");
		txt2.setBounds(25, 50, 150, 25);
		add(txt2);
		
		JCheckBox check1 = new JCheckBox("A title for your form");
		check1.setBounds(25, 70, 150, 25);
		add(check1);
		JTextField txtF1 = new JTextField("Subscribe to our mailing list");
		txtF1.setBounds(25, 100, 200, 25);
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
		txtF2.setBounds(25, 300, 200, 25);
		add(txtF2);
		
		
		JLabel txt4 = new JLabel("Enhance your form");
		txt4.setBounds(25, 350, 150, 25);
		add(txt4);
		JCheckBox check4 = new JCheckBox("enable evil popup mode");
		check4.setBounds(25, 370, 150, 25);
		add(check4);
		JCheckBox check5 = new JCheckBox("disable all");
		check5.setBounds(25, 390, 150, 25);
		add(check5);
		JCheckBox check6 = new JCheckBox("include archive link");
		check6.setBounds(25, 410, 150, 25);
		add(check6);
		JCheckBox check7 = new JCheckBox("include page link");
		check7.setBounds(25, 430, 150, 25);
		add(check7);
		
		
		JLabel txt5 = new JLabel("Preview");
		txt5.setBounds(260, 30, 150, 25);
		add(txt5);
		JLabel txt6 = new JLabel("Email Address");
		txt6.setBounds(260, 50, 150, 25);
		add(txt6);
		
		
		setVisible(true);
	}
	
}

public class FormularioLayoutNulo {

	public static void main(String[] args) {
		
		
		try {
			//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
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
