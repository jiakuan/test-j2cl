package org.docstr.j2cl;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@J2clTestInput(TestJ2CLTest.class)
public class TestJ2CLTest {

    @Test
    public void someSimpleTest() {
        assertEquals(TestJ2CL.HELLO_WORLD, new TestJ2CL().helloWorldString());
    }
}
