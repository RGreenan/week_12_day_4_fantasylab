package rooms;

import players.Player;
import wizards.Warlock;

import java.util.ArrayList;
import java.util.Random;

public class CombatRoom extends Room {

    private ArrayList<EnemyType> enemys;

    public CombatRoom(String name) {
        super(name);
        this.enemys = new ArrayList<>();
    }


    public EnemyType randomEnemy(){
        Random randomizer = new Random();
        int randomIndex = randomizer.nextInt(this.enemys.size()); // for size 3, this will be between 0 and 2
        return this.enemys.get(randomIndex);
    }

    public EnemyType getEnemy(EnemyType newenemy){
        for (EnemyType enemy : enemys){
            if (newenemy == enemy){
                return enemy;
            }
        }
        return null;
    }

    public void addEnemy(EnemyType enemy) {
        enemys.add(enemy);
    }

    public int countEnemys(){
        return enemys.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String fightEnemy(EnemyType enemy, Player player) {
        double playerHP = player.getHealthpoints();
        double eHP = enemy.getPoints();
        if ( playerHP > eHP ){
            player.setHealthpoints(playerHP -= eHP);
            return "Player Wins";
        }
        else {
            player.setHealthpoints(0);
            return "Enemy Wins. Player is out of HP";
        }

    }

    public String fightRandomEnemy(Player player) {
        double playerHP = player.getHealthpoints();
        EnemyType enemy = randomEnemy();
        System.out.println(enemy);
        double eHP = enemy.getPoints();
        if ( playerHP > eHP ){
            player.setHealthpoints(playerHP -= eHP);
            return "Player Wins";
        }
        else {
            player.setHealthpoints(0);
            return "Enemy Wins. Player is out of HP";
        }
    }
}
