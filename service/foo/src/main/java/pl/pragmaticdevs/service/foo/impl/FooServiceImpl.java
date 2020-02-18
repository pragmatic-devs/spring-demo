package pl.pragmaticdevs.service.foo.impl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.pragmaticdevs.service.foo.api.Foo;
import pl.pragmaticdevs.service.foo.api.FooService;

@RestController
public class FooServiceImpl implements FooService {
    @Override
    public Foo getById(@PathVariable String id) {
        return new Foo(id, "foo" + id);
    }
}
