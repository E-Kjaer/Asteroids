package dk.sdu.mmmi.cbse.commonPlayer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlayerTest {
    @Test
    public void testPlayerCanTakeDamage() {
        int health = 20;
        int damage = 10;
        Player player = new Player();
        player.setHealth(health);

        player.takeDamage(damage);

        assertEquals(health - damage, player.getHealth());
    }
}