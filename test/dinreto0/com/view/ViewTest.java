/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.com.view;

import dinreto0.com.controller.Controller;
import dinreto0.com.model.Model;
import dinreto0.com.model.ModelFactory;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mikel
 */
public class ViewTest {

    public ViewTest() {
    }
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void consoleGreetingOutputTest() {
        ViewFactory viewFactory = new ViewFactory();
        View view = viewFactory.getView("console");

        ModelFactory modelFactory = new ModelFactory();
        Model model = modelFactory.getModel("file");

        Controller controller = new Controller(model, view);
        controller.run();
        assertEquals("HOLA MUNDO", outContent.toString().trim());
    }

}
