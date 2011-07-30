package net.minecraft.src;

import java.util.Random;

public class BlockObliviousSand extends Block
{
	
    public BlockObliviousSand(int i, int j)
    {
        super(i, j, Material.ground);
    }
    
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.ObliviousSand.blockID;
    }
    
}
