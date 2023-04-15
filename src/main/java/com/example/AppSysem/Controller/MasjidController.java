package com.example.AppSysem.Controller;

import com.example.AppSysem.Entity.Application;
import com.example.AppSysem.Entity.Massjid_build;
import com.example.AppSysem.Repository.ApplicationRepository;
import com.example.AppSysem.Services.MasjidBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/masjid")
public class MasjidController {

    @Autowired
    public MasjidBuildService masjidBuildService;

    @PostMapping("/add")
    public Massjid_build addMasjid(@RequestBody Massjid_build massjid_build){
        return this.masjidBuildService.addMasjid(massjid_build);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Massjid_build>> getAllMasjid(){
        List<Massjid_build> masjid = masjidBuildService.getAllMasjid();
        return new  ResponseEntity<>(masjid, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity <Massjid_build> getAllMasjidById(@PathVariable("id") Integer id){
        Massjid_build masjid = masjidBuildService.findMasjidById(id);
        return new  ResponseEntity<>(masjid, HttpStatus.OK);
    }
    @PutMapping("/update")
    public Massjid_build updateMasjid(@RequestBody Massjid_build massjid_build){
       return this.masjidBuildService.updateMasjid(massjid_build);
    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public void deleteMasjid(@PathVariable Integer id){
         this.masjidBuildService.deleteMasjid(id);
    }

}
