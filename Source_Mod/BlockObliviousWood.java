package net.minecraft.src;

import java.util.Random;

public class BlockObliviousWood extends Block
{
	
    public BlockObliviousWood(int i, int j)
    {
        super(i, j, Material.wood);
    }
    
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.ObliviousWood.blockID;
    }
    
}
