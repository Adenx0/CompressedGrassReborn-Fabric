
package net.mcreator.compressedgrass.item;

public class QuintupleCompressedGrassItem extends Item {
	public QuintupleCompressedGrassItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
