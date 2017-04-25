package model;

public class TurnManager
{
    public Player[] players;
    public int currPlayerIndex;

    public void nextPlayer()
    {
        currPlayerIndex = (currPlayerIndex + 1) % players.length;
    }
}
