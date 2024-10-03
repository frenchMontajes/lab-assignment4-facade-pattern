public class Valet implements hotelService {
    private String plateNumber;

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle(String plateNumber){
        System.out.println("Picking up vehicle with plate number: " + plateNumber);
    }

    @Override
    public void getService() {
        pickUpVehicle(plateNumber);
    }
}
