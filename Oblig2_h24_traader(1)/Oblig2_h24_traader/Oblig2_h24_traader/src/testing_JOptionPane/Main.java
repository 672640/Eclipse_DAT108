package testing_JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
//		JOptionPane.showMessageDialog(null, "Hei", "Tittel", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Ubrukeleg informasjon", "Tittel", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "what", "Tittel", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Pcen din har virus", "Tittel", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Noko gjekk galt ahhhhhhhhhh", "Tittel", JOptionPane.ERROR_MESSAGE);
//		int svar = JOptionPane.showConfirmDialog(null, "kodar du?", "Tittelen min", JOptionPane.YES_NO_CANCEL_OPTION);
		
		String namn = JOptionPane.showInputDialog("Kva er namnet ditt?");
		System.out.println("Hallo " + namn);
		
//		String[] svar = {"Nei, du er fantastisk!", "tusen takk", "blush"};
//		ImageIcon icon = new ImageIcon("smile.png");
//		JOptionPane.showOptionDialog(null, "Du er fantastisk!", "skjult melding",
//				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
//				icon, svar, 0);
	}

}
