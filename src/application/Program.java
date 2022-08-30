package application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.Excecoes;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        /*
        try{
        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/mm/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/mm/yyyy): ");
        Date checkOut = sdf.parse(sc.next());
        
        Reservation reservation = new Reservation(number, checkIn, checkOut);
        System.out.println("Reservation: " + reservation);

        System.out.println();
        System.out.println("Enter data to update the reservation: ");
        System.out.print("Check-in date (dd/mm/yyyy): ");
        checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/mm/yyyy): ");
        checkOut = sdf.parse(sc.next());

        reservation.updateDates(checkIn, checkOut);
        System.out.println("Reservation: " + reservation); 
        }
        catch(ParseException e){
            System.out.println("Invalid date format");
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
        */
        
        // Exercicio proposto
        try{
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        Account ac = new Account(number, holder, balance, withdrawLimit);
        
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        ac.withdraw(sc.nextDouble());
        System.out.println("New balance: " + String.format("%.2f", ac.getBalance()));
        }
        catch(Excecoes e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
    
}