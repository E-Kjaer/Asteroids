package dk.sdu.mmmi.cbse.commonAsteroid;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IAsteroidSplitter {
    public void splitAsteroid(Asteroid asteroid, GameData gameData, World world);
}
