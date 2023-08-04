package Rumeysa.task28.task01;

public class Dikdortgen implements Sekil{

    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public int cevre(int... boyut) {
        return (2 * (kisaKenar + uzunKenar));
    }

    @Override
    public int alan(int... boyut) {
        return kisaKenar * uzunKenar;
    }
}
