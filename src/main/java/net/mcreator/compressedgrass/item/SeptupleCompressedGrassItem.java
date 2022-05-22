
package net.mcreator.compressedgrass.item;

public class SeptupleCompressedGrassItem extends Item {
	public SeptupleCompressedGrassItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
