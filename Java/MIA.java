import java.util.*;

public class MIA {
	
	public static void speak(String text) {
		System.out.println(text);
	}

	public static String listen() {
		System.out.println("O que quer que eu diga?");
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

}