package dk.sdu.mmmi.cbse.commonAsteroid;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * SPI for services that implement asteroid splitting logic
 */
public interface IAsteroidSplitter {
    /**
     * Method for splitting asteroid
     *
     * @param asteroid Asteroid to be split
     * @param gameData GameData object
     * @param world World object
     *
     * @see Asteroid
     * @see GameData
     * @see World
     */
    void splitAsteroid(Asteroid asteroid, GameData gameData, World world);
}
