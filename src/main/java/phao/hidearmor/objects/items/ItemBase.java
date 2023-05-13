package phao.hidearmor.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import phao.hidearmor.Main;
import phao.hidearmor.init.ItemInit;
import phao.hidearmor.proxy.ClientProxy;
import phao.hidearmor.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");		
	}


}
