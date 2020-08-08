package com.urbanladder.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.config.Keywords;

public class HomePage {
	
	@FindBy(xpath="//strong[contains(text(),'Visit our stores')]")
	private WebElement visitOurStoresLink;
	
	@FindBy(xpath="//div[@class='icofont-cross']")
	private WebElement crossIconBtn;
	
	@FindBy(xpath="//a[@class='inherit contact-channel'][contains(text(),'Help')]")
	private WebElement helpWithIconLink;
	
	@FindBy(xpath="//a[contains(text(),'Track Order')]")
	private WebElement trackOrderWithIconLink;
	
	@FindBy(xpath="//a[contains(text(),'Become a Franchisee')]")
	private WebElement becomeAFranchiseeLink;
	
	@FindBy(xpath="//a[@class='featuredLinksBar__link'][contains(text(),'Stores')]")
	private WebElement storesLink;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Orders')]")
	private WebElement bulkOrdersLink;
	
	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLink;
	
	@FindBy(xpath="//body[@id='home']")
	private WebElement urbanLadderWithLogo;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//span[@class='search-icon icofont-search']")
	private WebElement searchIconLink;
	
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']//*[local-name()='svg']")
	private WebElement userProfileIcon;
	
	@FindBy(xpath="")
	private WebElement saleUnit;
	
	public void clickOnVisitOurStoresLink() {
		visitOurStoresLink.click();
	}
	public void clickOnCrossIconBtn() {
		crossIconBtn.click();
	}
	public void mouseHoverOnHelpWithIconLink(){
		Keywords.hoverOnElement("XPATH", "helpWithIconLink");
	}
	public void clickOnHelpWithIconLink() {
		helpWithIconLink.click();
	}
	public void mouseHoverOnTrackOrderWithIconLink() {
		Keywords.hoverOnElement("XPATH","trackOrderWithIconLink");
	}
	public void clickOnTrackOrderWithIconLink() {
		trackOrderWithIconLink.click();
	}
	public void mouseHoverOnBecomeAFranchiseeLink() {
		Keywords.hoverOnElement("XPATH", "becomeAFranchiseeLink");
	}
	public void clickOnBecomeAFranchisee() {
		becomeAFranchiseeLink.click();
	}
	public void mouseHoverOnStoresLink() {
		Keywords.hoverOnElement("XPATH", "storesLink");
	}
	public void clickOnStoresLink() {
		storesLink.click();
	}
	public void mouseHoverOnBulkOrdersLink() {
		Keywords.hoverOnElement("XPATH", "bulkOrdersLink");
	}
	public void clickOnBulkOrdersLink() {
		bulkOrdersLink.click();
	}
	public void mouseHoverOnGiftCardsLink() {
		Keywords.hoverOnElement("XPATH", "giftCardsLink");
	}
	public void clickOnGiftCardsLink() {
		giftCardsLink.click();
	}
	public void clickOnUrbanLadderWithLogo() {
		urbanLadderWithLogo.click();
	}
	public void clickOnSearchTextBox() {
		searchTextBox.click();
	}
	public void mouseHoverOnSearchIconLink() {
		Keywords.hoverOnElement("XPATH", "searchIconLink");
	}
	public void clickOnSearchIconLink() {
		searchIconLink.click();
	}
	public void mouseHoverOnUserProfileIcon() {
		Keywords.hoverOnElement("XPATH", "userProfileIcon");
	}
}
