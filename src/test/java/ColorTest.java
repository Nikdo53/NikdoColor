import net.nikdo53.nikdocolor.NikdoColor;
import org.junit.jupiter.api.Test;

public class ColorTest {
    @Test
    public void test() {
        NikdoColor.RGB rgb = NikdoColor.fromHexNoAlpha(0xFF0088);
    }
}
