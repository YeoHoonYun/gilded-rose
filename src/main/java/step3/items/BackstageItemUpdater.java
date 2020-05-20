package step3.items;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class BackstageItemUpdater extends GildedRoseItemUpdater{

	public BackstageItemUpdater(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if(item.getSellIn() > 10) {
			increaseQuality(1);
		} else if (item.getSellIn() > 5) {
			increaseQuality(2);
		} else if (item.getSellIn() > 0) {
			increaseQuality(3);
		} else {
			item.setQuality(0);
		}
	}

	@Override
	protected void updateSellIn() {
		decreaseSellIn();
	}

}
