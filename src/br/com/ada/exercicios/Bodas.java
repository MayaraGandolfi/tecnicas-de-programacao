package br.com.ada.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bodas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a data de casamento:");
        var dataCasamento = input.nextLine();
        System.out.println("Digite a outra data:");
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataCasamentoFormatada = LocalDate.parse(dataCasamento, formatoData);

        var outraData = input.nextLine();
        LocalDate outraDataFormatada = LocalDate.parse(outraData, formatoData);

        var bodas = (int) ChronoUnit.YEARS.between(dataCasamentoFormatada, outraDataFormatada);

        if (bodas >= 1 && bodas < 5) {
            System.out.println("br.com.ada.exercicios.Bodas de papel");
        } else if (bodas < 10) {
            System.out.println("br.com.ada.exercicios.Bodas de madeira ou ferro");
        } else if (bodas < 15) {
            System.out.println("br.com.ada.exercicios.Bodas de estanho");
        } else if (bodas < 30) {
            System.out.println("br.com.ada.exercicios.Bodas de cristal");
        } else if (bodas < 40) {
            System.out.println("br.com.ada.exercicios.Bodas de pérola");
        } else if (bodas < 50) {
            System.out.println("br.com.ada.exercicios.Bodas de esmeralda");
        } else {
            System.out.println("br.com.ada.exercicios.Bodas de ouro");
        }


    }
}
