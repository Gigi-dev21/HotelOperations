public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;



    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public boolean isDirty() {
        return this.isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }


}
