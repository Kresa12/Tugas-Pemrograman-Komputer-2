class Elektronik{
    String merk;
    final String warna = "Hitam";
    private int harga;

    Elektronik(String merk, int harga){
        this.merk = merk;
        this.harga = harga;

    }

    int getHarga(){
        return harga;
    }

    void setHarga(int harga){
        this.harga = harga;
    }

    void show(){

        System.out.println("Merk elektronik : " + this.merk);
        System.out.println("Harga elektronik : " + this.harga);

        System.out.println("-------------------------");
    }
}
