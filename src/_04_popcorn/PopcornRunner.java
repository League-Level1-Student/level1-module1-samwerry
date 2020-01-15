package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		
		
		
		
		Popcorn pop = new Popcorn("Cheese");
		Microwave mic = new Microwave();
		
		mic.putInMicrowave(pop);
		mic.setTime(5);
		mic.startMicrowave();
	String flavor = 	JOptionPane.showInputDialog("what flavor popcorn do you want");
	String time = JOptionPane.showInputDialog("how long do you want the popcorn in the microwave?");
		int t = Integer.parseInt(time);
		
		Popcorn pop2 = new Popcorn(flavor);
		Microwave mic2 = new Microwave();
		
		mic.putInMicrowave(pop2);
		mic.setTime(t);
		mic.startMicrowave();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
