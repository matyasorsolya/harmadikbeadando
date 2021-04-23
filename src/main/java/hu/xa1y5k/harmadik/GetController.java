package hu.xa1y5k.harmadik;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GetController
{
    @ResponseBody
    @GetMapping(path = "/harmadik")
    public String getMessage(@RequestParam(value = "name", defaultValue = "Felhasznalo") String name)
    {
        return String.format("hello %s", name);
    }



}
