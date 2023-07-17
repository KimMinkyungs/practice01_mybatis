package com.example.board.mapper;

import com.example.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  //Mapper 인터페이스 선언
public interface BoardMapper {

    List<BoardDto> selectBoardList() throws Exception;
}