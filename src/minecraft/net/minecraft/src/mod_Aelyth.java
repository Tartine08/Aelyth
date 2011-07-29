package net.minecraft.src;

public class mod_Aelyth extends BaseMod
{
	
	public static int ObliviousDirtTexture;
	public static int ObliviousGrassTexture;
	public static int ObliviousLogTexture;

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
		ModLoader.RegisterBlock(ObliviousLog);
	}
	
	
	
	public void setupBlockName()
	{
		ModLoader.AddName(ObliviousDirt, "Oblivious Dirt");
		ModLoader.AddName(ObliviousGrass, "Oblivious Grass");
		ModLoader.AddName(ObliviousLog, "Oblivious Log");
	}
	
	
	
	public void setupTexture()
	{
		ObliviousDirtTexture = ModLoader.addOverride("/terrain.png", "/Aelyth/ObliviousDirt.png");
		ObliviousGrassTexture = ModLoader.addOverride("/terrain.png", "/Aelyth/ObliviousGrass.png");
		ObliviousLogTexture = ModLoader.addOverride("/terrain.png", "/Aelyth/ObliviousLog.png");
	}
	
	
	
	public static final Block ObliviousDirt = (new BlockObliviousDirt(100, ObliviousDirtTexture))
													.setHardness(0.6F)
													.setStepSound(Block.soundGravelFootstep)
													.setBlockName("obliviousdirt");
	
	public static final Block ObliviousGrass = (new BlockObliviousGrass(101, ObliviousGrassTexture))
													.setHardness(0.7F)
													.setStepSound(Block.soundGrassFootstep)
													.setBlockName("obliviousgrass");
	
	public static final Block ObliviousLog = (new BlockObliviousLog(102, ObliviousLogTexture))
													.setHardness(2.0F)
													.setStepSound(Block.soundWoodFootstep)
													.setBlockName("obliviouslog");
	
	
	
	public String Version()
	{
		return "En developpement ..";
	}

}
