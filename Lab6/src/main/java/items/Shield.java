package items;

public class Shield extends BaseItem {
    @Override
    public String getName() {
        return "Shield";
    }

    @Override
    public int getPrice() {
        return 150;
    }

    @Override
    public float getWeight() {
        return 13.6f;
    }
}
