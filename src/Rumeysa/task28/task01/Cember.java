package Rumeysa.task28.task01;

public class Cember implements Sekil{

    private double yariCap;
    @Override
    public int cevre(int... boyut) {
        return (int) (2 * PI * yariCap);
    }

    @Override
    public int alan(int... boyut) {
        return (int) (PI * yariCap * yariCap);
    }
}
