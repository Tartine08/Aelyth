package net.minecraft.src;

public class mod_Test extends BaseMod
{
	public static Item item;
	
	public static final Block blocTest;
	
	public mod_Test()
	{
		item = (new Item(150)).setIconCoord(0, 0).setItemName("item");
	}
	
	static
	{
		blocTest = (new BlockTest(149, 52)).setBlockName("blocTest");
	}
	
	public String Version()
	{
		return "Test de GitHub 2e";
	}
}
