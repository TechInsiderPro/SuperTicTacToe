package model;

public class Grid
{
    public PlayerSymbol[][] spaces;

    public Grid(int size)
    {
        spaces = new PlayerSymbol[size][size];
    }

    public boolean setSpace(Coord coord, PlayerSymbol playerSymbol)
    {
        if (isEmpty(coord))
        {
            spaces[coord.row][coord.col] = playerSymbol;
            return true;
        }
        else
            return false;
    }

    public boolean isEmpty(Coord coord)
    {
        return getPlayerSysbol(coord) == null;
    }

    public PlayerSymbol getPlayerSysbol(Coord coord)
    {
        return spaces[coord.row][coord.col];
    }
}
