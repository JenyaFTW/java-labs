package items;

public class BaseItem {
    private String name;
    private int price;
    private float weight;

    public BaseItem() {
        this.name = "BaseItem";
        this.price = 0;
        this.weight = 0f;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public float getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Price: %d | Weight: %f", this.getName(), this.getPrice(), this.getWeight());
    }
}
