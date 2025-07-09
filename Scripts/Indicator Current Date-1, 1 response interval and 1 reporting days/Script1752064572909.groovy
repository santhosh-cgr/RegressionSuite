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

WebUI.navigateToUrl('https://bug-nation.cgrfoundation-staging.com/indicators/110')

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/button_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/input_Next Report Date_due_date'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/td_8'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/div_08 July, 2025'), '08 July, 2025')

WebUI.navigateToUrl('https://bug-nation.cgrfoundation-staging.com/admin/jobs')

WebUI.click(findTestObject('Object Repository/Page_Background Jobs - CGR Foundation (6)/a_Run'))

WebUI.navigateToUrl('https://bug-nation.cgrfoundation-staging.com/indicators/110')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/div_09 July, 2025'), '09 July, 2025')

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/a_13323'))

WebUI.click(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/button_Edit_btn btn-default'))

WebUI.setText(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/textarea_D'), 'D')

WebUI.setText(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/textarea_De'), 'De')

WebUI.setText(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/textarea_Del'), 'Del')

WebUI.setText(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/textarea_Dele'), 'Dele')

WebUI.setText(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/textarea_Delet'), 'Delet')

WebUI.setText(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/textarea_Delete'), 'Delete')

WebUI.click(findTestObject('Object Repository/Page_Indicator Responses - CGR Foundation (6)/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/button_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/input_Next Report Date_due_date'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/span_Dec_glyphicon glyphicon-trash'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/span_Santhosh'))

WebUI.click(findTestObject('Object Repository/Page_Indicators - CGR Foundation (6)/a_Log out'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CGR Foundation/div_Successfully logged out'), 'Successfully logged out.')

