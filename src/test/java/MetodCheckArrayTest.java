import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MetodCheckArrayTest {
  private int[] inArr;
  private boolean result;
  private ExploringArray rsa;

  public MetodCheckArrayTest(boolean result, int[] inArr) {
    this.inArr = inArr;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {true, new int[]{1, 1, 1, 4, 1, 4}},
        {false, new int[]{1, 1, 1, 1, 1, 1}},
        {false, new int[]{4, 4, 4, 4, 4, 4}},
    });
  }

  @Before
  public void init() {
    rsa = new ResearchesArray();
  }

  @Test
  public void checkArray() {
    Assert.assertEquals(result, rsa.checkArray(inArr));
  }

}
