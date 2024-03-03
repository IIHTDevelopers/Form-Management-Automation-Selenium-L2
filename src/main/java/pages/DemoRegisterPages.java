package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DemoRegisterPages extends StartupPage 
{
	
	//WebElement Declaration
	By pageTitleText = By.xpath(""); 
	By switchToNavigationMenu = By.xpath("");
	By Alerts = By.xpath("");
	By ButtonToDisplayAnAlertBox = By.xpath("");
	By RegisterNavigationMenu = By.xpath("");
	By firstNameTextbox = By.xpath("");
	By lastNameTextbox = By.xpath("");
	By addressInputAreabox = By.xpath("");
	By emailAddressTextbox = By.xpath("");
	By phoneNumberTextbox = By.xpath("");
	By maleRadioButton = By.xpath("");
	By feMaleRadioButton = By.xpath("");
	By CricketCheckBox = By.xpath("");
	By MoviesCheckBox = By.xpath("");
	By HockeyCheckBox = By.xpath("");
	By languageDropdown = By.xpath("");
	By selectEnglish = By.xpath("");
	By selectHindi = By.xpath("");
	By skillsDropdown = By.xpath("");
	By countryDropdown = By.xpath("");
	By clickOnCountryDropdown = By.xpath("");
	By selectCountryAustralia = By.xpath("");
	By selectCountryBangladesh = By.xpath("");
	By selectCountryDenmark = By.xpath("");
	By selectCountryHongKong = By.xpath("");
	By selectCountryIndia = By.xpath("");
	By selectCountryJapan = By.xpath("");
	By selectCountryNetherlands = By.xpath("");
	By selectCountryNewZealand = By.xpath("");
	By selectCountrySouthAfrica = By.xpath("");
	By selectCountryUnitedStatesOfAmerica = By.xpath("");
	By selectYear = By.xpath("");
	By selectMonth = By.xpath("");
	By selectDate = By.xpath("");
	By password = By.xpath("");
	By confirmPassword = By.xpath("");
	By submitButton = By.xpath("");
	By refreshButton = By.xpath("");
	By chooseFile = By.xpath("");
	By uploadImageFileName = By.xpath("");
	
	// add locators as per need
	
	// DECLARE ANY OBJECTS/VARIABLE TO SHARE DATA/INFORMATION/STATUS AMONG DIFFERENT METHODS 

	//Getting the page name
	String pageName = this.getClass().getSimpleName();
	

	//constructor Initialization
	public DemoRegisterPages(WebDriver driver) 
	{
		super(driver);

	}	
	
	
	
	//Utilization
	//Navigate to the URL and Validate the Home Page. Return the Home Page Title
	public String getHomePageTitle() throws Exception
	{
		return "";
	}
	
	

	//Hover SwitchTo menu Option
	public DemoRegisterPages hoverOnswitchToNavigationMenu() throws Exception {
		return null;
	}
	
	

	
	// Click on Alerts sub option
	public DemoRegisterPages clickOnAlerts() throws Exception {
		return null;
	}
	
	// Return the Alerts Page Title
	public String alertsPageTitle() throws Exception
	{
		return null;
	}

	// Click on button to display alerts box
	public DemoRegisterPages clickOnButtonToDisplayAnAlertBox() throws Exception {
		return null;
	}
	
	// Return the Alerts message
	public String alertsMessageValidation() throws Exception
	{
		//return page name
		return "";
	}	
	
	//Navigate to Register Page
	public DemoRegisterPages clickOnRegisterNavigationMenu() throws Exception {
		return null;
	}
	
	// Fill the registration form with data populated from expected_data.json
	public DemoRegisterPages fillRegisterForm(Map<String, String> expectedData) throws Exception {
		return null;
	}
	
	//Click on the country dropdown and Select each country option one by one
	public DemoRegisterPages clickOnSelectCountryDropdownAndSelectEachCountryOneByOne() throws Exception {
		return null;
	}
	

	//Check and uncheck each hobby checkbox and Validate that the checkboxes are responding correctly to user interaction, allowing selection and deselection.
	public DemoRegisterPages checkAndUncheckEachHobbyCheckBox() throws Exception {
		return null;
	}
	
	
	//Select each radio button option for gender and Validate that only one radio button option should be selectable at a time
	public DemoRegisterPages selectEachRadioButton() throws Exception {
		return null;
	}
	
	
	//Select different dates from the Date Of Birth fields_Validate that dates are selectable
	public DemoRegisterPages selectYearMonthDate() throws Exception {
		return null;
	}
	
	// Click on the image upload button and Choose an image file from the file system _ Validate that the selected image should be displayed on the page after upload
	public DemoRegisterPages clickOnChooseFilUploadButton() throws Exception {
		return null;
	}
	
	//Get the name of the file uploaded
	public String getUploadImageName() throws Exception {
		//return page name
		return null;
	}
	
	// Submit the register form, Verify that error messages for incomplete field displayed as appropriate. Return that message
	public String submitRegistrationFormAndReturnthatMessage() throws Exception {
		return null;
	}

	//Hover Switch To Menu Option and click Window option. Return the title of the page navigated to
	public String hoverSwitchToTabAndClickOnWindow() throws Exception {
		return null;
	}
	
	// Click on "click" button of new Tabbed Windows option and return the title of new Tab opened
	public String clickOnClickButtonOfNewTabbedWindow() throws Exception {
		return null;
	}


	// Click on "click" button of new Separate Windows option and return the title of new Window opened
	public String clickOnClickButtonOfNewSeparateWindow() throws Exception {
		return null;
	}

	
	// Click on "click" button of Multiple Windows option and return the count of new tabs opened
	public int clickOnClickButtonOfMultipleWindow() throws Exception {
		return -1;
	}

	//Hover Switch To Menu Option and click Frame option. Return the title of the page navigated to
	public String hoverSwitchToTabAndClickOnFrame() throws Exception {
		return null;
	}

	// Read the the value of iframe:single from expected Data and fill the text box. Return that value as well 
	public String passTheValueInTextboxofSingleIframe(Map<String, String> expectedData) throws Exception {
		return null;
	}

	// Read the the value of iframe:nested from expected Data and fill the text box. Return that value as well 
	public String passTheValueInTextboxofNestedIframe(Map<String, String> expectedData) throws Exception {
		return null;
	}

	//Hover Switch To Widget Option and click Accordion option. Return the title of the page navigated to
	public String hoverWidgetTabAndClickOnAccordion() throws Exception {
		return null;
	}

	//Click on collapsible Group 3. Return the description mentioned under the same
	public String clickOnCollapsibleGroupThree() throws Exception {
		return null;
	}

	//Hover  Widget Option and click AutoComplete option. Return the title of the page navigated to
	public String hoverWidgetTabAndClickOnAutoComplete() throws Exception {
		return null;
	}

	// Read the the value of autocomplete:data from expected Data and fill the text box. Return that number of autofill suggestion values that populate 
	public int fillAutoCompleteTextBox(Map<String, String> expectedData) throws Exception {
		return -1;
	}
	
	
	
	
	//Hover  Widget Option and click on slider option and perform maximize and minimize operation
	public DemoRegisterPages goToWidgetsTabclickOnSliderAndPerformMaximizeMinimize() throws Exception {
		return null;
	}
	
	//Hover  Interaction Option-Static and click on drag and drop option and perform drag and drop of images
	public DemoRegisterPages goToInterActionTabclickOnDragAndDropClickOnStaticAndPerfomDragAndDropAction() throws Exception {
		return null;
	}
	
	//Hover  Interaction Option-Dynamic and click on drag and drop option and perform drag and drop of images
	public DemoRegisterPages goToInterActionTabclickOnDragAndDropClickOnDynamicAndPerfomDragAndDropAction() throws Exception {
		return null;
	}


}
