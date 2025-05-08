// NO 1
// Superclass
class Hewan {
    String suara = "Suara hewan";
}

// Subclass
class Kucing extends Hewan {
    String suara = "Meong";

    void tampilkanSuara() {
        System.out.println("suara milik kelas Kucing: " + suara);
        System.out.println("suara milik kelas Hewan: " + super.suara);
    }
}

// Program utama
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.tampilkanSuara();
    }
}
