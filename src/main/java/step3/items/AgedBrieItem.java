package step3.items;

import step3.GildedRoseItem;
import step3.Item;

public class AgedBrieItem extends GildedRoseItem{

	public AgedBrieItem(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if (getSellIn() > 0) {
			increaseQuality(1);
		} else {
			increaseQuality(2);
		}
	}

	@Override
	protected void updateSellIn() {
		decreaseSellIn();
	}
}
