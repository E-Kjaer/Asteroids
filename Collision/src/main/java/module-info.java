import dk.sdu.mmmi.cbse.collision.CollisionHandler;
import dk.sdu.mmmi.cbse.collision.CollisionProcessor;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;

module Collision {
    requires Common;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonPlayer;
    requires CommonAsteroid;
    requires CommonCollision;
    provides IEntityProcessingService with CollisionProcessor;
}