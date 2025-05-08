// NO 2
// Superclass
class Kendaraan {
    Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

// Subclass
class Mobil extends Kendaraan {
    Mobil() {
        super(); // Panggil konstruktor dari superclass
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

// Kelas utama
public class Program {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
    }
}
