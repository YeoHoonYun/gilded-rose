package step3;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import step3.items.AgedBrieItemTest;
import step3.items.BackstageItemTest;
import step3.items.ConjuredItemTest;
import step3.items.NormalItemTest;
import step3.items.SulfurasItemTest;

@RunWith(Suite.class)
@SuiteClasses({ 
	NormalItemTest.class,
	AgedBrieItemTest.class,
	SulfurasItemTest.class,
	BackstageItemTest.class,
	ConjuredItemTest.class
})
public class GildedRoseTest {
}
