package com.mrkyel.example.application;

import com.mrkyel.example.VO.BoardVO;
import com.mrkyel.example.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BoardService {
    List<BoardVO> getBoards();
    BoardVO getBoardsDt(int board_id);
    int saveBoard(BoardVO saveObj);
}

@Service
class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardVO> getBoards() {
        return boardMapper.getBoards();
    }

    @Override
    public BoardVO getBoardsDt(int board_id) {
        return boardMapper.getBoardsDt(board_id);
    }

    @Transactional
    @Override
    public int saveBoard(BoardVO saveObj) {
        return boardMapper.saveBoard(saveObj);
    }
}