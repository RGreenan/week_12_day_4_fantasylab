public enum CreatureType {
    DRAGON("dragon", 30),
    CAT("cat", 20);

    private final String name;
    private final double points;

    CreatureType(String name, double points){
        this.name = name;
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
}
