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
      // jesli chcemy przy dodawaniu wstawiać na koniec to trzeba odkomentować poniższą linię kodu
      // a zakomentować 19 linie
      //      appendToList(element);
    }
    count++;
    return true;
  }

  private void appendToList(String element) {
    // zadaniem tej metody jest wstawienie elementu na koniec listy
    // doczepienie jej na koniec
    // "jan" -> "tomasz"
    // wstawiamy "adam"
    // "jan" -> "tomasz" -> "adam"
    // mając head musimy dojść do ostaniego elementu i tam stworzyć dowiązanie
    // utwórz i wykorzystaj pomocniczą zmienną
    Node helper = head;
    // while służy wyłącznie do przestawiania wskaźnika helper,
    // aż dojdziemy do ostatniego elementu
    while (helper.getNext() != null) {
      helper = helper.getNext();
    }
    // po wyjsciu z petli
    // helper pokazuje na ostatni element
    Node newNode = new Node(element);
    helper.setNext(newNode);
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
    String headValue = head.getValue();
    head = head.next;
    return headValue;
  }

  @Override
  public String removeLast() {
    return null;
  }

  @Override
  public boolean isEmpty() {
    //    return count == 0;
    return head == null;
  }

  @Override
  public int indexOf(String element) {
    Node helper = head;
    int position = 0;
    while (helper != null) {
      // iterujemy po dynamicznych wskaźnikach
      if (helper.getValue().equals(element)) {
        // jeśli wartość węzła zgadza sie z szukanym elementem -> zwracamy licznik
        return position;
      }
      // jeśli nie znaleziono, to przestawiamy wskaźnik na następny element
      helper = helper.getNext();
      position++;
    }
    return -1;
  }

  @Override
  public boolean contains(String element) {
    return indexOf(element) >= 0;
  }

  @Override
  public void clear() {}

  @Override
  public int size() {
    return count;
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
