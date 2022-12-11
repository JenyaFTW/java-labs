package items;

public class Leggings extends BaseItem {
    @Override
    public String getName() {
        return "Leggings";
    }

    @Override
    public int getPrice() {
        return 75;
    }

    @Override
    public float getWeight() {
        return 2.8f;
    }
}
