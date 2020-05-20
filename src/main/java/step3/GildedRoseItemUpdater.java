package step3;

public abstract class GildedRoseItemUpdater{

	private static final int MIN_QUALITY = 0;
	private static final int MAX_QUALITY = 50;

	protected Item item;
	
	public GildedRoseItemUpdater(Item item) {
		this.item = item;
	}

	protected void decreaseQuality(int amount) {
		int newQuality = Math.max(MIN_QUALITY, item.getQuality() - amount);
		item.setQuality(newQuality);
	}

	protected void increaseQuality(int amount) {
		int newQuality = Math.min(MAX_QUALITY, item.getQuality() + amount);
		item.setQuality(newQuality);
	}
	
	protected void decreaseSellIn() {
		item.setSellIn(item.getSellIn() - 1);
	}

	protected abstract void updateSellIn();
	protected abstract void updateQuality();
}
