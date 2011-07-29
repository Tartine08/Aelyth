package net.minecraft.src;

public class mod_Aelyth extends BaseMod
{
	
	public static int ObliviousDirtTexture;
	public static int ObliviousGrassTexture;

	public mod_Aelyth()
	{
		RegisterBlock();
		setupBlockName();
		setupTexture();
	}
	
	
	
	public void RegisterBlock()
	{
		ModLoader.RegisterBlock(ObliviousDirt);
		ModLoader.RegisterBlock(ObliviousGrass);
	}
	
	
	
	public void setupBlockName()
	{
		ModLoader.AddName(ObliviousDirt, "Oblivious Dirt");
		ModLoader.AddName(ObliviousGrass, "Oblivious Grass");
	}
	
	
	
	public void setupTexture()
	{
		ObliviousDirtTexture = ModLoader.addOverride("/terrain.png", "/Aelyth/ObliviousDirt.png");
		ObliviousGrassTexture = ModLoader.addOverride("/terrain.png", "/Aelyth/ObliviousGrass.png");
	}
	
	
	
	public static final Block ObliviousDirt = (new BlockObliviousDirt(100, ObliviousDirtTexture))
													.setHardness(0.6F)
													.setStepSound(Block.soundGravelFootstep)
													.setBlockName("obliviousdirt");
	
	public static final Block ObliviousGrass = (new BlockObliviousGrass(101, ObliviousGrassTexture))
													.setHardness(0.7F)
													.setStepSound(Block.soundGrassFootstep)
													.setBlockName("obliviousgrass");
	
	
	
	public String Version()
	{
		return "En developpement ..";
	}

}
