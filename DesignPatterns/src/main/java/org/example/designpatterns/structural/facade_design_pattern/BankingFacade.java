package org.example.designpatterns.structural.facade_design_pattern;

public class BankingFacade {
    private AccountService accountService;
    private BillPaymentService billPaymentService;
    private TransferService transferService;

    public BankingFacade(){
        this.accountService=new AccountService();
        this.billPaymentService=new BillPaymentService();
        this.transferService=new TransferService();
    }

    public void getAccountDetails(String accountId){
        accountService.getAccountDetails(accountId);
    }

    public void transferFunds(String billId, String accountId, double amount){
        billPaymentService.billPaymentDetails(billId,accountId,amount);
    }

    public void payBill(String fromAccountId, String toAccountId, double amount){
        transferService.transferAmount(fromAccountId, toAccountId, amount);
    }
}

