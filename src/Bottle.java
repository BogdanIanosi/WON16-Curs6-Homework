public class Bottle {
    private final int totalCapacity;
    private int availableLiquid;
    private boolean isOpen;

    public Bottle(int totalCapacity, int availableLiquid, boolean isOpen) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.isOpen = isOpen;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        if (isOpen) {
            return "Bottle is already open";
        } else {
            isOpen = true;
            return "Bottle is opened";
        }
    }

    public String closeBottle() {
        if (!isOpen) {
            return "Bottle is already closed";
        } else {
            isOpen = false;
            return "Bottle is closed";
        }
    }

    public String drinkLiquid(int amount) {
        if (!isOpen) {
            return "Cannot drink from a closed bottle";
        } else if (availableLiquid < amount) {
            return "Not enough liquid in the bottle";
        } else {
            availableLiquid -= amount;
            return "You drank " + amount + " ml of liquid";
        }
    }

    public static void main(String[] args) {
        Bottle bottle = new Bottle(500, 300, false);

        System.out.println(bottle.openBottle()); // Bottle is opened
        System.out.println(bottle.drinkLiquid(200)); // You drank 200 ml of liquid
        System.out.println(bottle.drinkLiquid(150)); // You drank 150 ml of liquid
        System.out.println(bottle.drinkLiquid(100)); // Not enough liquid in the bottle
        System.out.println(bottle.closeBottle()); // Bottle is closed
        System.out.println(bottle.openBottle()); // Bottle is already open
        System.out.println(bottle.drinkLiquid(100)); // Cannot drink from a closed bottle
    }
}

