package net.minecraft.src;

import java.util.Random;

public class BlockObliviousLog extends Block
{
    public BlockObliviousLog(int i, int j)
    {
        super(i, j, Material.wood);
    }
    
    public int idDropped(int i, Random random)
    {
        return mod_Aelyth.ObliviousLog.blockID;
    }
}
