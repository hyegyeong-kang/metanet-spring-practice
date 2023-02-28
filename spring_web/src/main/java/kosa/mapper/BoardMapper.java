package kosa.mapper;

import java.util.List;

import kosa.model.Board;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard(Search search);
	Board showDetails(int seq);
}
