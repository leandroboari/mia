	public class Main {
	public static void main (String[] args) {
		Agenda ag = new Agenda();
		Notas notas = new Notas();
		Piadas piadas = new Piadas();
		Missoes miss = new Missoes();
		Interpretador interpretador = new Interpretador();
		
		Comunicacao.Fala("Oi! Eu sou a MIA. Como posso ajudar?");

		while(true) {
			switch(interpretador.Processar(Comunicacao.Escuta())) {
				case "adicionar compromisso": ag.AdicionarCompromisso(); break;
				case "listar compromisso": ag.LerCompromissos(); break;
				case "adicionar nota": notas.AdicionarNota(); break;
				case "buscar nota": notas.BuscaNota(); break;
				case "aleatorizar piada": piadas.AleatorizarPiada(); break;
				case "iniciar missao": miss.IniciarMissoes(); break;
				case "encerrar missao": miss.EncerrarMissoes(); break;
				default: Comunicacao.Fala("Nao entendi. Pode repetir?"); break;
			}
		}
	}
}