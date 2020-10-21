package com.mrkyel.example.service;

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
    int deleteBoard(int board_id);
    int insertBoard(BoardVO saveObj);
}

@Transactional
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

    @Override
    public int saveBoard(BoardVO saveObj) {
        return boardMapper.saveBoard(saveObj);
    }

    @Override
    public int insertBoard(BoardVO saveObj) {
        return boardMapper.insertBoard(saveObj);
    }

    @Override
    public int deleteBoard(int board_id) {
        return boardMapper.deleteBoard(board_id);
    }
}