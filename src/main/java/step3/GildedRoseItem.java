package step3;

public abstract class GildedRoseItem extends Item{

	private static final int MIN_QUALITY = 0;
	private static final int MAX_QUALITY = 50;

	private Item item;
	
	public GildedRoseItem(Item item) {
		this.item = item;
	}
	
	@Override
	public String getName() {
		return item.getName();
	}
	
	@Override
	public void setName(String name) {
		item.setName(name);
	}
	
	@Override
	public int getQuality() {
		return item.getQuality();
	}
	
	@Override
	public void setQuality(int quality) {
		item.setQuality(quality);
	}
	
	@Override
	public int getSellIn() {
		return item.getSellIn();
	}
	
	@Override
	public void setSellIn(int sellIn) {
		item.setSellIn(sellIn);
	}

	protected void decreaseQuality(int amount) {
		int newQuality = Math.max(MIN_QUALITY, getQuality() - amount);
		setQuality(newQuality);
	}

	protected void increaseQuality(int amount) {
		int newQuality = Math.min(MAX_QUALITY, getQuality() + amount);
		setQuality(newQuality);
	}
	
	protected void decreaseSellIn() {
		setSellIn(getSellIn() - 1);
	}

	protected abstract void updateSellIn();
	protected abstract void updateQuality();
}
