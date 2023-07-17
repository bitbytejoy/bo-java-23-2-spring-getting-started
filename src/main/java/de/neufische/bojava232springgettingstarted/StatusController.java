package de.neufische.bojava232springgettingstarted;

import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {
    @GetMapping("/status")
    public Status getStatus() {
        return new Status("The server is up and running!");
    }
}
