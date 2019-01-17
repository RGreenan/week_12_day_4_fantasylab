package rooms;

public enum EnemyType {
    GOBLIN("goblin", 20),
    MIMIC("mimic", 50),
    TROLL("troll", 60),
    SIREN("siren", 80),
    ULTIMATEWEAPON("ultimate weapon", 100);

    private final String name;
    private  final double points;

    EnemyType(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
}
