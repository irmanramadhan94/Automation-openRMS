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

WebUI.click(findTestObject('Object Repository/Page_Home/a_Find Patient Record'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Find Patient Record_patient-search'), 
    'irman')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan QVIqva4U'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan QVIqva4U'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Start Visit (1)'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Outpatient'), 'Outpatient')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/li_Visits'), 'Visits')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_End Visit'), 'End Visit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Visit Note'), 'Visit Note')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Admit to Inpatient'), 
    'Admit to Inpatient')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Capture Vitals'), 'Capture Vitals')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Attachments'), 'Attachments')

