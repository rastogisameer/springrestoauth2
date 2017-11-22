package pac.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepository {
	
	public List<Invoice> getAll(){
			
		List<Invoice> list = new ArrayList<Invoice>();
		list.add(new Invoice(1, 100, "Sameer"));
		list.add(new Invoice(2, 200, "Ramit"));
		
		return list;
	}

}
