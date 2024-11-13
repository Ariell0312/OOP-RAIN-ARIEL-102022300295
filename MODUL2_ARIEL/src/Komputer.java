    public class Komputer {
        protected int jumlahKomputer;
        protected String namaWarnet;
        protected float hargaPerJam;
    
        public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
            this.jumlahKomputer = jumlahKomputer;
            this.namaWarnet = namaWarnet;
            this.hargaPerJam = hargaPerJam;
        }
    
        public void Informasi() {
            System.out.println("Nama Warnet: " + namaWarnet);
            System.out.println("Jumlah Komputer: " + jumlahKomputer);
            System.out.println("Harga per Jam: " + hargaPerJam);
        }
    }
    
