package pac.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import pac.data.Invoice;

import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class InvoiceControllerIT {

	@Autowired
	private TestRestTemplate template;

	
	@Test
	public void testGetAll() throws MalformedURLException {
		URL url = new URL("http://localhost:8080/idea");
		ResponseEntity<List> response = template.getForEntity(url.toString(), List.class);
		
		List list = response.getBody();
		LinkedHashMap map = (LinkedHashMap) list.get(0);
		
		assertEquals(map.get("id"), 1); 
	}
	
}
