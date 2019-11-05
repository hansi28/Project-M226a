import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    	
    	//linked lsit with all the vehicles since we dont know the number of vehicles 
        LinkedList<vehicleList> vehicles = new LinkedList<vehicleList>();

        String auswahl;
        char abbruch = '0';

        Scanner eingabewert = new Scanner(System.in);
        
        //simple selection loop to choose what to do
        while((abbruch != 'X') && (abbruch != 'x')) {
            do {
                System.out.println("Would you like to:\n[r]egister a new vehicle,\n[l]ist all of our vehicles,\n[s]ee our new prices\nor[w]atch at our time prices");
                auswahl = eingabewert.next();
                //register a new vehicle
                if ((auswahl.equals("r")) || (auswahl.equals("R"))) {
                    scan(vehicles);
                }
                //list the vehicles
                else if ((auswahl.equals("l")) || (auswahl.equals("L"))) {

                    System.out.println("\nName;Brand;Color;Owner;Date;Sign;Doors;Number;Price");
                    for(int i = 0; i < vehicles.size(); i++) {
                        System.out.println(vehicles.get(i).toString());
                    }
                    System.out.println("");
                }
                //see the new prices
                else if((auswahl.equals("s")) || (auswahl.equals("S"))){

                    int total = 0;
                    for(int i = 0; i < vehicles.size(); i++) {
                        total +=  vehicles.get(i).price;
                    }

                    long average = total / vehicles.size();

                    System.out.println("Number_of_cars;total_price;average_price");
                    System.out.print(vehicles.size() + ";" + total + ";" + average);

                }
                //look at the prices of all time
                else if((auswahl.equals("w")) || (auswahl.equals("W"))){
                    int total = 0;
                    for(int i = 0; i < vehicles.size(); i++){
                        int age = (2019 - vehicles.get(i).year);
                        int zeitWert = vehicles.get(i).price;
                        for(int l = 0; l < age; l++){
                            zeitWert = zeitWert / 100 * 80;
                        }
                        total += zeitWert;
                    }
                    int average = (total / vehicles.size());
                    System.out.println("Number_of_cars;total_time_price;average_time_price");
                    System.out.print(vehicles.size() + ";" + total + ";" + average);
                }
            } while ((!auswahl.equals("l")) && (!auswahl.equals("L")) && (!auswahl.equals("r")) && (!auswahl.equals("R")) && (!auswahl.equals("s")) && (!auswahl.equals("S")) && (!auswahl.equals("w")) && (!auswahl.equals("W")));

            System.out.println("\nIf you want to continue the programm, press anything except 'X'(The entrys wont be saved)");
            abbruch = eingabewert.next().charAt(0);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        }
        
        eingabewert.close();
    }


    static int scan(LinkedList<vehicleList> vehicles){

        Scanner eingabewert = new Scanner(System.in);

        System.out.println("Please enter: Name");
        String name = eingabewert.next();
        System.out.println("Please enter: Brand");
        String brand = eingabewert.next();
        System.out.println("Please enter: Color");
        String color = eingabewert.next();
        System.out.println("Please enter: Owner");
        String owner = eingabewert.next();
        System.out.println("Please enter: Year");
        int year = eingabewert.nextInt();
        System.out.println("Please enter: Month");
        int month = eingabewert.nextInt();
        System.out.println("Please enter: Day");
        int day = eingabewert.nextInt();
        System.out.println("Please enter: Sign");
        String sign = eingabewert.next();
        System.out.println("Please enter: Doors");
        String doors = eingabewert.next();
        System.out.println("Please enter: Number");
        String number = eingabewert.next();
        System.out.println("Please enter: Price");
        int price = eingabewert.nextInt();

        vehicles.add(new vehicleList(name, brand, color, owner, year, month, day, sign, doors, number, price));
        System.out.println("A new entry was created!");
        
        eingabewert.close();
        
        return 0;
    }


}