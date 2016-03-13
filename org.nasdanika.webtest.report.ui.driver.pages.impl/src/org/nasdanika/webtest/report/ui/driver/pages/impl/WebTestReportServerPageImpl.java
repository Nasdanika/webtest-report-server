package org.nasdanika.webtest.report.ui.driver.pages.impl;

import org.nasdanika.webtest.report.ui.driver.pages.WebTestReportServerPage;
import org.nasdanika.webtest.ReflectivePageBase;
import org.nasdanika.webtest.Wait;
import org.openqa.selenium.WebDriver;


@Wait(id="button-groups")
public class WebTestReportServerPageImpl extends ReflectivePageBase<WebDriver> implements WebTestReportServerPage {
		
	private WebTestReportServerPageFactoryImpl factory;
	private WebDriver webDriver;	

	public WebTestReportServerPageImpl(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void setFactory(WebTestReportServerPageFactoryImpl factory) {
		this.factory = factory;
	}
	
	@Override
	public WebDriver getWebDriver() {
		return webDriver;
	}

}
