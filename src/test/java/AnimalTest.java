import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalTest {

  private final String animalKind;


  public AnimalTest(String animalKind) {
    this.animalKind = animalKind;

  }

  @Parameterized.Parameters
  public static Object[][] getEatData() {
    return new Object[][] {
            {"Травоядное"},
            {"Хищник"},
    };
  }

  @Test
  public void getFoodTest() throws Exception {
    Animal animal = new Animal();
    switch (animalKind){
      case "Травоядное":
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood(animalKind));
        break;
      case "Хищник":
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood(animalKind));
        break;
    }
  }

  @Test
  public void getFamilyTest() {
    Animal animal = new Animal();
    assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
  }

}


