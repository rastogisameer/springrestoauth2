package demo1.invoice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/idea")
public class InvoiceController {
	
	private InvoiceRepository repository;
	
	public InvoiceController(InvoiceRepository repository) {
		this.repository = repository;
	}
	@GetMapping("/idea")
	public List<Invoice> getAll(){
		
		return repository.getAll();
	}

}
