package step3.items;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class SulfurasItemUpdater extends GildedRoseItemUpdater{

	public SulfurasItemUpdater(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		// Do nothing as sulfuras is legendary item
	}

	@Override
	protected void updateSellIn() {
		// Do nothing as sulfuras is legendary item
	}
}
