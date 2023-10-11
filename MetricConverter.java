
import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        float userInput2;

        System.out.println("This is a metric conversion application. What would you like to convert?");
        System.out.println("1)Temperature");
        System.out.println("2)Area");
        System.out.println("3)Time");
        System.out.println("");
        System.out.println("Select an option from the menu(Enter # 1-3 or -1 to exit): ");

        userInput = scanner.nextInt();

        while (userInput != -1) {
            if (userInput == 1) {
                //Temperature conversion
                System.out.println("Temperature Conversion Selected. This option allows you to convert between Fahrenheit and Celsius.");
                System.out.println("What unit would you like to start your conversion with?");
                System.out.println("1)Fahrenheit");
                System.out.println("2)Celsius");

                System.out.println("Select an option from the menu(Enter # 1-2): ");
                userInput = scanner.nextInt();

                //F to C
                if (userInput == 1){
                    System.out.println("*FAHRENHEIT TO CELSIUS*");
                    System.out.println("Enter a number in Fahrenheit: ");
                    userInput2 = scanner.nextFloat();
                    float Fahrenheit = userInput2;

                    float Celsius = (float)((Fahrenheit - 32.0f) * 5.0f/9.0f);
                    System.out.println(Fahrenheit + " degrees fahrenheit is " + Celsius + " degrees in celsius.");
                }
                //C to F
                else if (userInput == 2){
                    System.out.println("*CELSIUS TO FAHRENHEIT*");
                    System.out.println("Enter a number in Celsius: ");
                    userInput2 = scanner.nextFloat();
                    float Celsius = userInput2;

                    float Fahrenheit = (float)((Celsius *9.0f/5.0f) + 32.0f);
                    System.out.println(Celsius + " degrees celsius is " + Fahrenheit + " degrees in fahrenheit.");
                }
                else{
                     System.out.println("Invalid number");
                }



            }
            else if (userInput == 2){
                //Area Converter
                System.out.println("Area Conversion Selected. This option allows you to convert Square Feet to one of the follow:");
                System.out.println("1)Square Meters");
                System.out.println("2)Square Yards");
                System.out.println("3)Square Acres");
                System.out.println("");
                System.out.println("Select an option from the menu(Enter # 1-3): ");
                userInput = scanner.nextInt();

                //SQR ft to SQR meters
                if (userInput == 1){
                    System.out.println("*SQUARE FEET TO SQUARE METERS*");
                    System.out.println("Enter a number in Square feet: ");
                    userInput2 = scanner.nextFloat();
                    float squareFeet = userInput2;

                    
                    float squareMeters =(float)(squareFeet * 0.092903f);
                    System.out.println(squareFeet + " square feet is equal to " + squareMeters + " square meters.");
                }
                //SQR ft to SQR Yards
                else if (userInput == 2){
                    System.out.println("*SQUARE FEET TO SQUARE YARDS*");
                    System.out.println("Enter a number in Square feet: ");
                    userInput2 = scanner.nextFloat();
                    float squareFeet = userInput2;

                    float squareYards = (float)(squareFeet/9.0f);
                    System.out.println(squareFeet + " square feet is equal to " + squareYards + " square yards.");
                }
                //SQR ft to SQR acres
                else if (userInput == 3){
                    System.out.println("*SQUARE FEET TO ACRES*");
                    System.out.println("Enter a number in Square feet: ");
                    userInput2 = scanner.nextFloat();
                    float squareFeet = userInput2;

                    float squareAcres = (float)(squareFeet/43560.0f);
                    System.out.println(squareFeet + " square feet is equal to " + squareAcres + " square acres.");
                }
                else{
                    System.out.println("Invalid number");
                }
            }
            else if (userInput == 3){
                //Time Converter
                System.out.println("Time Conversion Selected. This option allows you to convert seconds to one of the follow:");
                System.out.println("1)Minutes");
                System.out.println("2)Hours");
                System.out.println("3)Days");
                System.out.println("");
                System.out.println("Select an option from the menu(Enter # 1-3): ");
                userInput = scanner.nextInt();

                if (userInput == 1){
                    //seconds to minutes
                    System.out.println("*SECONDS TO MINUTES*");
                    System.out.println("Enter the number of seconds: ");
                    userInput2 = scanner.nextFloat();
                    float Seconds = userInput2;

                    
                    float Minutes =(float)(Seconds/60.0f);
                    float remainingSeconds = Seconds % 60;
                    System.out.println(Seconds + " seconds is equal to " + Minutes + " minutes and " + remainingSeconds + " seconds.");
                }
                else if (userInput == 2){
                    //seconds to hours
                    System.out.println("*SECONDS TO HOURS*");
                    System.out.println("Enter the number of seconds: ");
                    userInput2 = scanner.nextFloat();
                    float Seconds = userInput2;
                  
                    float Hours = (float)(Seconds / 3600.0f);
                    float remainingSeconds = Seconds % 3600.0f;
                    System.out.println(Seconds + " seconds is equal to " + Hours + " hours and " + (remainingSeconds/60) + " minutes.");
                }
                else if (userInput == 3){
                    //seconds to days
                    System.out.println("*SECONDS TO DAYS*");
                    System.out.println("Enter the number of seconds: ");
                    userInput2 = scanner.nextFloat();
                    float Seconds = userInput2;
                    
                    float Days = (float)(Seconds/86400.0f);
                    float remainingSeconds = Seconds % 86400.0f;
                    System.out.println(Seconds + " seconds is equal to " + Days + " days and " + (remainingSeconds/3600) + " hours.");
                }
                else{
                    System.out.println("Invalid number");
                }


            }
            
            else{
                System.out.println("Please try again. You can only enter a number that is on the menu.");
            }
            System.out.println("1)Temperature");
            System.out.println("2)Area");
            System.out.println("3)Time");
            System.out.println("");
            System.out.println("Select another option (Enter #1-3 or -1 to exit): ");
            userInput = scanner.nextInt();

        }
        scanner.close();
    }
    
}
