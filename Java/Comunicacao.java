import java.util.*;

public class Comunicacao {
	
	public static void Fala(String text) {
		System.out.println(text);
	}

	public static String Escuta() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

}