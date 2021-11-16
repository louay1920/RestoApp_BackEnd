package com.example.demo.endpoints;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.TicketReponse;
import com.example.demo.Dto.TicketRequest;
import com.example.demo.services.TicketService;


@RestController
@RequestMapping(("/api/tickets"))
public class TicketRest {
	
	private TicketService service;
	
	public TicketRest(TicketService service) {
		
		super();
		this.service=service;
		
	}
	
	@PostMapping
	public TicketReponse createTicket(@RequestBody TicketRequest ticket) {
	return service.createTicketEntity(ticket);
    }
	
	@GetMapping
	public List<TicketReponse> getAll()
	{
		return service.getAllTicketEntities();
	}
	@GetMapping("/{numero}")
	public TicketReponse getTicketById(@PathVariable("numero")int numero)
	{
		return service.getTicketEntityById(numero);
	}
	
	@PutMapping("/{numero}")
	public TicketReponse modifyTicket(@PathVariable("numero")int numero,@RequestBody TicketRequest newTicket)
	{
		return service.modifyTicketEntity(numero, newTicket);
	}
	
	@DeleteMapping("/{id}")
	public TicketReponse deleteTicketById(@PathVariable("id")int id)
	{
		return service.deleteTicketEntityById(id);
	}
	
	
	@GetMapping("/revenue/{dateBegin}/{dateEnd}")
    public float getRevenuParPeriode(@PathVariable("dateBegin") String dBegin,@PathVariable("dateEnd") String dEnd) {
        LocalDate dateBegin = LocalDate.parse(dBegin);
        LocalDate dateEnd = LocalDate.parse(dEnd);
        return service.getRevenuParPeriode(dateBegin, dateEnd);
       
    }
	
	@GetMapping("/revenueMois/{mois}")
	public float getRevenueParMois(@PathVariable("mois") String mois)
	{
		return service.revenuParMois(mois);
	}
	
	
	/*@GetMapping("/revenueParJour/{jour}")
	public float RevenueparJour(@PathVariable("jour") String jour)
	{
		return service.getRevenueparJour(jour);
	}*/
	
	
	@GetMapping("/revenueParJour/{date}")
	public float RevenueparJour(@PathVariable("date") String date)
	{
		return service.getRevenueparJour(date);
	}
}
