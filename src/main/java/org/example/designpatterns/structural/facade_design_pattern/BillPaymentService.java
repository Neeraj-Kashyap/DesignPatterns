package org.example.designpatterns.structural.facade_design_pattern;

public class BillPaymentService {
    public void billPaymentDetails(String billId, String accountId, double amount){
        System.out.println("Bill payment for "+billId+"for the account "+accountId+", total amount "+amount);
    }
}
