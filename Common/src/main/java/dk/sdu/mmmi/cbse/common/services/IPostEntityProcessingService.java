package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * SPI for services that need to run after entities has been processed
 */
public interface IPostEntityProcessingService {
    /**
     * Service for processing entities after processing
     * <p>
     * Precondition: All entities must have been processed
     * <p>
     * Postcondition: All extra processing must have been processed
     *
     * @param gameData Data about the screen size and allowed keys
     * @param world Data about the entities in the world
     */
    void process(GameData gameData, World world);
}
