public class Cafe extends Building {
    /** The number of ounces of coffee remaining in inventory */
    private int nCoffeeOunces;
    /** The number of sugar packets remaining in inventory */
    private int nSugarPackets;
    /** The number of "splashes" of cream remaining in inventory */
    private int nCreams;
    /** The number of cups remaining in inventory */
    private int nCups;

    /**
     * Creates a new Cafe object
     * @param name The name of the Cafe
     * @param address The address of the Cafe
     * @param nFloors The number of floors in the Cafe
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 200;
        this.nSugarPackets = 80;
        this.nCreams = 60;
        this.nCups = 50;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Sells a cup of coffee and reduces the contents of the Cafe's inventory according to 
     * the specifications of the coffee sold and restocks inventory with a specific item 
     * when there is not enough for the specified coffee
     * @param size Number of ounces in the coffee to be sold
     * @param nSugarPackets Number of sugars in the specified coffee
     * @param nCreams Number of "splashes" of cream in the specified coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces >= size) {
            this.nCoffeeOunces -= size;
        } else {
            restock(200, 0, 0, 0);
        }
        if (this.nSugarPackets >= nSugarPackets) {
            this.nSugarPackets -= size;
        } else {
            restock(0, 80, 0, 0);
        }
        if (this.nCreams >= nCreams) {
            this.nCreams -= nCreams;
        } else {
            restock(0, 0, 60, 0);
        }
        if (this.nCups > 0) {
            this.nCups -= 1;
        } else {
            restock(0, 0, 0, 50);
        }
    }

    /**
     * Restocks the Cafe's inventory
     * @param nCoffeeOunces Ounces of coffee to add to inventory
     * @param nSugarPackets Number of sugar packets to add to inventory
     * @param nCreams Number of "splashes" of cream to add to inventory
     * @param nCups Number of cups to add to inventory
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    /**
     * for testing
     * @param args
     */
    public static void main(String[] args) {
        new Cafe("CC Cafe", "1 Chapin Way", 1);
    }
    
}
