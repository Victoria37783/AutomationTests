package com.example.demo;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LinksChecker {

    @Test
    void name() {

        List<String> links = new ArrayList<>();
        Set<String> brokenLinks = new HashSet<>();

        links.add("https://cdn.oinvest.com/en/future_trading_v2");
        links.add("https://cdn.oinvest.com/en/commodities");
        links.add("https://cdn.oinvest.com/en/make_money");
        links.add("https://cdn.oinvest.com/en/make_money");
        links.add("https://cdn.oinvest.com/en/metals_v2");
        links.add("https://cdn.oinvest.com/en/content_spread");
        links.add("https://cdn.oinvest.com/en/currency_investing_v2");
        links.add("https://cdn.oinvest.com/en/metals");
        links.add("https://cdn.oinvest.com/en/demo_trading_v2");
        links.add("https://cdn.oinvest.com/en/content_forex_v2");
        links.add("https://cdn.oinvest.com/en/demo_trading_v1");
        links.add("https://cdn.oinvest.com/en/content_spread_v2");
        links.add("https://cdn.oinvest.com/en/lead-generation");
        links.add("https://cdn.oinvest.com/en/competitors");
        links.add("https://cdn.oinvest.com/en/currency_investing");
        links.add("https://cdn.oinvest.com/en/content_forex");
        links.add("https://cdn.oinvest.com/en/future_trading");
        links.add("https://cdn.oinvest.com/en/content_trading_v2");

        CloseableHttpClient httpClient = HttpClients.createDefault();

        for (String l : links) {
            HttpGet request = new HttpGet(l);
            CloseableHttpResponse response = null;
            try {
                response = httpClient.execute(request);
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode != 200) {
                    brokenLinks.add(l);
                }
            } catch (IOException e) {
                brokenLinks.add(l);
                e.printStackTrace();
            }
        }

        System.out.println("All broken links: " + brokenLinks);
        assertTrue(brokenLinks.isEmpty());
    }
}

