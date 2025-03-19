package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 *
 * @author jcs
 */
public interface IPostEntityProcessingService {
    /**
     * Service for processing entities after processing
     *
     * Precondition: All entities must have been processed
     * Postcondition: All extra processing for the entities must have been processed
     *
     * @param gameData Data about the screen size and allowed keys
     * @param world Data about the entities in the world
     * @throws
     */
    void process(GameData gameData, World world);
}
