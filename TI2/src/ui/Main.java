package ui;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static Scanner lect= new Scanner(System.in);
    public static void main(String[] args) {
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
                }else if(comand.equalsIgnoreCase("INSERT INTO cities")){
                 cities();
                String insertCities= lect.next();
                }
                break;
                case 2:
                    System.out.println("SQL");
                    break;
                case 3:
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
        System.out.println("Enter the name, population, countryCode");
        System.out.println("Example: 'Colombia', 50.2, '+57'");
        System.out.println("name");
        String name=lect.nextLine();
        System.out.println("population");
        double population=lect.nextDouble();
        lect.nextLine();
        System.out.println("Country code");
        String countryCode=lect.nextLine();
        UUID uuid= UUID.randomUUID();
        String uuidAsString=uuid.toString();
        System.out.println(uuidAsString);
    }

    public static void cities(){
        System.out.println("Enter the name, countryID , population ");
        System.out.println("Example: 'Cali', '6ec3e8ec-3dd0-11ed-b878-0242ac120002', 2.2");
        System.out.println("name");
        String name=lect.nextLine();
        System.out.println("population");
        double population=lect.nextDouble();
        UUID uuid= UUID.randomUUID();
        String idUui=uuid.toString();
        String countryCodeUui=uuid.toString();
        System.out.println(idUui+"id");
        System.out.println(countryCodeUui+"County code");
    }


}
