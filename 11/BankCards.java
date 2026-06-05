public class BankCards {
    public static class BankCard {
        private String cardNumber;
        private String cardHolderName;
        private String expiryDate;
        private String bankName;

        public BankCard(String cardNumber, String cardHolderName, String expiryDate, String bankName) {
            this.cardNumber = cardNumber;
            this.cardHolderName = cardHolderName;
            this.expiryDate = expiryDate;
            this.bankName = bankName;
        }

        public void displayCardInfo() {
            System.out.println("Bank: " + bankName);
            System.out.println("Card Holder: " + cardHolderName);
            System.out.println("Card Number: " + cardNumber);
            System.out.println("Expiry Date: " + expiryDate);
        }
    }

    public static class DebitCard extends BankCard {
        private double balance;

        public DebitCard(String cardNumber, String cardHolderName, String expiryDate, String bankName, double balance) {
            super(cardNumber, cardHolderName, expiryDate, bankName);
            this.balance = balance;
        }

        @Override
        public void displayCardInfo() {
            super.displayCardInfo();
            System.out.println("Balance: $" + balance);
        }
    }

    public static class CreditCard extends BankCard {
        private double creditLimit;
        private double outstandingBalance;

        public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String bankName, double creditLimit, double outstandingBalance) {
            super(cardNumber, cardHolderName, expiryDate, bankName);
            this.creditLimit = creditLimit;
            this.outstandingBalance = outstandingBalance;
        }

        @Override
        public void displayCardInfo() {
            super.displayCardInfo();
            System.out.println("Credit Limit: $" + creditLimit);
            System.out.println("Outstanding Balance: $" + outstandingBalance);
        }
    }

    public static class StudentDebitCard extends DebitCard {
        public StudentDebitCard(String cardNumber, String cardHolderName, String expiryDate, String bankName, double balance) {
            super(cardNumber, cardHolderName, expiryDate, bankName, balance);
        }

        @Override
        public void displayCardInfo() {
            System.out.println("Student Debit Card");
            super.displayCardInfo();
        }
    }

    public static class PlatinumCreditCard extends CreditCard {
        public PlatinumCreditCard(String cardNumber, String cardHolderName, String expiryDate, String bankName, double creditLimit, double outstandingBalance) {
            super(cardNumber, cardHolderName, expiryDate, bankName, creditLimit, outstandingBalance);
        }

        @Override
        public void displayCardInfo() {
            System.out.println("Platinum Credit Card");
            super.displayCardInfo();
        }
    }

    public static void main(String[] args) {
        StudentDebitCard studentDebitCard = new StudentDebitCard("1234567890123456", "John Doe", "12/24", "Bank of Student", 1500.00);
        PlatinumCreditCard platinumCreditCard = new PlatinumCreditCard("6543210987654321", "Jane Doe", "11/25", "Premium Bank", 10000.00, 2000.00);

        studentDebitCard.displayCardInfo();
        System.out.println();
        platinumCreditCard.displayCardInfo();
    }
}


