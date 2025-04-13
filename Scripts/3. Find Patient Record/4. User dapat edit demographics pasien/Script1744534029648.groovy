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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan QVIqva4U'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Edit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName (1)'), 
    10)

WebUI.clearText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName (1)'), 'edited')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Male                    Female (1)'), 
    'F', true)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'))

WebUI.doubleClick(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'), '5')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Gender Female'), 'Gender: Female')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Birthdate 5, March, 1994'), 
    'Birthdate: 5, March, 1994')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h2_Demographics'), 'Demographics')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_irman (2)'), 'irman')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_ramadhan (2)'), 'ramadhan')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Male                                   _7b49c2'), 
    'Male  31 year(s) ( 04.Mar.1994) Edit')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Edit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName_1'), 
    10)

WebUI.clearText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName_1'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName_1'), 'edited')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Male                    Female_1'), 
    10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Male                    Female_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Male                    Female_1'), 
    'F', true)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'), '5')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_irman (2)'), 'irman')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_edited'), 'edited')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_Female'), 'Female ')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_31 year(s)                            _27b454'), 
    '31 year(s) ( 05.Mar.1994)')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/a_Edit'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName_1_2'), 
    10)

WebUI.clearText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName_1_2'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_(required)_givenName (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Middle_middleName_1_2'), 'ramadhan')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/select_Male                    Female_1_2'), 
    'M', true)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Day_birthdateDay'), '4')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Cancel_next-button'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_irman (2)'), 'irman')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_ramadhan (2)'), 'ramadhan')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_Male (2)'), 'Male ')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/span_31 year(s)                            _1191ad (2)'), 
    '31 year(s) ( 04.Mar.1994)')

