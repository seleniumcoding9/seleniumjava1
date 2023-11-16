import org.bouncycastle.asn1.isismtt.x509.Admissions;
import org.testng.annotations.*;

public class Programm1
{
    @Test
    public void AdmissionLogin()
    {
        System.out.println("Admission Login");
    }
    @Test
    public void AdmissionBrokenLinks()
    {
        System.out.println("Admission Broken Links");
    }
    @Test
    public void FacultyAdmissions()
    {
        System.out.println("Faculty Admissions");
    }
    @Test
    public void FacultyLogin()
    {
        System.out.println("FacultyLogin");
    }
    @Test
    public void FacultyLogout()
    {
        System.out.println("FacultyLogout");
    }
    @BeforeMethod
    public void beforemethod()
    {
        System.out.println("Admissions are logging");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("admissions server is not working");
    }
    @AfterMethod
    public void aftermethod()
    {
        System.out.println("Faculty is not able to login");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Faculty is facing server issue");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Admissions are available in the portal");
    }
    @BeforeClass
    public void beforeClass1()
    {
        System.out.println("All links are available in portal");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("IT Team is working on it");
    }
    @AfterClass
    public void afterClass1()
    {
        System.out.println("Now admissions link are working");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Facing some issues with admissions links");
    }
    @BeforeTest
    public void beforeTest1()
    {
        System.out.println("It is taking some-much time for homepage");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("After working it department links are working");
    }
    @AfterTest
    public void afterTest1()
    {
        System.out.println("Still it is not working");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Employees are waiting for links");
    }
    @BeforeSuite
    public void beforsSuite()
    {
        System.out.println("production was stopped due to server issue");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("RightNow employees are working after issue resolved");
    }
    @AfterSuite
    public void afterSuite1()
    {
        System.out.println("Again issue is raised");
    }
}