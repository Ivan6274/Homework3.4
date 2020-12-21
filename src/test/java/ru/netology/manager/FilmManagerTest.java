package ru.netology.manager;

import org.junit.jupiter.api.Test;

import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FilmManagerTest {

  @Test
  void showLatestFilmMax() {

    FilmManager manager = new FilmManager();

    PurchaseItem first = new PurchaseItem(1, 1, "first", "http.first");
    PurchaseItem second = new PurchaseItem(2, 2, "second", "http.second");
    PurchaseItem third = new PurchaseItem(3, 3, "third", "http.third");
    PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", "http.fourth");
    PurchaseItem fiveth = new PurchaseItem(5, 5, "fiveth", "http.fiveth");
    PurchaseItem sixth = new PurchaseItem(6, 6, "sixth", "http.sixth");
    PurchaseItem seventh = new PurchaseItem(7, 7, "seventh", "http.seventh");
    PurchaseItem eighth = new PurchaseItem(8, 8, "eighth", "http.eighth");
    PurchaseItem nineth = new PurchaseItem(9, 9, "nineth", "http.nineth");
    PurchaseItem tenth = new PurchaseItem(10, 10, "tenth", "http.tenth");

    manager.add(first);
    manager.add(second);
    manager.add(third);
    manager.add(fourth);
    manager.add(fiveth);
    manager.add(sixth);
    manager.add(seventh);
    manager.add(eighth);
    manager.add(nineth);
    manager.add(tenth);



    PurchaseItem[] actual = manager.showLatestFilm();
    PurchaseItem[] expected = new PurchaseItem[]{tenth, nineth, eighth, seventh, sixth};

    assertArrayEquals(expected, actual);

  }
  @Test
  void showLatestFilmMin() {
    FilmManager manager = new FilmManager();

    PurchaseItem first = new PurchaseItem(1, 1, "first", "http.first");
    PurchaseItem second = new PurchaseItem(2, 2, "second", "http.second");
    PurchaseItem third = new PurchaseItem(3, 3, "third", "http.third");


    manager.add(first);
    manager.add(second);
    manager.add(third);

    PurchaseItem[] actual = manager.showLatestFilm();
    PurchaseItem[] expected = new PurchaseItem[]{third,second,first};

    assertArrayEquals(expected, actual);

  }

}