import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		//int a = scanner.nextInt();
		
		char c = scanner.next().charAt(0);
		
		System.out.println("value =" +c);

	}

}
