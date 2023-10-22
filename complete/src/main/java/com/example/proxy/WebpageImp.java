package com.example.proxy;
import javax.swing.JOptionPane;
public class WebpageImp implements Webpage {
    @Override
    public void renderPage(String url){
        System.out.println("Has entrado correctamente a: " + url);
        JOptionPane.showMessageDialog(
                null,
                "Has entrado correctamente a: " + url,
                "Exito",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
