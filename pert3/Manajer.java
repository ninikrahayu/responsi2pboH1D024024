class Manajer extends Karyawan {
    private double tunjangan;

    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);   // memanggil constructor Karyawan
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);
        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + totalGaji);
    }
}
