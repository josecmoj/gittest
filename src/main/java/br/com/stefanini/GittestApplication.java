package br.com.stefanini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class GittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GittestApplication.class, args);
	}

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Hello Gitttest!";
    }

}
