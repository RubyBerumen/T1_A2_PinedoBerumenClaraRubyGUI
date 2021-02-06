import javax.swing.*;
import java.awt.*;

class VentanaFormulario extends JFrame{
	
	public VentanaFormulario(){
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900,600);
		setTitle("Formulario");
		setLocationRelativeTo(null);
		
		JLabel txtTitulo = new JLabel("Formulario de registro");
		txtTitulo.setBounds(0, 0, 300, 20);
		add(txtTitulo);
		
		JLabel txt1 = new JLabel("From option");
		txt1.setBounds(25, 30, 150, 25);
		add(txt1);
		
		JLabel txt2 = new JLabel("Include the following:");
		txt2.setBounds(25, 60, 150, 25);
		add(txt2);
		
		JCheckBox check1 = new JCheckBox("A title for your form");
		check1.setBounds(25, 90, 150, 25);
		add(check1);
		JTextField txtF1 = new JTextField("Subscribe to our mailing list");
		txtF1.setBounds(25, 120, 140, 25);
		add(txtF1);
		
		
		
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
