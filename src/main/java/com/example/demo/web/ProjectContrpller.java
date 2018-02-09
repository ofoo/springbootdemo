package com.example.demo.web;

import com.example.demo.domain.Project;
import com.example.demo.service.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by uu on 2018/2/9.
 */
@RestController
public class ProjectContrpller {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping("/s1")
    public Project save(String name){
        Project project = new Project();
        project.setName(name);
        return projectRepository.save(project);
    }

    @GetMapping("/q1")
    public List<Project> q1(String name){
        return projectRepository.findByName(name);
    }
}
