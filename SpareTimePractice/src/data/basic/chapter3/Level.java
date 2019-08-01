package data.basic.chapter3;

import java.util.Scanner;

public class Level {

	public static void main(String[] args) {
		   char level;
		   int score=0;
		   System.out.println("Input score:");
		   Scanner scanner = new Scanner(System.in);
		  score = scanner.nextInt();
		  if (score >=90) {
			level = 'A';
		}else if (score >=70 && score<90) {
			level = 'B';
		}else if(score>=60 && score <70) {
			level = 'C';
		}else {
			level = 'D';
		}
		  System.out.println("Score:" + level);
	}

}
