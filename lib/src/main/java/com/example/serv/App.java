package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyD1qSkCSjSI4BJo7jEtkTsmiNnUOHMCQIM";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bG6eLikb70OLvOCwf7pha4kjYZ9wL7C83psb3ZfsIhQuclK6o2kdPJgBnn4GJOKUT_mrcqMy_N1AqoUP1ddB8mpOpyjb6Pqqbg6z4SfWHpxhraPGew9U8aoRYN2r5SvhR3UWEEy");

        c.createData("Working!!", "Test message");

        return c;
    }
}

