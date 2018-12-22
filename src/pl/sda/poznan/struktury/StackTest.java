package pl.sda.poznan.struktury;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

  private final int stackSize = 3;
  private Stack<String> stringStack = new Stack<>(stackSize);

  @Test
  public void should_add_element_to_stack() {
    // arrange
    String element = "firstElement";
    // act
    stringStack.push(element);
    // assert
    assertEquals(true, stringStack.contains(element));
    assertEquals(1, stringStack.size());

  }
}
