package items;

public class Boots extends BaseItem {
    @Override
    public String getName() {
        return "Boots";
    }

    @Override
    public int getPrice() {
        return 75;
    }

    @Override
    public float getWeight() {
        return 2.1f;
    }
}
