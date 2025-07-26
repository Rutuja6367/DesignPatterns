package com.example.apiprac.Controller;

import com.example.apiprac.Model.Assignment;
import com.example.apiprac.Service.AssignmentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class AssignController {
    private AssignmentService assignmentService;
    public AssignController() {
        assignmentService = new AssignmentService();
    }
    //getAssignbyID
    @GetMapping("/getById/{id}")
    public Assignment getById(@PathVariable int id){
        assignmentService = new AssignmentService();
        Assignment assignment = assignmentService.getAssignmentById(id);
        return assignment;
    }
    @GetMapping("/getAll")
    public List<Assignment> getAll(){
        return assignmentService.getAll();
    }

    //CreateAssign
    @PostMapping("/create")
    public Assignment create(@RequestBody Assignment assignment){
        assignmentService.createAssignment(assignment);
        return assignment;
    }
    //UpdateAssign
    @PutMapping("/update/{id}")
    public Assignment update(@PathVariable int id, @RequestBody Assignment assignment){
        Assignment update = assignmentService.getAssignmentById(id);
        update.setName(assignment.getName());
        return assignment;
    }
    @DeleteMapping("/delete/{id}")
    public String  delete(@PathVariable int id) {
        if (assignmentService.deleteAssignmentById(id))
        {
            return "Deleted!";
    }else{
        return null;
    }
}
}
