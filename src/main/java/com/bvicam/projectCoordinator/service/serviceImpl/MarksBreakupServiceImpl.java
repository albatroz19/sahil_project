package com.bvicam.projectCoordinator.service.serviceImpl;

import com.bvicam.projectCoordinator.dto.MessageDTO;
import com.bvicam.projectCoordinator.entity.MarksBreakup;
import com.bvicam.projectCoordinator.repository.MarksBreakupRepository;
import com.bvicam.projectCoordinator.service.MarksBreakupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksBreakupServiceImpl implements MarksBreakupService {
    @Autowired
    MarksBreakupRepository marksBreakupRepository;

    @Override
    public MessageDTO addMarksBreakup(MarksBreakup marksBreakup){
        marksBreakupRepository.save(marksBreakup);
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessage("Marks are added.");
        return messageDTO;
    }

    @Override
    public List<MarksBreakup> showMarksBreakup(){
        List<MarksBreakup> marksBreakups = marksBreakupRepository.findAll();
        return marksBreakups;
    }
}
