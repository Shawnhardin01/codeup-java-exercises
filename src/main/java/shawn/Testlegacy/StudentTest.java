package shawn.Testlegacy;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.*;

public class StudentTest {
  @Test
    public void getId(){
    long id = 0;
    assertEquals(0,id);

  }

    // returns the student's name
  @Test
    public void getName(){
    String getName ="Codeup";
    assertEquals("Codeup",getName);

  }

    // adds the given grade to the grades list
  @Test
    public void addGrade(){


        return ;
    }
@Test
//     returns the list of grades
    public void  getGrades(){
      List<String> languages = new ArrayList<>();
      List<String> morelanguages = new ArrayList<>();

      assertNotSame(languages,morelanguages);
    }

    // returns the average of the students grades
    public double getGradeAverage(){return 0;
  }
}








