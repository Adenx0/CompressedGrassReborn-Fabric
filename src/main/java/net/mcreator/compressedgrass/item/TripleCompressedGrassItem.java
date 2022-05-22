
package net.mcreator.compressedgrass.item;

public class TripleCompressedGrassItem extends Item {
	public TripleCompressedGrassItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
