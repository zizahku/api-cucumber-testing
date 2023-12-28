import cucumber.api.PendingException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class LoginStep {

	@Given("user is on login page")
	def userIsOnLoginPage() {
		WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}

	@When("user input username and password")
	def userInputUsernameAndPassword() {
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), 'Admin')
		WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))
	}

	@And("user should be logged in successfully")
	def userShouldBeLoggedIn() {
		WebUI.verifyTextPresent('Dashboard', false)
	}


	@Then("user log out")
	def userLogOut() {
		WebUI.click(findTestObject('Page_OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd_d2fd49'))
		WebUI.click(findTestObject('Page_OrangeHRM/a_Logout'))
	}
}
