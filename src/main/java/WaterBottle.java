public class WaterBottle {

    private int volume = 100;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int addDrink() {
        return volume += 10;
    }

    public int emptyBottle() {
        return volume = 0;
    }

    public int fillsVolumenAgain() {
        return volume = 100;
    }
}
