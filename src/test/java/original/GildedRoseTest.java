package original;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void gilded_rose_test() {
		GildedRose gildedRose = new GildedRose(new ArrayList<>());
		assertNotNull(gildedRose);
	}

}
