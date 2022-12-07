import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionTest {

  private final String sex;


  public LionTest(String sex) {
    this.sex = sex;

  }

  @Parameterized.Parameters
  public static Object[][] getEatData() {
    return new Object[][] {
            {"Самец"},
            {"Самка"},
    };
  }

  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
  }

  @Mock
  Feline feline;

  @Test
  public void getKittensTest() throws Exception {
    var lion = new Lion(sex, feline);
    Mockito.when(lion.getKittens()).thenReturn(1);
    assertEquals(1, lion.getKittens());
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


  @Test
  public void getFoodTest() throws Exception {
    var lion = new Lion(sex, feline);
    Mockito.when(lion.getFood()).thenReturn(List.of("Хищник"));
    assertEquals(List.of("Хищник"), lion.getFood());
  }

}

