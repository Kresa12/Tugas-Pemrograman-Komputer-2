public class Main {
    public static void main(String[] args) {

        //memanggil class parent
        Elektronik elektronik1 = new Elektronik("Toshiba", 5000000);
        elektronik1.show();

        //memanggil class child
        Laptop laptop1 = new Laptop("lenovo", 600000, "16");
        laptop1.setHarga(laptop1.getHarga());
        laptop1.show();

        Laptop laptop2 = new Laptop("HP", 700000, "8");
        laptop2.setHarga(laptop2.getHarga());
        laptop2.show();
    }
}
