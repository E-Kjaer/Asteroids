import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.player.PlayerGamePlugin;
import dk.sdu.mmmi.cbse.player.PlayerProcessor;

module Player {
    requires Common;
    requires CommonPlayer;
    provides IGamePluginService with PlayerGamePlugin;
    provides IEntityProcessingService with PlayerProcessor;
}