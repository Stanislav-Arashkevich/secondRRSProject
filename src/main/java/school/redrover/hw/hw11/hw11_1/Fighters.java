package school.redrover.hw.hw11.hw11_1;

public class Fighters {

    private final String fighter;
    private int health;
    private int damagePerAttack;

    public Fighters(String fighter, int health, int damagePerAttack) {

        this.fighter = fighter;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getFighter() {
        return fighter;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public String declareWinner(Fighters fighter1, Fighters fighter2, String firstAttacker) {

        if (fighter1 == null || fighter2 == null) {
            return "Fighters can't be null";
        }
        if (fighter1.getHealth() <= 0 || fighter2.getHealth() <= 0) {
            return "Fighters can't have negative or zero health";
        }

        if (fighter1.getFighter().equals(fighter2.getFighter())) {
            return "Fighters can't be the same";
        }

        Fighters first = firstAttacker.equals(fighter1.getFighter()) ? fighter1 : fighter2;
        Fighters second = first == fighter1 ? fighter2 : fighter1;

        while (true) {
            second.setHealth(second.getHealth() - first.getDamagePerAttack());

            if (second.getHealth() <= 0) {
                return first.getFighter();
            }

            first.setHealth(first.getHealth() - second.getDamagePerAttack());

            if (first.getHealth() <= 0) {
                return second.getFighter();
            }
        }
    }
}