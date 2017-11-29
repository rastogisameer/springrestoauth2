package demo1.invoice;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class InvoiceControllerTest {

	private InvoiceRepository invoiceRepository = mock(InvoiceRepository.class);	
	private InvoiceController InvoiceController = new InvoiceController(invoiceRepository);
	
	@Test
	public void testGetAll() throws Exception {
		
		List<Invoice> list = new ArrayList<Invoice>();
		list.add(new Invoice(1, 100, "Sameer"));
		list.add(new Invoice(2, 200, "Ramit"));
		
		when(invoiceRepository.getAll()).thenReturn(list);
		
		assertTrue(InvoiceController.getAll().size() == 2);
	}
}
