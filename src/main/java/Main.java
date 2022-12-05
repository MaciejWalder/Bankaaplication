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
        System.out.println("Witaj w naszym MENU:\n1. Informacje o rachunku bankowym.\n2. Wpłata pieniędzy (zasilenie konta).\n3. Wypłata na konto.\n4. Wyjście");
        User user1=new User(imie, nazwisko, pesel);
        System.out.println("Co bys chciał zrobic, wybierz z menu:");
        int choose =scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("Informacje o koncie");
                user1.userDetails();
                break;
            case 2:
                System.out.println("Ile chesz wpłacić pieniędzy");
                double moneyToDeposit= scanner.nextDouble();
                user1.deposit(moneyToDeposit);
                System.out.println("Saldo twojego konta wynosi: "+user1.getBalance());

                break;

            case 3:
                System.out.println("Ilość wypłaconych pieniedzy");
                break;

            case 4:
                System.out.println("Wyjscie z aplikacji");
                break;

        }


    }



}
