package pl.sda.poznan;

import pl.sda.poznan.struktury.ArrayList;
import pl.sda.poznan.struktury.MyList;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    MyList mojaLista = new ArrayList(3);

    mojaLista.add("a");
    mojaLista.add("b");
    mojaLista.add("c");
    mojaLista.remove(1);
    mojaLista.remove(0);
    System.out.println(mojaLista.toString());
    mojaLista.add("z");

    // c z
    System.out.println(mojaLista.toString());

//    // c
    mojaLista.remove(1);
    System.out.println(mojaLista.toString());
  }
}
