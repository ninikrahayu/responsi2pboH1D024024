public class PaymentTest {
    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        EWalletPayment pembayaran = new EWalletPayment("OVO", 150000, 50000);

        System.out.printf("Saldo awal: %.0f\n", pembayaran.getBalance());
        System.out.printf("Memproses pembayaran sebesar %.0f...\n", pembayaran.getNominalPembayaran());
        System.out.println(pembayaran.processPayment());
        System.out.printf("Sisa saldo: %.0f\n", pembayaran.getBalance());
        System.out.println("Detail Transaksi: " + pembayaran.getPaymentDetails());
    }
}
