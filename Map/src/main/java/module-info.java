import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.map.MapGamePlugin;

module Map {
    requires Common;
    requires CommonStar;

    provides IGamePluginService with MapGamePlugin;
}