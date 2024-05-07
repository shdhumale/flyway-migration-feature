package com.siddhu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddhu.model.TableData;
import com.siddhu.repository.SiddhuRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/1.0/tabledata")
@RequiredArgsConstructor
public class SiddhuController {
	 
    private final SiddhuRepository siddhuRepository;

	 @Autowired
	    public SiddhuController(SiddhuRepository siddhuRepository) {
	        this.siddhuRepository = siddhuRepository;
	    }

    @GetMapping()
    public List<TableData> getTableData() {
    	ArrayList<TableData> myArrayList = new ArrayList<>();
        myArrayList.addAll(siddhuRepository.findAll());

        return myArrayList;
    }

}