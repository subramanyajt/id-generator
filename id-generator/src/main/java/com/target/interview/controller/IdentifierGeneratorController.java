package com.target.interview.controller;

import com.target.interview.api.RetailIdentifier;
import com.target.interview.core.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IdentifierGeneratorController {

    @Autowired
    private IdManager idManager;

    @GetMapping("/id/{id}")
    public String getRetailIdentifier(@PathVariable String id) {
        return String.format("Details for Id: %s", id);
    }

    @PostMapping("/id")
    public String createRetailIdentifier(@RequestBody RetailIdentifier id) {
        // TODO: Complete code to get details
        return String.format("Details for Id: %s", id);
    }

    public void updateRetailIdentifier() {
        // TODO: Create API to Update Retail Identifier.
    }
}
