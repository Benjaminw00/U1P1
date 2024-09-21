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

            double tipAmount = billConverted*((double) tipPercentConverted/100); //25-59 calculating all the costs using algebraic equations
            double totalBillCost = tipAmount + billConverted;
            double tipPerPerson = tipAmount/numPeopleConverted;
            double billPerPerson = totalBillCost/numPeopleConverted;

                double temp = tipAmount*100; //30-36 rounding for tipAmount
                int numTemp = (int) temp;
                temp = temp-numTemp;
                if (temp >= .5) {
                numTemp = numTemp + 1;
                }
                tipAmount = (double) numTemp/100;
            //
                temp = totalBillCost*100; //38-44 rounding for totalBillCost
                numTemp = (int) temp;
                temp = temp-numTemp;
                if (temp >= .5) {
                numTemp = numTemp + 1;
                }
                totalBillCost = (double) numTemp/100;
            //
                temp = tipPerPerson*100; //46-52 rounding for tipPerPerson
                numTemp = (int) temp;
                temp = temp-numTemp;
                if (temp >= .5) {
                numTemp = numTemp + 1;
                }
                tipPerPerson = (double) numTemp/100;
            //
                temp = billPerPerson*100; //54-60 rounding for billPerPerson
                numTemp = (int) temp;
                temp = temp-numTemp;
                if (temp >= .5) {
                numTemp = numTemp + 1;
                }
                billPerPerson = (double) numTemp/100;

        System.out.println("------------------------------"); //62-70 is outputting all the information
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