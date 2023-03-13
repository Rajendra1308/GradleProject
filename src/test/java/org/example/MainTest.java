package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
@Test
    public void return1(){
    Main main =new Main();
    assertEquals(1,main.return1());
}
    @Test
    public void return1Failed(){
        Main main =new Main();
        assertEquals(1,main.return1());
    }

}