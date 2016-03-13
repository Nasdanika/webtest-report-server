package org.nasdanika.webtest.report.ui.driver.actors.impl;

import org.nasdanika.webtest.report.ui.driver.actors.WebTestReportServerActor;
import org.nasdanika.webtest.report.ui.driver.actors.WebTestReportServerActorFactory;
import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPage;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.openqa.selenium.WebDriver;

class WebTestReportServerActorImpl implements WebTestReportServerActor {

	private WebTestReportServerActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	WebTestReportServerActorImpl(WebTestReportServerActorFactory factory, WebDriver webDriver) {
		this.factory = factory;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}
	
	@Override		
	@Description("Navigates to WebTestReportServerPage")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public WebTestReportServerPage navigateToWebTestReportServerPage() {
		webDriver.get("http://localhost:8080/webtest-report-server/router/webtest-report-server.html");
		WebTestReportServerPage ret = factory.getPageFactory().createWebTestReportServerPage(webDriver);
		
		return ret;
	}

}
