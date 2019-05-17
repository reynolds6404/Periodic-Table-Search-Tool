import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ascii text art made with patorjk.com
        System.out.println("  _____          _           _ _        _______    _     _         _____                     _     \n" +
                " |  __ \\        (_)         | (_)      |__   __|  | |   | |       / ____|                   | |    \n" +
                " | |__) |__ _ __ _  ___   __| |_  ___     | | __ _| |__ | | ___  | (___   ___  __ _ _ __ ___| |__  \n" +
                " |  ___/ _ \\ '__| |/ _ \\ / _` | |/ __|    | |/ _` | '_ \\| |/ _ \\  \\___ \\ / _ \\/ _` | '__/ __| '_ \\ \n" +
                " | |  |  __/ |  | | (_) | (_| | | (__     | | (_| | |_) | |  __/  ____) |  __/ (_| | | | (__| | | |\n" +
                " |_|   \\___|_|  |_|\\___/ \\__,_|_|\\___|    |_|\\__,_|_.__/|_|\\___| |_____/ \\___|\\__,_|_|  \\___|_| |_|");
        System.out.println(" Made by: TJ Reynolds\n\n\n");

        System.out.println("Search Options:\n(1) Element Name\n(2) Element Abbreviation\n(3) Atomic Number");
        Scanner s = new Scanner(System.in); //Gives the ability for the user to add input
        int choice = -2;
        while(choice != -1){
            //Sets search criteria based on what user selects, makes call to search class
            System.out.print("\nChoose search [1/2/3]: ");
            choice = s.nextInt();
            if (choice == 1){
                System.out.print("Enter an element name to search for:");
                String lookfor = s.next();
                int found = search.namesearch(lookfor.toLowerCase());
                if (found == -1){
                    System.out.println("Not found");
                }
                else{
                    display.show(found);
                }
            }
            else if (choice == 2){
                System.out.print("Enter an element abbreviation to search for:");
                String lookfor = s.next();
                int found = search.abbrevsearch(lookfor.toLowerCase());
                if (found == -1){
                    System.out.println("Not found");
                }
                else{
                    display.show(found);
                }
            }
            else if (choice == 3){
                System.out.print("Enter an atomic number to search for:");
                int lookfor = s.nextInt();
                int found = search.numsearch(lookfor);
                if (found == -1){
                    System.out.println("Not found");
                }
                else{
                    display.show(found);
                }
            }
            else{
                if (choice != -1){
                    System.out.println("Illegal entry, Restarting.");
                }
            }
        }
    }
}
