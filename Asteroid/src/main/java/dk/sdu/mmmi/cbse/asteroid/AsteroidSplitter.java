package dk.sdu.mmmi.cbse.asteroid;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.commonAsteroid.Asteroid;
import dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;

import java.util.Random;


public class AsteroidSplitter implements IAsteroidSplitter {
    @Override
    public void splitAsteroid(Asteroid asteroid, GameData gameData, World world) {
        double x = asteroid.getX();
        double y = asteroid.getY();

        if (asteroid.getRadius() > 4) {
            Random rnd = new Random();
            for (int i = 0; i < 2; i++) {
                Entity a = new Asteroid();
                float size = asteroid.getRadius() / 2;
                a.setPolygonCoordinates(size, -size, -size, -size, -size, size, size, size);
                a.setRadius(size);
                a.setX(x + i * 10 + 5);
                a.setY(y + i * 10 + 5);
                a.setRadius(size);
                a.setRotation(asteroid.getRotation() + rnd.nextInt(-180, 180));
                a.setColor(asteroid.getColor());
                world.addEntity(a);
            }
        }
    }
}
