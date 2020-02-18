package pl.pragmaticdevs.service.bar.impl;

import org.springframework.web.bind.annotation.RestController;
import pl.pragmaticdevs.service.bar.api.Bar;
import pl.pragmaticdevs.service.bar.api.BarService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
public class BarServiceImpl implements BarService {
    @Override
    public List<Bar> getAll() {
        return Arrays.asList(new Bar("bar1", LocalDate.now()), new Bar("bar2", LocalDate.now()));
    }
}
