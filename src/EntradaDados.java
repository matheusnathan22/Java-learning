import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		System.out.println("Voc� digitou: " + z);
		sc.close();

	}

}
