import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionParamTest {

  String sex;
  Feline feline;
  boolean shouldHaveMane;

  public LionParamTest(String sex, boolean shouldHaveMane) {
    this.sex = sex;
    this.shouldHaveMane = shouldHaveMane;
  }

  @Parameterized.Parameters
  public static Object[][] getEatData() {
    return new Object[][] {
            {"Самец", true},
            {"Самка", false},
    };
  }

  @Test
  public void doesHaveManeTest() throws Exception {
    var lion = new Lion(sex, feline);
    assertEquals(shouldHaveMane, lion.doesHaveMane());
  }



}

