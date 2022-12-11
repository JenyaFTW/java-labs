import items.BaseItem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();

        int inventoryPrice = knight.inventoryPrice();
        System.out.printf("Inventory Price: $%d\n", inventoryPrice);

        knight.sortInventoryByWeight();
        System.out.println("Items sorted by weight:");
        for (BaseItem i: knight.getInventory()) {
            System.out.println(i);
        }

        List<BaseItem> inventoryRange = knight.inventoryPriceRange(0, 100);
        System.out.println("Items cheaper than $100:");
        for (BaseItem i: inventoryRange) {
            System.out.println(i);
        }
    }
}
