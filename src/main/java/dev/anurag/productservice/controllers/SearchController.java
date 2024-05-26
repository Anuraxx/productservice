package dev.anurag.productservice.controllers;

import dev.anurag.productservice.dtos.GenericProductDto;
import dev.anurag.productservice.dtos.SearchRequestDto;
import dev.anurag.productservice.services.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping
    public Page<GenericProductDto> search(@RequestBody SearchRequestDto searchRequestDto) {
        return searchService.search(searchRequestDto.getQuery(),
                searchRequestDto.getPageSize(),
                searchRequestDto.getPageNumber());
    }
}
