package pl.sda.poznan.struktury;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {

  LinkedList list = new LinkedList();

  @Test
  public void should_add_one_element_to_empty_list() {
    // arrange
    String firstElement = "pierwszy";

    // act
    boolean result = list.add(firstElement);

    // assert
    assertEquals(true, result);
  }

  @Test
  public void should_add_many_elements() {
    // arrange
    String firstElement = "pierwszy";
    String secondElement = "second";
    String thirdElement = "third";

    // act
    list.add(firstElement);
    list.add(secondElement);
    list.add(thirdElement);
    // na liście elementy będą w kolejności: "third" -> "second" -> "first" -> NULL

    // assert
    assertEquals(3, list.size());
  }
}
