package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<BoardDto> selectBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }
}
