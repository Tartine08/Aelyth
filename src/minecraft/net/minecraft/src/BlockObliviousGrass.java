package net.minecraft.src;

import java.util.Random;

public class BlockObliviousGrass extends Block
{

	protected BlockObliviousGrass(int i, int j)
	{
		super(i, j, Material.grassMaterial);
	}
	
	
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.ObliviousDirt.blockID;
    }

}
