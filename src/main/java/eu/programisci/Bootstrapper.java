package eu.programisci;

import eu.programisci.Test.user.dto.UserDTO;
import eu.programisci.Test.user.service.IUserService;
import eu.programisci.app.kontrahent.dto.KontrahentDTO;
import eu.programisci.app.kontrahent.service.IKontrahentService;
import eu.programisci.app.towar.dto.EJednostkaMiary;
import eu.programisci.app.towar.dto.TowarDTO;
import eu.programisci.app.towar.service.ITowarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Bootstrapper implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private IUserService userService;

    @Autowired
    private IKontrahentService kontrahentService;

    @Autowired
    private ITowarService towarService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("Tutaj wykonuje sie import danych");

        userService.save(new UserDTO("Jan", "Kowalski", "j.kowalski", "tajneHaslo123", "j.kowalski@wp.pl"));
        userService.save(new UserDTO("Adam", "Nowak", "a.nowak", "tajneHaslo123", "a.nowak@wp.pl"));
        userService.save(new UserDTO("Stefan", "Batory", "s.batory", "tajneHaslo123", "s.batory@wp.pl"));
        userService.save(new UserDTO("Anna", "Kowalska", "a.kowalska", "tajneHaslo123", "a.kowalska@wp.pl"));
        userService.save(new UserDTO("Zenon", "Zenon", "z.zenon", "tajneHaslo123", "z.zenon@wp.pl"));
        userService.save(new UserDTO("Krzysztof", "Nazwisko", "k.nazwisko", "tajneHaslo123", "k.nazwisko@wp.pl"));

        kontrahentService.save(new KontrahentDTO("Rames", "Warszawa", "15936521458"));
        kontrahentService.save(new KontrahentDTO("Ortos", "Kraków", "9632158912"));
        kontrahentService.save(new KontrahentDTO("Barnabos", "Olsztyn", "65478113"));
        kontrahentService.save(new KontrahentDTO("Kerto", "Gdynia", "121544846513"));

        towarService.save(new TowarDTO("Portolo", "01", EJednostkaMiary.KILOGRAM, 18, 22.30));
        towarService.save(new TowarDTO("Ortega", "01.02", EJednostkaMiary.LITR, 32, 90.45));
        towarService.save(new TowarDTO("Lobos", "01.02.03", EJednostkaMiary.METR_BIEZACY, 12, 12.99));
        towarService.save(new TowarDTO("Kerno", "01.02.01", EJednostkaMiary.METR_KWADRATOWY, 40, 45.45));
        towarService.save(new TowarDTO("Falas", "01.03.01", EJednostkaMiary.SZTUKA, 11, 89.99));
    }
}
