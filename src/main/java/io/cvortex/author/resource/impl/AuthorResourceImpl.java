package io.cvortex.author.resource.impl;

import io.cvortex.author.model.Author;
import io.cvortex.author.resource.AuthorResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class AuthorResourceImpl implements AuthorResource {

    @Override
    public Author findById(String id) {
        return Author.builder()
                .id(UUID.randomUUID().toString())
                .name("Jose da Silva")
                .build();
    }
}
