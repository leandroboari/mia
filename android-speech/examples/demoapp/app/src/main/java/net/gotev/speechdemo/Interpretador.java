package net.gotev.speechdemo;

import java.util.*;

public class Interpretador {
    private final Vector<String> adicionar = new Vector<String>();
    private final Vector<String> buscar = new Vector<String>();
    private final Vector<String> listar = new Vector<String>();
    private final Vector<String> remover = new Vector<String>();
    private final Vector<String> editar = new Vector<String>();
    private final Vector<String> aleatorizar = new Vector<String>();
    private final Vector<String> iniciar = new Vector<String>();
    private final Vector<String> encerrar = new Vector<String>();

    public Interpretador() {
        adicionar.add("adicionar");
        adicionar.add("adicione");
        adicionar.add("colocar");
        adicionar.add("inserir");
        adicionar.add("fazer");
        adicionar.add("agendar");
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

        aleatorizar.add("contar");
        aleatorizar.add("fala");
        aleatorizar.add("dê");
        aleatorizar.add("fale");
        aleatorizar.add("conte");
        aleatorizar.add("conta");

        iniciar.add("iniciar");
        iniciar.add("começar");

        encerrar.add("encerrar");
        encerrar.add("finalizar");
        encerrar.add("terminar");
        encerrar.add("acabar");

    }

    private String ConverteSingular(String palavra) {
        String novaPalavra = "";
        int tamanho = palavra.length();
        for(int i = 0; i < tamanho; i++) {
            if(i != tamanho - 1) {
                novaPalavra = novaPalavra + palavra.charAt(i);
            } else {
                if(!String.valueOf(palavra.charAt(i)).equals("s")) {
                    novaPalavra = novaPalavra + palavra.charAt(i);
                }
            }
        }
        return novaPalavra;
    }


    public String Processar(String frase) {
        String[] listaPalavras = ListaPalavras(frase);
        int contaPalavras = listaPalavras.length;

        String verbo = "";
        for(int i = 0; i < contaPalavras; i++) {
            String palavraAtual = ConverteSingular(listaPalavras[i].toLowerCase());

            if(adicionar.contains(palavraAtual)) verbo = "adicionar";
            if(buscar.contains(palavraAtual)) verbo = "buscar";
            if(listar.contains(palavraAtual)) verbo = "listar";
            if(editar.contains(palavraAtual)) verbo = "editar";
            if(remover.contains(palavraAtual)) verbo = "remover";
            if(aleatorizar.contains(palavraAtual)) verbo = "aleatorizar";
            if(iniciar.contains(palavraAtual)) verbo = "iniciar";
            if(encerrar.contains(palavraAtual)) verbo = "encerrar";
        }

        String funcao = "";
        for(int i = 0; i < contaPalavras; i++) {
            String palavraAtual = ConverteSingular(listaPalavras[i].toLowerCase());

            if(palavraAtual.equals("compromisso")) funcao = "compromisso";
            if(palavraAtual.equals("piada")) funcao = "piada";
            if(palavraAtual.equals("nota")) funcao = "nota";
            if(palavraAtual.equals("missão")) funcao = "missao";
        }

        return verbo + " " + funcao;

    }

    public static String[] ListaPalavras(String frase) {
        return frase.trim().split("\\s+");
    }


}