package dk.sdu.mmmi.cbse.commonCollision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface ICollisionHandler {
    public void handleCollision(Entity e1, Entity e2, GameData gameData, World world);
}
