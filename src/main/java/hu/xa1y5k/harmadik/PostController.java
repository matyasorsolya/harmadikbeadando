package hu.xa1y5k.harmadik;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController
{
    @PostMapping(path = "/post")
    public ForditoGep postBody(@RequestBody(required = false) String text) {


        ForditoGep fg = new ForditoGep("Alma a fa alatt");


        if (text != null) {
            fg.setBemenet(text);
        }

        fg.forditas();
        return fg;
    }

}
