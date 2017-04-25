package model.events;

import model.Coord;
import model.Player;

public class PlayerMoveRequestEvent
{
    public Player sender;
    public Coord gridCoord, spaceCoord;

    public PlayerMoveRequestEvent(Player sender, Coord gridCoord, Coord spaceCoord)
    {
        this.sender = sender;
        this.gridCoord = gridCoord;
        this.spaceCoord = spaceCoord;
    }
}
