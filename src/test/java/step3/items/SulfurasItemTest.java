package step3.items;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import step3.GildedRose;
import step3.Item;

public class SulfurasItemTest {

	Item item = new Item();
	GildedRose gildedRose = new GildedRose(Arrays.asList(item));
	
	@Test
	public void Sulfuras_아이템은_품질과_판매기한_모두_절대_변하지_않습니다() {
		// given
		item.setName("Sulfuras, Hand of Ragnaros");
		item.setQuality(10);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(10, item.getQuality());
		assertEquals(10, item.getSellIn());
	}
	
	@Test
	public void Sulfuras_아이템의_품질은_0에서_50제한과_상관없이_변하지_않습니다() {
		// given
		item.setName("Sulfuras, Hand of Ragnaros");
		item.setQuality(80);
		item.setSellIn(-1);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(80, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
}
