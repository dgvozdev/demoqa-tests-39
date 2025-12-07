import org.junit.jupiter.api.*;

public class SimpleJUnitTest {
int result;

@BeforeAll
static void beforeAll () {
    System.out.println("\n### beforeAll()\n");
}
    @BeforeEach
    void beforeEach() {
        System.out.println("###   beforeEach()");
        result = getResult();
    }
    @AfterEach
    void AfterEach() {
        System.out.println("\n### AfterEach()\n");
    }
@Test
    void firstTest () {
    int result = getResult();
    Assertions.assertTrue(3 > 2);
    System.out.println("###     firstTest()");
}

@Test
    void secondTest () {
    int result = getResult();
    Assertions.assertTrue(3 > 2);
    System.out.println("###     secondTest()");
}
@Test
        void thirdTest () {
    int result = getResult();
            Assertions.assertTrue(3>2);
            System.out.println("###     thirdTest()");
  }
    private int getResult() {
        return 3;
    }
}
