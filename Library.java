/* This is a stub for the Library class */
import java.util.Enumeration;
import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  public void addTitle(String title) {
    this.collection.put(title,true);
    // check if there - add a number to the title if so? like copy two type beat
  }
  public String removeTitle(String title) {
    this.collection.remove(title);
    return title + "removed from collection";
    //check if there
  }

  public void checkOut(String title) {
    this.collection.replace(title, false);
    //check if already there - use other replace method?
  }

  public void returnBook(String title) {
    this.collection.replace(title, true);
  }

  public boolean containsTitle(String title) {
    return this.collection.containsKey(title);
  } // returns true if the title appears as a key in the Libary's collection, false otherwise

  public boolean isAvailable(String title) {
    return this.collection.get(title);
  } // returns true if the title is currently available, false otherwise

  public void printCollection() {
    Enumeration<String> titles = this.collection.keys();
    while (titles.hasMoreElements()) {
      String title = titles.nextElement();
      if (this.collection.get(title) == true) {
        System.out.println(title + "is checked in.");
      } 
      if (this.collection.get(title) == false) {
        System.out.println(title + "is checked out.");
      }
    }

  } // prints out the entire collection in an easy-to-read way (including checkout status)
  
  public static void main(String[] args) {
    new Library("Neilson", "1 Neilson Dr", 4);
  }
  
}