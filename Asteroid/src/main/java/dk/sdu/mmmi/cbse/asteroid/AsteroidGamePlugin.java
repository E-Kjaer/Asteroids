package dk.sdu.mmmi.cbse.asteroid;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonAsteroid.Asteroid;

import java.util.Random;


public class AsteroidGamePlugin implements IGamePluginService {
    @Override
    public void start(GameData gameData, World world) {
        for (int i = 0; i < 100; i++) {
            Random rnd = new Random();
            Entity a = createAsteroid(i * 10, i * 10, rnd.nextInt(360), new int[]{i * 20, i * 30, i* 50});
            world.addEntity(a);
        }
    }

    @Override
    public void stop(GameData gameData, World world) {
        for (Entity a : world.getEntities(Asteroid.class)) {
            world.removeEntity(a);
        }
    }

    public Entity createAsteroid(int x, int y, int rotation, int[] color) {
        Entity asteroid = new Asteroid();
        Random rnd = new Random();
        int size = rnd.nextInt(10) + 5;
        asteroid.setPolygonCoordinates(size, -size, -size, -size, -size, size, size, size);
        asteroid.setX(x);
        asteroid.setY(y);
        asteroid.setRadius(size);
        asteroid.setRotation(rotation);
        asteroid.setColor(color);
        return asteroid;
    }
}
