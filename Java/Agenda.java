import java.util.Vector;
import java.util.Calendar;

public class Agenda {
	private Vector<Compromisso> compromissos = new Vector<Compromisso>();

	void AdicionarCompromisso() {
		Compromisso novoCompromisso = new Compromisso();
		Comunicacao.Fala("Qual o dia, mes e ano do seu compromisso?");
		String data = Comunicacao.Escuta();

		// Calendar calendario = Calendar.getInstance();
		// Date hoje = calendario.getTime();
		// int dia = calendar.get(Calendar.DAY_OF_MONTH);
		// int mes = calendar.get(Calendar.MONTH);
		// int ano = calendar.get(Calendar.YEAR);

		if(data.equals("hoje")) {
			novoCompromisso.DefineDia(dia);
			novoCompromisso.DefineMes(mes);
			novoCompromisso.DefineAno(ano);
		} else if(data.equals("amanhã")) {
			novoCompromisso.DefineDia();
			novoCompromisso.DefineMes();
			novoCompromisso.DefineAno();
		} else if(data.equals("depois de amanhã")) {
			novoCompromisso.DefineDia();
			novoCompromisso.DefineMes();
			novoCompromisso.DefineAno();
		} else {
			String[] listaPalavrasData = data.trim().split("\\s+");
			int palavraAtual = 0;
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

