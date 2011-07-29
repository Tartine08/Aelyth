package net.minecraft.src;

import java.util.Random;

public class BlockObliviousStone extends Block
{
	
    public BlockObliviousStone(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.ObliviousCobble.blockID;
    }
}
