class DataHora {
	int dia;
	int mes;
	int ano;
	int hora;
	int minuto;

	void DataHora() {
		dia = 0;
		mes = 0;
		ano = 0;
		hora = 0;
		minuto = 0;
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

	void DefineHora(String palavra) {
		hora = Integer.parseInt(palavra);
	}

	void DefineMinuto(String palavra) {
		if(palavra.equals("meia")) minuto = 30;
		else minuto = Integer.parseInt(palavra);
	}

	boolean VerificaIgnorar(String palavra) {
		if(palavra.equals("de")
			|| palavra.equals("do")
			|| palavra.equals("hora")
			|| palavra.equals("horas")
			|| palavra.equals("e")) {
			return true;
		}
		return false;
	}


	String GetData() {
		return dia + "/" + mes + "/" + ano;
	}


	String GetHora() {
		return hora + ":" + minuto;
	}

	String GetDataHora() {
		return GetData() + " " + GetHora();
	}


}