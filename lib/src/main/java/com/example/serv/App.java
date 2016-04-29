package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyANiye1iGbbW4p1IVJHXz3lnq6_asOD9nM";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bGO6iwXNcbVzy9BRrAapG4IPNvUQBT5lWB5_iBzBjYXWoG3XD_oBLpj1BO1yGRw_Abh6BSozOAnYkDxHrOfepeMFOdgqiX45F-jKqa6OSJAq6VjlTS1j9u7UonzDHi7RLF9v49p");

        c.createData("Working!!", "Test message");

        return c;
    }
}

