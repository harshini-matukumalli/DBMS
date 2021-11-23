package com.rest.implementations;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerListController {

    private final PlayerListRepository playerListRepository;

    public PlayerListController(PlayerListRepository playerListRepository) {
        this.playerListRepository = playerListRepository;
    }

    @GetMapping("/playerStats")
    public List<PlayerList> getPlayerList(){
        return (List<PlayerList>) playerListRepository.findAll();
    }

    @PostMapping("/playerStats")
    void addPlayerList(@RequestBody PlayerList playerList){
        playerListRepository.save(playerList);
    }

}
