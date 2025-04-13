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

'skenario ini saling dependensi dengan skenario \r\n1. Mendaftarkan pasien baru\r\n2. Start Visit Pasien'
WebUI.click(findTestObject('Object Repository/Page_Home/a_Capture Vitals (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Capture Vitals for Patient_patient-search (1) (1)'), 
    'irman')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan lDoikmTe (1) (1)'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan lDoikmTe (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/i_Yes, Record Vitals_icon-arrow-right (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Height (cm)_w8 (1)'), '165')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Weight (kg)_w10 (1)'), '70')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Temperature (c)_w12 (1)'), 
    '27')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Pulse_w14 (1)'), '100')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Respiratory rate_w16 (1)'), 
    '99')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Blood Pressure_w18 (1)'), '100')

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Blood Pressure_w20 (1)'), '70')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Arterial blood oxygen saturation (pul_224004 (1)'), 
    '99')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Please enter at least one observatio_633184 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Height (cm) 165 cm (1)'), 
    'Height (cm): 165 cm')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Weight (kg) 70 kg (1)'), 
    'Weight (kg): 70 kg')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_(Calculated) BMI 25.7 (1)'), 
    '(Calculated) BMI: 25.7')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Temperature (c) 27 C (1)'), 
    'Temperature (c): 27 °C')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Pulse 100 min (1)'), 
    'Pulse: 100 /min')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Respiratory rate 99 min (1)'), 
    'Respiratory rate: 99 /min')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Blood Pressure 100  70 (1)'), 
    'Blood Pressure: 100 / 70')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Arterial blood oxygen saturation (pulse o_5bf421 (1)'), 
    'Arterial blood oxygen saturation (pulse oximeter): 99 %')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Save_cancel focused (1)'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Save (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Capture Vitals for Patient_patient-search (1) (1)'), 
    'irman')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan lDoikmTe (1) (1)'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan lDoikmTe (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_Pharmacy (1)'), 'Pharmacy')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_Super User (admin) (1)'), 
    'Super User (admin)')

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/i_Registration Desk_icon-home small (1)'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Find Patient Record (3) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Capture Vitals for Patient_patient-search (1) (1)'), 
    'irman')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan lDoikmTe (1) (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/h3_LATEST OBSERVATIONS (2) (1)'), 
    'LATEST OBSERVATIONS')

