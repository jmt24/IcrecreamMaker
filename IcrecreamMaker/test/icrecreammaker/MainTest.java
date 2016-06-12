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
    private IcecreamMaker iceMaker = new IcecreamMaker();
    
    public MainTest() {
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

            } else {

            }
        } catch (ComboException e) {

        } finally {
            //mainMenu();
        }
        
        r = new Combo();
        
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
                r.setPrice("a");
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
    public void testAddCombo9() {
        System.out.println("testAddCombo9");
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

    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo10() {
        System.out.println("testAddCombo10");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("a");
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
    public void testAddCombo11() {
        System.out.println("testAddCombo11");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("a");
                r.setvarChocolate("3");

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
    public void testAddCombo12() {
        System.out.println("testAddCombo12");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("a");

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
    public void testAddCombo13() {
        System.out.println("testAddCombo13");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Chococrema");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("2");
                r.setvarAlmendras("2");
                r.setvarChocolate("3");

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
    public void testAddCombo14() {
        System.out.println("testAddCombo14");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Fresacrunch ");
                r.setPrice("60");
                r.setvarYogurt("3");
                r.setvarFresas("3");
                r.setvarAlmendras("2");
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
    public void testAddCombo15() {
        System.out.println("testAddCombo15");
        valorEsperado = "agregado exitosamente";
        Combo r = new Combo();
        try {
                r.setName("Tarta");
                r.setPrice("60");
                r.setvarYogurt("0");
                r.setvarFresas("2");
                r.setvarAlmendras("2");
                r.setvarChocolate("3");

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
    public void testAddCombo16() {
        System.out.println("testDeleteCombo1");
        
        Combo r = new Combo();
        try {
                r.setName("Tarta");
                r.setPrice("60");
                r.setvarYogurt("0");
                r.setvarFresas("2");
                r.setvarAlmendras("2");
                r.setvarChocolate("3");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
         
            } else {
            
            }
        } catch (ComboException e) {

        } finally {

        }
        
        valorEsperado = "Borrado exitosamente";
        
        Combo [] Combos = iceMaker.getCombos();

        String ComboDeleted = iceMaker.deleteCombo(1 - 1);
        
        if (ComboDeleted != null) {
            System.out.println(ComboDeleted + " borrado exitosamente.");
        } else {
            System.out.println("El Combo seleccionado no existe y no pudo ser borrado.\n");
            fail("The test case is a prototype.");
        }
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo17() {
        System.out.println("testDeleteCombo2");
        
        Combo r = new Combo();
        try {
                r.setName("Tarta");
                r.setPrice("60");
                r.setvarYogurt("0");
                r.setvarFresas("2");
                r.setvarAlmendras("2");
                r.setvarChocolate("3");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
         
            } else {
            
            }
        } catch (ComboException e) {

        } finally {

        }
        
        valorEsperado = "Borrado exitosamente";
        
        Combo [] Combos = iceMaker.getCombos();

        String ComboDeleted = iceMaker.deleteCombo(1 - 1);
        
        if (ComboDeleted != null) {

        } else {
            
        }
        
        ComboDeleted = iceMaker.deleteCombo(1 - 1);
        
        if (ComboDeleted != null) {
            System.out.println(ComboDeleted + " borrado exitosamente.");
        } else {
            System.out.println("El Combo seleccionado no existe y no pudo ser borrado.\n");
            fail("The test case is a prototype.");
        }
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo18() {
        System.out.println("agregarInventario1");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "3";
        String almendraString = "7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no pudo ser agregado");
            System.out.println("Inventario no agregado exitosamente");
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo19() {
        System.out.println("agregarInventario2");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "-1";
        String fresaString = "3";
        String almendraString = "7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo20() {
        System.out.println("agregarInventario3");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "-3";
        String almendraString = "7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo21() {
        System.out.println("agregarInventario4");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "3";
        String almendraString = "-7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo22() {
        System.out.println("agregarInventario5");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "3";
        String almendraString = "7";
        String chocolateString = "-2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo23() {
        System.out.println("agregarInventario6");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "a";
        String fresaString = "3";
        String almendraString = "7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo24() {
        System.out.println("agregarInventario7");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "a";
        String almendraString = "7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo25() {
        System.out.println("agregarInventario8");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "3";
        String almendraString = "a";
        String chocolateString = "1";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo26() {
        System.out.println("agregarInventario9");
        valorEsperado = "Inventario agregado exitosamente";
        
        String yogurtString = "5";
        String fresaString = "3";
        String almendraString = "7";
        String chocolateString = "a";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            System.out.println("Inventario agregado exitosamente");
            
        } catch (InventoryException e) {
            System.out.println("Inventario no agregado exitosamente");
            System.out.println(e.getMessage());
            fail("The test case is a prototype.");

        } finally {

        }
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo27() {
        System.out.println("revisarInventario");
        valorEsperado = "Yogurt: 15\n" +
                        "Fresas: 15\n" +
                        "Almendras: 15\n" +
                        "Chocolate: 15";
        
        String yogurtString = "5";
        String fresaString = "3";
        String almendraString = "7";
        String chocolateString = "2";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            
        } catch (InventoryException e) {

        } finally {

        }
        
        //assertEquals(valorEsperado, iceMaker.checkInventario());
        
        if(!valorEsperado.contains(iceMaker.checkInventario()))
            System.out.print(iceMaker.checkInventario());
            fail("The test case is a prototype.");    
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo28() {
        System.out.println("comprarHelado1");
        
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
        
            } else {
            
            }
        } catch (ComboException e) {
            
        } finally {
            //mainMenu();
        }
        
        String yogurtString = "15";
        String fresaString = "15";
        String almendraString = "15";
        String chocolateString = "15";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            
        } catch (InventoryException e) {

        } finally {

        }
        
        
        Combo [] Combos = iceMaker.getCombos();
        
        int ComboToPurchase = 0;
        
        String amountPaid = "60";
        int amtPaid = 0;
        try {
        	amtPaid = Integer.parseInt(amountPaid);
        } catch (NumberFormatException e) {
        	System.out.println("Favor entrar un numero entero positivo");
                fail("The test case is a prototype.");    
        	//mainMenu();
        }
        
        int change = iceMaker.makeIcecream(ComboToPurchase, amtPaid);
        
        if (change == amtPaid) {
        	System.out.println("Fondos insuficientes para pagar.");
                fail("The test case is a prototype.");    
        } else {
        	System.out.println("Gracias por su compra: -> " + iceMaker.getCombos()[ComboToPurchase].getName());
        }
        System.out.println("Su cambio es: " + change + "\n");
        System.out.print(iceMaker.checkInventario());
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo29() {
        System.out.println("comprarHelado2");
        
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
        
            } else {
            
            }
        } catch (ComboException e) {
            
        } finally {
            //mainMenu();
        }
        
        String yogurtString = "15";
        String fresaString = "15";
        String almendraString = "15";
        String chocolateString = "15";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            
        } catch (InventoryException e) {

        } finally {

        }
        
        
        Combo [] Combos = iceMaker.getCombos();
        
        int ComboToPurchase = 0;
        
        String amountPaid = "40";
        int amtPaid = 0;
        try {
        	amtPaid = Integer.parseInt(amountPaid);
        } catch (NumberFormatException e) {
        	System.out.println("Favor entrar un numero entero positivo");
                fail("The test case is a prototype.");    
        	//mainMenu();
        }
        
        int change = iceMaker.makeIcecream(ComboToPurchase, amtPaid);
        
        if (change == amtPaid) {
        	System.out.println("Fondos insuficientes para pagar.");
                fail("The test case is a prototype.");    
        } else {
        	System.out.println("Gracias por su compra: -> " + iceMaker.getCombos()[ComboToPurchase].getName());
        }
        System.out.println("Su cambio es: " + change + "\n");
        System.out.print(iceMaker.checkInventario());
        
    }
    
    /**
     * Test of addCombo method, of class Main.
     */
    @Test
    public void testAddCombo30() {
        System.out.println("comprarHelado3");
        
        Combo r = new Combo();
        try {
                r.setName("Batida");
                r.setPrice("50");
                r.setvarYogurt("16");
                r.setvarFresas("1");
                r.setvarAlmendras("1");
                r.setvarChocolate("0");

                boolean ComboAdded = iceMaker.addCombo(r);

            if(ComboAdded) {
        
            } else {
            
            }
        } catch (ComboException e) {
            
        } finally {
            //mainMenu();
        }
        
        String yogurtString = "15";
        String fresaString = "15";
        String almendraString = "15";
        String chocolateString = "15";

        try {
            iceMaker.addInventario(yogurtString, fresaString, almendraString, chocolateString);
            
        } catch (InventoryException e) {

        } finally {

        }
        
        
        Combo [] Combos = iceMaker.getCombos();
        
        int ComboToPurchase = 0;
        
        String amountPaid = "50";
        int amtPaid = 0;
        try {
        	amtPaid = Integer.parseInt(amountPaid);
        } catch (NumberFormatException e) {
        	System.out.println("Favor entrar un numero entero positivo");
                fail("The test case is a prototype.");    
        	//mainMenu();
        }
        
        int change = iceMaker.makeIcecream(ComboToPurchase, amtPaid);
        
        if (change == amtPaid) {
        	System.out.println("Fondos insuficientes para pagar.");
                fail("The test case is a prototype.");    
        } else {
        	System.out.println("Gracias por su compra: -> " + iceMaker.getCombos()[ComboToPurchase].getName());
        }
        System.out.println("Su cambio es: " + change + "\n");
        System.out.print(iceMaker.checkInventario());
        
    }
    
}
