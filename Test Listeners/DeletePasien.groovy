//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
//import com.kms.katalon.core.model.FailureHandling as FailureHandling
//import com.kms.katalon.core.testcase.TestCase as TestCase
//import com.kms.katalon.core.testdata.TestData as TestData
//import com.kms.katalon.core.testobject.TestObject as TestObject
//
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//
//import internal.GlobalVariable as GlobalVariable
//
//import com.kms.katalon.core.annotation.BeforeTestCase
//import com.kms.katalon.core.annotation.BeforeTestSuite
//import com.kms.katalon.core.annotation.AfterTestCase
//import com.kms.katalon.core.annotation.AfterTestSuite
//import com.kms.katalon.core.context.TestCaseContext
//import com.kms.katalon.core.context.TestSuiteContext
//
//class DeletePasien {
//	/**
//	 * Executes after every test suite ends.
//	 * @param testSuiteContext: related information of the executed test suite.
//	 */
//	@AfterTestSuite
//	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
//		println testSuiteContext.getTestSuiteId()
//		
//		WebUI.click(findTestObject('Object Repository/Page_Home/a_Find Patient Record (4)'))
//		
//		WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Find Patient Record_patient-search (3)'),
//			'irman')
//		
//		WebUI.delay(5)
//		
//		WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/td_irman ramadhan 1dXe85JL'))
//		
//		WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/div_Delete Patient (2)'))
//		
//		WebUI.setText(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/input_Reason_delete-reason'), 'automation test')
//		
//		WebUI.click(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/button_Confirm (2)'))
//		
//		WebUI.rightClick(findTestObject('Object Repository/Page_OpenMRS Electronic Medical Record/p_Patient has been deleted successfully'))
//		
//	}
//}