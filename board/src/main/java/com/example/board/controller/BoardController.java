package com.example.board.controller;

        import com.example.board.dto.BoardDto;
        import com.example.board.service.BoardService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;

        import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/board/boardList")
    public ModelAndView openBoardList() throws Exception { // selectBoarList() 예외 오류나서 예외 던지는 부분 추가함.
        ModelAndView mv = new ModelAndView("/board/boardList");   //view를 설정해준다.
        List<BoardDto> list = boardService.selectBoardList();  //service를 이용하여 게시판 목록을 데이터베이스에서 조회한다.
        mv.addObject("list",list);                                //설정한 뷰로 넘겨줄 데이터를 추가

        return mv;
    }

}