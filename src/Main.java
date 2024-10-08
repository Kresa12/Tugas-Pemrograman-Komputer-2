class Elektronik{
    String merk;
    final String warna = "Hitam";
    private int harga;

    int getHarga(){
        return harga;
    }

    void setHarga(int harga){
        this.harga = harga;
    }
}

class Laptop extends Elektronik{
    String ram;

    void show(){
        System.out.println("Merk : " + this.merk);
        System.out.println("Warna : " + this.warna);
        System.out.println("Harga : " + getHarga());
        System.out.println("Ram : " + this.ram);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.merk = "Lenovo";
        System.out.println(laptop1.warna);
        laptop1.setHarga(1000);
        laptop1.ram = "16";
        laptop1.show();
    }
}
