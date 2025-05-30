package dk.sdu.mmmi.cbse.collision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import dk.sdu.mmmi.cbse.commonCollision.ICollidable;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;
import dk.sdu.mmmi.cbse.commonStar.Star;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ServiceLoader;

import static java.util.stream.Collectors.toList;

public class CollisionProcessor implements IPostEntityProcessingService {
    @Override
    public void process(GameData gameData, World world) {
        Collection<Entity> entities = new ArrayList<>();
        for (Entity entity : world.getEntities()) {
            if (entity instanceof ICollidable) {
                entities.add(entity);
            }
        }

        for (Entity e1 : entities) {
            for (Entity e2 : entities) {
                if (e1 instanceof Star || e2 instanceof Star) continue;
                if (Math.sqrt(Math.pow(Math.abs(e1.getX() - e2.getX()), 2) + Math.pow((Math.abs(e1.getY() - e2.getY())), 2)) <= e1.getRadius() + e2.getRadius()) {
                    getCollisionHandler().stream().findFirst().ifPresent(iCollisionHandler -> iCollisionHandler.handleCollision(e1, e2, gameData, world));
                }
            }
        }
    }

    private Collection<? extends ICollisionHandler> getCollisionHandler() {
        return ServiceLoader.load(ICollisionHandler.class).stream().map(ServiceLoader.Provider::get).collect(toList());
    }
}
