package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * SPI for services that process entities
 */

public interface IEntityProcessingService {

    /**
     * Service for updating the state of entities
     * <p>
     * Precondition: Graphics must not have been rendered
     * <p>
     * Postcondition: All entities must be processed -> All data must be up to date.
     *
     * @param gameData Data about the screen size and allowed keys
     * @param world Data about the entities in the world
     */
    void process(GameData gameData, World world);
}
