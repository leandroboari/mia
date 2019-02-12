public class Missao{
	String inicio;
	String inicioReal;
	String codigo;
	String detalhes;
	String duracao;
	String status;
	String relatorio;
	String msgInicio;
	String msgEncerramento;

	public Missao(String in, String cod, String detal, String dur, String msgI, String msgE){
		inicio = in;
		inicioReal = "";
		codigo = cod;
		detalhes = detal;
		duracao = dur;
		status = "nao iniciado";
		relatorio = "";
		msgInicio = msgI;
		msgEncerramento = msgE;
	}

	public String lerCodigo() {
		return codigo;
	}

	public String lerMensagemInicio() {
		return msgInicio;
	}

	public void iniciarMissao() {
		status = "iniciado";
	}



}
