	public class Interpretador {

	public static Vector<String> adicionar = new Vector<String>();
	public static Vector<String> buscar = new Vector<String>();
	public static Vector<String> listar = new Vector<String>();
	public static Vector<String> remover = new Vector<String>();
	public static Vector<String> editar = new Vector<String>();


	public Interpretador() {	
		adicionar.add("adicionar");
		adicionar.add("colocar");
		adicionar.add("inserir");
		adicionar.add("fazer");
		adicionar.add("novo");

		buscar.add("buscar");
		buscar.add("procurar");
		buscar.add("achar");
		buscar.add("encontrar");
		
		listar.add("listar");
		listar.add("visualizar");
		listar.add("ver");
		
		editar.add("editar");
		editar.add("mudar");
		editar.add("alterar");
		editar.add("modificar");

		remover.add("remover");
		remover.add("tirar");
		remover.add("apagar");
		remover.add("deletar");
		remover.add("excluir");
		remover.add("esquecer");

	}

	private String ConverteSingular(String palavra) {
		String novaPalavra = "";
		int tamanho = palavra.length;
		for(int i = 0; i < tamanho; i++) {
			if(i != tamanho - 1) {
				novaPalavra = novaPalavra + palavra[i];
			} else {
				if(palavra[i] != "s") {
					novaPalavra = novaPalavra + palavra[i];
				}
			}	
		}
		return novaPalavra;
	}
	

	public static String Processar(String frase) {
		String[] listaPalavras = ListaPalavras(frase);
		int contaPalavras = listaPalavras.lenght;

		if(ListaPalavras.contains())

	}
	
	public static String[] ListaPalavras(String frase) {
		return frase.trim().split("\\s+");
	}


}