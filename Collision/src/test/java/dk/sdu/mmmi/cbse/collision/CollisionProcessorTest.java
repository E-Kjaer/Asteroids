package dk.sdu.mmmi.cbse.collision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.commonBullet.Bullet;
import dk.sdu.mmmi.cbse.commonEnemy.Enemy;
import dk.sdu.mmmi.cbse.commonPlayer.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollisionProcessorTest {
    private GameData gameData;
    private World world;
    private CollisionProcessor collisionProcessor;

    @BeforeEach
    public void setup() {
        gameData = new GameData();
        world = new World();
        collisionProcessor = new CollisionProcessor();
    }

    @Test
    public void testBulletDamagesEnemy() {
        int damage = 5;
        int health = 10;

        Bullet bullet = new Bullet();
        bullet.setX(0);
        bullet.setY(0);
        bullet.setRadius(1);
        bullet.setDamage(damage);

        Entity enemy = new Enemy();
        enemy.setX(0);
        enemy.setY(0);
        enemy.setRadius(1);
        enemy.setHealth(health);

        world.addEntity(bullet);
        world.addEntity(enemy);

        assertTrue(world.getEntities().contains(bullet));
        assertTrue(world.getEntities().contains(enemy));

        collisionProcessor.process(gameData, world);

        assertEquals(health - damage, enemy.getHealth());
    }

    @Test
    public void testPlayerEnemyCollisionDamagesBoth() {
        int enemyDamage = 5;
        int enemyHealth = 10;
        int playerDamage = 5;
        int playerHealth = 10;

        Entity enemy = new Enemy();
        enemy.setX(0);
        enemy.setY(0);
        enemy.setRadius(1);
        enemy.setHealth(enemyHealth);
        enemy.setDamage(enemyDamage);

        Entity player = new Player();
        player.setX(0);
        player.setY(0);
        player.setRadius(1);
        player.setHealth(playerHealth);
        player.setDamage(playerDamage);

        world.addEntity(enemy);
        world.addEntity(player);

        assertTrue(world.getEntities().contains(enemy));
        assertTrue(world.getEntities().contains(player));

        collisionProcessor.process(gameData, world);

        assertEquals(playerHealth - enemyDamage, player.getHealth());
        assertEquals(enemyHealth - playerDamage, enemy.getHealth());
    }
}