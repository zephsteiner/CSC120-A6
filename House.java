import java.util.ArrayList;

public class House extends Building{

  /** List of residents of the House */
  private ArrayList<String> residents;
  /** Does the House have a dining hall? */
  private boolean hasDiningRoom;
  /** How many people can live here? */
  private int maxCapacity;

  /**
   * Creates a new House object
   * @param name Name of House
   * @param address Address of House
   * @param nFloors Number of floors in the House
   * @param hasDiningRoom True if the House has a dining room
   * @param maxCapacity Number of people who can live in the House
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom, int maxCapacity) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>(maxCapacity);
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Checks if a House has a dining room attatched
   * @return True if there is a dining room, false otherwise
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * Gets the current number of residents in a House
   * @return The current number of residents in a House
   */
  public int nResidents() {
    return this.residents.size();
  }

  /**
   * Gets the maximum residential capacity of a House
   * @return Maximum residential capacity of a House
   */
  public int residentCapacity() {
    return this.maxCapacity;
  }

  /**
   * Moves a student into a House if the House is not full and the student does not live there already
   * @param name The student to move in
   */
  public void moveIn(String name) {
    if (this.residents.contains(name)) {
      throw new RuntimeException(name + " already lives here");
    }
    if (this.residents.size() == maxCapacity) {
      throw new RuntimeException(this.name + " is at maximum residential capacity");
    }
    this.residents.add(name);
  }

  /**
   * Removes a student from a House if they reside there
   * @param name The student to move out
   * @return Message detailing who moved out
   */
  public String moveOut(String name) {
    if (!this.residents.contains(name)) {
      throw new RuntimeException(name + " not found");
    }
    this.residents.remove(name);
    return name + " has moved out";
  }

  /**
   * Checks if a student lives in the specified House
   * @param person The person to check residential status
   * @return True if the person is in the House, false otherwise
   */
  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  /**
   * for testing
   * @param args
   */
  public static void main(String[] args) {
    new House("Washburn House","2 Seeyle Drive",4, false, 44);
  }

}