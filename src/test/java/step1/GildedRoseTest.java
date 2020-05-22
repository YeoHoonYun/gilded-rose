package step1;

import org.junit.Test;
import step1.GildedRose;
import step1.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GildedRoseTest {

	Item item = new Item();
	GildedRose gildedRose = new GildedRose(Arrays.asList(item));

	@Test
	public void 아이템_1(){
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
	public void 아이템_2(){
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
	public void 아이템_2_1(){
		// given
		item.setName("Sulfuras, Hand of Ragnaros");
		item.setQuality(-1);
		item.setSellIn(10);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(-1, item.getQuality());
		assertEquals(10, item.getSellIn());
	}
	@Test
	public void 아이템_3(){
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
	public void 아이템_4(){
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
	public void 아이템_4_1(){
		// given
		item.setName("Aged Brie");
		item.setQuality(50);
		item.setSellIn(50);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(50, item.getQuality());
		assertEquals(49, item.getSellIn());
	}

	@Test
	public void 아이템_4_2(){
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(49);
		item.setSellIn(5);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(50, item.getQuality());
		assertEquals(4, item.getSellIn());
	}
	@Test
	public void 아이템_4_2_1(){
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(60);
		item.setSellIn(5);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(60, item.getQuality());
		assertEquals(4, item.getSellIn());
	}

	@Test
	public void 아이템_4_3(){
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(49);
		item.setSellIn(20);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(50, item.getQuality());
		assertEquals(19, item.getSellIn());
	}

	@Test
	public void 아이템_4_3_1(){
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(30);
		item.setSellIn(3);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(33, item.getQuality());
		assertEquals(2, item.getSellIn());
	}

	@Test
	public void 아이템_5(){
		// given
		item.setName("Aged Brie");
		item.setQuality(30);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(32, item.getQuality());
		assertEquals(-2, item.getSellIn());
	}

	@Test
	public void 아이템_6(){
		// given
		item.setName("Aged Brie");
		item.setQuality(100);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(100, item.getQuality());
		assertEquals(-2, item.getSellIn());
	}

	@Test
	public void 아이템_5_1(){
		// given
		Item item = new Item("Aged Brie", 100, -1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(-1, item.getQuality());
		assertEquals(100, item.getSellIn());
	}

	@Test
	public void 아이템_5_2(){
		// given
		item.setName("Backstage passes to a TAFKAL80ETC concert");
		item.setQuality(30);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(0, item.getQuality());
		assertEquals(-2, item.getSellIn());
	}

	@Test
	public void 아이템_5_3(){
		// given
		item.setName("Sulfuras, Hand of Ragnaros");
		item.setQuality(30);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(30, item.getQuality());
		assertEquals(-1, item.getSellIn());
	}

	@Test
	public void 아이템_5_3_1(){
		// given
		item.setName("Sulfuras");
		item.setQuality(30);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(28, item.getQuality());
		assertEquals(-2, item.getSellIn());
	}

	@Test
	public void 아이템_5_2_1(){
		// given
		item.setName("Normal");
		item.setQuality(30);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(28, item.getQuality());
		assertEquals(-2, item.getSellIn());
	}

	@Test
	public void 아이템_5_4(){
		// given
		item.setName("Normal");
		item.setQuality(-1);
		item.setSellIn(-1);

		// when
		gildedRose.updateQuality();

		// then
		assertEquals(-1, item.getQuality());
		assertEquals(-2, item.getSellIn());
	}

//	@Test
//	public void 일반_아이템은_기본적으로_품질이_1씩_떨어집니다() {
//		// given
//		item.setName("일반 아이템");
//		item.setQuality(10);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(9, item.getQuality());
//		assertEquals(9, item.getSellIn());
//	}
//
//	@Test
//	public void 일반_아이템은_판매기한이_지나면_품질이_2씩_떨어집니다() {
//		// given
//		item.setName("일반 아이템");
//		item.setQuality(10);
//		item.setSellIn(0);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(8, item.getQuality());
//		assertEquals(-1, item.getSellIn());
//	}
//
//	@Test
//	public void 일반_아이템의_품질은_0보다_낮을_수_없습니다() {
//		// given
//		item.setName("일반 아이템");
//		item.setQuality(0);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(0, item.getQuality());
//		assertEquals(9, item.getSellIn());
//	}
//
//	@Test
//	public void 일반_아이템의_품질은_판매기한이_지나도_0보다_낮을_수_없습니다() {
//		// given
//		item.setName("일반 아이템");
//		item.setQuality(1);
//		item.setSellIn(0);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(0, item.getQuality());
//		assertEquals(-1, item.getSellIn());
//	}
//
//	@Test
//	public void Aged_Brie_아이템의_품질은_도리어_1씩_증가합니다() {
//		// given
//		item.setName("Aged Brie");
//		item.setQuality(10);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(11, item.getQuality());
//		assertEquals(9, item.getSellIn());
//	}
//
//	@Test
//	public void Aged_Brie_아이템의_품질은_50을_넘을_수_없습니다() {
//		// given
//		item.setName("Aged Brie");
//		item.setQuality(50);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(50, item.getQuality());
//		assertEquals(9, item.getSellIn());
//	}
//
//	@Test
//	public void Aged_Brie_아이템의_품질은_판매기간이_지나면_2씩_증가합니다() {
//		// given
//		item.setName("Aged Brie");
//		item.setQuality(10);
//		item.setSellIn(0);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(12, item.getQuality());
//		assertEquals(-1, item.getSellIn());
//	}
//
//	@Test
//	public void Aged_Brie_아이템의_품질은_판매기간이_지나도_50을_넘을_수_없습니다() {
//		// given
//		item.setName("Aged Brie");
//		item.setQuality(50);
//		item.setSellIn(0);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(50, item.getQuality());
//		assertEquals(-1, item.getSellIn());
//	}
//
//	@Test
//	public void Sulfuras_아이템은_품질과_판매기한_모두_절대_변하지_않습니다() {
//		// given
//		item.setName("Sulfuras, Hand of Ragnaros");
//		item.setQuality(10);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(10, item.getQuality());
//		assertEquals(10, item.getSellIn());
//	}
//
//	@Test
//	public void Sulfuras_아이템의_품질은_0에서_50제한과_상관없이_변하지_않습니다() {
//		// given
//		item.setName("Sulfuras, Hand of Ragnaros");
//		item.setQuality(80);
//		item.setSellIn(-1);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(80, item.getQuality());
//		assertEquals(-1, item.getSellIn());
//	}
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_10일보다_많이_남으면_1씩_증가합니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(10);
//		item.setSellIn(11);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(11, item.getQuality());
//		assertEquals(10, item.getSellIn());
//	}
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_10일보다_많아도_50을_넘을_수_없습니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(50);
//		item.setSellIn(11);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(50, item.getQuality());
//		assertEquals(10, item.getSellIn());
//	}
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_5일_초과_10일_이하로_남으면_2씩_증가합니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(10);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(12, item.getQuality());
//		assertEquals(9, item.getSellIn());
//	}
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_5일_초과_10일_이하로_남아도_50을_넘을_수_없습니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(49);
//		item.setSellIn(10);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(50, item.getQuality());
//		assertEquals(9, item.getSellIn());
//	}
//
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_1일_이상_5일_이하로_남으면_3씩_증가합니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(10);
//		item.setSellIn(5);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(13, item.getQuality());
//		assertEquals(4, item.getSellIn());
//	}
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_1일_이상_5일_이하로_남아도_품질이_50을_넘을_수는_없습니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(48);
//		item.setSellIn(5);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(50, item.getQuality());
//		assertEquals(4, item.getSellIn());
//	}
//
//	@Test
//	public void Backstage_아이템의_품질은_판매기한이_지나면_0이_됩니다() {
//		// given
//		item.setName("Backstage passes to a TAFKAL80ETC concert");
//		item.setQuality(10);
//		item.setSellIn(0);
//
//		// when
//		gildedRose.updateQuality();
//
//		// then
//		assertEquals(0, item.getQuality());
//		assertEquals(-1, item.getSellIn());
//	}
}
