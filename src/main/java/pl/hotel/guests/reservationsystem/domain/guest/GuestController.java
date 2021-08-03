package pl.hotel.guests.reservationsystem.domain.guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://127.0.0.1:5500")
public class GuestController {

    @Autowired
    GuestService guestService;



    @GetMapping("guests")
    public List<Guest> getAllGuests(){
        return guestService.getAll();
    }

    @GetMapping("/guests/{id}")
    public Guest getGuest(@PathVariable Long id){
        return guestService.getGuestById(id);
    }

    //POST
    @PostMapping("/guests")
    public void createGuest(@RequestBody Guest guest){
        guestService.createNewGuest(guest);
    }

    //DELETE
    @DeleteMapping("/guests/{id}")
    public void deleteGuest(@PathVariable Long id){
        guestService.remove(id);
    }

    //PUT
    @PutMapping("/guests/{id}")
    public void updateGuest(@PathVariable Long id, @RequestBody Guest guest){
        this.guestService.updateGuest(id, guest);
    }
}
