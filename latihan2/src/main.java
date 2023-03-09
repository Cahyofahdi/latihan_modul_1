import java.util.ArrayList;
public class main {
        public static void main(String[] args) {
                ArrayList<Konsumsi>ListKonsumsi= new ArrayList<>();
                Konsumsi<Makanan, Minuman>Breakfast = new Konsumsi<>();
                Konsumsi<Makanan,Minuman>Lunch = new Konsumsi<>();

                Makanan roti = new Makanan();
                roti.setNamaHidangan("Roti Tawar");
                Minuman susu = new Minuman();
                susu.setNamaHidangan("Susu Sapi");
                Breakfast.setKonsumsi(roti, susu);
                ListKonsumsi.add(Breakfast);

                Makanan Nasi = new Makanan();
                Nasi.setNamaHidangan("Nasi Putih");
                Minuman air = new Minuman();
                air.setNamaHidangan("Air putih");

                System.out.println("Menu Konsumsi : ");
                for (Konsumsi<Makanan,Minuman> konsumsi : ListKonsumsi){
                        Makanan makanan = konsumsi.getM();
                        Minuman minuman = konsumsi.getI();

                        System.out.println(makanan.disantap());
                        System.out.println(minuman.disantap());
                }

        }
}