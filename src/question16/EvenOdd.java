package question16;



import javax.swing.JOptionPane;

public class EvenOdd {

	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("Enter the Number: " );
		double nO=Double.parseDouble(s);
		if(nO%2==0) {
			JOptionPane.showInternalMessageDialog(null,"CONGRATS! Number "+nO+ " is an even number");
		}
		else {
			JOptionPane.showInternalMessageDialog(null,"OOPS! Number "+nO+ " is an odd number");
		}
		
				
	}

}
