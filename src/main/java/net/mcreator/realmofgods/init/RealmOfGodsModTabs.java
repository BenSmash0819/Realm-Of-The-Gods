
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmofgods.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RealmOfGodsModTabs {
	public static CreativeModeTab TAB_REALM_OF_GODS_TAB;

	public static void load() {
		TAB_REALM_OF_GODS_TAB = new CreativeModeTab("tabrealm_of_gods_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.STRUCTURE_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
