package net.minecraft.src;

public class mod_Aelyth extends BaseMod
{
	
	public static int ObliviousDirtTexture;

	public mod_Aelyth()
	{
		RegisterBlock();
		setupBlockName();
		setupTexture();
	}
	
	
	
	public void RegisterBlock()
	{
		ModLoader.RegisterBlock(ObliviousDirt);
	}
	
	
	
	public void setupBlockName()
	{
		ModLoader.AddName(ObliviousDirt, "Oblivious Dirt");
	}
	
	
	
	public void setupTexture()
	{
		ObliviousDirtTexture = ModLoader.addOverride("/terrain.png", "/Aelyth/ObliviousDirt.png");
	}
	
	
	
	public static final Block ObliviousDirt = (new BlockObliviousDirt(100, ObliviousDirtTexture))
													.setHardness(0.6F)
													.setStepSound(Block.soundGravelFootstep)
													.setBlockName("obliviousdirt");
	
	
	
	public String Version()
	{
		return "En developpement ..";
	}

}
