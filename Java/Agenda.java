import java.util.*;

public class Agenda {
	// Atributos
	int numComprimissos;

	// Construtor
	void Agenda() {
		numComprimissos = 0;
	}

	void AdicionarCompromisso() {
		DataHora dh = new DataHora();

		Comunicacao c = new Comunicacao();
		c.Fala("Qual o dia, mes e ano do seu compromisso?");
		String data = c.Escuta();

		String[] listaPalavrasData = data.trim().split("\\s+");

		int palavraAtual = 0;

		dh.DefineDia(listaPalavrasData[palavraAtual]);

		palavraAtual++;

		if(dh.VerificaIgnorar(listaPalavrasData[palavraAtual])) {
			palavraAtual++;
		}

		dh.DefineMes(listaPalavrasData[palavraAtual]);

		palavraAtual++;

		if(dh.VerificaIgnorar(listaPalavrasData[palavraAtual])) {
			palavraAtual++;
		}

		dh.DefineAno(listaPalavrasData[palavraAtual]);

		c.Fala("OK. E o horario?");
		String horario = c.Escuta();

		String[] listaPalavrasHora = horario.trim().split("\\s+");
		
		palavraAtual = 0;

		dh.DefineHora(listaPalavrasHora[palavraAtual]);

		palavraAtual++;

		if(dh.VerificaIgnorar(listaPalavrasHora[palavraAtual])) {
			palavraAtual++;
		}

		if(palavraAtual < listaPalavrasHora.length) {
			if(dh.VerificaIgnorar(listaPalavrasHora[palavraAtual])) {
				palavraAtual++;
			}

			if(palavraAtual < listaPalavrasHora.length) {
				dh.DefineMinuto(listaPalavrasHora[palavraAtual]);
			}
		}

		c.Fala(dh.GetDataHora());
		
	}
}

