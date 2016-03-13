package org.nasdanika.webtest.report.ui.driver.actors;

import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPageFactory;
import org.openqa.selenium.WebDriver;

public interface WebTestReportServerActorFactory {
	
	WebTestReportServerPageFactory getPageFactory();
	
	WebTestReportServerActor createWebTestReportServerActor(WebDriver webDriver);

}
