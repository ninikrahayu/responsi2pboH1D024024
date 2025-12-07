public class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int kebutuhanEnergi = jarak * 3;
        if (getLevelEnergi() < kebutuhanEnergi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - kebutuhanEnergi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        setLevelEnergi(getLevelEnergi() + jumlah);
        System.out.println("Energi pesawat bertambah.");
    }

    // ================= METHOD KHUSUS =================
    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak mencukupi!");
        }
    }
}
