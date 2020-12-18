package io.cvortex.author.resource;

import io.cvortex.author.model.Author;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/authors", produces = MediaType.APPLICATION_JSON_VALUE)
public interface AuthorResource {

    @GetMapping("/{id}")
    Author findById(@PathVariable("id") final String id);
}
