package step1;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GildedRoseTest {

	Item item = new Item("더미", 0, 0);
	List<Item> items = Arrays.asList(item);
	GildedRose gildedRose = new GildedRose(items);
	
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
