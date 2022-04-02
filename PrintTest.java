import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void print() {
        Print print = new Print();
        assertEquals(print.print(), "hello");
    }
}