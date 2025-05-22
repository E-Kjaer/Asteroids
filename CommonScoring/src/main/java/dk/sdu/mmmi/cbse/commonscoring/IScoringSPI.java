package dk.sdu.mmmi.cbse.commonscoring;

/**
 * SPI for scoring systems.
 */
public interface IScoringSPI {
    /**
     * Method for updating and retrieving the current score
     *
     * @param points The amount of point to increase the score by
     * @return The current score
     */
    int updateScore(int points);
}
