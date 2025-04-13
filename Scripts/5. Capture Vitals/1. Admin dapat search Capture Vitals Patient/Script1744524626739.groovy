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

WebUI.click(findTestObject('Object Repository/Page_Home/a_Capture Vitals'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Capture Vitals for Patient_patient-search'), 
    'irman')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h2_Capture Vitals for Patient'), 
    'Capture Vitals for Patient')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Identifier (1)'), 'Identifier')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Name (2)'), 'Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Gender (1)'), 'Gender')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_M (1)'), 'M')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Age (1)'), 'Age')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_31 (1)'), '31')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Birthdate (1)'), 'Birthdate')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_04 Mar 1994'), '   04 Mar 1994')

