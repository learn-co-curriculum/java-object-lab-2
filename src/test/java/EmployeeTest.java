import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void mainTest() {
        String expectedOutput = "Sasha: hours worked =14, weekly pay = $259.00.\n" +
                "Tal: hours worked =26, weekly pay = $481.00.\n";

        //call the main method
        Employee.main(null);

        //compare expected output with actual output
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}