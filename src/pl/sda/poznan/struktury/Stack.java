package pl.sda.poznan.struktury;

public class Stack<T> {

  private Object[] elements;
  private int topIndex = 0;

  public Stack(int size) {
    this.elements = new Object[size];
  }

  public void push(T element) {
    // nie mozemy dodawac do pelnego stosu
    // jesli stos pełny rzuc wyjątkiem FullStackException (nasz własny wyjątek)
    // dodaj element na stos
    if (topIndex == elements.length) {
      throw new FullStackException("Stack is full");
    }
    elements[topIndex++] = element;

    // to samo wyżej w 1 lini kodu
    //    elements[topIndex] = element;
    //    topIndex++;
  }

  public T pop() {
    return null;
  }

  public int size() {
    return topIndex;
  }

  public boolean contains(T element) {
    // wyszukiwanie w tablicy
    for (Object o : elements) {
      if (o.equals(element)) {
        return true;
      }
    }
    return false;
  }
}
