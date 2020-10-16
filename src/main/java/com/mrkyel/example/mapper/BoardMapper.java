package com.mrkyel.example.mapper;

import com.mrkyel.example.VO.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVO> getBoards();
    BoardVO getBoardsDt(int board_id);
    int saveBoard(BoardVO saveObj);
}
