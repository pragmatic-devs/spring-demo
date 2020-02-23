package pl.pragmaticdevs.service.foo.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pragmaticdevs.service.foo.api.Foo;
import pl.pragmaticdevs.service.foo.api.FooService;

@RestController
@Slf4j
public class FooServiceImpl implements FooService {
    @Override
    public Foo getById(@PathVariable String id) {
        log.info("Foo.getById:" + id);
        return new Foo(id, "foo" + id);
    }
}
