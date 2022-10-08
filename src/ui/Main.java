package ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lect= new Scanner(System.in);
        boolean entry=true;
        int answEntry;
        while(!entry){
          menu();
        answEntry= lect.nextInt();
        lect.nextLine();
    switch (answEntry){
        case 1:
            commands();
            break;
}
        }
    }

    public static void menu(){
        System.out.println("1. Insert command");
        System.out.println("2. Import data from archive SQL");
        System.out.println("3. Get out");
    }

    public static void commands(){
        System.out.println("----------------");
        System.out.println("LIST OF COMMANDS");
        System.out.println("INSERT INTO... To insert data in the data base");
        System.out.println("");
    }
}
