public class Cart implements hotelService {
    private int numberOfCarts;

    public void setNumberOfCarts(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart (int numberOfCarts){
        System.out.println("Delivering " + numberOfCarts + " cart(s).");
    }
    @Override
    public void getService() {
        requestCart(numberOfCarts);
    }
}
