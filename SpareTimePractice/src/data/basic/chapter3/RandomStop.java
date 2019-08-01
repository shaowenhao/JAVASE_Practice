package data.basic.chapter3;

public class RandomStop {

	public static void main(String[] args) {
		while (true) {
		int number=(int) (Math.random() * 10);  // Random generate 0~9
		System.out.println(number);
		if (number==5) {
			System.out.println("Hit 5 Orz");
			break;
		 }
		}

	}

}
