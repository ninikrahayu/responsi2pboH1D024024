class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] mesin = new defaultMesin[5];

        mesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (int i = 0; i < mesin.length; i++) {
            mesin[i].tampilInfo();
            System.out.println("Kategori: " + mesin[i].kategoriMesin());
            System.out.println("Performa: " + mesin[i].nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (int i = 0; i < mesin.length; i++) {
            if (mesin[i] instanceof mesinMotor) {
                ((mesinMotor) mesin[i]).suaraMesin();
            }
            else if (mesin[i] instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) mesin[i]).suaraMesin();
            }
            else if (mesin[i] instanceof mesinTraktor) {
                ((mesinTraktor) mesin[i]).suaraMesin();
            }
        }

        defaultMesin terbaik = mesin[0];
        for (int i = 1; i < mesin.length; i++) {
            if (mesin[i].nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = mesin[i];
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        for (int i = 0; i < mesin.length - 1; i++) {
            for (int j = i + 1; j < mesin.length; j++) {
                if (mesin[j].nilaiPerforma() > mesin[i].nilaiPerforma()) {
                    defaultMesin temp = mesin[i];
                    mesin[i] = mesin[j];
                    mesin[j] = temp;
                }
            }
        }

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + mesin[i].namaMesin + " → " + mesin[i].nilaiPerforma());
        }
    }
}