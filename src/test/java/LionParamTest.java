import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionParamTest {

  private final String sex;
  Feline feline;

  public LionParamTest(String sex) {
    this.sex = sex;

  }

  @Parameterized.Parameters
  public static Object[][] getEatData() {
    return new Object[][] {
            {"Самец"},
            {"Самка"},
    };
  }

  @Test
  public void doesHaveManeTest() throws Exception {
    var lion = new Lion(sex, feline);
    switch (sex){
      case "Самец":
        assertTrue(lion.doesHaveMane());
        break;
      case "Самка":
        assertFalse(lion.doesHaveMane());
        break;
    }
  }



}

