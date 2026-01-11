package org.springboot.boot4.controller;

import lombok.RequiredArgsConstructor;
import org.springboot.boot4.config.api.HitokotoClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * @author jhlz
 * @version x.x.x
 */
@RestController
// @RequestMapping("/api/{version}")
@RequestMapping("/{version}/api")
@RequiredArgsConstructor
public class WebController {

    private final HitokotoClient hitokotoClient;

    record Person(
            Integer id,
            String name,
            int age,
            LocalDateTime bir) {
    }

    private final List<Person> persons = List.of(
            new Person(1, "李逍遥", 18, LocalDateTime.now()),
            new Person(2, "赵灵儿", 16, LocalDateTime.now())
    );

    @GetMapping(value = "/hello", version = "1.0")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello spring boot4!");
    }

    @GetMapping(value = "/user/{id}", version = "2.0")
    public ResponseEntity<Person> user(@PathVariable Integer id) {
        return ResponseEntity.ok(persons.stream()
                .filter(p -> Objects.equals(id, p.id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("not found person id is " + id)));
    }

    @GetMapping(value = "/hitokoto", version = "2.0")
    public ResponseEntity<String> hitokoto() {
        return ResponseEntity.ok(hitokotoClient.test());
    }
}
