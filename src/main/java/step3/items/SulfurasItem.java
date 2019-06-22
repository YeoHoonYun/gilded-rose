package step3.items;

import step3.GildedRoseItem;
import step3.Item;

public class SulfurasItem extends GildedRoseItem{

	public SulfurasItem(Item item) {
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
