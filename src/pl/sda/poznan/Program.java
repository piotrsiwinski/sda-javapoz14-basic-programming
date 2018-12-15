package pl.sda.poznan;

import pl.sda.poznan.struktury.ArrayList;
import pl.sda.poznan.struktury.MyList;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    MyList mojaLista = new ArrayList(3);

    mojaLista.add("Ala");
    mojaLista.add("ma");
    mojaLista.add("kota");
    mojaLista.add("basia");
    mojaLista.add("test");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Jaki element chcesz szukac");
    String text = scanner.next();
    int pozycja = mojaLista.indexOf(text);
    System.out.println(pozycja);
  }
}
