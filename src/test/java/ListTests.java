import backend.models.ListView;
import backend.models.ParentCard;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * @author Zino
 * Created: 7/11/2018
 * Package: test
 * @version 1.0
 */
public class ListTests {

    private ListView list;
    private ParentCard testCard;

    @Before
    public void setup() {
        this.list = new ListView(null, null, null);
        this.testCard = new ParentCard("testTitle", null);
    }

    @Test
    public void setupTest() {
        assertNotNull(list);
        assertNotNull(testCard);
    }

    @Test
    public void addCardTest() {
        list.addCard(testCard);
        assertNotNull(list.getTodoList());
    }

    @Test
    public void removeCardTest() {
        list.addCard(testCard);
        assertNotNull(list.getTodoList().get(0));
        list.removeCard(testCard);
        assertEquals(0, list.getTodoList().size());
    }
}
