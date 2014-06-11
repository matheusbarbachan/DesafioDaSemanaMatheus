import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class PalpiteiroTest{

    private Palpiteiro palpiteiro;

    @Before
    public void setUp() throws Exception {
        palpiteiro = new Palpiteiro();
    }

    @Test
    public void QuandoInstanciadoOPalpiteiroEstaCom0Pontos() throws Exception {
        assertEquals(palpiteiro.getPontos(), 0);
    }

    @Test
    public void QuandoInstanciadoOPalpiteiroEstaCom0Palpites() throws Exception {
        assertEquals(palpiteiro.getNumerodePalpites(), 0);

    }

}