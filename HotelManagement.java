import java.util.ArrayList;

public class HotelManagement {

    ArrayList<Room> rooms = new ArrayList<>();

    public HotelManagement() {

        rooms.add(new Room(101, "Single", 1000));
        rooms.add(new Room(102, "Double", 1500));
        rooms.add(new Room(103, "Deluxe", 2500));

    }

    public void viewRooms() {

        System.out.println("----- Available Rooms -----");

        for (Room room : rooms) {

            System.out.println(
                    "Room No: " + room.roomNumber +
                            " | Type: " + room.roomType +
                            " | Price: " + room.price +
                            " | Booked: " + room.isBooked
            );
        }
    }
    public void bookRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.roomNumber == roomNumber) {

                if (!room.isBooked) {

                    room.isBooked = true;
                    System.out.println("Room booked successfully!");

                } else {

                    System.out.println("Room already booked!");
                }

                return;
            }
        }

        System.out.println("Room not found!");
    }
    public void cancelBooking(int roomNumber) {

        for (Room room : rooms) {

            if (room.roomNumber == roomNumber) {

                if (room.isBooked) {

                    room.isBooked = false;

                    System.out.println("Booking cancelled!");

                } else {

                    System.out.println("Room is not booked!");
                }

                return;
            }
        }

        System.out.println("Room not found!");
    }
}
