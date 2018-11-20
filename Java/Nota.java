public class Nota {
	private String identificacao;
	private String nota;

	// Construtor do objeto
	public Nota(String id, String n) {
		identificacao = id;
		nota = n;
	}

	public void AlteraNota(String nota) {
		this.nota = nota;
	}

	public String PegaIdentificacao() {
		return identificacao;
	}

	public String PegaNota() {
		return nota;
	}
}