package businessLogic.entities;

public class Factory
{
    public GameEntity createEntity(String _type)
    {
        GameEntity entity = null;
        switch (_type)
        {
            case "Player":
                entity = new Player();
                break;
        }

        return entity;
    }

    public GameEntity createEntity(String _type, Player _player1)
    {
        GameEntity entity = null;
        switch (_type)
        {
            case "Treasure":
                entity = new Treasure(_player1);
                break;
            case "Trap":
                entity = new Trap(_player1);
                break;
        }
        return entity;
    }
}
