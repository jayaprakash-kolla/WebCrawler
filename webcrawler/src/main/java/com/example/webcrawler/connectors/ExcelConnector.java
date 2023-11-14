package com.example.webcrawler.connectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ExcelConnector {

    public void excelConnectorMethod() throws IOException {
        String url = "https://file-examples.com/index.php/sample-documents-download/sample-xls-download/";

        Document document = Jsoup.connect(url).get();

        Element element = document.select("a").first();

        System.out.println(element.absUrl("href"));


    }
}
