package com.javarush.task.pro.task09.task0912;

public class Solution {

    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org",
                "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);
            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https:")) {
            return "https";
        } else if (url.startsWith("http:")) {
            return "http";
        } else {
            return "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        String[] domains = {".com", ".net", ".org", ".ru"};
        for (String domain : domains) {
            if (url.endsWith(domain)) {
                return domain.substring(1);
            }
        }
        return "неизвестный";
    }
}
