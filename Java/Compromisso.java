import java.util.*;

class Compromisso {
	String texto;
	int dia;
	int mes;
	int ano;
	int hora;
	int minuto;

	public Compromisso() {
		texto = "";
		dia = 0;
		mes = 0;
		ano = 0;
		hora = 0;
		minuto = 0;
	}
	public Compromisso(String t, int d, int m, int a, int h, int min) {
		texto = t;
		dia = d;
		mes = m;
		ano = a;
		hora = h;
		minuto = min;
	}

	void DefineDia(String palavra) {
		dia = Integer.parseInt(palavra);
	}
	void DefineMes(String palavra) {
		if(palavra.equals("janeiro") || palavra.equals("1") || palavra.equals("um")) mes = 1;
		if(palavra.equals("fevereiro") || palavra.equals("2") || palavra.equals("dois")) mes = 2;
		if(palavra.equals("marco") || palavra.equals("3") || palavra.equals("tres")) mes = 3;
		if(palavra.equals("abril") || palavra.equals("4") || palavra.equals("quatro")) mes = 4;
		if(palavra.equals("maio") || palavra.equals("5") || palavra.equals("cinco")) mes = 5;
		if(palavra.equals("junho") || palavra.equals("6") || palavra.equals("seis")) mes = 6;
		if(palavra.equals("julho") || palavra.equals("7") || palavra.equals("sete")) mes = 7;
		if(palavra.equals("agosto") || palavra.equals("8") || palavra.equals("oito")) mes = 8;
		if(palavra.equals("setembro") || palavra.equals("9") || palavra.equals("nove")) mes = 9;
		if(palavra.equals("outubro") || palavra.equals("10") || palavra.equals("dez")) mes = 10;
		if(palavra.equals("novembro") || palavra.equals("11") || palavra.equals("onze")) mes = 11;
		if(palavra.equals("dezembro") || palavra.equals("12") || palavra.equals("doze")) mes = 12;
	}
	void DefineAno(String palavra) {
		ano = Integer.parseInt(palavra);
	}
	void DefineMinuto(String palavra) {
		if(palavra.equals("meia")) minuto = 30;
		else minuto = Integer.parseInt(palavra);
	}
	void DefineHora(String palavra) {
		hora = Integer.parseInt(palavra);
	}
	boolean VerificaIgnorar(String palavra) {
		if(palavra.equals("de")
			|| palavra.equals("do")
			|| palavra.equals("hora")
			|| palavra.equals("horas")
			|| palavra.equals(":")
			|| palavra.equals("as")
			|| palavra.equals("às")
			|| palavra.equals("e")) {
			return true;
		}
		return false;
	}
	void DefineTexto(String compromisso) {
		texto = compromisso;
	}
	String VerAno() {
		return String.valueOf(ano);
	}
	String VerMes() {
		return String.valueOf(mes);
	}
	String VerDia() {
		return String.valueOf(dia);
	}
	String VerHora() {
		return String.valueOf(hora);
	}
	String VerMinuto() {
		return String.valueOf(minuto);
	}
	String VerTexto() {
		return texto;
	}

	String VerCompromisso() {
		return "Em " + VerDia() + "/" + VerMes() + "/" + VerAno() + " as " + VerHora() + ":" + VerMinuto() + " voce tem: " + VerTexto();
	}

	boolean VerificaInicio() {
		Date d = new Date();
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(d);
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minute = calendario.get(Calendar.MINUTE);

		Boolean verificacao = false;

		Comunicacao.Fala("AAAAAAAAAAAAAA:" + minute);

		if(String.valueOf(ano).equals(VerAno()))
			if(String.valueOf(mes).equals(VerMes()))
				if(String.valueOf(dia).equals(VerDia()))
					if(String.valueOf(hora).equals(VerHora()))
						if(String.valueOf(minute).equals(VerMinuto()))
							verificacao = true;
	
		return verificacao;
	}

}