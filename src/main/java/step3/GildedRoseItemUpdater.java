package step3;

import step3.Item;

public abstract class GildedRoseItemUpdater {

	protected void increaseQuality(Item item, int amount) {
		int newQuality = Math.min(50, item.getQuality() + amount);
		item.setQuality(newQuality);
	}

	protected void decreaseQuality(Item item, int amount) {
		int newQuality = Math.max(0, item.getQuality() - amount);
		item.setQuality(newQuality);
	}

	protected abstract void updateSellIn(Item item);
	protected abstract void updateQuality(Item item);

}
