import java.util.*;

public class Piadas {
	private Vector<String> piadas = new Vector<String>();

	public Piadas() {
		NovaPiada("Por que o petroleo foi no psicologo? Porque ele estava no fundo do poco.");
		NovaPiada("Porque a plantinha nao foi ao medico? Porque so tinha medico de plantao.");
		NovaPiada("Sabe como e a piada do pintinho caipira? Pir.");
		NovaPiada("O que o pagodeiro foi fazer na igreja? Foi cantar pra god");
	}
	
	private void NovaPiada(String piada) {
		piadas.add(piada);
	}

	private int NumAleatorio() {
		Random r = new Random();
		return r.nextInt(piadas.size());
	}

	public String GetPiada() {
		return "Aqui vai uma piada: " + piadas.get(NumAleatorio());
	}


}
