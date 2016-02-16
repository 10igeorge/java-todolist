import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class AppTest {

  @Test
  public void Task_instantiatesCorrectly_true(){
    Task taskApp = new Task("Mow the lawn");
    assertEquals(true, taskApp instanceof Task);
  }

  @Test
  public void task_instantiatesWithdescription_true() {
    Task taskApp = new Task("Mow the lawn");
    assertEquals("Mow the lawn", taskApp.getDescription());
  }

}
