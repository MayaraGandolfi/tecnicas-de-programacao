package br.com.ada.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Campeonato {
    public static void main(String[] args) {
        ArrayList<Jogo> jogos = new ArrayList<>();
        LocalDate data = LocalDate.now();

        Jogo jogo1 = new Jogo("dBrasil", "Alemanha", data, new Placar(1, 7));
        Jogo jogo2 = new Jogo("bBrasil", "Coreia", data, new Placar(4, 1));
        Jogo jogo3 = new Jogo("cBrasil", "Camarões", data, new Placar(0, 1));
        Jogo jogo4 = new Jogo("aBrasil", "Suiça", data, new Placar(4, 2));

        jogos.add(jogo1);
        jogos.add(jogo2);
        jogos.add(jogo3);
        jogos.add(jogo4);

        // Stream<Jogo> streamJogo = jogos.stream();
//        max(jogos.stream());
//        min(jogos.stream());
//        reduce(jogos.stream());
//        ordenar(jogos.stream());
//        filtros(jogos.stream());
        filtrosLetraA(jogos.stream());


    }

    private static void filtrosLetraA(Stream<Jogo> streamJogos){
        streamJogos.filter(item -> item.getTime1().toLowerCase().contains("u") || item.getTime2().toLowerCase().contains("u"))
                .forEach(System.out::println);
    }


    private static void filtros(Stream<Jogo> streamJogos) {
        Jogo value = streamJogos
                .filter(item -> item.getPlacar().getPlacarTime1() == item.getPlacar().getPlacarTime1())
                .findAny()
                .orElse(null);
        System.out.println(value);

//        if (value.isPresent()) {
//            System.out.println(value.get());
//        } else {
//            System.out.println("Nenhum empatado");
//        }
    }

    private static void ordenar(Stream<Jogo> streamJogo) {
        streamJogo.sorted(Comparator.comparing(Jogo::getTotalGols).reversed()).forEach(System.out::println);
    }

    private static void reduce(Stream<Jogo> streamJogo) {
        var value = streamJogo.reduce(0, (s, jogo) -> s + jogo.getTotalGols(), Integer::sum);
        System.out.println(value);
    }


    private static void max(Stream<Jogo> streamJogo) {
        var value = streamJogo.max(Comparator.comparingInt(Jogo::getTotalGols));
        if (value.isPresent()) {
            System.out.println("Maior - " + value.get().toString());
        } else {
            System.out.println("Não existe maior.");
        }
    }

    private static void min(Stream<Jogo> streamJogo) {
        var value = streamJogo.min(Comparator.comparing(Jogo::getTotalGols));
        if (value.isPresent()) {
            System.out.println("Menor - " + value.get().toString());

        } else {
            System.out.println("Não existe maior.");
        }
    }

}
