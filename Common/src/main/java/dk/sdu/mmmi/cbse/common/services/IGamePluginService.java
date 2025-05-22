package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * SPI for plugins in the game
 */
public interface IGamePluginService {
    /**
     * Method for starting the plug-in
     *
     * <p>
     * Precondition: Plug-in must not be started
     * <p>
     * Postcondition: Plug-in must be started
     *
     * @param gameData Data about the screen size and allowed keys
     * @param world Data about the entities in the world
     */
    void start(GameData gameData, World world);

    /**
     * Method for stopping the plug-in
     *
     * Precondition: Plug-in must be running
     * Postcondition: Plug-in must be stopped
     *
     * @param gameData Data about the screen size and allowed keys
     * @param world Data about the entities in the world
     */
    void stop(GameData gameData, World world);
}
