import java.util.*;

public class Missoes{

	private Vector<Missao> missoes = new Vector<Missao>();


	public Missoes() {

	}

	public void AdicionarMissao(){
		Comunicacao.fala("Qual o horario e dia de inicio da missao");
		String inicio = Comunicacao.escuta();
		Comunicacao.fala("Qual os detalhes da missao");
		String detalhes = Comunicacao.escuta();
		Comunicacao.fala("Qual a duracao da missao");
		String duracao = Comunicacao.escuta();
		Comunicacao.fala("Qual o nome da missao");
		String nome = Comunicacao.escuta();
		Comunicacao.fala("Qual a mensagem de início da missao?");
		String mensagemInicio = Comunicacao.escuta();
		Comunicacao.fala("Qual a mensagem de encerramento da missao?");
		String mensagemEncerramento = Comunicacao.escuta();
		missoes.add(new Missao(inicio, nome, detalhes, duracao, mensagemInicio, mensagemEncerramento));
		Missao last = missoes.lastElement();
		Comunicacao.fala("Missao " + last.lerCodigo() + " adicionada com sucesso.");
	}

	public void LerMissoes() {

	}

	public void IniciarMissao() {
		Comunicacao.fala("Qual o código da missáo?");
		String codigo = Comunicacao.escuta();
		int posMissao = 0;
		boolean encontrouMissao = false;
		for (Missao missao : missoes) {
			if(missao.lerCodigo().equals(codigo)) {
				encontrouMissao = true;
				break;
			}
			posMissao++;
		}
		if(!encontrouMissao) {
			Comunicacao.fala("Me desculpe. A missào nào foi encontrada!");
		} else {
			Missao missaoAtual = missoes.get(posMissao);
			missaoAtual.iniciarMissao();
			Comunicacao.fala("Missào " + codigo + " iniciada. " + missaoAtual.lerMensagemInicio());
		}
	}
	public void EncerrarMissao() {

	}

}