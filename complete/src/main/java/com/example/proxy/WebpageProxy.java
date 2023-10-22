package com.example.proxy;

import javax.swing.*;

public class WebpageProxy implements Webpage{

    private Webpage webpage;
    public WebpageProxy(){
        webpage = new WebpageImp();
    }

    @Override
    public void renderPage(String url) throws Exception{
        if (url.equalsIgnoreCase("www.youtube.com")){
            System.out.printf("Pagina: " + url +" ha sido bloqueda por el ISP");
            JOptionPane.showMessageDialog(null, "Pagina: " + url +" ha sido bloqueda por el ISP", "Error", JOptionPane.ERROR_MESSAGE);

            throw new Exception ();
        }
        else {
            webpage.renderPage(url);
        }
    }



}
