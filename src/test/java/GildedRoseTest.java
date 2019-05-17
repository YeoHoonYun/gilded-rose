import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

	@Test
	void gilded() {
		GildedRose gildedRose = new GildedRose(new ArrayList<>());
		assertNotNull(gildedRose);
	}

}
