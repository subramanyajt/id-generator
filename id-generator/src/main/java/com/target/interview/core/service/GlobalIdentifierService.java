package com.target.interview.core.service;

import com.target.interview.api.RetailIdentifier;
import com.target.interview.core.repository.GlobalIdentifierRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GlobalIdentifierService {

    @Autowired
    private GlobalIdentifierRepository globalIdentifierRepository;

    public RetailIdentifier getIdentifier(String id) {
        RetailIdentifier retailIdentifier = globalIdentifierRepository.findById(id);
        log.info("Found identifier for id: {}, identifier: {}", id, retailIdentifier);
        return retailIdentifier;
    }

    public Boolean createIdentifier(RetailIdentifier retailIdentifier) {
        globalIdentifierRepository.save(retailIdentifier);
        log.info("Saved identifier :{}", retailIdentifier);
        return true;
    }

    public Boolean updateIdentifier() {
        // globalIdentifierRepository.update();
        // log.info("Updated identifer, identifier: {}");
        return true;
    }
}
