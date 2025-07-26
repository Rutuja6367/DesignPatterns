package com.example.apiprac.Service;

import com.example.apiprac.Model.Assignment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentService {
    List<Assignment> assignments;

    public AssignmentService(){
        assignments = new ArrayList<>();
        assignments.add(new Assignment("Assignment 1",1));
    }
    public Assignment getAssignmentById(int id){
        for(Assignment ass : assignments){
            if(ass.getId() == id){
                return ass;
            }
        }
        return null;
    }
    public List<Assignment> getAll(){
        return assignments;
    }
    public Assignment createAssignment(Assignment assignment){
        assignments.add(assignment);
        return assignment;
    }
    public boolean deleteAssignmentById(int id){
        if(assignments.remove(getAssignmentById(id))){
            return true;
        }else{
            return false;
        }
    }
}
