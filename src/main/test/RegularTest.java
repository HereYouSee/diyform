import com.regular.RegularCase;
import com.regular.impl.PointerRegular;
import org.junit.Test;

/**
 * Created by zmm on 17-5-3.
 */
public class RegularTest {


    @Test
    public void testCommon() {

        PointerRegular regular = new PointerRegular();
        regular.match2Model1();

    }


    @Test
    public void testGroup() {
        PointerRegular regular = new PointerRegular();
        regular.match2Model2();
    }

    @Test
    public void testGroup2() {
        PointerRegular regular = new PointerRegular();
        regular.match2Model3();
    }

}
