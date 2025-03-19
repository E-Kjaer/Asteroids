import dk.sdu.mmmi.cbse.asteroid.AsteroidGamePlugin;
import dk.sdu.mmmi.cbse.asteroid.AsteroidProcessor;
import dk.sdu.mmmi.cbse.asteroid.AsteroidSplitter;
import dk.sdu.mmmi.cbse.common.services.*;
import dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;

module Asteroid {
    requires Common;
    requires CommonAsteroid;
    provides IAsteroidSplitter with AsteroidSplitter;
    provides IGamePluginService with AsteroidGamePlugin;
    provides IEntityProcessingService with AsteroidProcessor;
}