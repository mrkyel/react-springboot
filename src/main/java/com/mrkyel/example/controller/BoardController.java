package com.mrkyel.example.controller;

import com.mrkyel.example.VO.BoardVO;
import com.mrkyel.example.mapper.BoardMapper;
import com.mrkyel.example.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BoardController {

//    @Autowired
//    BoardMapper boardMapper;

    @Autowired
    BoardService boardService;

    @GetMapping("/v1/board")
    public List<BoardVO> getBoards() {
        return boardService.getBoards();
    }

    @GetMapping("/v1/board/{board_id}")
    public BoardVO getBoardsDt(@PathVariable int board_id) { return  boardService.getBoardsDt(board_id) ;}

    //글 수정
    @PostMapping("/v1/board/save/")
    public int saveBoard(@RequestBody BoardVO saveParamObj)
    {
        BoardVO saveObj = saveParamObj;
        return  boardService.saveBoard(saveObj);
    }

    @DeleteMapping("/v1/board/delete/{board_id}")
    public int deleteBoard(@PathVariable int board_id) {
        return boardService.deleteBoard(board_id);
    }

    //글쓰기
    @PostMapping("/v1/board/insert/")
    public int insertBoard(@RequestBody BoardVO saveParamObj)
    {
        BoardVO saveObj = saveParamObj;
        return  boardService.insertBoard(saveObj);
    }
}
