package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCardDto;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.service.TrelloService;
import com.crud.tasks.trello.facade.TrelloFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/trello")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TrelloController {

    private final TrelloFacade trelloFacade;
    @GetMapping("boards")
    public ResponseEntity<List<TrelloBoardDto>> getTrelloBoards() {
        return ResponseEntity.ok(trelloFacade.fetchTrelloBoards());
    }
    @PostMapping("cards")
    public ResponseEntity<CreatedTrelloCardDto> createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return ResponseEntity.ok(trelloFacade.createCard(trelloCardDto));
    }
}



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

//    private final TrelloService trelloService;    potrzebne przed Modulem 29
//
//    @GetMapping("boards")
//    public ResponseEntity<List<TrelloBoardDto>> getTrelloBoards() {
//        return ResponseEntity.ok(trelloService.fetchTrelloBoards());
//    }
//
//    @PostMapping("cards")
//    public ResponseEntity<CreatedTrelloCardDto> createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
//        return ResponseEntity.ok(trelloService.createTrelloCard(trelloCardDto));
//    }




