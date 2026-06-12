import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login!");
            return;
        }

        System.out.println("Login Successful!");

        HotelManagement hotel = new HotelManagement();

        while (true) {

            System.out.println("\n===== HOTEL MENU =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    hotel.viewRooms();
                    break;

                case 2:

                    System.out.print("Enter Room Number: ");

                    int roomNo = sc.nextInt();

                    hotel.bookRoom(roomNo);

                    break;

                case 3:

                    System.out.print("Enter Room Number: ");

                    int cancelRoom = sc.nextInt();

                    hotel.cancelBooking(cancelRoom);

                    break;

                case 4:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }

    }
    }