package dk.sdu.mmmi.cbse.commonCollision;

/**
 * Interface that allows entities to collide with other entities and specify its collision type
 */
public interface ICollidable {
    /**
     * Method for retrieving the collision type of an entity
     * @return The collision type of the entity
     *
     * @see CollisionType
     */
    CollisionType getCollisionType();
}
