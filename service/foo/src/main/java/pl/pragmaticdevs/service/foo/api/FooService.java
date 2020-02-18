package pl.pragmaticdevs.service.foo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/foo")
public interface FooService {
    @GetMapping("/{id}")
    Foo getById(@PathVariable String id);
}
