package phao.hidearmor.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import phao.hidearmor.objects.blocks.BlockBase;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ORE_TUTORIAL = new BlockBase("ore_tutorial", Material.IRON);
}
