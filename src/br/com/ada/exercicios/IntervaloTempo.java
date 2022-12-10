package br.com.ada.exercicios;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class IntervaloTempo {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Digite a letra A");
        String A = io.nextLine();
        var dataHoraLetraA = LocalTime.now();

        System.out.println("Digite a letra B");
        String B = io.nextLine();
        var dataHoraLetraB = LocalTime.now();

        long secundos = ChronoUnit.SECONDS.between(dataHoraLetraA, dataHoraLetraB);
        Duration duration = Duration.ofSeconds(secundos);
        System.out.println("Duracao do intervalo: " + duration);

    }
}