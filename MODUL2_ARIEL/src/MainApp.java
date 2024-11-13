    public class MainApp {
        public static void main(String[] args) {
            KomputerVIP vipUser = new KomputerVIP(20, "Warnet Gaming X", 5000, true);
            vipUser.Informasi();
            vipUser.Login("AsepVIP");
            vipUser.Bermain(2);
            vipUser.Bermain(2, 30);
    
            System.out.println();
    
            KomputerPremium premiumUser = new KomputerPremium(15, "Warnet Gaming X", 7000, true);
            premiumUser.Informasi();
            premiumUser.Pesan(5);
            premiumUser.TambahLayanan("Mie Goreng");
            premiumUser.TambahLayanan("Mie Goreng", "Es Teh");
        }
    }