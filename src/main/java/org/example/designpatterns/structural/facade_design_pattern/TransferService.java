package org.example.designpatterns.structural.facade_design_pattern;

public class TransferService {

    public void transferAmount(String fromAccountId, String toAccountId, double amount){
        System.out.println("Transferring from "+fromAccountId+" to the "+toAccountId+", total amount"+amount);
    }
}
