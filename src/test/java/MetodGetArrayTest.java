import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MetodGetArrayTest {
  private int[] inArr;
  private Integer[] result;
  private ExploringArray rsa;


  public MetodGetArrayTest(Integer[] result, int[] inArr) {
    this.inArr = inArr;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {new Integer[]{1,0}, new int[]{1, 1, 1, 4, 1, 0}},
        {new Integer[]{6}, new int[]{4, 10, 1, 5, 4, 6}},
        {new Integer[]{1,3}, new int[]{1, 4, 1, 4, 1, 3}},
        {new Integer[]{}, new int[]{1, 1, 1, 4, 1, 4}},
        {new Integer[]{}, new int[]{4, 4, 4, 4, 4, 4}},
    });
  }

  @Before
  public void init() {
    rsa = new ResearchesArray();
  }

  @Test
  public void testGetArr() {
    Assert.assertArrayEquals(result, rsa.getArr(inArr));
  }


}
