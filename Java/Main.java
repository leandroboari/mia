	public class Main {
	public static void main (String[] args) {
		Agenda agenda = new Agenda();
		Notas notas = new Notas();
		Piadas piadas = new Piadas();
		Missoes miss = new Missoes();
		Interpretador interpretador = new Interpretador();
		
		Comunicacao.Fala("Oi! Eu sou a MIA. Como posso ajudar?");

		while(true) {
			switch(interpretador.Processar(Comunicacao.Escuta())) {
				case "adicionar compromisso": agenda.AdicionarCompromisso(); break;
				case "listar compromisso": agenda.LerCompromissos(); break;
				case "adicionar nota": notas.AdicionarNota(); break;
				case "buscar nota": notas.BuscaNota(); break;
				case "aleatorizar piada": piadas.AleatorizarPiada(); break;
				case "adicionar missào": miss.AdicionarMissao(); break;
				case "iniciar missào": miss.IniciarMissao(); break;
				default: Comunicacao.Fala("Nao entendi. Pode repetir?"); break;
			}
		}
	}
}