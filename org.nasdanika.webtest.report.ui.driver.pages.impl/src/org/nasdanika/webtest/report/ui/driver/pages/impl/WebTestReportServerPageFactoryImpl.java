package org.nasdanika.webtest.report.ui.driver.pages.impl;

import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPageFactory;
import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPage;
import org.openqa.selenium.WebDriver;
import org.nasdanika.webtest.WebTestUtil;
import org.osgi.service.component.ComponentContext;

public class WebTestReportServerPageFactoryImpl implements WebTestReportServerPageFactory {

	private String baseURL;
	
	public void activate(ComponentContext context) {
		baseURL = (String) context.getProperties().get("base-url");
		System.out.println("Page factory component activated with base URL '"+baseURL+"'");
	}
	
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	
	@Override
	public WebTestReportServerPage createWebTestReportServerPage(WebDriver webDriver) {
		WebTestReportServerPageImpl ret = WebTestUtil.initElements(webDriver, WebTestReportServerPageImpl.class);
		ret.setFactory(this);
		return ret;
	}
	
	public String getBaseURL() {
		return baseURL;
	}

}
