package items;

public class Gloves extends BaseItem {
    @Override
    public String getName() {
        return "Gloves";
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public float getWeight() {
        return 1.1f;
    }
}
