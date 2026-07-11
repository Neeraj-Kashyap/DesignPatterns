package org.example.designpatterns.structural.facade_design_pattern;


/**
 * Article for reference
 * https://medium.com/@akshatsharma0610/facade-design-pattern-in-java-777005efc75f
 */
public class Main {

    public static void main(String[] args){
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.getAccountDetails("123456");
        bankingFacade.payBill("123456","654321", 1000.0);
        bankingFacade.transferFunds("123456","BILL01", 500.00);

    }
}
