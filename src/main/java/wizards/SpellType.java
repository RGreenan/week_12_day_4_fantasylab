package wizards;

public enum SpellType {
    FIREBALL("fireball", 40),
    LIGHTNINGSTRIKE("lightning strike", 30);

    private final String name;
    private final double points;

    SpellType(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
}
