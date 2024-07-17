package chapter17.example;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	Board board=new Board("제목1", "내용1");
	Board board1=new Board("제목2", "내용2");
	Board board2=new Board("제목3", "내용3");
	ArrayList<Board> list=new ArrayList<>();
	
	public List<Board> getBoardList() {
		list.add(board);
		list.add(board1);
		list.add(board2);
		return list;
	}
	
	}
	

