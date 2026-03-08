package latihan_pbo.tugas1;

class Cafe {

    String nama;
    int espresso;
    int susu;
    double foam;

    public Cafe(String nama, int espresso, int susu, double foam) {
        this.nama = nama;
        this.espresso = espresso;
        this.susu = susu;
        this.foam = foam;
    }

    public void mix() {

        System.out.println("Nama Minuman: " + nama);
        System.out.println("Espresso : " + espresso + " slot");
        System.out.println("Susu     : " + susu + " slot");
        System.out.println("Foam     : " + foam + " slot");

        if (espresso == 1 && susu == 2 && foam == 0.5) {
            System.out.println("Hasil: Moccachino");
        } 
        else if (espresso == 1 && susu == 1 && foam == 0.5) {
            System.out.println("Hasil: Cappuccino");
        } 
        else if (espresso == 2 && susu == 1 && foam == 0) {
            System.out.println("Hasil: Latte");
        } 
        else {
            System.out.println("Hasil: Kopi Custom");
        }
    }

    public void bandingkan() {

        if (espresso > susu) {
            System.out.println("Rasa kopi lebih kuat");
        } 
        else if (espresso == susu) {
            System.out.println("Rasa seimbang");
        } 
        else {
            System.out.println("Rasa susu lebih dominan");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Cafe kopi1 = new Cafe("Moccachino", 1, 2, 0.5);
        kopi1.mix();
        kopi1.bandingkan();

        System.out.println();

        Cafe kopi2 = new Cafe("Custom Kopi", 2, 1, 0);
        kopi2.mix();
        kopi2.bandingkan();
    }
}