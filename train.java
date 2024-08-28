import java.util.Scanner;

public class train {
    public static void main(String args[]) {
        Scanner sow = new Scanner(System.in);
        System.out.print("Welcome to Danish Express! Which seat number do you prefer (1-72)? ");
        
        // Check if the input is an integer
        if (sow.hasNextInt()) {
            int seats = sow.nextInt();

            // Check if the seat number is within the valid range
            if (seats <= 72) {
                int place = seats % 8;

                switch (place) {
                    case 1:
                        System.out.println("Left Upper berth available");
                        break;
                    case 2:
                        System.out.println("Left Middle berth available");
                        break;
                    case 3:
                        System.out.println("Left Lower berth available");
                        break;
                    case 4:
                        System.out.println("Right Upper berth available");
                        break;
                    case 5:
                        System.out.println("Right Middle berth available");
                        break;
                    case 6:
                        System.out.println("Right Lower berth available");
                        break;
                    case 7:
                        System.out.println("Side Upper berth available");
                        break;
                    case 0:
                        System.out.println("Side Lower berth available");
                        break;
                    default:
                        System.out.println("Invalid seat number");
                        break;
                }
            } else {
                System.out.println("Seats not available. Please enter a number between 1 and 72.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid seat number.");
        }

        sow.close(); // Close the scanner to prevent resource leaks
    }
}
