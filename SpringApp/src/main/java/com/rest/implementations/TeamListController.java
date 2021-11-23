package com.rest.implementations;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeamListController {

    private final TeamListRepository teamListRepository;

    public TeamListController(TeamListRepository teamListRepository) {
        this.teamListRepository = teamListRepository;
    }

    @RequestMapping(
            value = "/teamStats",
            method = GET,
            headers = "Accept=application/json")
    @ResponseBody
    public JSONArray getTeamList(){
        return (List<TeamList>) teamListRepository.findAll();
    }

    @PostMapping("/teamStats")
    void addTeamList(@RequestBody TeamList teamList){
        teamListRepository.save(teamList);
    }
}
