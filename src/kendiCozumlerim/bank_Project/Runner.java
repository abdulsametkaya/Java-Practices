package kendiCozumlerim.bank_Project;

public class Runner {
    public static void main(String[] args) {

        OperationsTRY opr = new OperationsTRY();
        opr.defaultCustomers();
        opr.balanceInquiry();
        //opr.withdrawal();
        //opr.deposit();
        opr.moneyTransfer();
    }
}
