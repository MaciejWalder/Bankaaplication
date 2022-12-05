

public class User {

    private String name;
    private String surename;
    private String login;
    private int pesel;
    private int account;
    private double balance;

    public User(String name, String surename, int pesel) {
        this.name = name;
        this.surename = surename;
        this.pesel = pesel;
        this.login = loginGenerator(name, surename);
        this.balance = 100;
        this.account = 1;

    }

    public String loginGenerator(String name, String surename) {
        return (name.substring(0, 3) + surename.substring(0, 3));

    }

    public void userDetails() {
        System.out.println("Nr. konta: " + account + " Imię " + name + " Nazwisko: " + surename + " Nick Name: " + login + " PESEL: " + pesel + " Saldo: " + balance);
    }

    public double deposit(double money) {
        return balance=balance+money;
    }
    public double getBalance(){
        return balance;
    }
}







