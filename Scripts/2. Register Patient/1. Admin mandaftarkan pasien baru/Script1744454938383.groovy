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
import java.util.Random

randomString randomGenerator = new randomString()

int randomLength = 8

String randomText = randomGenerator.generateAlphanumeric(randomLength)

println('Random Alphanumeric Text: ' + randomText)

GlobalVariable.randomText = randomText


WebUI.click(findTestObject('Object Repository/Page_Home/a_Register a patient'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_(required)_givenName'), 
    10)

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_(required)_givenName'), 'irman')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName'), 'ramadhan')

//int random = CustomKeywords.'randomString.generateAlphanumeric'(10)
WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_(required)_familyName'), randomText)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/icon_Confirm submission_fas fa-chevron-right'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Male                    Female'), 
    'M', true)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_(required)_birthdateDay'), 
    '04')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Select                            Ja_a574ad'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_(required)_birthdateYear'), 
    '1994')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Address_address1'), 'cisinga')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Address 2_address2'), 'kertamukti')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_CityVillage_cityVillage'), 
    'tasik')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_StateProvince_stateProvince'), 
    'jabar')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Country_country'), 'indo')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Postal Code_postalCode'), '46156')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_concat(What, , s the patient phone nu_867169'), 
    '087777777777')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Select Relationship Type            _961917'), 
    '8d919b58-c2cc-11de-8d13-0010c6dffd0f-A', true)

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Who is the patient related to_person-_c8514e'), 
    'indra')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/i_Who is the patient related to_icon-plus-s_997839'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Select Relationship Type            _961917_1'), 
    '8d91a210-c2cc-11de-8d13-0010c6dffd0f-A', true)

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Who is the patient related to_person-_c8514e_1'), 
    'Simon')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Confirm submission_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_irman'), 'irman')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_ramadhan'), 'ramadhan')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_rama'), randomText)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Given'), 'Given')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Middle'), 'Middle')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Family Name'), 'Family Name')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_Male'), 'Male ')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_31 year(s)                            _1191ad'), 
    '31 year(s) ( 04.Mar.1994)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/em_Patient ID'), 'Patient ID')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_100LDG'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_DIAGNOSES'), 'DIAGNOSES')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_None in the last 730 days'), 
    'None in the last 730 days')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_LATEST OBSERVATIONS'), 
    'LATEST OBSERVATIONS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None in the last   30  days              _127cd3'), 
    'None in the last 30 days None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_HEALTH TREND SUMMARY'), 
    'HEALTH TREND SUMMARY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_WEIGHT GRAPH'), 'WEIGHT GRAPH')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/strong_Weight (kg)'), 'Weight (kg)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_None in the last   365  days'), 
    'None in the last 365 days')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_VITALS'), 'VITALS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_None'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_APPOINTMENTS'), 'APPOINTMENTS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_None_1'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_RECENT VISITS'), 'RECENT VISITS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_FAMILY'), 'FAMILY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None_1'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_CONDITIONS'), 'CONDITIONS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_None_1_2'), 'None')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_ATTACHMENTS'), 'ATTACHMENTS')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_ALLERGIES'), 'ALLERGIES')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Unknown'), 'Unknown')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_General Actions'), 'General Actions')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Start Visit'), 'Start Visit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Add Past Visit'), 'Add Past Visit')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Schedule Appointment'), 
    'Schedule Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Request Appointment'), 
    'Request Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Mark Patient Deceased'), 
    'Mark Patient Deceased')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Edit Registration Information'), 
    'Edit Registration Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Delete Patient'), 'Delete Patient')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Attachments'), 'Attachments')

