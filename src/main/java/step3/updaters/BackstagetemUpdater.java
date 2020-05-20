package step3.updaters;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class BackstagetemUpdater extends GildedRoseItemUpdater {

	@Override
	protected void updateQuality(Item item) {
		if (item.getSellIn() > 10) {
			increaseQuality(item, 1);
		} else if (item.getSellIn() > 5) {
			increaseQuality(item, 2);
		} else if (item.getSellIn() > 0) {
			increaseQuality(item, 3);
		} else {
			item.setQuality(0);
		}
	}

	@Override
	protected void updateSellIn(Item item) {
		item.setSellIn(item.getSellIn() - 1);
	}
}
