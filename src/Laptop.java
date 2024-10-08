class Laptop extends Elektronik{
    String ram;

    Laptop(String merk, int harga, String ram){
        super(merk, harga);
        this.ram = ram;
    }

    void show(){
        System.out.println("Merk : " + this.merk);
        System.out.println("Warna : " + this.warna);
        System.out.println("Harga : " + getHarga());
        System.out.println("Ram : " + this.ram);

        System.out.println("-------------------------------------------------");
    }
}
