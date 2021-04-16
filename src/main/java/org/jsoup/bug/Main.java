package org.jsoup.bug;

import org.jsoup.Jsoup;

public class Main {

    public static void main(String... args) {
        Jsoup.parse("<html><body><table><input type='text'/></table></body></html>"); // Works
        Jsoup.parse("<html><body><table><input/></table></body></html>"); // NPE
    }
}
