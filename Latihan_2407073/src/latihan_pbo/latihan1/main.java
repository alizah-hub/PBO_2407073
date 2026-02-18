package latihan_pbo.latihan1;


class Cafe{
    String nama;
    String alamat;

    //constructor
    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama cafenya adalah "+ nama);
        System.out.println(alamat);
        System.out.println("============================");
    }

    //method
    void buka(){
        System.out.println("================================");
        System.out.println("Cafe Sudah Buka");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
public class main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe ("Kenangan", "IMKOT");
        Cafe cafe2 = new Cafe ( "Kopi Janji Jiwa","Indramayu");
        Cafe cafe3 = new Cafe ("Kopi himalaya", "Cirebon");
        cafe3,setNama("Kopi Hitam");
        cafe3.buka
        
        // Cafe cafe1 = new Cafe();
        // cafe1.nama = "Kopi Kenangan";
        // cafe1.alamat = "Indramayu";

        // System.out.println("Nama cafe: " + cafe1.nama );
        // System.out.println("Alamat cafe: " + cafe1.alamat );

        // System.out.println("===========================");


        // Cafe cafe2 = new Cafe();
        // cafe2.nama = "Cozy";
        // cafe2.alamat = "Jatibarang";

        // System.out.println("Nama cafe: " + cafe2.nama );
        // System.out.println("Alamat cafe: " + cafe2.alamat );

        // Cafe cafe3 = new Cafe();
        // cafe3.nama = "Teraz";
        // cafe3.alamat = "Losarang";

        // System.out.println("Nama cafe: " + cafe3.nama );
        // System.out.println("Alamat cafe: " + cafe3.alamat );



    }
}
