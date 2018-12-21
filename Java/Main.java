public class Main {
	public static void main (String[] args) {
		Agenda agenda = new Agenda();
		Piadas piadas = new Piadas();
		Notas notas = new Notas();
		
		Comunicacao.Fala("Oi! Eu sou a MIA. Como posso ajudar?");

		while(true) {
			switch(Comunicacao.Escuta()) {
				case "Adicionar compromisso": agenda.AdicionarCompromisso(); break;
				case "Ver compromissos": agenda.LerCompromissos(); break;
				case "Adiconar nota": notas.AdicionarNota(); break;
				case "Busca nota": notas.BuscaNota(); break;
				default: Comunicacao.Fala("Nao entendi. Pode repetir?"); break;
			}
		}
	}
}