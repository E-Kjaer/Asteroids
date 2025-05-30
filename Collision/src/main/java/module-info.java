import dk.sdu.mmmi.cbse.collision.CollisionHandler;
import dk.sdu.mmmi.cbse.collision.CollisionProcessor;
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;

module Collision {
    requires Common;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonPlayer;
    requires CommonAsteroid;
    requires CommonCollision;
    requires CommonStar;

    uses dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;
    uses dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;
    provides IPostEntityProcessingService with CollisionProcessor;
    provides ICollisionHandler with CollisionHandler;
}