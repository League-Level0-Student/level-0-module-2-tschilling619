package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		Random rand = new Random();
		String lottery = "";
		for (int i = 0; i < 6; i++) {
			int ran = rand.nextInt(100);
			lottery += ran + " ";
		} JOptionPane.showMessageDialog(null, lottery);
	}

}
