package healers;

public enum PotionType {
    SMALLHEAL("small heal", 5),
    MEDIUMHEAL("medium heal", 20),
    HIGHHEAL("high heal", 40);

    private final String name;
    private final double points;

    PotionType(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
}
