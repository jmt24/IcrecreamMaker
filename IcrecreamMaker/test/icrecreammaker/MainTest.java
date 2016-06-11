/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icrecreammaker;

import static icrecreammaker.Main.mainMenu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MainTest {
    private String valorEsperado;
    private String valorRetornado;
    private IcecreamMaker iceMaker;
    
    public MainTest() {
        iceMaker = new IcecreamMaker();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mainMenu method, of class Main.
     */
    /*@Test
    public void testMainMenu() {
        System.out.println("mainMenu");
        Main.mainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo1() {
        System.out.println("testAddCombo1");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("50");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            System.out.println(r.getName()+" no agregado exitosamente");
            valorRetornado = "no pudo ser agregado";
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo2() {
        System.out.println("testAddCombo2");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("50");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo3() {
        System.out.println("testAddCombo3");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("-50");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo4() {
        System.out.println("testAddCombo4");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("-3");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo5() {
        System.out.println("testAddCombo5");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("-1");
                r.setvarAlmendras("1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo6() {
        System.out.println("testAddCombo6");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("-1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo7() {
        System.out.println("testAddCombo7");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("-3");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo8() {
        System.out.println("testAddCombo8");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("a");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("-3");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
                valorRetornado = "agregado exitosamente";
                System.out.println(r.getName()+" agregado exitosamente");
            } else {
                valorRetornado = "no pudo ser agregado";
                System.out.println(r.getName()+" no agregado exitosamente");
                fail("The test case is a prototype.");
            }
        } catch (ComboException e) {
            valorRetornado = "no pudo ser agregado";
            System.out.println(r.getName()+" no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");
        } finally {
            //mainMenu();
        }
    }
}
