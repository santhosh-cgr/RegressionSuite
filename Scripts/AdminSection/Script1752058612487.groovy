import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bug-nation.cgrfoundation-staging.com/accounts/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_CGR Foundation/input_Email address_accountemail'), 'santhosh.nidamanuri@corpgovrisk.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CGR Foundation/input_Password_accountpassword'), 'g9InqrzvBVyAQwkGaiz+Ig==')

WebUI.click(findTestObject('Object Repository/Page_CGR Foundation/input_Remember me_commit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Dashboard - CGR Foundation (6)/div_Successfully logged in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - CGR Foundation (6)/span_Santhosh'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - CGR Foundation (6)/a_Admin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard - CGR Foundation (6)/a_Admin_1'), 'Admin')

