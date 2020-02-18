package pl.pragmaticdevs.service.bar.api;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Bar {
    private final String value;
    private final LocalDate date;
}
