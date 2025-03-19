import dk.sdu.mmmi.cbse.asteroid.AsteroidGamePlugin;
import dk.sdu.mmmi.cbse.asteroid.AsteroidProcessor;
import dk.sdu.mmmi.cbse.common.services.*;

module Asteroid {
    requires Common;
    requires CommonAsteroid;
    provides IGamePluginService with AsteroidGamePlugin;
    provides IEntityProcessingService with AsteroidProcessor;
}