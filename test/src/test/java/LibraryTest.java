/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

import javax.sound.sampled.ReverbType;

import org.apache.commons.math3.analysis.function.Inverse;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        Inverter inverter = new Inverter();
        
        System.out.println("test");
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
        assertEquals("abcd", inverter.invert("dcba"));
        assertEquals("abcd", inverter.invert("abcd"));
        //assertEquals("", inverter.invert(null));
    }
}
