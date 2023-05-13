package phao.hidearmor.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import phao.hidearmor.objects.armor.ArmorBase;
import phao.hidearmor.objects.items.ItemBase;
import phao.hidearmor.objects.tools.ToolPickaxe;
import phao.hidearmor.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/*
	 *  WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
	 */
	
//	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", harvestLevel, maxUses, efficiency, damage, enchantability)
	public static final ToolMaterial TOOL_TUTORIAL = EnumHelper.addToolMaterial("tool_tutorial", 1, 131, 4.0F, 1.0F, 5); // stone values

	
	/*
	 *         LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

	 */
	
	//public static final ArmorMaterial ARMOR_COPPER = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	public static final ArmorMaterial ARMOR_TUTORIAL = EnumHelper.addArmorMaterial("armor_tutorial", Reference.MODID+":tutorial", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F); // leather values
	
	public static final Item INGOT_TUTORIAL = new ItemBase("ingot_tutorial");
	
	public static final Item PICKAXE_TUTORIAL = new ToolPickaxe("pickaxe_tutorial", TOOL_TUTORIAL);

	public static final Item HELMET_TUTORIAL = new ArmorBase("helmet_tutorial", ARMOR_TUTORIAL, 1, EntityEquipmentSlot.HEAD);

}
