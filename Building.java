public class Building {

    /** Name of Building */
    protected String name = "<Name Unknown>";
    /** Address of Building */
    protected String address = "<Address Unknown>";
    /** Number of floors in the Building */
    protected int nFloors = 1;

    /**
     * Creates a Building object
     * @param name Name of Building
     * @param address Address of Building
     * @param nFloors Number of floors in the Building
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Gets the name of a Building object
     * @return The name of the Building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the address of a Building object
     * @return The address of the Building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the number of floors of a Building
     * @return The number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * toString for a Building object
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * for testing
     * @param args
     */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
