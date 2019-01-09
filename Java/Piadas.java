import java.util.*;

public class Piadas {
	private Vector<String> piadas = new Vector<String>();
	private Vector<String> expressoes = new Vector<String>();

	public Piadas() {
		NovaPiada("Por que o petroleo foi no psicologo? Porque ele estava no fundo do poco.");
		NovaPiada("Porque a plantinha nao foi ao medico? Porque so tinha medico de plantao.");
		NovaPiada("Sabe como e a piada do pintinho caipira? Pir.");
		NovaPiada("O que o pagodeiro foi fazer na igreja? Foi cantar pra god");

		NovaExpressao("Deixa eu pensar... Ok, aqui vai:");
		NovaExpressao("Você está na bad? Eu tenho a solução:");
		NovaExpressao("Piadas são ótimas, né! Olhe essa:");
		NovaExpressao("Essa hora do dia e você quer uma piada?");
		NovaExpressao("Eu sou a robô mais engraçada do mundo.");
		NovaExpressao("Eu confesso. De inteligente minhas piadas não tem nada...");
	}
	
	private void NovaPiada(String piada) {
		piadas.add(piada);
	}

	private void NovaExpressao(String expressao) {
		expressoes.add(expressao);
	}

	private int NumAleatorio() {
		Random r = new Random();
		return r.nextInt(piadas.size());
	}

	public String GetPiada() {
		return expressoes.get(NumAleatorio()) + " " + piadas.get(NumAleatorio());
	}

	public void AleatorizarPiada() {
		Comunicacao.Fala(GetPiada());
	}


}
