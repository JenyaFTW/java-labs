import items.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Knight {
    private List<BaseItem> inventory;

    public Knight() {
        inventory = new ArrayList<>();
        inventory.add(new Helmet());
        inventory.add(new Chestplate());
        inventory.add(new Gloves());
        inventory.add(new Leggings());
        inventory.add(new Boots());
        inventory.add(new Shield());
    }

    public List<BaseItem> getInventory() {
        return inventory;
    }

    public int inventoryPrice() {
        int totalPrice = 0;
        for (BaseItem i: inventory) totalPrice += i.getPrice();
        return totalPrice;
    }

    public void sortInventoryByWeight() {
        inventory.sort(Comparator.comparing(BaseItem::getWeight));
    }

    public List<BaseItem> inventoryPriceRange(int from, int to) {
        List<BaseItem> filtered = new ArrayList();
        for (BaseItem i: inventory) {
            int price = i.getPrice();
            if (price >= from && price <= to) {
                filtered.add(i);
            }
        }
        return filtered;
    }
}
