package step3.items;

import step3.GildedRoseItem;
import step3.Item;

public class NormalItem extends GildedRoseItem{

	public NormalItem(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if (getSellIn() > 0) {
			decreaseQuality(1);
		} else {
			decreaseQuality(2);
		}
	}

	@Override
	protected void updateSellIn() {
		decreaseSellIn();
	}
}
