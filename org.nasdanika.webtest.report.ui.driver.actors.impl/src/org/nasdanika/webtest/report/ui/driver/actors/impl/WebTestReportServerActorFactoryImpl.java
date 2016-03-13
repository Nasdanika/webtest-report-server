package org.nasdanika.webtest.report.ui.driver.actors.impl;

import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPageFactory;
import org.nasdanika.webtest.report.ui.driver.actors.WebTestReportServerActorFactory;
import org.nasdanika.webtest.report.ui.driver.actors.WebTestReportServerActor;
import org.nasdanika.webtest.WebTestUtil;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class WebTestReportServerActorFactoryImpl implements WebTestReportServerActorFactory {

	private WebTestReportServerPageFactory pageFactory;

	public void setPageFactory(WebTestReportServerPageFactory pageFactory) {
		this.pageFactory = WebTestUtil.proxyPageFactory(pageFactory);
	}

	@Override
	public WebTestReportServerActor createWebTestReportServerActor(WebDriver webDriver) {
		return new WebTestReportServerActorImpl(this, webDriver);
	}
	
	// For troubleshooting
	public void activate(ComponentContext context) {
		System.out.println("WebTest Report Server Actor Factory Component activated");
	}

	@Override
	public WebTestReportServerPageFactory getPageFactory() {
		return pageFactory;
	}

}
