package step3;

import step3.items.AgedBrieItem;
import step3.items.BackstageItem;
import step3.items.ConjuredItem;
import step3.items.NormalItem;
import step3.items.SulfurasItem;

public class GildedRoseItemFactory {
	public static final String AGED_BRIE = "Aged Brie";
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	public static final String CONJURED = "Conjured";
	
	public static GildedRoseItem createFrom(Item item) {
		String name = item.getName();
		if (SULFURAS.equals(name)) {
			return new SulfurasItem(item);
		} else if (AGED_BRIE.equals(name)) {
			return new AgedBrieItem(item);
		} else if (BACKSTAGE.equals(name)) {
			return new BackstageItem(item);
		} else if (CONJURED.equals(name)) {
			return new ConjuredItem(item);
		} else {
			return new NormalItem(item);
		}
	}
}
