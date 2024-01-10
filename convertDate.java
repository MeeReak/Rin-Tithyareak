import java.util.Scanner;

public class convertDate {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = reader.nextLine();

        String[] cutDate = shortDate.split("-");

        if (cutDate.length != 3) {
            System.out.println("Invalid date format. Please enter a valid date in the format YYYY-MM-DD.");
            return;
        }

        try {
            int year = Integer.parseInt(cutDate[0]);
            int month = Integer.parseInt(cutDate[1]);
            int day = Integer.parseInt(cutDate[2]);

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Invalid date. Please enter a valid month and day.");
                return;
            }

            String[] monthList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String monthName = monthList[month - 1];

            String fullDate = monthName + " " + day + ", " + year;
            System.out.println("The full date is: " + fullDate);
        } catch (NumberFormatException e) {
            System.out.println("Invalid date format. Please enter a valid date in the format YYYY-MM-DD.");
        }
    }
}
