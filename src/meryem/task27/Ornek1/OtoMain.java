package meryem.task27.Ornek1;

import task27.Ornek1.Ford;

public class OtoMain {
    public static void main(String[] args) {
        task27.Ornek1.Ford ford1 = new Ford();
        ford1.setUretimYili(2020);
        System.out.println(ford1.getMarka());
        System.out.println(ford1.getUretimYili());
    }
}
