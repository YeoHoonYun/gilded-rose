package step2;

import java.util.List;

public class GildedRose {

	private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String AGED_BRIE = "Aged Brie";
	
	private List<Item> items = null;

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			updateQuality(item);
			updateSellIn(item);
		}
	}

	private void updateQuality(Item item) {
		if (GildedRose.SULFURAS.equals(item.getName()))
			return;

		if (GildedRose.AGED_BRIE.equals(item.getName())) {
			updateQualityForAgedBrie(item);
		} else if (GildedRose.BACKSTAGE.equals(item.getName())) {
			updateQualityForBackstage(item);
		} else {
			updateQualityForNormal(item);
		}
	}

	private void updateQualityForAgedBrie(Item item) {
		if (item.getSellIn() > 0) {
			increaseQuality(item, 1);
		} else {
			increaseQuality(item, 2);
		}
	}
	
	private void updateQualityForBackstage(Item item) {
		if(item.getSellIn() > 10) {
			increaseQuality(item, 1);
		} else if (item.getSellIn() > 5) {
			increaseQuality(item, 2);
		} else if (item.getSellIn() > 0) {
			increaseQuality(item, 3);
		} else {
			item.setQuality(0);
		}
	}
	
	private void updateQualityForNormal(Item item) {
		if (item.getSellIn() > 0) {
			decreaseQuality(item, 1);
		} else {
			decreaseQuality(item, 2);
		}
	}

	private void updateSellIn(Item item) {
		if (GildedRose.SULFURAS.equals(item.getName()))
			return;
		
		item.setSellIn(item.getSellIn() - 1);
	}

	private void decreaseQuality(Item item, int amount) {
		int newQuality = Math.max(0, item.quality - amount);
		item.setQuality(newQuality);
	}

	private void increaseQuality(Item item, int amount) {
		int newQuality = Math.min(50, item.quality + amount);
		item.setQuality(newQuality);
	}

}