import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack <= 0) {
            throw new IllegalArgumentException("Health, strength, and attack must be positive integers.");
        }
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public void attack(Player opponent) {
        int attackRoll = rollDice();
        int damage = attackRoll * attack;
        
        int defendRoll = opponent.rollDice();
        int defense = defendRoll * opponent.strength;
        
        int damageDealt = Math.max(0, damage - defense);
        
        opponent.takeDamage(damageDealt);
    }

    private int rollDice() {
        return random.nextInt(6) + 1; // Simulate a 6-sided dice roll
    }

    private void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public String toString() {
        return "Player [health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
    }
}