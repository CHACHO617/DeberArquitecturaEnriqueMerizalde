package com.example.proxy;
import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una URL: ");

        String url = scanner.nextLine();

        WebpageProxy webpageProxy = new WebpageProxy();

        try {
            webpageProxy.renderPage(url);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
