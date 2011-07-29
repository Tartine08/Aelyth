package net.minecraft.src;

import java.util.Random;

public class BlockTest extends Block 
{
	public BlockTest(int i, int j)
	{
		super(i, j, Material.ground);
	}
	
    public int idDropped(int i, Random random)
    {
        return mod_Test.item.shiftedIndex;
    }
}
