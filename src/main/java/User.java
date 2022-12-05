

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
    //realizacja loginu do logowania
    public String loginGenerator(String name, String surename) {
        return (name.substring(0, 3) + surename.substring(0, 3));
    }
    public void userDetails() {
        System.out.println("Nr. konta: " + account + " Imię " + name + " Nazwisko: " + surename + " Nick Name: " + login + " PESEL: " + pesel + " Saldo: " + balance);
    }
    //tworzenie wpłaty
    public double deposit(double money) {
        return balance = balance + money;
    }
    public double getBalance() {
        return balance;
    }
    //tworzenie wypłaty

    public void withdraw(double money1) {

        if (money1 > balance) {
            System.out.println("Kwota którą wypłacasz jest większa niż dostępne środki na konie.");
        } else {
            balance = balance - money1;


        }
    }
}











