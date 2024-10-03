import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean stop = false;

        Valet valet = new Valet();
        HouseKeeping houseKeeping = new HouseKeeping();
        Cart cart = new Cart();
        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

    while(!stop){
        System.out.println("1.Valet: ");
        System.out.println("2.HouseKeeping: ");
        System.out.println("3.Cart: ");
        System.out.println("4.Exit: ");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the vehicle plate number: ");
                String plateNumber = scan.next();
                frontDesk.valet.setPlateNumber(plateNumber);

                frontDesk.valet.getService();
                break;
            case 2:
                System.out.println("Enter the room number: ");
                String roomNumber = scan.next();
                frontDesk.houseKeeping.setRoomNumber(roomNumber);

                frontDesk.houseKeeping.getService();
                break;
            case 3:
                System.out.println("Enter the number of cart(s): ");
                int numOfCart = scan.nextInt();
                frontDesk.cart.setNumberOfCarts(numOfCart);

                frontDesk.cart.getService();
                break;
            case 4:
                System.out.println("Exit application");
                stop = true;
                break;

            default:
                System.out.println("Invalid choice");

        }
        System.out.println();
    }

    }
}