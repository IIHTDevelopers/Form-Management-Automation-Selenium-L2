

package testcases;

import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.yakshaAssert;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.DemoRegisterPages;
import pages.StartupPage;
import testBase.AppTestBase;

public class DemoAutomationRegister extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	DemoRegisterPages RegisterPageInstance;
	String numberToBeEntered="nayaksurya50@gmail.com";
	String ExpectedErrorMessage="The phone number you're trying to verify was recently used to verify a different account.  Please try a different number.";
	
	
	
	
	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		
		try{
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		initialize(configData);
		startupPage = new StartupPage(driver);
		RegisterPageInstance = new DemoRegisterPages(driver);
		yakshaAssert(currentTest(), isValidUrl, businessTestFile);
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		
		
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 1, groups = {"sanity"}, description="Navigate to the URL and Validate the Home Page")
	public void DemoRegisterAutomation() throws Exception {
		try{
		 
		 
		
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		String title = RegisterPageInstance.getHomePageTitle();
		yakshaAssert(currentTest(), title.equals( expectedData.get("pageTitle")), businessTestFile);
		Assert.assertEquals(title, expectedData.get("pageTitle"), "page title is not matching please check manually");
	}catch(Exception ex){
		yakshaAssert(currentTest(), false, businessTestFile);
		Assert.assertTrue(false);
	}	
	}	
	
	@Test(priority = 2, groups = {"sanity"}, description="Hover SwitchTo Option")
	public void hoverOnSwitchToMenuOption() throws Exception {
		try{
		 
		 
		DemoRegisterPages page = RegisterPageInstance.hoverOnswitchToNavigationMenu();
		
		
		yakshaAssert(currentTest(), page != null, businessTestFile);
		Assert.assertNotNull(page);
	}catch(Exception ex){
		yakshaAssert(currentTest(), false, businessTestFile);
		Assert.assertTrue(false);
	}		
	}	
	
	@Test(priority = 3, groups = {"sanity"}, description="Click on alert sub option")
	public void clickOnAlertSubOption() throws Exception {
		try{
		 
		 
		
		DemoRegisterPages page = RegisterPageInstance.clickOnAlerts();
		
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
	}catch(Exception ex){
		yakshaAssert(currentTest(), false, businessTestFile);
		Assert.assertTrue(false);
	}		
	}	

	@Test(priority = 4, groups = {"sanity"}, description="Return an validate alerts page title")
	public void returnAlertsPageTitle() throws Exception {
		try{
		 
		 
		
		String title = RegisterPageInstance.alertsPageTitle();
		
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "alerts_Page");
		yakshaAssert(currentTest(), title.equals(expectedData.get("alertsTitle")), businessTestFile);
		Assert.assertEquals(title, expectedData.get("alertsTitle"), 				"page title is not matching please check manually");
	}catch(Exception ex){
		yakshaAssert(currentTest(), false, businessTestFile);
		Assert.assertTrue(false);
	}		
	}	

	@Test(priority = 5, groups = {"sanity"}, description="Click on button to display the alert box and Validate if alert popup is shown.")
	public void clickOnButtonToDisplayAnAlertBox() throws Exception {
		try{
		 
		DemoRegisterPages page = RegisterPageInstance.clickOnButtonToDisplayAnAlertBox();	
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 6, groups = {"sanity"}, description="Validate the alert message")
	public void alertMessageValidation() throws Exception {
		try{
		 
		String message = RegisterPageInstance.alertsMessageValidation();	
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "alerts_message");
		yakshaAssert(currentTest(), message.equals(expectedData.get("alertsMessage")), businessTestFile);
		Assert.assertEquals(message, expectedData.get("alertsMessage"), "page title is not matching please check manually");
		
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	
	
	@Test(priority = 7, groups = {"sanity"}, description="Click on Register menu option to navigate to Register page")
	public void clickOnRegisterLink() throws Exception {
	try{
		 
		 
		
		RegisterPageInstance.clickOnRegisterNavigationMenu();
		String title = RegisterPageInstance.getHomePageTitle();
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		yakshaAssert(currentTest(), title.equals(expectedData.get("pageTitle")), businessTestFile);
		Assert.assertEquals(title, expectedData.get("pageTitle"), 				"page title is not matching please check manually");
		
		
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}		
	}		
	
	@Test(priority = 8, groups = {"sanity"}, description="Fill the form with data provided in json")
	public void fillTheForm() throws Exception {
	try{
		 
		 
		
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedRegisterDetails = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		DemoRegisterPages page = RegisterPageInstance.fillRegisterForm(expectedRegisterDetails);
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}		
	}

	@Test(priority = 9, groups = {"sanity"}, description="Click on the country dropdown and Select each country option one by one.")
	public void clickOnCountryDropDownAndSelectEachCountryOptionsOneByOne() throws Exception {
		try{
		 
		 
		DemoRegisterPages page = RegisterPageInstance.clickOnSelectCountryDropdownAndSelectEachCountryOneByOne();
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			 
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
	}	
	
	
	@Test(priority = 10, groups = {"sanity"}, description=" Check and uncheck each hobby checkbox and Validate that the checkboxes are responding correctly to user interaction, allowing selection and deselection.")
	public void checkAndUncheckEachCheckBoxAndValidateThatCheckBox() throws Exception {
		try{
		 
		 
		RegisterPageInstance.checkAndUncheckEachHobbyCheckBox();
		DemoRegisterPages page =RegisterPageInstance.checkAndUncheckEachHobbyCheckBox();
		 
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			 
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
	}	
	
	@Test(priority = 11, groups = {"sanity"}, description="Select each radio button option for gender and Validate that only one radio button option should be selectable at a time.")
	public void selectEachRadioOptionsForGenderValidateThatOnlyOneRadioButtonShouldBeSelect() throws Exception {
		try{
		 
		 
		RegisterPageInstance.selectEachRadioButton();
		DemoRegisterPages page = RegisterPageInstance.selectEachRadioButton();
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	
	
	

	@Test(priority = 12, groups = {"sanity"}, description="Select different dates from the Date Of Birth fields_Validate that dates are selectable")
	public void DateOfBirthValidation() throws Exception {
		 
		try{
			
		 
		RegisterPageInstance.selectYearMonthDate();	
		DemoRegisterPages page = RegisterPageInstance.selectYearMonthDate();
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	

	}	
	
	@Test(priority = 13, groups = {"sanity"}, description="Click on the image upload button and Choose an image file from the file system _ Validate that the selected image should be displayed on the page after upload.")
	public void fileUploadAction() throws Exception {
		try{
		 
		 
		DemoRegisterPages page = RegisterPageInstance.clickOnChooseFilUploadButton();
		
		
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
			
	}	

	@Test(priority = 14, groups = {"sanity"}, description="Get the name of the file uploaded.")
	public void getuploadedFileName() throws Exception {
		try{
		 
		 
		
		String image = RegisterPageInstance.getUploadImageName();
		
		yakshaAssert(currentTest(), image!=null, businessTestFile);
		Assert.assertNotNull(image);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
			
	}	
	
	@Test(priority = 15, groups = {"sanity"}, description="Submit the register form, Verify that error messages for incomplete field displayed as appropriate.")
	public void filltheRegisterFormAndValidateErrorMessage() throws Exception {
		try{
		 
		 
		String message = RegisterPageInstance.submitRegistrationFormAndReturnthatMessage();
		
		yakshaAssert(currentTest(), message!=null, businessTestFile);
		Assert.assertNotNull(message);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
			
		
	}	

	@Test(priority = 16, groups = {"sanity"}, description="Go to SwitchTo Tab, click On Window and validate page")
	public void hoverSwitchToTabAndClickOnWindow() throws Exception {
		try{
		
	
		String title = RegisterPageInstance.hoverSwitchToTabAndClickOnWindow();
		
		yakshaAssert(currentTest(), title.equals("Frames & Windows"), businessTestFile);
		Assert.assertEquals(title, "Frames & Windows");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 17, groups = {"sanity"}, description="Click on click button of new Tabbed Window and validate")
	public void clickOnClickButtonNewTabbedWindowAndValidate() throws Exception {
		try{
		
		String title = RegisterPageInstance.clickOnClickButtonOfNewTabbedWindow();
		
		yakshaAssert(currentTest(), title.equals("Selenium"), businessTestFile);
		Assert.assertEquals(title, "Selenium");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 18, groups = {"sanity"}, description="Click on click button of new Separate Window and validate")
	public void clickOnClickButtonNewSeparateWindowAndValidate() throws Exception {
		try{
		
		String title = RegisterPageInstance.clickOnClickButtonOfNewSeparateWindow();
		
		yakshaAssert(currentTest(), title.equals("Selenium"), businessTestFile);
		Assert.assertEquals(title, "Selenium");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 19, groups = {"sanity"}, description="Click on click button of Multiple Window and validate")
	public void clickOnClickButtonMultipleWindowAndValidate() throws Exception {
		try{
		
		int count = RegisterPageInstance.clickOnClickButtonOfMultipleWindow();
		
		yakshaAssert(currentTest(), count==2, businessTestFile);
		Assert.assertEquals(count, 2);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 20, groups = {"sanity"}, description="Go to SwitchTo Tab, click On Frame and validate page")
	public void hoverSwitchToTabAndClickOnFrame() throws Exception {
		try{
		
	
		String title = RegisterPageInstance.hoverSwitchToTabAndClickOnFrame();
		
		yakshaAssert(currentTest(), title.equals("Frames"), businessTestFile);
		Assert.assertEquals(title, "Frames");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	


	@Test(priority = 21, groups = {"sanity"}, description="Fill the value in test box of single Iframe and Validate")
	public void passTheValueInTextboxofSingleIframe() throws Exception {
	try{
		 
		 
		
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedRegisterDetails = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		String str = RegisterPageInstance.passTheValueInTextboxofSingleIframe(expectedRegisterDetails);
		
		yakshaAssert(currentTest(), str.equals("Single"), businessTestFile);
		Assert.assertEquals(str, "Single");
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}		
	}

	@Test(priority = 22, groups = {"sanity"}, description="Fill the value in test box of nested Iframe and Validate")
	public void passTheValueInTextboxofNestedIframe() throws Exception {
	try{
		 
		 
		
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedRegisterDetails = new FileOperations().readJson(expectedDataFilePath, "iframe");
		String str = RegisterPageInstance.passTheValueInTextboxofNestedIframe(expectedRegisterDetails);
		
		yakshaAssert(currentTest(), str.equals("Nested"), businessTestFile);
		Assert.assertEquals(str, "Nested");
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}		
	}
	

	@Test(priority = 23, groups = {"sanity"}, description="Go to Widget Tab, click On Accordion and validate page")
	public void hoverWidgetTabAndClickOnAccordion() throws Exception {
		try{
		
	
		String title = RegisterPageInstance.hoverWidgetTabAndClickOnAccordion();
		
		yakshaAssert(currentTest(), title.equals("Accordion"), businessTestFile);
		Assert.assertEquals(title, "Accordion");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 24, groups = {"sanity"}, description="Click on Collapsible Group  3 and Validate")
	public void clickOnCollapsibleGroupThree() throws Exception {
		try{
		
	
		String title = RegisterPageInstance.clickOnCollapsibleGroupThree();
		
		yakshaAssert(currentTest(), title.equals("As the name indicates, you can chain the methods without breaking the code i.e. you can write the code for each element continuously."), businessTestFile);
		Assert.assertEquals(title, "As the name indicates, you can chain the methods without breaking the code i.e. you can write the code for each element continuously.");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 25, groups = {"sanity"}, description="Go to Widget Tab, click On AutoComplete and validate page")
	public void hoverWidgetTabAndClickOnAutoComplete() throws Exception {
		try{
		
	
		String title = RegisterPageInstance.hoverWidgetTabAndClickOnAutoComplete();
		
		yakshaAssert(currentTest(), title.equals("Autocomplete"), businessTestFile);
		Assert.assertEquals(title, "Autocomplete");
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 26, groups = {"sanity"}, description="Fill AutoComplete Text Box and validate")
	public void fillAutoCompleteTextBox() throws Exception {
		try{
		
	
			String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedRegisterDetails = new FileOperations().readJson(expectedDataFilePath, "autocomplete");
		int count = RegisterPageInstance.fillAutoCompleteTextBox(expectedRegisterDetails);
		
		yakshaAssert(currentTest(), count == 3, businessTestFile);
		Assert.assertEquals(count, 3);
		}catch(Exception ex){
			
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
		
	}	

	@Test(priority = 27, groups = {"sanity"}, description="Go to widget Tab clickOn Slider, validate maximize and minimize")
	public void goToWidgetsTabclickOnSliderAndPerformMaximizeMinimize() throws Exception {
		try{

		DemoRegisterPages page = RegisterPageInstance.goToWidgetsTabclickOnSliderAndPerformMaximizeMinimize();
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
	}	
	
	@Test(priority = 28, groups = {"sanity"}, description="Go to Interactions, clickOn Drag and Drop-Static, and perform dragnDrop and validate")
	public void goToInterActionTabclickOnDragAndDropClickOnStaticAndPerfomDragAndDropAction() throws Exception {
		try{
		
		DemoRegisterPages page = RegisterPageInstance.goToInterActionTabclickOnDragAndDropClickOnStaticAndPerfomDragAndDropAction();
		yakshaAssert(currentTest(), page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
	}	
	
	@Test(priority = 29, groups = {"sanity"}, description="Go to Interactions, clickOn Drag and Drop-Dynamic, and perform dragnDrop and validate")
	public void goToInterActionTabclickOnDragAndDropClickOnDynamicAndPerfomDragAndDropAction() throws Exception {
		try{
			DemoRegisterPages page = RegisterPageInstance.goToInterActionTabclickOnDragAndDropClickOnDynamicAndPerfomDragAndDropAction();
		
		yakshaAssert(currentTest(),page!=null, businessTestFile);
		Assert.assertNotNull(page);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
			Assert.assertTrue(false);
		}	
	}	
		

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}
	
	
}
