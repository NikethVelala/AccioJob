public class Paytm implements UPIPayment{

    @Override
    public String doPayments(String source, String dest) {
        String txDate = UPIPayment.datePatterns("yyyy-MM-dd");
        return null;
    }

    //optional you can either implement or no need to implement
    @Override
    public double getScratchCard() {
        return UPIPayment.super.getScratchCard();
    }
}
