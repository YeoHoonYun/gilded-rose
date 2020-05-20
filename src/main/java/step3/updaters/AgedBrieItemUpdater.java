package step3.updaters;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class AgedBrieItemUpdater extends GildedRoseItemUpdater {

	@Override
	protected void updateQuality(Item item) {
		if (item.getSellIn() > 0) {
			increaseQuality(item, 1);
		} else {
			increaseQuality(item, 2);
		}
	}

	@Override
	protected void updateSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}
}
