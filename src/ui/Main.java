package ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lect= new Scanner(System.in);
        boolean entry=true;
        int answEntry;
        while(entry){
          menu();
        answEntry= lect.nextInt();
        lect.nextLine();
    switch (answEntry){
        case 1:
            commands();
            String comand=lect.nextLine();
            if(comand.equalsIgnoreCase("INSERT INTO countries")){
                countries();
                String insertCountry= lect.next();
            }else if(comand.equalsIgnoreCase("INSERT INTO cities")){
                cities();
                String insertCities= lect.next();
            }
            break;
        case 2:
            entry=false;
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
        System.out.println("INSERT INTO countries To register a new country");
        System.out.println("INSERT INTO cities To register a new city");
    }

    public static void countries(){
        System.out.println("Enter the id, name, population, countryCode separated by commas");
        System.out.println("Example: '6ec3e8ec-3dd0-11ed-b878-0242ac120002', 'Colombia', 50.2, '+57'");
    }

    public static void cities(){
        System.out.println("Enter the id, name, countryID , population  separated by commas");
        System.out.println("Example:'e4aa04f6-3dd0-11ed-b878-0242ac120002', 'Cali', '6ec3e8ec-3dd0-11ed-b878-0242ac120002', 2.2");
    }


}
