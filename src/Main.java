import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("Do not use any symbols for inputting data (no $ or %)");
        System.out.println("-----------------------------------------------------");

        System.out.print("Enter your Bill($): ");
        String bill =  s.nextLine();
        double billConverted = Double.parseDouble(bill); //Get the initial information

        System.out.print("Tip Percent: ");
        String tipPercent = s.nextLine();
        int tipPercentConverted = Integer.parseInt(tipPercent); //Get the initial information

        System.out.print("Number of People: ");
        String numPeople = s.nextLine();
        int numPeopleConverted = Integer.parseInt(numPeople); //Get the initial information

            double tipAmount = billConverted*((double) tipPercentConverted/100); //25-28 calculating all the costs using algebraic equations
            double totalBillCost = tipAmount + billConverted;
            double tipPerPerson = tipAmount/numPeopleConverted;
            double billPerPerson = totalBillCost/numPeopleConverted;

        System.out.println("------------------------------"); //29-37 is outputting all the information
        System.out.println("Total Tip Amount: $" + tipAmount);
        System.out.println("------------------------------");
        System.out.println("Total Bill Cost: $" + totalBillCost);
        System.out.println("------------------------------");
        System.out.println("Tip Per Person: $" + tipPerPerson);
        System.out.println("------------------------------");
        System.out.println("Total Bill Per Person: $" + billPerPerson);
        System.out.print("------------------------------");

    }
}