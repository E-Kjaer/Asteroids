import dk.sdu.mmmi.cbse.collision.CollisionProcessor;
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;

module Collision {
    requires Common;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonPlayer;
    requires CommonAsteroid;
    requires CommonCollision;
    requires CommonStar;

    uses dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;
    provides IPostEntityProcessingService with CollisionProcessor;
}