import java.awt.Graphics;

// this class controls the whole game: player, viruses, packets, bombs and barriers
public class ArcadeGame {

    // the player's core node
    private PlayerNode player;

    // array of virus objects for the enemy formation
    private Virus[] viruses;

    // list of active data packets fired by the player
    private DataPacket[] packets;

    // firewall barriers the player hides behind
    private FirewallBlock[] barriers;

    // current level and score
    private int level;
    private int score;

    // constructor sets up the game objects
    public Arcade() {
        player = new PlayerNode(375, 540);
        level = 1;
        score = 0;

        // setup the initial level
        setupLevel();
    }

    // creates the virus formation and barriers for the current level
    private void setupLevel() {
        viruses = new Virus[0];
        packets = new DataPacket[0];
        barriers = new FirewallBlock[0];
    }

    // draws every game object
    public void draw(Graphics g) {
        player.draw(g);
    }

    // moves the player left or right by dir, dir is -1 or 1
    public void movePlayer(int dir) {
        player.move(dir);
    }

    // fires a data packet from the player
    public void fire() {
        // shortcut: packet list not yet grown, add to packets array when shooting is implemented
    }

    // '9' key jumps to the next level for testing
    public void testLevelJump() {
        if (level < 2) {
            level++;
        }
        setupLevel();
    }

    // runs one tick of the game: moves enemies and checks collisions
    public void update() {
        // collision detection and enemy movement go here
    }

    // method that returns this.level
    public int getLevel() {
        return level;
    }

    // method that returns this.score
    public int getScore() {
        return score;
    }
}
