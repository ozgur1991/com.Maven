package day07;

public class Isci extends Muhasebe {

    //ACCESS MODIFIERS
    //public: herkes ulasabilir
    //protected: ayni package veya child class tan ulasilabilir
    //default(birsey yazmayinca default kabul eder): ayni package dan ve o classin icinden ulasilabilir
    //private : sadece o class icinde kullanabiliriz


    public static void main(String[] args) {

        Isci isci1 = new Isci();

        isci1.isim="ozgur";
        isci1.soyIsim="asula";
        isci1.id=1001;
        isci1.izindeMi=false;
        isci1.saatUcreti=10;
        isci1.statu="Isci";
        isci1.maas = isci1.maasHesapla();

        System.out.println(isci1.id+ " "+ isci1.isim+" "+isci1.soyIsim+" "+
                isci1.statu+" "+isci1.maas+" tl");

        Isci isci2 = new Isci();


    }
}
