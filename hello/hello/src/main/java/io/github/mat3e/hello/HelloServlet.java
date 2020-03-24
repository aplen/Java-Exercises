package io.github.mat3e.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloServlet {
    private final Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    private static final String NAME_PARAM = "name";
    private static final String LANG_PARAM = "lang";
    private final HelloService service;


    HelloServlet(final HelloService service) {
        this.service = service;
    }
    @GetMapping("/api")
    String Welcome(){
        return welcome(null, null);
    }
@GetMapping(value = "/api", params = {"lang", "name"})
String welcome(@RequestParam("lang") Integer langId, @RequestParam String name){
        logger.info("Request got");

    return service.prepareGreeting(name, langId);

}

}









