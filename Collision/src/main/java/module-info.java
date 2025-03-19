import dk.sdu.mmmi.cbse.collision.CollisionProcessor;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;

module Collision {
    requires Common;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonPlayer;
    requires CommonAsteroid;
    requires CommonCollision;
    uses dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;
    provides IEntityProcessingService with CollisionProcessor;
}