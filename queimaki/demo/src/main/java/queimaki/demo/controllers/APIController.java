/*package queimaki.demo.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/")
    public ResponseEntity<Resource> index(){
        tyr{
            Resource resource = new ClassPathResource("static/index.html");
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.TEXT_HTML)
            return new ResponseEntity<>(resource, headers, HttpStatus,)
        }
    }
    
}
*/