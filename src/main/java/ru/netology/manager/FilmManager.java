package ru.netology.manager;
//import ru.netology.domain.CountShowLastFilm;
import ru.netology.domain.PurchaseItem;

class FilmManager {

  private PurchaseItem[] items = new PurchaseItem[0];

  public void add(PurchaseItem item) {

    int length = items.length + 1;
    PurchaseItem[] tmp = new PurchaseItem[length];

    for (int i = 0; i < items.length; i++) {
      tmp[i] = items[i];
    }

    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    items = tmp;
  }

  public PurchaseItem[] getAll() {
    PurchaseItem[] result = new PurchaseItem[items.length];

    for (int i = 0; i < result.length; i++) {
      int index = items.length - i - 1;
      result[i] = items[index];
    }
    return result;
  }

  public PurchaseItem[] showLatestFilm() {

    int count = 5;

    PurchaseItem[] item = new PurchaseItem[items.length];

    if (items.length <= count) {
      for (int i = 0; i < items.length; i++) {
        int index = items.length - i - 1;
        item[i] = items[index];
      }
      return item;
    } else {
      PurchaseItem[] item1 = new PurchaseItem[count];
      for (int i = 0; i < count; i++) {
        int index = items.length - i - 1;
        item1[i] = items[index];
      }

      return item1;

    }
  }


}