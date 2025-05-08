package dk.sdu.mmmi.cbse.map;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonStar.Star;

import java.util.Random;

public class MapGamePlugin implements IGamePluginService {
    @Override
    public void start(GameData gameData, World world) {
        Random rnd = new Random();
        for (int col = 0; col < gameData.getDisplayWidth(); col += 40) {
            for (int row = 0; row < gameData.getDisplayHeight(); row += 40) {
                Star star = new Star();
                star.setColor(new int[]{245, 236, 66});
                double size = rnd.nextDouble(1.5);
                star.setPolygonCoordinates(size, size, -size, size, -size, -size, size, -size);
                star.setX(col + rnd.nextFloat(-15, 15));
                star.setY(row + rnd.nextFloat(-15, 15));
                star.setRotation(rnd.nextInt(360));
                world.addEntity(star);
            }
        }
    }

    @Override
    public void stop(GameData gameData, World world) {
        for (Entity entity : world.getEntities()) {
            if (entity instanceof Star) world.removeEntity(entity);
        }
    }
}
