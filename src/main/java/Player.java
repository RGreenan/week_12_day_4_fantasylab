public abstract class Player {
    protected double healthpoints;
    private String name;

    public Player(double healthpoints, String name) {
        this.healthpoints = healthpoints;
        this.name = name;
    }

    public double getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(double healthpoints) {
        this.healthpoints = healthpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
