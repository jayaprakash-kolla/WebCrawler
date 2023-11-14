package com.example.webcrawler;

import com.example.webcrawler.connectors.ExcelConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class WebcrawlerApplication {

	private final ExcelConnector excelConnector;

	public WebcrawlerApplication(ExcelConnector excelConnector) {
		this.excelConnector = excelConnector;
	}


	public static void main(String[] args) throws IOException {
		WebcrawlerApplication webcrawlerApplication = SpringApplication.run(WebcrawlerApplication.class, args).getBean(WebcrawlerApplication.class);
		webcrawlerApplication.excelConnectorlauncher();
	}

	public void excelConnectorlauncher() throws IOException {
		excelConnector.excelConnectorMethod();
	}

}
