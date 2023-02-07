package day07;

public class Muhasebe extends Personel {

    //Muhasebe classi child class oldu
    //Personel classi parent class oldu
    //Inheritance yapisini olusturmak icin extends keywordu kullaniriz

    //child class extends parent class

    public int saatUcreti;
    public String statu;
    public int maas;

    public int maasHesapla() {

        maas = 30*8*saatUcreti;

        return maas;
    }

}
