package dk.sdu.mmmi.cbse.collision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;

public class CollisionProcessor implements IEntityProcessingService {
    @Override
    public void process(GameData gameData, World world) {
        for (Entity e1 : world.getEntities()) {
            for (Entity e2 : world.getEntities()) {
                if (Math.sqrt(Math.pow(Math.abs(e1.getX() - e2.getX()), 2) + Math.pow((Math.abs(e1.getY() - e2.getY())), 2)) <= e1.getRadius() + e2.getRadius()) {
                    getCollisionHandler().handleCollision(e1, e2, gameData, world);
                }
            }
        }
    }

    public ICollisionHandler getCollisionHandler() {
        return new CollisionHandler();
    }
}
