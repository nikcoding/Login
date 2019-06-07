

import java.awt.*;
import java.awt.event.*;

class Demo extends Frame {
	/*class M implements WindowListener {
		public void windowClosed(WindowEvent e) {
		

		}

		public void windowOpened(WindowEvent e) {
		

		}

		public void windowActivated(WindowEvent e) {
		

		}

		public void windowDeactivated(WindowEvent e) {
			
	
		}

		public void windowIconified(WindowEvent e) {
			System.out.println("Inconified");

		}

		public void windowDeiconified(WindowEvent e) {
			

		}

		public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);

		}

	}*/
	class W extends WindowAdapter{
		public void windowClosing(WindowEvent t)
		{
			dispose();
		}
	}

	class A implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			try {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);

				if ((n1 == 1713101117) && (n2 == 1234)) {
					t3.setText("Success");
				} else {
					t3.setText("failed");

				}

			} catch (Exception ex) {

				t3.setText(ex.getMessage());

			}

		}

	}

	Frame f;
	Button b1, b2;
	Label l1, l2;
	Panel p;
	TextField t1, t2, t3;

	Demo() {
		setTitle("Login");
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.RED);
	
		p = new Panel();
		p.setBackground(Color.yellow);
	
		p.setLayout(null);
		p.setBounds(40, 60, 300, 250);
		l1 = new Label("User_ID");
		l1.setBounds(40, 20, 50, 40);
		p.add(l1);
		l2 = new Label("PassWord");
		l2.setBounds(40, 100, 70, 40);
		p.add(l2);
		add(p);
		t1 = new TextField("");
		t1.setBounds(170, 30, 70, 40);
		t1.setForeground(Color.BLUE);
		p.add(t1);
		t2 = new TextField("");
		t2.setBounds(170, 110, 70, 40);
		t2.setForeground(Color.BLUE);
		p.add(t2);
		b1 = new Button("Log In");
		b1.setBounds(100, 180, 70, 40);
	
		b1.addActionListener(new A());
		addWindowListener(new W());
		b1.setForeground(Color.BLACK);
		p.add(b1);
		t3 = new TextField();
		t3.setBounds(140, 320, 70, 40);

		t3.setForeground(Color.BLUE);
		add(t3);
		

	}

}

public class Login {

	public static void main(String[] args) {
		Demo a = new Demo();
		a.setVisible(true);
//new Demo().setVisible(true);
	}

}
