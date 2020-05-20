package step3;

import java.util.List;

public class GildedRose {

	private List<Item> items = null;

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			GildedRoseItemUpdater updater = GildedRoseItemFactory.createFrom(item);
			updater.updateQuality();
			updater.updateSellIn();
		}
	}
}