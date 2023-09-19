

public class Building {
    private int squareMeter;

    public Building(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getTax() {
        return squareMeter * Main.TAX_RATE;
    }
}
