package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
# import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class Application {

	@RequestMapping(value = "/", method = {RequestMethod.GET})
	public String home() {
		return "Hello Docker World";
	}

#	@RequestMapping(value = "/service1", method = {RequestMethod.GET})
#	public String getServiceAPI() {
#		return "{ type: service1, method: GET }";
#   }

#	@RequestMapping(value = "/service1", method = {RequestMethod.POST}, params = {"id", "name"})
#	public String saveServiceAPI(@RequestParam("id") int paramId, @RequestParam("name") String paramName) {
#		return "{ type: service1, method: POST, id:" + paramId + "name:" + paramName + " } " ;
#   }

#	@RequestMapping(value = "/service1", method = {RequestMethod.PUT}, params = {"id"})
#	public String editServiceAPI(@RequestParam("id") int paramId) {
#		return "{ type: service1, method: PUT, id:" + paramId + " } " ;
#   }

#	@RequestMapping(value = "/service1", method = {RequestMethod.DELETE}, params = {"id"})
#	public String delServiceAPI(@RequestParam("id") int paramId) {
#		return "{ type: service1, method: DELETE, id:" + paramId + " } " ;
#   }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
