/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

  /** List of residents of the house */
  private ArrayList<String> residents;
  /** Does the house have a dining hall? */
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    //limit size?
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents() {
    return this.residents.size();
  }

  public void moveIn(String name) {
    this.residents.add(name);
    //add check for if student is already there
  }

  public String moveOut(String name) {
    this.residents.remove(name);
    return name + "has moved out";
    //add check for student living there
  }

  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    new House("Washburn House","2 Seeyle Drive",4, false);
  }

}