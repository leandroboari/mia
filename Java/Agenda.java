import java.util.Vector;
import java.util.Calendar;
import java.util.Date;

public class Agenda {
	private Vector<Compromisso> compromissos = new Vector<Compromisso>();

	void AdicionarCompromisso() {
		Compromisso novoCompromisso = new Compromisso();
		Comunicacao.Fala("Qual o dia, mes e ano do seu compromisso?");
		String data = Comunicacao.Escuta();
		int palavraAtual = 0;

		if(data.equals("hoje")) {
			Date d = new Date();
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(d);
			int ano = calendario.get(Calendar.YEAR);
			int mes = calendario.get(Calendar.MONTH);
			int dia = calendario.get(Calendar.DAY_OF_MONTH);
			novoCompromisso.DefineDia(String.valueOf(dia));
			novoCompromisso.DefineMes(String.valueOf(mes + 1));
			novoCompromisso.DefineAno(String.valueOf(ano));
		} else if(data.equals("amanha")) {
			Date d = new Date();
			Calendar calendario = Calendar.getInstance(); 
			calendario.add(Calendar.DATE, 1);
			d = calendario.getTime();
			calendario.setTime(d);
			int ano = calendario.get(Calendar.YEAR);
			int mes = calendario.get(Calendar.MONTH);
			int dia = calendario.get(Calendar.DAY_OF_MONTH);
			novoCompromisso.DefineDia(String.valueOf(dia));
			novoCompromisso.DefineMes(String.valueOf(mes + 1));
			novoCompromisso.DefineAno(String.valueOf(ano));
		} else if(data.equals("depois de amanha")) {
			Date d = new Date();
			Calendar calendario = Calendar.getInstance(); 
			calendario.add(Calendar.DATE, 2);
			d = calendario.getTime();
			calendario.setTime(d);
			int ano = calendario.get(Calendar.YEAR);
			int mes = calendario.get(Calendar.MONTH);
			int dia = calendario.get(Calendar.DAY_OF_MONTH);
			novoCompromisso.DefineDia(String.valueOf(dia));
			novoCompromisso.DefineMes(String.valueOf(mes + 1));
			novoCompromisso.DefineAno(String.valueOf(ano));
		} else {
			String[] listaPalavrasData = data.trim().split("\\s+");
			novoCompromisso.DefineDia(listaPalavrasData[palavraAtual]);
			palavraAtual++;
			if(novoCompromisso.VerificaIgnorar(listaPalavrasData[palavraAtual])) {
				palavraAtual++;
			}
			novoCompromisso.DefineMes(listaPalavrasData[palavraAtual]);
			palavraAtual++;
			if(novoCompromisso.VerificaIgnorar(listaPalavrasData[palavraAtual])) {
				palavraAtual++;
			}
			novoCompromisso.DefineAno(listaPalavrasData[palavraAtual]);
		}		
		Comunicacao.Fala("OK. E o horario?");
		String horario = Comunicacao.Escuta();
		String[] listaPalavrasHora = horario.trim().split("\\s+");
		palavraAtual = 0;
		novoCompromisso.DefineHora(listaPalavrasHora[palavraAtual]);
		palavraAtual++;
		if(novoCompromisso.VerificaIgnorar(listaPalavrasHora[palavraAtual])) {
			palavraAtual++;
        }
		if(palavraAtual < listaPalavrasHora.length) {
			if(novoCompromisso.VerificaIgnorar(listaPalavrasHora[palavraAtual])) {
				palavraAtual++;
			}

			if(palavraAtual < listaPalavrasHora.length) {
				novoCompromisso.DefineMinuto(listaPalavrasHora[palavraAtual]);
			}
		}

		Comunicacao.Fala("E qual é o compromisso?");
		novoCompromisso.DefineTexto(Comunicacao.Escuta());

		compromissos.add(novoCompromisso);
		Comunicacao.Fala("Pronto, registrado!");
	}

	int ContaCompromissos() {
		return compromissos.size();
	}

	void LerCompromissos() {
		for(int i = 0; i < ContaCompromissos(); i++) {
			Comunicacao.Fala(compromissos.get(i).VerCompromisso());
		}
	}
}

