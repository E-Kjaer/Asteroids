import dk.sdu.mmmi.cbse.asteroid.AsteroidGamePlugin;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

module AsteroidDuplicate {
    requires Common;
    requires CommonAsteroid;
    provides IGamePluginService with AsteroidGamePlugin;
}