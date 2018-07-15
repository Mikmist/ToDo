import backend.models.BaseCard;
import backend.models.ParentCard;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.Assert.*;

/**
 * @author Zino
 * Created: 7/12/2018
 * Package: PACKAGE_NAME
 * @version 1.0
 */
public class BaseCardTests {

    private BaseCard baseCard;

    @Before
    public void setup() {
        this.baseCard = new ParentCard(null, null);
    }

    @Test
    public void titleTest() {
        assertNull(this.baseCard.getTitle());
        this.baseCard.setTitle("someTitle");
        assertEquals("someTitle", this.baseCard.getTitle());
    }

    @Test
    public void finishedTest() {
        assertFalse(this.baseCard.getFinished());
        this.baseCard.setFinished(true);
        assertTrue(this.baseCard.getFinished());
    }

    @Test
    public void summaryTest() {
        assertNull(this.baseCard.getContent());
        this.baseCard.setContent(new String[]{"string", "string2"});
        assertEquals("string", this.baseCard.getContent()[0]);
        assertEquals("string2", this.baseCard.getContent()[1]);
    }
}
