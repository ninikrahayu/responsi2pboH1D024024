public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;

    public EWalletPayment(String namaLayanan, double saldoPengguna, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldoPengguna = saldoPengguna;
        this.nominalPembayaran = nominalPembayaran;
    }

    @Override
    public String processPayment() {
        double total = nominalPembayaran + getTransactionFee();

        if (saldoPengguna >= total) {
            saldoPengguna -= total;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000; // fee tetap Rp 2.000
    }

    @Override
    public double getBalance() {
        return saldoPengguna;
    }

    public double getNominalPembayaran() {
        return nominalPembayaran;
    }
}
