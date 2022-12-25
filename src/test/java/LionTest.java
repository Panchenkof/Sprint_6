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



public class LionTest {
  String sex = "Самец";

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
  public void getFoodTest() throws Exception {
    var lion = new Lion(sex, feline);
    Mockito.when(lion.getFood()).thenReturn(List.of("Хищник"));
    assertEquals(List.of("Хищник"), lion.getFood());
  }

}

