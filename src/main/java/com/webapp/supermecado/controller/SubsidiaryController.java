package com.webapp.supermecado.controller;

import com.webapp.supermecado.Service.ISubsidiaryService;
import com.webapp.supermecado.model.Subsidiary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubsidiaryController {
    @Autowired
    private ISubsidiaryService service;
    @GetMapping("api/subsidiary/{id}")
    public ResponseEntity<String> getSubsidiary(@PathVariable Long id){
        Subsidiary ss = service.getSubsidiary(id);
        if(ss == null){
            return ResponseEntity.status(404).body("Not found");
        }
        return  ResponseEntity.status(200).body("Subsidiary founded"+ss.getId_subsidiary()+" "+ss.getAddress());
    }
    @GetMapping("api/subsidiary")
    public ResponseEntity<String> getSubsidiaries(){
        List<Subsidiary> res = service.getSubsidiaries();
        if(res.isEmpty()){
            return ResponseEntity.status(404).body("Not found");
        }
        return ResponseEntity.status(200).body("Subsidiaries founded: "+res.size());
    }
    @PostMapping("api/subsidiary")
    public ResponseEntity<String> postSubsidiary(@RequestBody Subsidiary subsidiary){
        Subsidiary sub = service.postSubsidiary(subsidiary);
        return ResponseEntity.status(201).body("Subsidiary created: "+sub.getId_subsidiary());
    }
    @DeleteMapping("api/subsidiary/{id}")
    public ResponseEntity<String> deleteSubsidiary(@PathVariable Long id){
        Subsidiary res = service.getSubsidiary(id);
        if(res != null){
            service.deleteSubsidiary(id);
            return ResponseEntity.status(200).body("Deleted: "+res.getId_subsidiary());
        }
        return ResponseEntity.status(404).body("Not found");
    }
    @PutMapping("api/subsidiary")
    public ResponseEntity<String> putSubsidiary(@RequestBody Subsidiary sub){
        Subsidiary res = service.putSubsidiary(sub);
        return ResponseEntity.status(200).body("Subsidiary modified: "+res);
    }
}
