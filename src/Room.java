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
    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isDirty = true;
            System.out.println("Guest checked out. Room now dirty.");
        } else {
            System.out.println("Room is not currently occupied.");
        }
    }

    public void cleanRoom() {
        if (isDirty) {
            isDirty = false;
            System.out.println("Room cleaned.");
        } else {
            System.out.println("Room is already clean.");
        }
    }

}
