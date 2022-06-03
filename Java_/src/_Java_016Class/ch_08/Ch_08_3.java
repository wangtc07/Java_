package _Java_016Class.ch_08;

import java.io.IOException;
import java.util.Scanner;

public class Ch_08_3 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String s = null;
		System.out.println("請輸入分數，輸入quit結束");

		while (scanner.hasNextLine()) {
			s = scanner.next();
			if (s.trim().equalsIgnoreCase("quit")) break;
			
			try {
				int score = Integer.parseInt(s) ;
				if (score > 100 || score < 0) {
					throw new ScoreException(score);
				}
				System.out.println("這是一個合法分數:" + score);
			} 
			catch (NumberFormatException e) {
				System.out.println("格式錯誤:s=" + s);
			} 
			catch (ScoreException se) {
				System.out.println("這不是一個合法分數:" + se.score + " 原因=" + se.getErrorMessage());
			}
		} // end of while
		System.out.println("程式結束");
		scanner.close();
	}
}

class ScoreException extends Exception {
	int score;
	private String errorMessage;

	ScoreException(int s) {
		score = s;
		setErrorMessage();
	}

	private void setErrorMessage() {
		if (score < 0)
			errorMessage = " 分數 < 0 ";
		else if (score > 100)
			errorMessage = " 分數 > 100 ";
	}

	String getErrorMessage() {
		return errorMessage;
	}
}