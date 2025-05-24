package dk.sdu.mmmi.cbse.commonscoring;

/**
 * SPI for scoring systems.
 */
public interface IScoringSPI {
    /**
     * Method for updating and retrieving the current score
     *
     * <p>
     * Precondition - A scoring increasing event must have happened
     * <p>
     * Postcondition - The score must have been updated and returned
     *
     * @param points The amount of point to increase the score by
     * @return The current score
     */
    int updateScore(int points);
}
