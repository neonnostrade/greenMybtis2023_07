package aaa.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

	List<BoardDTO> list(BoardDTO sdfsd);
	
	List<BoardDTO> listPname(BoardDTO sdfsd);
	
	BoardDTO detail(BoardDTO bdedsde);
	
	void inserttt(BoardDTO efev45rtrg);
	
	void insertList( ArrayList<BoardDTO> arr);
	
	int deleteee(BoardDTO efev45rtrg);
	
	int modifyyy(BoardDTO refv);
	
}
