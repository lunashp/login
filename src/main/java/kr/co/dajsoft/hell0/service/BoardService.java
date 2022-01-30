package kr.co.dajsoft.hell0.service;

import kr.co.dajsoft.hell0.dto.BoardDTO;
import kr.co.dajsoft.hell0.dto.PageRequestDTO;
import kr.co.dajsoft.hell0.dto.PageResultDTO;

public interface BoardService {

    //게시물 등록을 위한 메서드
    public Long register(BoardDTO dto);


    //목록 보기 요청을 처리할 메서드
    public PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO dto);

}
