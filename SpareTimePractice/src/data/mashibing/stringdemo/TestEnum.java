package data.mashibing.stringdemo;

public class TestEnum {

	public static void main(String[] args) {
		MyColor color = MyColor.RED;
       switch (color) {
	case RED:
		System.out.println("red color");
		break;

	default:
		System.out.println("unknow color");
	}
	}

}
