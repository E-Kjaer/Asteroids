package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IEntityProcessingService {

    /**
     * Service for updating the state of entities
     *
     * Precondition: Graphics must not have been rendered
     * Postcondition: All entities must be processed -> All data must be up to date.
     *
     * @param gameData Data about the screen size and allowed keys
     * @param world Data about the entities in the world
     * @throws
     */
    void process(GameData gameData, World world);
}
