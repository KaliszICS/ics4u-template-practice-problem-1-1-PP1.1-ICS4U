import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class PP1_1_Test {

   @Test
   public void testHelloWorld()
   {
     assertEquals(PP1_1.func(1), 1);
   }
}
