package step3.items;

import step3.GildedRoseItemUpdater;
import step3.Item;

public class ConjuredItemUpdater extends GildedRoseItemUpdater{

	public ConjuredItemUpdater(Item item) {
		super(item);
	}

	@Override
	protected void updateSellIn() {
		decreaseSellIn();
	}

	@Override
	protected void updateQuality() {
		if(item.getSellIn() > 0) {
			decreaseQuality(2);
		} else {
			decreaseQuality(4);
		}
	}
}
