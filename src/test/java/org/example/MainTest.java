package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
@Test
    public void return1(){
    Main main =new Main();
    assertEquals(1,main.return1());
}
}