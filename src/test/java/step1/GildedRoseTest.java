package step1;

import org.junit.Test;
import step1.GildedRose;
import step1.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GildedRoseTest {

	@Test
	public void normal_item_is_derease_1_1() {
		ArrayList<Item> items = new ArrayList<>();
		Item item = new Item("Normal Item",10,10);
		items.add(item);
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();

		assertEquals(9, item.getSellIn());
		assertEquals(9, item.getQuality());
	}
	@Test
	public void normal_item_is_derease_1_1_() {
		ArrayList<Item> items = new ArrayList<>();
		Item item = new Item("Normal Item",0,10);
		items.add(item);
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();

		assertEquals(-1, item.getSellIn());
		assertEquals(8, item.getQuality());
	}

	@Test
	public void normal_item_is_derease_1_1__() {
		ArrayList<Item> items = new ArrayList<>();
		Item item1 = new Item("Normal Item",0,10);
		items.add(item1);
		Item item2 = new Item("Aged Brie",0,10);
		items.add(item2);
		Item item3 = new Item("Backstage passes to a TAFKAL80ETC concert",0,10);
		items.add(item3);
		Item item4 = new Item();
		item4.setName("Sulfuras, Hand of Ragnaros");
		item4.setQuality(5);
		item4.setSellIn(10);
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();

		assertEquals(-1, item1.getSellIn());
		assertEquals(8, item1.getQuality());

		assertEquals(-1, item2.getSellIn());
		assertEquals(12, item2.getQuality());

		assertEquals(-1, item3.getSellIn());
		assertEquals(0, item3.getQuality());

		assertEquals(10, item4.getSellIn());
		assertEquals(5, item4.getQuality());
	}
}
