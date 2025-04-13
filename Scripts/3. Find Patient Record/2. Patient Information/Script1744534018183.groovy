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

WebUI.click(findTestObject('Object Repository/Page_Home/a_Find Patient Record (2)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Find Patient Record_patient-search (2)'), 
    'irman')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan rama (1)'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan rama (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_irman (1)'), 'irman')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_ramadhan (1)'), 'ramadhan')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Given (1)'), 'Given')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Middle (1)'), 'Middle')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Family Name (1)'), 'Family Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_Male (1)'), 'Male ')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_31 year(s)                            _1191ad (1)'), 
    '31 year(s) ( 04.Mar.1994)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Patient ID (1)'), 'Patient ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_100LDG (1)'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_DIAGNOSES (1)'), 'DIAGNOSES')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_None in the last 730 days (1)'), 
    'None in the last 730 days')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_LATEST OBSERVATIONS (1)'), 
    'LATEST OBSERVATIONS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None in the last   30  days              _127cd3 (1)'), 
    'None in the last 30 days None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_HEALTH TREND SUMMARY (1)'), 
    'HEALTH TREND SUMMARY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_WEIGHT GRAPH (1)'), 
    'WEIGHT GRAPH')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/strong_Weight (kg) (1)'), 
    'Weight (kg)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_None in the last   365  days (1)'), 
    'None in the last 365 days')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_VITALS (1)'), 'VITALS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_None (1)'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_APPOINTMENTS (1)'), 
    'APPOINTMENTS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_None_1 (1)'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_RECENT VISITS (1)'), 
    'RECENT VISITS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None (1)'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_FAMILY (1)'), 'FAMILY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None_1 (1)'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_CONDITIONS (1)'), 'CONDITIONS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None_1_2 (1)'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_ATTACHMENTS (1)'), 'ATTACHMENTS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_ALLERGIES (1)'), 'ALLERGIES')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Unknown (1)'), 'Unknown')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_General Actions (1)'), 
    'General Actions')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Start Visit (2)'), 
    'Start Visit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Add Past Visit (1)'), 
    'Add Past Visit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Schedule Appointment (1)'), 
    'Schedule Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Request Appointment (1)'), 
    'Request Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Mark Patient Deceased (1)'), 
    'Mark Patient Deceased')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Edit Registration Information (1)'), 
    'Edit Registration Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Delete Patient (1)'), 
    'Delete Patient')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Attachments (1)'), 
    'Attachments')

