import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean endLoop = true;
        Scanner sc;
        int userChoice;
        int index = 0, i;
        int ID, choice;
        double[] accountBalances = new double[100];
        String[] accountNames = new String[100];
        double balance, deposited, withdrawn;
        String name;

        while(endLoop){
            System.out.println("BANK ADMIN MENU \n Select an Option: ");
            System.out.println("1.Add Customer to Bank");
            System.out.println("2.Change Account Name");
            System.out.println("3.Check Account Balance");
            System.out.println("4.Change Account Balance");
            System.out.println("5.Accounts Summary");
            System.out.println("6.Quit Menu");

            sc = new Scanner(System.in);
            userChoice = sc.nextInt();


            switch (userChoice) {
                case 1:
                    //Add Customer to Bank -> Balance + Name
                    System.out.println("Please enter your account balance");
                    balance = sc.nextDouble();
                    accountBalances[index] = balance;

                    sc.nextLine(); //Flush the buffer

                    System.out.println("Please enter your account name");
                    name = sc.next();
                    accountNames[index] = name;
                    System.out.println("Your customer ID is :" + index);
                    index++;
                    break;

                case 2:
                    //Change Account name
                    System.out.println("Please enter the new name of your account");
                    name = sc.next();
                    System.out.println("Please enter your customer ID");
                    ID = sc.nextInt();
                    accountNames[ID] = name;
                    break;

                case 3:
                    //Check Account balance
                    System.out.println("Please enter your customer ID");
                    ID = sc.nextInt();
                    System.out.println("You have " + accountBalances[ID] + "$ in your account");
                    break;

                case 4:
                    //Change account balance
                    System.out.println("Choose an Option: \n1.Deposit  \n2.Withdrawal");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Please enter the amount to be deposited");
                        deposited = sc.nextDouble();
                        System.out.println("Please enter your customer ID");
                        ID = sc.nextInt();
                        accountBalances[ID] = accountBalances[ID] + deposited;
                    } else if (choice == 2) {
                        System.out.println("Please enter the amount to be withdrawn");
                        withdrawn = sc.nextDouble();
                        System.out.println("Please enter your customer ID");
                        ID = sc.nextInt();
                        accountBalances[ID] = accountBalances[ID] - withdrawn;
                    } else {
                        System.out.println("Invalid choice! Try again.");
                    }
                    break;

                case 5:

                    System.out.println("Accounts Summary");
                    for (i = 0; i < index; i++) {
                        System.out.println("Account " + i + ": ");
                        System.out.println(accountNames[i]);
                        System.out.println(accountBalances[i]);
                    }
                    break;

                case 6:
                    System.out.println("Thank you for trusting our service");
                    endLoop=false;
                    break;

                default:
                    System.out.println("Invalid Choice! Try again");
            }
        }
    }
}