package vibze.site.vibze.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vibze.site.vibze.entity.Person;
import vibze.site.vibze.repository.PersonRepo;

@RestController
@RequestMapping("/api/v1")
public class Hello {

    @Autowired
    private PersonRepo repo;

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello!");
    }

    @PostMapping("/add/user")
    public ResponseEntity<Boolean> addUser(@RequestBody Person person){
        try{
            repo.save(person);
            return ResponseEntity.ok(true);
        }
        catch(Exception e)
        {
            throw new RuntimeException("Error Creating User");
        }
    }
}
