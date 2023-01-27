package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.TrelloService;
import com.crud.tasks.trello.client.TrelloClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrelloController {

//    private final TrelloClient trelloClient;         potrzebne przed Modulem 23
//
//    @GetMapping("boards")
//    public ResponseEntity<List<TrelloBoardDto>> getTrelloBoards() {
//        return ResponseEntity.ok(trelloClient.getTrelloBoards());
//    }
//
//    @PostMapping("cards")
//    public ResponseEntity<CreatedTrelloCard> createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
//        return ResponseEntity.ok(trelloClient.createNewCard(trelloCardDto));
//    }
//


    private final TrelloService trelloService;

    @GetMapping("boards")
    public ResponseEntity<List<TrelloBoardDto>> getTrelloBoards() {
        return ResponseEntity.ok(trelloService.fetchTrelloBoards());
    }

    @PostMapping("cards")
    public ResponseEntity<CreatedTrelloCard> createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return ResponseEntity.ok(trelloService.createTrelloCard(trelloCardDto));
    }
}



