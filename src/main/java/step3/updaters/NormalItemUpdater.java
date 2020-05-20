package step3.updaters;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class NormalItemUpdater extends GildedRoseItemUpdater {

	@Override
	protected void updateQuality(Item item) {
		if (item.getSellIn() > 0) {
			decreaseQuality(item, 1);
		} else {
			decreaseQuality(item, 2);
		}
	}

	@Override
	protected void updateSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}

}
