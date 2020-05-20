package step3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import step3.updaters.AgedBrieItemUpdater;
import step3.updaters.BackstagetemUpdater;
import step3.updaters.ConjuredItemUpdater;
import step3.updaters.NormalItemUpdater;
import step3.updaters.SulfurasItemUpdater;

public class GildedRoseItemUpdaterFactory {

	private static final Map<String, GildedRoseItemUpdater> CACHE = new HashMap<>();
	private static final GildedRoseItemUpdater DEFAULT = new NormalItemUpdater();
	private static final Set<String> ITEM_NAMES_TO_CACHED = Set.of(
			GildedRose.AGED_BRIE, 
			GildedRose.BACKSTAGE,
			GildedRose.SULFURAS,
			GildedRose.CONJURED
	);

	public static GildedRoseItemUpdater create(String name) {
		if (ITEM_NAMES_TO_CACHED.contains(name)) {
			return CACHE.computeIfAbsent(name, GildedRoseItemUpdaterFactory::newInstance);
		} else {
			return DEFAULT;
		}
	}

	private static GildedRoseItemUpdater newInstance(String name) {
		if (GildedRose.AGED_BRIE.equals(name)) {
			return new AgedBrieItemUpdater();
		} else if (GildedRose.BACKSTAGE.equals(name)) {
			return new BackstagetemUpdater();
		} else if (GildedRose.SULFURAS.equals(name)) {
			return new SulfurasItemUpdater();
		} else if (GildedRose.CONJURED.equals(name)) {
			return new ConjuredItemUpdater();
		} else {
			return DEFAULT;
		}
	}

}
