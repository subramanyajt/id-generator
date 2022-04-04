package com.target.interview.core.repository;

import com.target.interview.api.RetailIdentifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GlobalIdentifierRepository {
    private Map<String, RetailIdentifier> retailIdentifierMap = new HashMap<>();


    public RetailIdentifier findById(String id) {
        if (retailIdentifierMap.containsKey(id)) {
            return retailIdentifierMap.get(id);
        }
        return null;
    }

    public void save(RetailIdentifier retailIdentifier) {
        retailIdentifierMap.put(retailIdentifier.getId(), retailIdentifier);
    }

    public void update(String id, RetailIdentifier retailIdentifier) {
        retailIdentifierMap.put(id, retailIdentifier);
    }
}
