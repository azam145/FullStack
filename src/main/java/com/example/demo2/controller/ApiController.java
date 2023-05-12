package com.example.demo2.controller;

import com.example.demo2.dto.Bookdto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class ApiController {

    @GetMapping
    public ResponseEntity<List<Bookdto>> getBook(String name) {
        Bookdto book = Bookdto.builder()
                .name("somebook")
                .build();
        List<Bookdto> lst = new ArrayList<>();
        lst.add(book);
        return ResponseEntity.ok(lst);
    }

}
