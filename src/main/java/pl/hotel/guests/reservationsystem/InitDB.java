package pl.hotel.guests.reservationsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.hotel.guests.reservationsystem.domain.guest.GuestService;

@Component
public class InitDB implements CommandLineRunner {

    @Autowired
    GuestService guestService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("INIT GUEST DATABASE");
        guestService.createNewGuest("Micky", "Kaps", 26);

        System.out.println("CURRENT GUEST COUNT "+guestService.getAll().size());

    }
}
