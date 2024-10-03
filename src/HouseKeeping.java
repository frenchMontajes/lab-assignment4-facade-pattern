public class HouseKeeping implements hotelService {
    private String roomNumber;

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }


    public void cleanRoom(String roomNumber){
        System.out.println("Cleaning room for room number: " + roomNumber);
    }

    @Override
    public void getService() {
        cleanRoom(roomNumber);
    }
}
