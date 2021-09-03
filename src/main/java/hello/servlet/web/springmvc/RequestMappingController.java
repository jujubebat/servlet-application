package hello.servlet.web.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestMappingController {

    @RequestMapping(value = "/springmvc/request-mapping-controller", method = RequestMethod.GET)
    @ResponseBody
    public String get() {
        System.out.println("RequestMappingController.get");
        return "hello!";
    }

}
