public class MakananBasah extends Makanan {
    private String bahan;

    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        super(nama, jumlah, harga);
        this.bahan = bahan;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Bahan: " + bahan);
    }
}