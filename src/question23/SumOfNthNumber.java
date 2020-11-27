package question23;

import javax.swing.JOptionPane;

public class SumOfNthNumber {

	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("Enter the Number: ");
		double num=Double.parseDouble(s);
		int x=(int) num;
		int sum=0;
		for(int i=1; i<=x;i++) {
			//int sum=0;
			sum =sum+i;
			JOptionPane.showMessageDialog(null,sum);
		}
		JOptionPane.showMessageDialog(null,"Invalid");
	}

}
