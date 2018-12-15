package pl.sda.poznan.struktury;

// Własna implementacja listy z wykorzystaniem tablicy ("ArrayList")
// implementujemy interfejs MyList
// zakładamy, ze jest to lista na elementy typu String
// kazdy element tej listy to String
public class ArrayList implements MyList {

  private static int DEFAULT_CAPACITY = 10;
  // tablica z elementami - w tej implementacji chcemy "opakowac" tablicę tak by wygladala jak lista
  private String[] elements;

  public ArrayList() {
    // konstruktor bezparamterowy utowrzy listę z początkową wielkością 10
    this.elements = new String[DEFAULT_CAPACITY];
  }

  // drugi konstruktor z opcją ustawienia startowej wielkości listy
  // efektywne rozwiązanie, gdy znamy liczbe elementow z gory
  public ArrayList(int initialSize) {
    // korzystamy z argumentu konstruktora, a nie ze stałej DEFAULT_CAPACITY
    this.elements = new String[initialSize];
  }

  @Override
  public boolean add(String element) {
    return false;
  }

  @Override
  public boolean remove(String element) {
    return false;
  }

  @Override
  public String remove(int index) {
    return null;
  }

  @Override
  public String removeFront() {
    return null;
  }

  @Override
  public String removeFromEnd() {
    return null;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public int indexOf(String element) {
    return 0;
  }

  @Override
  public boolean contains(String element) {
    return false;
  }

  @Override
  public void clear() {}
}
