import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Witaj w naszym Banku");
        System.out.println("Wprowadź imię:");
        Scanner scanner= new Scanner(System.in);
        String imie=scanner.nextLine();
        System.out.println("Wprowadź nazwisko:");
        String nazwisko=scanner.nextLine();
        System.out.println("Wprowadź nr PESEL:");
        int pesel=scanner.nextInt();
        System.out.println("Witaj w naszym MENU:\n1. Informacje o rachunku bankowym.\n2.Wpłata pieniędzy (zasilenie konta).\n3.Wypłata na konto.\n4. Wyjście");
        User user1=new User(imie, nazwisko, pesel);










    }



}
