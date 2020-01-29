package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.scene.layout.Pane;

public class BinaryConverter implements MouseListener {
	
	
	
	
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton();
	JLabel label = new JLabel();
public static void main(String[] args) {
	
	
	
	BinaryConverter converter = new BinaryConverter();
	converter.CreateUI();
}
	
	
	
	void CreateUI() {
		label.setPreferredSize(new Dimension(100,100));
		frame.setVisible(true);
		panel.add(answer);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		button.addMouseListener(this);
		
		
		frame.pack();
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String press = convert(answer.getText());
		label.setText(press);
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}

}
