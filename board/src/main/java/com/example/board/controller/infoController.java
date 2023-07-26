package com.example.board.controller;


import com.example.board.dto.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController
public class infoController {

    @GetMapping("/info")
    public Object getBoardInfo(){
//     ModelAndView mv = new ModelAndView("/board/dataGrid");
//     BoardDto boardDto = new BoardDto();
//     boardDto.setBbsContent("hello");
//     boardDto.setUserID("bryan");
//     mv.addObject(boardDto);
//
//       System.out.println("boardDto = " + boardDto);
//     return mv;
        BoardDto boardDto = new BoardDto();
        boardDto.setBbsID(1);
        boardDto.setBbsTitle("title");
        boardDto.setUserID("bryan");
        boardDto.setBbsContent("hello");
        boardDto.setBbsAvailable(1);
        boardDto.setBbsDate("2023");
        boardDto.setFileName("1");
        boardDto.setFileRealName("1");
        return boardDto;



//        return boardDto;
    }


}
