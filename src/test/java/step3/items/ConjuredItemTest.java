package step3.items;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import step3.GildedRose;
import step3.Item;

public class ConjuredItemTest {

	Item item = new Item();
	GildedRose gildedRose = new GildedRose(Arrays.asList(item));
	
	@Test
	public void Conjured_아이템의_품질은_2씩_떨어집니다() {
		// given
		item.setName("Conjured");
		item.setQuality(10);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(8, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void Conjured_아이템의_품질은_판매기간이_지나면_4씩_떨어집니다() {
		// given
		item.setName("Conjured");
		item.setQuality(10);
		item.setSellIn(0);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(6, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
}
