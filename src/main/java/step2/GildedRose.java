package step2;

import sun.management.snmp.jvmmib.JvmThreadInstanceTableMeta;

import java.util.List;

public class GildedRose {

	private List<Item> items = null;
	private Item item = null;

	public GildedRose(List<Item> items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			// step1 : Quallity 조작
			String Backstage = "Backstage passes to a TAFKAL80ETC concert";
			String SULFURAS = "Sulfuras, Hand of Ragnaros";
			String Aged = "Aged Brie";

			if (!Aged.equals(item.getName()) && !Backstage.equals(item.getName())) {
				if (!SULFURAS.equals(item.getName())) {
					if (item.getQuality() > 0) {
						qualityDown(item, 1);
					}
				}
			} else {
				if (item.getQuality() < 50) {
					qualityUp(item);
				}
				if (Backstage.equals(item.getName())) {
					if (item.getSellIn() < 11) {
						qualityCheck(item);
					}
					if (item.getSellIn() < 6) {
						qualityCheck(item);
					}
				}
			}

			//step2 : sellIn조작
			if (!SULFURAS.equals(item.getName())) {
				item.setSellIn(item.getSellIn() - 1);
			}

			//step3 : Quality 조작
			if (item.getSellIn() < 0) {
				if (Aged.equals(item.getName())) {
					qualityCheck(item);
				} else if (Backstage.equals(item.getName())) {
						qualityDown(item, item.getQuality());
				} else if (item.getQuality() > 0) {
					if (!SULFURAS.equals(item.getName())) {
						qualityDown(item, 1);
					}
				}
			}
		}
	}

	private void qualityCheck(Item item) {
		if (item.getQuality() < 50) {
			qualityUp(item);
		}
	}

	private void qualityUp(Item item) {
		item.setQuality(item.getQuality() + 1);
	}

	private void qualityDown(Item item, int i2) {
		item.setQuality(item.getQuality() - i2);
	}

}