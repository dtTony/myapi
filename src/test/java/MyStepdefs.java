import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class MyStepdefs implements En {
//public class MyStepdefs {
    public MyStepdefs() {
        Given("^I am on the \"([^\"]*)\" page$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("这是第一步");
//            throw new PendingException();
        });
        And("^I click the \"([^\"]*)\" button$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("这是第2步");
//            throw new PendingException();
        });
        Then("^I should go to the \"([^\"]*)\" page$", (String arg0) -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("这是第3步");
//            throw new PendingException();
        });
        Given("^I am a \"([^\"]*)\" page$", (String arg0) -> {
            System.out.println("这是新的step");
        });
        Given("^我在这个页面$", () -> {
            System.out.println("这是中文");
        });
        Then("^我在这$", () -> {
            System.out.println("这是中文");
        });
    }
}
