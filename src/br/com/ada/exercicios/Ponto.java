package br.com.ada.exercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ponto {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Digite a hora de entrada:");
        var horaManhaEntrada = io.nextLine();


        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime[] horarioFormatado = new LocalTime[4];

        LocalTime.parse(horaManhaEntrada, formatoHora);
        for (int i = 0; i < 4; i++) {
            horarioFormatado[i]  = LocalTime.parse(horaManhaEntrada.split("\\|")[i], formatoHora);
        }

        var diferencaMinutosManha = (int) ChronoUnit.MINUTES.between(horarioFormatado[0], horarioFormatado[1]);
        var diferencaMinutosTarde = (int) ChronoUnit.MINUTES.between(horarioFormatado[2], horarioFormatado[3]);


        if (diferencaMinutosManha != 240){
            System.out.println("Abusou");
        } //else if(horarioFormatado[0] )


        System.out.print(horaManhaEntrada.split("\\|")[0].getClass().getSimpleName());


    }
}
