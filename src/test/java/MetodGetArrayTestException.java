import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MetodGetArrayTestException {
  private int[] inArr;
  private ExploringArray rsa;


  public MetodGetArrayTestException(int[] inArr) {
    this.inArr = inArr;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {new int[]{11, 10, 1, 12, 13, 6}},
        {new int[]{}}
    });
  }

  @Before
  public void init() {
    rsa = new ResearchesArray();
  }

  @Test(expected = RuntimeException.class)
  public void testGetArr() {
    rsa.getArr(inArr);
  }
}
