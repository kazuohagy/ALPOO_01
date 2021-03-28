import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle x1, x2;
		x1 = new Triangle();
		x2 = new Triangle();

		x1.a = sc.nextInt();
		x1.b = sc.nextInt();
		x1.c = sc.nextInt();


		x2.a = sc.nextInt();
		x2.b = sc.nextInt();
		x2.c = sc.nextInt();
		
		System.out.println("Valor do X1:");
		System.out.println("a: " + x1.a+ ",b: " + x1.b+ ",c: " + x1.c);
		System.out.println("Total do X1: " + x1.conta());
		System.out.println("");
		System.out.println(x1);
		System.out.println(x2);
	}
}
