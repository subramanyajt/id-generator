package com.target.interview.core;

import com.target.interview.api.RetailIdentifier;
import com.target.interview.core.service.GlobalIdentifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdManager {

    @Autowired
    private GlobalIdentifierService globalIdentifierService;

    public RetailIdentifier getIdentifier(String id){
        return globalIdentifierService.getIdentifier(id);
    }

    public Boolean saveIdentifier(RetailIdentifier retailIdentifier) {
        return globalIdentifierService.createIdentifier(retailIdentifier);
    }

    public void updateIdentifier() {
        //return globalIdentifierService.updateIdentifier()
    }
}
