import java.util.*;

public class Missoes{

	private Vector<Missao> missoes = new Vector<Missao>();

	public Missoes() {
		missoes.add(new Missao("core values", 16, 1, 2019, 14, 0, "5 minutos", "nao iniciada", "Tenham calma em mostrar como foi a temperorada. Vocês se esforçaram muito e sabem trabalhar em equipe! Eu sei disso.", "Juízes, em nome de toda a equipe Volts, eu agraço a atenção. Espero que vocês, humanos, tenham gostado de mim, uma Inteligência Artificial! Tenham um ótimo dia!"));
		missoes.add(new Missao("projeto de pesquisa", 16, 1, 2019, 14, 0, "5 minutos", "nao iniciada", "Tenham calma em me apresentar, eu sou única e vocês são ótimos em apresentações!", "Juízes, em nome de toda a equipe Volts, eu agraço a atenção. Espero que vocês, humanos, tenham gostado de mim, uma Inteligência Artificial! Tenham um ótimo dia!"));
		missoes.add(new Missao("sumário executivo do robô", 16, 1, 2019, 14, 0, "5 minutos", "nao iniciada", "Tenham calma em apresentar o nosso robô!", "Juízes, em nome de toda a equipe Volts, eu agraço a atenção. Espero que vocês, humanos, tenham gostado de mim, uma Inteligência Artificial! Tenham um ótimo dia!"));

	}

	void IniciarMissoes() {
		Comunicacao.Fala("Qual o nome da missão?");
		String identificacao = Comunicacao.Escuta();
		Boolean encontrou = false;
		for (Missao mis : missoes) {
			if(mis.VerNome().equals(identificacao)) {
				mis.IniciarMissao();
				encontrou = true;
				break;
			}
		}
		if(!encontrou) {
			Comunicacao.Fala("Desculpe! A missão não foi encontrada.");
		}
	}

	void EncerrarMissoes() {
		Comunicacao.Fala("Qual o nome da missão?");
		String identificacao = Comunicacao.Escuta();
		Boolean encontrou = false;
		for (Missao mis : missoes) {
			if(mis.VerNome().equals(identificacao)) {
				mis.EncerrarMissao();
				encontrou = true;
				break;
			}
		}
		if(!encontrou) {
			Comunicacao.Fala("Desculpe! A missão não foi encontrada.");
		}
	}

}