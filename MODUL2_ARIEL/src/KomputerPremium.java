    public class KomputerPremium extends Komputer {
        protected boolean ruangPrivat;
    
        public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
            super(jumlahKomputer, namaWarnet, hargaPerJam);
            this.ruangPrivat = ruangPrivat;
        }
    
        @Override
        public void Informasi() {
            super.Informasi();
            System.out.println("Ruang Privat: " + (ruangPrivat ? "Yes" : "No"));
        }
    
        public void Pesan(int nomorKomputer) {
            System.out.println("Memesan Komputer nomor: " + nomorKomputer);
        }
    
        public void TambahLayanan(String makanan) {
            System.out.println("Layanan makanan tambahan: " + makanan);
        }
    
        public void TambahLayanan(String makanan, String minuman) {
            System.out.println("Layanan makanan tambahan: " + makanan + ", Minuman tambahan: " + minuman);
        }
    }
