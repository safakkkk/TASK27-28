package safak.task27.sirket;

import task27.sirket.insan;

public class Calisan extends task27.sirket.insan {
    private int calisanId;

    public Calisan(String isim, String soyisim, int calisanId) {
        super(isim, soyisim);
        this.calisanId = calisanId;
    }

    @Override
    public void calis() {

        if (this.calisanId == 0) {

            System.out.println("Çalışan değil.");
            System.out.println("id =" + calisanId);
        } else
            System.out.println("Şirkette çalışıyor..");
        System.out.println("id = " + calisanId);

    }


    public static void main(String[] args) {
        task27.sirket.insan ogrenci = new Calisan("Ömer", "Özdemir", 0);
        task27.sirket.insan sekreter = new Calisan("Hande", "Yılmaz", 123);
        insan danisman = new Calisan("Hüseyin", "Özdemir", 22);


        ogrenci.Bilgilendirme();
        ogrenci.calis();

        danisman.Bilgilendirme();
        danisman.calis();

        sekreter.Bilgilendirme();
        sekreter.calis();

        sekreter.isimDegistir("Mahmut", "Akçay");

        sekreter.Bilgilendirme();


    }
}
