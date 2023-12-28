import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class updateContactDetailStep {
	
	@Given("User is on their dashboard page")
	def userAlreadyOnDashboard() {
		WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
		WebUI.setText(findTestObject('Page_OrangeHRM/input_Username_username'), 'Admin')
		WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')
		WebUI.click(findTestObject('Page_OrangeHRM/button_Login'))
	}

	@When("User click my info sidebar and click Contact Detail")
	def userAccessContactDetail() {
		WebUI.click(findTestObject('Page_OrangeHRM/a_My Info'))
		WebUI.click(findTestObject('Page_OrangeHRM/a_Contact Details'))
	}

	@And("User update contact detail information")
	def updateContactDetail() {
		WebUI.setText(findTestObject('Page_OrangeHRM/InputformStreet1'), 'Jalan Ini')
		WebUI.setText(findTestObject('Page_OrangeHRM/ContactDetailFormProvinsi'), 'Jakarta')
		WebUI.setText(findTestObject('Page_OrangeHRM/ContactDetailEmailKantor'), 'iniemail@mailinator.com')
	}
	

	@Then("Contact detail information updated successfully")
	def contactDetailUpdated() {
		WebUI.click(findTestObject('Page_OrangeHRM/button_Save'))
	}
}