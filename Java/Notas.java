import java.util.Vector;

public class Notas {
	private Vector<Nota> notas = new Vector<Nota>();

	public void AdicionarNota() {
		Comunicacao.Fala("Me diga uma identificação para sua nota...");
		String identificacao = Comunicacao.Escuta();
		Comunicacao.Fala("Agora, o texto da nota...");
		String nota = Comunicacao.Escuta();
		notas.add(new Nota(identificacao, nota));
	}

	public int PegaTamanho() {
		return notas.size();
	}

	public void BuscaNota() {
		Comunicacao.Fala("Qual a identificação da nota?");
		String identificacao = Comunicacao.Escuta();
		for(int i = 0; i < PegaTamanho(); i++) {
			if(notas.get(i).PegaIdentificacao() == identificacao) {
				Comunicacao.Fala(notas.get(i).PegaNota());
			}
		}
	}
}