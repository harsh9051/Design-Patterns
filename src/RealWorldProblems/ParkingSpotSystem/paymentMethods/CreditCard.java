package RealWorldProblems.ParkingSpotSystem.paymentMethods;

public class CreditCard extends PaymentMethods{
    private String cardNumber;
    private int cvv;

    public CreditCard(String cardNumber, int cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }


    @Override
    public boolean initiatePayment(int amount) {
        System.out.println("Amount is Received by Card : "+ amount);
        System.out.println("Card Number is "+this.cardNumber);
        return true;
    }
}
