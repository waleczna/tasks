package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrelloMapperTest {

    @Test
    void testMapToBoards() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloListDto> lists = List.of(new TrelloListDto("id", "list", false));
        List<TrelloBoardDto> trelloBoardDtos = List.of(new TrelloBoardDto("abc", "name", lists));
        //When
        List<TrelloBoard> result = trelloMapper.mapToBoards(trelloBoardDtos);
        //Then
        assertEquals("abc", result.get(0).getId());
        assertEquals("name", result.get(0).getName());
        assertEquals("id", result.get(0).getLists().get(0).getId());
        assertEquals("list", result.get(0).getLists().get(0).getName());
        assertEquals(false, result.get(0).getLists().get(0).isClosed());
    }

    @Test
    void testMapToBoardsDto() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloList> lists = List.of(new TrelloList("id", "list", false));
        List<TrelloBoard> trelloBoards = List.of(new TrelloBoard("abc", "name", lists));
        //When
        List<TrelloBoardDto> result = trelloMapper.mapToBoardsDto(trelloBoards);
        //Then
        assertEquals("abc", result.get(0).getId());
        assertEquals("name", result.get(0).getName());
        assertEquals("id", result.get(0).getLists().get(0).getId());
        assertEquals("list", result.get(0).getLists().get(0).getName());
        assertEquals(false, result.get(0).getLists().get(0).isClosed());
    }

    @Test
    void testMapToList() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloListDto> trelloListDtos = List.of(new TrelloListDto("id", "list", false));
        //When
        List<TrelloList> result = trelloMapper.mapToList(trelloListDtos);
        //Then
        assertEquals("id", result.get(0).getId());
        assertEquals("list", result.get(0).getName());
        assertEquals(false, result.get(0).isClosed());
    }

    @Test
    void testMapToListDto() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        List<TrelloList> trelloLists = List.of(new TrelloList("id", "list", false));
        //When
        List<TrelloListDto> result = trelloMapper.mapToListDto(trelloLists);
        //Then
        assertEquals("id", result.get(0).getId());
        assertEquals("list", result.get(0).getName());
        assertEquals(false, result.get(0).isClosed());
    }

    @Test
    void testMapToCardDto() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        //When
        TrelloCard trelloCards = new TrelloCard("nameCard", "descriptionCard", "posCard", "listIdCard");
        trelloMapper.mapToCardDto(trelloCards);
        //Then
        assertEquals("nameCard", trelloCards.getName());
        assertEquals("descriptionCard", trelloCards.getDescription());
        assertEquals("posCard", trelloCards.getPos());
        assertEquals("listIdCard", trelloCards.getListId());
    }

    @Test
    void testMapToCard() {
        //Given
        TrelloMapper trelloMapper = new TrelloMapper();
        //When
        TrelloCardDto trelloCardsDto = new TrelloCardDto("nameCard", "descriptionCard", "posCard", "listIdCard");
        trelloMapper.mapToCard(trelloCardsDto);
        //Then
        assertEquals("nameCard", trelloCardsDto.getName());
        assertEquals("descriptionCard", trelloCardsDto.getDescription());
        assertEquals("posCard", trelloCardsDto.getPos());
        assertEquals("listIdCard", trelloCardsDto.getListId());
    }
}