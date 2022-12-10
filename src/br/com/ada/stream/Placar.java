package br.com.ada.stream;

public class Placar {
    private int placarTime1;
    private int placarTime2;

    public Placar(int placarTime1, int placarTime2) {
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    @Override
    public String toString() {
        return "Placar [" +
                "Time1= " + placarTime1 +
                " X Time2= " + placarTime2 +
                ']';
    }
}
