package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FilmManagerGetAllTest {

    @Test
    void getAllItem() {

        FilmManager manager = new FilmManager(5);


        PurchaseItem first = new PurchaseItem(1, 1, "first", "http.first");
        PurchaseItem second = new PurchaseItem(2, 2, "second", "http.second");
        PurchaseItem third = new PurchaseItem(3, 3, "third", "http.third");
        PurchaseItem fourth = new PurchaseItem(4, 4, "fourth", "http.fourth");
        PurchaseItem fiveth = new PurchaseItem(5, 5, "fiveth", "http.fiveth");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fiveth);


        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{fiveth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getOneItem() {
        FilmManager manager = new FilmManager(5);

        PurchaseItem first = new PurchaseItem(1, 1, "first", "http.first");


        manager.add(first);


        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{first};

        assertArrayEquals(expected, actual);
    }
}