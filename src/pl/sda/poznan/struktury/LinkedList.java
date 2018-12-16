package pl.sda.poznan.struktury;

public class LinkedList implements MyList {

  // referencja ("wskaźnik") na głowę listy
  private Node head; // na początku przyjmuje wartość null (domyślną dla typu referencyjnego)
  private int count = 0;

  @Override
  public boolean add(String element) {
    // (1) dodawanie do pustej listy
    // (2) dodwanie do listy nie pustej (głowa != null)
    if (head == null) {
      // tworzymy nowy wezel, na ktory pokazuje head
      head = new Node(element);
    } else {
      // head na coś wskazuje, wiec lista nie pusta
      // wstawiamy na początek listy
      insertFront(element);
    }
    count++;
    return true;
  }

  private void insertFront(String element) {
    Node newNode = new Node(element);
    // następnikiem nowego elementu jest aktualna głowa
    newNode.setNext(head);
    // ustaw głowę na początek listy; przestaw wskaźnik head na nową "głowę"
    head = newNode;

    // newNode -> OLD_HEAD -> NULL
    //  |
    // HEAD
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
  public String removeFirst() {
    return null;
  }

  @Override
  public String removeLast() {
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

  @Override
  public int size() {
    return 0;
  }

  // klasa reprezentująca pojedynczy węzeł - poj. element na liście
  private static class Node {
    private String value;
    private Node next;

    Node(String value) {
      this.value = value;
    }

    Node(String value, Node next) {
      this.value = value;
      this.next = next;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
    }
  }
}
