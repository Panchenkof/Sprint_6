import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
  private final int kittensCount;

  public FelineParamTest(int kittensCount) {
    this.kittensCount = kittensCount;
  }

  @Parameterized.Parameters
  public static Object[][] getKittensCountData() {
    return new Object[][]{
            {2},
            {3},
    };
  }

@Test
public void getKittensParamTest() {
  Feline feline = new Feline();
  assertEquals(kittensCount, feline.getKittens(kittensCount));
}
}
