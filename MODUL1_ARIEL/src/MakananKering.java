public class MakananKering extends Makanan {
    private String brand;

    public MakananKering(String nama, int jumlah, double harga, String brand) {
        super(nama, jumlah, harga);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Brand: " + brand);
    }
}