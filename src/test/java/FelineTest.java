import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class FelineTest {

  private final int kittensCount;


  public FelineTest(int kittensCount) {
    this.kittensCount = kittensCount;

  }

  @Parameterized.Parameters
  public static Object[][] getKittensCountData() {
    return new Object[][] {
            {2},
            {3},
    };
  }

  @Test
  public void eatMeatTest() throws Exception {
    Feline feline = new Feline();
    assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
  }

  @Test
  public void getFamilyTest(){
    Feline feline = new Feline();
    assertEquals("Кошачьи", feline.getFamily());
  }

  @Test
  public void getKittensTest(){
    Feline feline = new Feline();
    assertEquals(1, feline.getKittens());
  }

  @Test
  public void getKittensParamTest() {
    Feline feline = new Feline();
    switch (kittensCount){
      case 2:
        assertEquals(2, feline.getKittens(kittensCount));
        break;
      case 3:
        assertEquals(3, feline.getKittens(kittensCount));
        break;
    }
  }
}


