package step3.items;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import step3.GildedRose;
import step3.Item;

public class BackstageItemTest {

	Item item = new Item();
	GildedRose gildedRose = new GildedRose(Arrays.asList(item));
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_10일보다_많이_남으면_1씩_증가합니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(10);
		item.setSellIn(11);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(11, item.getQuality());
		assertEquals(10, item.getSellIn());
	}
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_10일보다_많아도_50을_넘을_수_없습니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(50);
		item.setSellIn(11);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(50, item.getQuality());
		assertEquals(10, item.getSellIn());
	}
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_5일_초과_10일_이하로_남으면_2씩_증가합니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(10);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(12, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_5일_초과_10일_이하로_남아도_50을_넘을_수_없습니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(49);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(50, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_1일_이상_5일_이하로_남으면_3씩_증가합니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(10);
		item.setSellIn(5);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(13, item.getQuality());
		assertEquals(4, item.getSellIn());
	}
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_1일_이상_5일_이하로_남아도_품질이_50을_넘을_수는_없습니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(48);
		item.setSellIn(5);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(50, item.getQuality());
		assertEquals(4, item.getSellIn());
	}
	
	@Test
	public void Backstage_아이템의_품질은_판매기한이_지나면_0이_됩니다() {
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(10);
		item.setSellIn(0);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(0, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
}
