package entity.payment;

public class DomesticCreditCard extends PaymentCard{
	private String issuingBank;
    private String cardNumber;
    private String owner;
    private String validFromDate;

    public DomesticCreditCard(String issuingBank, String cardNumber, String owner, String validFromDate){
        this.issuingBank = issuingBank;
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.validFromDate = validFromDate;
    }
}
