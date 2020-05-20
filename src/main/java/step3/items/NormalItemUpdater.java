package step3.items;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class NormalItemUpdater extends GildedRoseItemUpdater{

	public NormalItemUpdater(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if (item.getSellIn() > 0) {
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
