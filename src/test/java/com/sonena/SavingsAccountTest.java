package com.sonena;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

    @Test //deposit  1000$
    public  void testValidDeposit(){
        BankAccount bankObj =  new SavingsAccount(2000);
        long accBalance = bankObj.depositAmount(1000) ;
        System.out.println(accBalance);
        Assert.assertEquals(3000,accBalance);
    }

    @Test(expected = RuntimeException.class)//Negative deposit amount test
    public void testNegitiveDepositAmount() {
        BankAccount bankObj = new SavingsAccount(3000);
        long accBalance = bankObj.depositAmount(-1000);
        System.out.println(accBalance);
    }

    @Test
    public void testValidWithdrawlAmount(){
        BankAccount bankObj = new SavingsAccount(2000);
        long withdrawlAmount = bankObj.withdrawAmount(2000);
        System.out.println(withdrawlAmount);
        Assert.assertEquals(0,withdrawlAmount);

    }

    @Test(expected = RuntimeException.class)// withdrawing negative amount
    public void testNegativeWithdrawlAmount(){
        BankAccount bankObj = new SavingsAccount(2000);
        long withdrawlAmount = bankObj.withdrawAmount(-2000);
        System.out.println(withdrawlAmount);

    }

    @Test(expected = RuntimeException.class) // withdrawing more amount than the balance amount
    public void testWithdrawlAmntMoreThanBalance(){
        BankAccount bankObj = new SavingsAccount(2000);
        long withdrawlAmount = bankObj.withdrawAmount(5000);
        System.out.println(withdrawlAmount);
    }


}