package org.nasdanika.webtest.report.ui.driver.actors;

import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.openqa.selenium.WebDriver;

@Description("WebTest Report Server Actor")
public interface WebTestReportServerActor extends Actor<WebDriver> {
	
	@Description("Navigates to WebTestReportServerPage")
	WebTestReportServerPage navigateToWebTestReportServerPage();

}
