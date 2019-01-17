package fighters;

public enum WeaponType {
    SWORD("sword", 20),
    CLUB("club", 30),
    AXE("axe", 25);

    private final String weaponName;
    private final double points;

    WeaponType(String weaponName, double points){
        this.weaponName = weaponName;
        this.points = points;
    }

    public double getPoints() {
        return points;
    }
}
