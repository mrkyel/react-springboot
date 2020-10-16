package com.mrkyel.example.controller;

import com.mrkyel.example.VO.BoardVO;
import com.mrkyel.example.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BoardController {

    @Autowired
    BoardMapper boardMapper;

    @GetMapping("/v1/board")
    public List<BoardVO> getBoards() {
        return boardMapper.getBoards();
    }

    @GetMapping("/v1/board/{board_id}")
    public BoardVO getBoardsDt(@PathVariable int board_id) { return  boardMapper.getBoardsDt(board_id) ;}

    @PostMapping("/v1/board/save/{board_id}")
    public int saveBoard(@PathVariable int board_id, @RequestBody BoardVO saveParamObj)
    {
        System.out.println("=========================");
        System.out.println(saveParamObj);
        BoardVO saveObj = saveParamObj;
        return  boardMapper.saveBoard(saveObj);
    }
}
