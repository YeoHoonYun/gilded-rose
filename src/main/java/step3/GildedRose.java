package step3;

import java.util.List;

public class GildedRose {

	public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	public static final String AGED_BRIE = "Aged Brie";
	public static final String CONJURED = "Conjured";
	
	private List<Item> items = null;

	
	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			GildedRoseItemUpdater updater = GildedRoseItemUpdaterFactory.create(item.getName());
			updater.updateQuality(item);
			updater.updateSellIn(item);
		}
	}

}