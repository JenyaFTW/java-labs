package items;

public class Chestplate extends BaseItem {
    @Override
    public String getName() {
        return "Chestplate";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public float getWeight() {
        return 5.5f;
    }
}
