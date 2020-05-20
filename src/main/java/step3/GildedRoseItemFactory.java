package step3;

import step3.items.AgedBrieItemUpdater;
import step3.items.BackstageItemUpdater;
import step3.items.ConjuredItemUpdater;
import step3.items.NormalItemUpdater;
import step3.items.SulfurasItemUpdater;

public class GildedRoseItemFactory {
	public static final String AGED_BRIE = "Aged Brie";
	public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
	public static final String CONJURED = "Conjured";
	
	public static GildedRoseItemUpdater createFrom(Item item) {
		String name = item.getName();
		if (SULFURAS.equals(name)) {
			return new SulfurasItemUpdater(item);
		} else if (AGED_BRIE.equals(name)) {
			return new AgedBrieItemUpdater(item);
		} else if (BACKSTAGE.equals(name)) {
			return new BackstageItemUpdater(item);
		} else if (CONJURED.equals(name)) {
			return new ConjuredItemUpdater(item);
		} else {
			return new NormalItemUpdater(item);
		}
	}
}
