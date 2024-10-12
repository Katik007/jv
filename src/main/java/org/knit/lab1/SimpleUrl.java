package org.knit.lab1;

import java.net.URL;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class SimpleUrl {
    private String protocol;
    private String address;
    private String domainZone;
    private String siteName;
    private String webpageName;
    private String webPageExtension;
    private int intParam;

    public SimpleUrl(String url) {
        parseUrl(url);
    }

    private void parseUrl(String url) {
        try {
            URL parsedUrl = new URL(url);
            this.protocol = parsedUrl.getProtocol();
            String host = parsedUrl.getHost();
            this.address = host;
            String[] hostParts = host.split("\\.");
            this.siteName = hostParts[0];
            this.domainZone = hostParts[1];
            String[] pathParts = parsedUrl.getPath().split("/");
            this.webpageName = pathParts[pathParts.length - 1].split("\\.")[0];
            this.webPageExtension = pathParts[pathParts.length - 1].split("\\.")[1];

            String urlWithout = parsedUrl.toString().split("\\?")[1];
            String[] queryParams = urlWithout.split("&");
            for (String param : queryParams) {
                String[] keyValue = param.split("=");
                if ("intParam".equals(keyValue[0])) {
                    this.intParam = Integer.parseInt(keyValue[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDomainZone() {
        return domainZone;
    }

    public void setDomainZone(String domainZone) {
        this.domainZone = domainZone;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getWebpageName() {
        return webpageName;
    }

    public void setWebpageName(String webpageName) {
        this.webpageName = webpageName;
    }

    public String getWebPageExtension() {
        return webPageExtension;
    }

    public void setWebPageExtension(String webPageExtension) {
        this.webPageExtension = webPageExtension;
    }
    public int getIntParam() {
        return intParam;
    }

    public void setIntParam(int intParam) {
        this.intParam = intParam;
    }
    public String toString() {
        return "protocol = " + protocol + "\n" +
                "address = " + address + "\n" +
                "domainZone = " + domainZone + "\n" +
                "siteName = " + siteName + "\n" +
                "webpageName = " + webpageName + "\n" +
                "webPageExtension = " + webPageExtension+ "\n" +
                "intParam = " + intParam;
    }
}