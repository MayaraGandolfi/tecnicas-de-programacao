package br.com.ada.stream;

import java.time.LocalDate;

public class Jogo {
    private String time1;
    private String time2;
    private LocalDate data;
    private Placar placar;
    private int totalGols;

    public Jogo(String time1, String time2, LocalDate data, Placar placar) {
        this.time1 = time1;
        this.time2 = time2;
        this.data = data;
        this.placar = placar;
        this.totalGols = calculaTotalGols(placar);
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Placar getPlacar() {
        return placar;
    }

    public void setPlacar(Placar placar) {
        this.placar = placar;
    }

    public int getTotalGols() {
        return totalGols;
    }

    public void setTotalGols(int totalGols) {
        this.totalGols = totalGols;
    }

    public int calculaTotalGols(Placar placar){
        return placar.getPlacarTime1()+ placar.getPlacarTime2();
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "time1='" + time1 + '\'' +
                ", time2='" + time2 + '\'' +
                ", data=" + data +
                ", " + placar +
                ", totalGols=" + totalGols +
                '}';
    }
}
