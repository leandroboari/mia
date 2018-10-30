import java.util.*;

public class MIA {
	
	public void speak(String text) {
		System.out.println(text);
	}

	public String listen() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

}