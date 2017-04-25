package model;

public class GridOfGrids
{
    public Grid[][] grids;

    public GridOfGrids(int size)
    {
        grids = new Grid[size][size];
    }
}
