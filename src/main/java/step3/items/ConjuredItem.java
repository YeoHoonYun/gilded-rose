package step3.items;

import step3.GildedRoseItem;
import step3.Item;

public class ConjuredItem extends GildedRoseItem{

	public ConjuredItem(Item item) {
		super(item);
	}

	@Override
	protected void updateSellIn() {
		decreaseSellIn();
	}

	@Override
	protected void updateQuality() {
		if(getSellIn() > 0) {
			decreaseQuality(2);
		} else {
			decreaseQuality(4);
		}
	}
}
