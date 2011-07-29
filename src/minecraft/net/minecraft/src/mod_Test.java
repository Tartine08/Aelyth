package net.minecraft.src;

public class mod_Test extends BaseMod
{
	public static Item itemTest;
	
	public static final Block blocTest;
	
	public mod_Test()
	{
		itemTest = (new Item(150)).setIconCoord(0, 0).setItemName("itemTest");
	}
	
	static
	{
		blocTest = (new BlockTest(150, 50)).setBlockName("blocTest");
	}
	
	public String Version()
	{
		return "Test de GitHub";
	}
}
