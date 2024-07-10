import java.util.Scanner;

public class MagicalArena {
    private Player playerA;
    private Player playerB;
    private Scanner scanner;

    public MagicalArena() {
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        playerA = createPlayer("Player A");
        playerB = createPlayer("Player B");

        Player attacker = getInitialAttacker();
        Player defender = (attacker == playerA) ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            attack(attacker, defender);
            // Switch roles for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        announceWinner();
    }

    private Player createPlayer(String playerName) {
        System.out.println("Enter attributes for " + playerName + ":");
        int health = getIntInput("Health:");
        int strength = getIntInput("Strength:");
        int attack = getIntInput("Attack:");
        return new Player(health, strength, attack);
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt + " ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    private Player getInitialAttacker() {
        return (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
    }

    private void attack(Player attacker, Player defender) {
        attacker.attack(defender);
        System.out.println(attacker + " attacks " + defender);
        System.out.println("Current status - Player A: " + playerA.getHealth() + ", Player B: " + playerB.getHealth());
        System.out.println();
    }

    private void announceWinner() {
        if (playerA.getHealth() <= 0) {
            System.out.println("Player B wins!");
        } else {
            System.out.println("Player A wins!");
        }
    }

    public static void main(String[] args) {
        MagicalArena arena = new MagicalArena();
        arena.startGame();
    }
}