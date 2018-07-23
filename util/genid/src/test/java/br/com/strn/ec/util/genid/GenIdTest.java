package br.com.strn.ec.util.genid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenIdTest {

    @Test
    void generate() {
        System.out.println("ID Generated: " + GenId.generate());
    }
}