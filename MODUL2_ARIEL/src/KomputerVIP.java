public class KomputerVIP extends Komputer {
    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void Informasi() {
        super.Informasi();
        System.out.println("VIP Card: " + (vipCard ? "Yes" : "No"));
    }

    public void Login(String Username) {
        System.out.println("Login dengan Username: " + Username);
    }

    public void Bermain(int jam) {
        System.out.println("Bermain selama: " + jam + " jam");
    }

    public void Bermain(int jam, int menitTambahan) {
        System.out.println("Bermain selama: " + jam + " jam dan " + menitTambahan + " menit");
    }
}