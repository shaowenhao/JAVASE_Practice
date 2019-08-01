package data.basic.chapter3;

public class Level2 {

	public static void main(String[] args) {
	   int score = 88;
	   char level;
	   int num = score / 10;
	   switch (num) {
	case 9:
		level = 'A';
		break;
	case 8:
		level = 'B';
		break;
	default:
		level = 'E';
		break;
	}
   System.out.println("Level" + level);
	}

}
