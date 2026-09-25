package pa.gob.dntic.tareas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TareasApplication {
    public static void main(String[] a){ SpringApplication.run(TareasApplication.class,a); }
    @GetMapping("/tareas") public List<String> tareas(){ return List.of("comprar pan","llamar a mama","desplegar ARKA"); }
}
