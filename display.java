//A class to display the element and properties that were searched for
//Also to show inheritance...
public class display extends search {

    public static void show(int pos){
        System.out.println("\nName: " + name[pos] + "\nAbbreviation: " + abbreviation[pos] + "\nAtomic Number: " + number[pos] +
                "\nPhase at STP: " + phases[pos] + "\nAtomic Weight: " + mass[pos]);
    }
}
