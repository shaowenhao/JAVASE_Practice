package stream;

public class SystemSeparator {

	public static void main(String[] args) {
		
		// windows separator \r\n
		String separator = System.getProperty("line.separator"); 
		
		String content = "hello" + separator;
		content += "ryan";
		System.out.print(content);

	}

}
