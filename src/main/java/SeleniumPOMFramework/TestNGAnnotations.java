package SeleniumPOMFramework;

public class TestNGAnnotations {


        @BeforeSuite
        public void beforeSuiteSetup() {
            System.out.println(">>> [BeforeSuite] Initialize ExtentReports, DB connection, and Selenium Grid setup.");
        }

        @AfterSuite
        public void afterSuiteTearDown() {
            System.out.println(">>> [AfterSuite] Flush reports, close DB connections, stop Grid.");
        }

        @BeforeTest
        public void beforeTestSetup() {
            System.out.println(">>> [BeforeTest] Set browser from testng.xml parameter, initialize environment variables.");
        }

        @AfterTest
        public void afterTestCleanup() {
            System.out.println(">>> [AfterTest] Close all browser instances opened in this <test> block.");
        }

        @BeforeClass
        public void beforeClassSetup() {
            System.out.println(">>> [BeforeClass] Launch browser and navigate to base URL.");
        }

        @AfterClass
        public void afterClassCleanup() {
            System.out.println(">>> [AfterClass] Close browser for this test class.");
        }

        @BeforeMethod
        public void beforeEachTest() {
            System.out.println(">>> [BeforeMethod] Navigate to test page, reset data before each test case.");
        }

        @AfterMethod
        public void afterEachTest() {
            System.out.println(">>> [AfterMethod] Capture screenshot if test failed, clear session data.");
        }

        @Test
        public void testCase1() {
            System.out.println(">>> [Test] Executing Test Case 1 - Verify Login functionality.");
        }

        @Test
        public void testCase2() {
            System.out.println(">>> [Test] Executing Test Case 2 - Verify Payment workflow.");
        }
    }


