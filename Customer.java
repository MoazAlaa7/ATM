public class Customer {
    private Card customerATMCard;

    public Customer(Card newATMCard) {
        customerATMCard = newATMCard;
    }

    public Card getATMCard() { return customerATMCard; }

}
