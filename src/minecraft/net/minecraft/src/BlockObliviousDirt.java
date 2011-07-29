package net.minecraft.src;

import java.util.Random;

public class BlockObliviousDirt extends Block
{
	public BlockObliviousDirt(int i, int j)
	{
		super(i, j, Material.ground);
	}
	
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.ObliviousDirt.blockID;
    }
}
