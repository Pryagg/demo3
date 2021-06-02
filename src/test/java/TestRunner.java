//Run this file with jUnit in order for tags to work.
//Run this file as cucumber with 'name' explicit to run a single name scenario. Name = Cucumber file scenario name.
//If you get the 'no glue code' message on a Feature file - go to the stepDefinition file and make any arbitrary edit (like add then remove a space) and then re-save - this re-maps the feature file to it, then it can be run.



//import org.junit.AfterClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import managers.TestDriver;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/"},
		glue = {"stepDefinitions"}
 //     ,tags = {"@categories"}
      ,tags = {"@EndToEnd"}
//        ,tags = {"@Regression"}
 //       ,tags = {"@Header,@Home"}
//        ,tags = {"@main"}
//        ,tags = {"@home"}
//        ,tags = {"@footer"}
//        ,tags = {"@registration"}
//        ,name = {"Verify the elements on the home page"}
//        ,name = {"Verify that the user is able to update the country and currency"}
//        ,name = {"Verify the support links in the footer"}
	//	,name = {"Verify the new registration"}
)
public class TestRunner {



//    @AfterClass
//
//         public static void tearDown() {
//             TestDriver.closeDriver();
//
//
//    }
//

}