package question21;

import javax.swing.JOptionPane;

public class DayOftheWeek {

	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("Enter the number(1....7): ");
		int n=Integer.parseInt(s);
		switch(n) {
		case 1:
			JOptionPane.showInternalMessageDialog(null," Sunday");break;
		case 2:
			JOptionPane.showInternalMessageDialog(null," Monday");break;
		case 3:
			JOptionPane.showInternalMessageDialog(null," Tuesday");break;
		case 4:
			JOptionPane.showInternalMessageDialog(null," Wednesday");break;
		case 5:
			JOptionPane.showInternalMessageDialog(null," Thursday");break;
		case 6:
			JOptionPane.showInternalMessageDialog(null," Friday");break;
		case 7:
			JOptionPane.showInternalMessageDialog(null," Saturday");break;
		default:
			JOptionPane.showMessageDialog(null,"                ERROR!\nINSERT THE VALID NUMBER");
		}
		
		
	}

}
