package step3.items;

import step3.GildedRoseItem;
import step3.Item;

public class BackstageItem extends GildedRoseItem{

	public BackstageItem(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if(getSellIn() > 10) {
			increaseQuality(1);
		} else if (getSellIn() > 5) {
			increaseQuality(2);
		} else if (getSellIn() > 0) {
			increaseQuality(3);
		} else {
			setQuality(0);
		}
	}

	@Override
	protected void updateSellIn() {
		decreaseSellIn();
	}

}
