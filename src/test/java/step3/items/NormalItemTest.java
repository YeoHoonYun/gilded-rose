package step3.items;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import step3.GildedRose;
import step3.Item;

public class NormalItemTest {

	Item item = new Item();
	GildedRose gildedRose = new GildedRose(Arrays.asList(item));
	
	@Test
	public void 일반_아이템은_기본적으로_품질이_1씩_떨어집니다() {
		// given
		item.setName("일반 아이템");
		item.setQuality(10);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(9, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void 일반_아이템은_판매기한이_지나면_품질이_2씩_떨어집니다() {
		// given
		item.setName("일반 아이템");
		item.setQuality(10);
		item.setSellIn(0);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(8, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
	
	@Test
	public void 일반_아이템의_품질은_0보다_낮을_수_없습니다() {
		// given
		item.setName("일반 아이템");
		item.setQuality(0);
		item.setSellIn(10);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(0, item.getQuality());
		assertEquals(9, item.getSellIn());
	}
	
	@Test
	public void 일반_아이템의_품질은_판매기한이_지나도_0보다_낮을_수_없습니다() {
		// given
		item.setName("일반 아이템");
		item.setQuality(1);
		item.setSellIn(0);
		
		// when
		gildedRose.updateQuality();
		
		// then
		assertEquals(0, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}
}
