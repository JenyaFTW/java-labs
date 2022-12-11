package items;

public class Helmet extends BaseItem {
    @Override
    public String getName() {
        return "Helmet";
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public float getWeight() {
        return 2.72f;
    }
}
