import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

  @Mock
  Feline feline;

  @Test
  public void getSoundTest() {
    var cat = new Cat(feline);
    assertEquals("Мяу", cat.getSound());
  }

  @Test
  public void getFoodTest() throws Exception {
    Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    var cat = new Cat(feline);
    assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
  }


}
