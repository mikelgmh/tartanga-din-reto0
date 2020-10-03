/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.model;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikel
 */
public class ModelTest {

    ModelFactory modelFactory = new ModelFactory();

    public ModelTest() {
    }

    /**
     * Test of getGreeting method, of class Model.
     */
    @Test
    public void fileGreetingTest() {
        Model model = this.modelFactory.getModel("file");
        assertEquals("HOLA MUNDO", model.getGreeting());
    }

    @Test
    public void dbGreetingTest() {
        Model model = this.modelFactory.getModel("db");
        assertEquals("HOLA MUNDO", model.getGreeting());
    }

}
