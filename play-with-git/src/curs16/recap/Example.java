package curs16.recap;

public class Example {
    public static void main(String[] args) {

        BankAccount.BankAccountBuilder builder = BankAccount.builder();

        BankAccount build = builder
                .withEmail("email")
                .withNewsletter(true)
                .withName("name")
                .withAccountNumber("accoutnNumb").build();

    }
}


class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;


    // copy-constructor
    private BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.email = bankAccountBuilder.email;
        this.newsletter = bankAccountBuilder.newsletter;
    }

    public static BankAccountBuilder builder() {
        return new BankAccountBuilder();
    }


    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        private BankAccountBuilder() {
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder withNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccountBuilder withName(String name) {
            this.name = name;
            return this;
        }


        public BankAccountBuilder withAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}