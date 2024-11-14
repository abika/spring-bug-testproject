package testproject;

import static java.util.Collections.emptyList;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataBoundary {
    @GetMapping("/data")
    public List<String> getData() {
        return emptyList();
    }

    @PutMapping("/data/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }
}
