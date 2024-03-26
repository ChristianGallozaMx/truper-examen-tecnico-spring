package truper.demo.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;
import truper.demo.entity.Client;
import truper.demo.entity.PurchaseItem;

@Data
public class PurchaseForm {
	
	private Client client;
	private List<PurchaseItem> items;
	private Date registered;
	private Date updated;
	private boolean active;
}
