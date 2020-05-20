package step3.items;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import step3.GildedRose;
import step3.Item;

public class AgedBrieItemTest {

	Item item = new Item();
	GildedRose gildedRose = new GildedRose(Arrays.asList(item));
	
	@Test
	public void Aged_Brie_아이템의_품질은_도리어_1씩_증가합니다() {
		// given
		item.setName("Aged Brie");
		item.setQuality(10);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(11, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void Aged_Brie_아이템의_품질은_50을_넘을_수_없습니다() {
		// given
		item.setName("Aged Brie");
		item.setQuality(50);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(50, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void Aged_Brie_아이템의_품질은_판매기간이_지나면_2씩_증가합니다() {
		// given
		item.setName("Aged Brie");
		item.setQuality(10);
		item.setSellIn(0);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(12, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
	
	@Test
	public void Aged_Brie_아이템의_품질은_판매기간이_지나도_50을_넘을_수_없습니다() {
		// given
		item.setName("Aged Brie");
		item.setQuality(50);
		item.setSellIn(0);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(50, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
}
