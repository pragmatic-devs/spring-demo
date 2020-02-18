package pl.pragmaticdevs.service.bar.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/v1/bar")
public interface BarService {
    @GetMapping("/")
    List<Bar> getAll();
}