package utilities;

//class that packages the encrypted and decrypted number of the card together
//Warning: class in not used anywhere but deleting it causes a module-related error
public class BankCard {
    private String cardNumber;      //the card number before encryption
    private String encryptedNumber; //the card number after encryption

    public BankCard(String card, String encrypted)
    {
        setCardNumber(card);
        setEncryptedNumber(encrypted);
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setEncryptedNumber(String encryptedNumber) {
        this.encryptedNumber = encryptedNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getEncryptedNumber() {
        return encryptedNumber;
    }
}
