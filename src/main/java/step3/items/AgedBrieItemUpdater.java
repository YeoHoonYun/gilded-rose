package step3.items;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class AgedBrieItemUpdater extends GildedRoseItemUpdater{

	public AgedBrieItemUpdater(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if (item.getSellIn() > 0) {
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
