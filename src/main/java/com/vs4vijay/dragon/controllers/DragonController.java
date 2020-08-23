package com.vs4vijay.dragon.controllers;

import com.vs4vijay.dragon.repositories.DragonRepository;
import com.vs4vijay.dragon.models.Dragon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
class DragonController {

    @Autowired
    private DragonRepository dragonRepository;

    @GetMapping("/dragons")
    public List<Dragon> getAll() {
        return dragonRepository.findAll();
    }

    @PostMapping("/dragons")
    public Dragon createDragon(@RequestBody Dragon dragon) {
        Dragon savedDragon = dragonRepository.save(dragon);

        return savedDragon;
    }

}